package com.mono.controller.admin;

import com.mono.command.UserCommand;
import com.mono.core.dto.UserDTO;
import com.mono.core.service.UserService;
import com.mono.core.service.impl.UserServiceimpl;
import com.mono.core.web.common.WebConstant;
import com.mono.core.web.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns ={"/admin-user-list.html","/ajax-admin-user-edit.html"})
public class UserController extends HttpServlet {
    private UserService userService = new UserServiceimpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class,request);
        UserDTO pojo = command.getPojo();
//        HttpSession session = request.getSession();
//        if(session!= null){
//            session.setAttribute(WebConstant.ALERT,session.getAttribute(WebConstant.ALERT));
//            session.setAttribute(WebConstant.MESSAGE_RESPONSE,session.getAttribute(WebConstant.MESSAGE_RESPONSE));
//        }


        if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_LIST)) {
            Map<String, Object> mapProperty = new HashMap<String, Object>();
            Object[] objects = userService.findUserByProperty(mapProperty, command.getSortExpression(), command.getSortDirection(), command.getFirstItem(), command.getMaxPageItems());
            command.setListResult((List<UserDTO>) objects[0]);
            command.setTotalItems(Integer.parseInt(objects[1].toString()));
            request.setAttribute(WebConstant.LIST_ITEM,command);
            RequestDispatcher rd = request.getRequestDispatcher("views/admin/user/list.jsp");
            rd.forward(request,response);
        }else if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_EDIT)) {
            if(pojo != null && pojo.getUserId() != null){
                command.setPojo(userService.findUserById(pojo.getUserId()));
            }
            request.setAttribute(WebConstant.FROM_ITEM,command);
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user/edit.jsp");
            rd.forward(request, response);
        }
//        session.removeAttribute(WebConstant.ALERT);
//        session.removeAttribute(WebConstant.MESSAGE_RESPONSE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

}
