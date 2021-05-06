package com.mono.core.data.daoimpl;

import com.mono.core.common.constant.CoreConstant;
import com.mono.core.common.utils.HibernateUtil;
import com.mono.core.data.dao.GenericDao;
import org.hibernate.*;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AbstractDao <ID extends Serializable,T> implements GenericDao<ID,T> {
    private Class<T> persistenceClass;

    public AbstractDao() {
        this.persistenceClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    public String getPersistenceClassName() {
        return persistenceClass.getSimpleName();
    }


    public List<T> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<T> list = new ArrayList<T>();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            StringBuilder sql = new StringBuilder("from ");
            sql.append(this.getPersistenceClassName());
            Query query = session.createQuery(sql.toString());
            list = query.list();
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return list;
    }

    public T update(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        T result = null;
        Transaction transaction = session.beginTransaction();
        try{
            Object object = session.merge(entity);
            result = (T) object;
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return result;
    }

    public void save(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.persist(entity);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
    }

    public T findById(ID id) {
        T result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            result = (T) session.get(persistenceClass,id);
            if(result == null) {
                throw new ObjectNotFoundException(" NOT FOUND "+id,null);
            }
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return result;
    }

    public Object[] findByProperty(Map<String, Object> property,  String sortExpression, String sortDirection, Integer offset, Integer limit) {
        List<T> list = new ArrayList<T>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Object totalItem = 0;
        String[] params = new String[property.size()];
        Object[] objects = new Object[property.size()];
        int i = 0;
        for(Map.Entry item : property.entrySet()){
            params[i] = (String) item.getKey();
            objects[i] = item.getValue();
            i++;
        }
        try{
            StringBuilder sql = new StringBuilder("From ");
            sql.append(getPersistenceClassName());
            if(property.size() >0) {
                for(int k =0;k < params.length;k++) {
                    if(k==0) {
                        sql.append(" where ").append(params[k]).append("= :").append(params[k]);
                    }else {
                        sql.append(" and ").append(params[k]).append("= :").append(params[k]);
                    }
                }
            }
//            if(property != null && value != null){
//                sql.append(" where ").append(property).append(" = :value");
//            }
            if(sortExpression != null && sortDirection != null){
                sql.append(" order by ").append(sortExpression).append(" "+(sortDirection.equalsIgnoreCase(CoreConstant.ASC_SORT)?"ASC":"DESC"));

            }

            Query query1 = session.createQuery(sql.toString());
            if(property.size() >0) {
                for(int k =0;k < params.length;k++) {
                    query1.setParameter(params[k],objects[k]);
                }
            }
//            if( value != null){
//                query1.setParameter("value",value);
//            }
            if(offset != null && offset >=0){
                query1.setFirstResult(offset);
            }
            if(limit != null && limit >0){
                query1.setMaxResults(limit);
            }
            list = query1.list();
            StringBuilder sql2 = new StringBuilder("select count(*) from ");
            sql2.append(getPersistenceClassName());
//            if(property != null && value != null){
//                sql2.append(" where ").append(property).append(" = :value");
//            }
            if(property.size() >0) {
                for(int k =0;k < params.length;k++) {
                    if(k==0) {
                        sql2.append(" where ").append(params[k]).append(" = :").append(params[k]);
                    }else {
                        sql2.append(" and ").append(params[k]).append(" = :").append(params[k]);
                    }
                }
            }
            Query query2 = session.createQuery(sql2.toString());
//            if( value != null){
//                query2.setParameter("value",value);
//            }
            if(property.size() >0) {
                for(int k =0;k < params.length;k++) {
                    query2.setParameter(params[k],objects[k]);
                }
            }
            totalItem = query2.list().get(0);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return new Object[]{list,totalItem};
    }

    public Integer deleteById(List<ID> ids) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Integer count = 0;
        try{
            for(ID id : ids){
                T result = (T) session.get(persistenceClass,id);
                session.delete(result);
            }
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return count;
    }
}
