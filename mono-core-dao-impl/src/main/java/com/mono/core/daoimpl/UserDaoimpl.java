package com.mono.core.daoimpl;

import com.mono.core.common.utils.HibernateUtil;
import com.mono.core.dao.UserDao;
import com.mono.core.data.daoimpl.AbstractDao;
import com.mono.core.persistence.entity.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoimpl extends AbstractDao<Integer, UserEntity> implements UserDao {

    public UserEntity isUserExist(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserEntity entity = new UserEntity();
        try{
            StringBuilder sql = new StringBuilder("FROM UserEntity WHERE  name = :name AND password = :password");

            Query query = session.createQuery(sql.toString());
            query.setParameter("name",username);
            query.setParameter("password",password);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return entity;
    }

    public UserEntity findRoleByUser(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserEntity entity = new UserEntity();
        try{
            StringBuilder sql = new StringBuilder("FROM UserEntity WHERE  name = :name AND password = :password");

            Query query = session.createQuery(sql.toString());
            query.setParameter("name",username);
            query.setParameter("password",password);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return entity;
    }
}
