package com.mono.controller.admin;

import com.mono.command.TourCommand;
import com.mono.core.common.utils.UploadUtil;
import com.mono.core.service.TourService;
import com.mono.core.service.impl.TourServiceimpl;
import com.mono.core.web.common.WebConstant;
import com.mono.core.web.utils.FormUtil;
import org.apache.commons.fileupload.FileUploadException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@WebServlet(urlPatterns ={"/admin-tour-list.html","/admin-tour-edit.html"})
//@WebServlet("/admin-tour-list.html")
public class TourController extends HttpServlet {
    private TourService service = new TourServiceimpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        TourCommand command = FormUtil.populate(TourCommand.class,request);
        HttpSession session = request.getSession();
//        TourCommand command = new TourCommand();
//        List<TourDTO> tourDTOList = new ArrayList<TourDTO>();
//        TourDTO dto1 = new TourDTO();
//        dto1.setTitle("Tour 1");
//        dto1.setContent("Noi dung 1");
//        TourDTO dto2 = new TourDTO();
//        dto2.setTitle("Tour 2");
//        dto2.setContent("Noi dung 2");
//        tourDTOList.add(dto1);
//        tourDTOList.add(dto2);
//        command.setListResult(tourDTOList);
//        command.setMaxPageItems(2);
//        command.setTotalItems(tourDTOList.size());
//        RequestUtil.initSearchBean(request,command);
//        Object[] object = service.findTourByProperty(null, null, command.getSortExpression(), command.getSortDirection(), command.getFirstItem(), command.getMaxPageItems());
//        command.setListResult((List<TourDTO>) object[0]);
//        command.setTotalItems(Integer.parseInt(object[1].toString()));
        if(session!= null){
            session.setAttribute(WebConstant.ALERT,session.getAttribute(WebConstant.ALERT));
            session.setAttribute(WebConstant.MESSAGE_RESPONSE,session.getAttribute(WebConstant.MESSAGE_RESPONSE));
        }
        request.setAttribute(WebConstant.LIST_ITEM,command);

        if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_LIST)){
            RequestDispatcher rd = request.getRequestDispatcher("views/admin/tour/list.jsp");
            rd.forward(request,response);
        }else if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_EDIT)) {

            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/tour/edit.jsp");
            rd.forward(request, response);
        }
        session.removeAttribute(WebConstant.ALERT);
        session.removeAttribute(WebConstant.MESSAGE_RESPONSE);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        TourCommand command = new TourCommand();
        UploadUtil uploadUtil = new UploadUtil();
        HttpSession session = request.getSession();
        Set<String> valueTitle = new HashSet<String>();
        valueTitle.add("pojo.title");
        valueTitle.add("pojo.content");
        Map<String,String> mapValue = new HashMap<String, String>();
        try{
             Object[] objects= uploadUtil.writeOrUploadFile(request,valueTitle,WebConstant.TOUR);
             mapValue = (Map<String, String>) objects[3];
             for(String item : valueTitle){
                 if(mapValue.containsKey(item)) {
                     if(item.equals("pojo.title")) {
                         command.getPojo().setTitle(mapValue.get(item));
                     }else if(item.equals("pojo.content")) {
                         command.getPojo().setContent(mapValue.get(item));
                     }
                 }
             }
//            request.setAttribute("alert", "fail");
//            request.setAttribute("messageResponse", "Upload success!");
            session.setAttribute(WebConstant.ALERT,"success");
            session.setAttribute(WebConstant.MESSAGE_RESPONSE,"Upload success!");
        }catch (FileUploadException e){
            session.setAttribute(WebConstant.ALERT,"fail");
            session.setAttribute(WebConstant.MESSAGE_RESPONSE,"Upload fail!");
        }catch (Exception e){
            session.setAttribute(WebConstant.ALERT,"fail");
            session.setAttribute(WebConstant.MESSAGE_RESPONSE,"Upload fail!");
        }
        response.sendRedirect("/admin-tour-list.html?urlType=url_list");
//        RequestDispatcher rd = request.getRequestDispatcher("views/admin/tour/list.jsp");
//        rd.forward(request,response);

    }
}
