package com.mono.controller.web;

import com.mono.command.UserCommand;
import com.mono.core.dto.UserDTO;
import com.mono.core.service.UserService;
import com.mono.core.service.impl.UserServiceimpl;
import com.mono.core.web.common.WebConstant;
import com.mono.core.web.utils.FormUtil;
import org.apache.log4j.Logger;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("views/web/login.jsp");
        rd.forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class,request);
        UserDTO pojo = command.getPojo();
        UserService service = new UserServiceimpl();
        try{
            if(service.isUserExist(pojo)!=null){
                if (service.findRoleByUser(pojo) != null && service.findRoleByUser(pojo).getRoleDTO() != null) {
                    if(service.findRoleByUser(pojo).getRoleDTO().getName().equals(WebConstant.ROLE_ADMIN)){

                        response.sendRedirect("/admin-home.html");
                    }else{

                        response.sendRedirect("/home.html");
                    }
                }

            }

        }catch (Exception e) {
            request.setAttribute("alert", "fail");
            request.setAttribute("messageResponse", "Login Fail!");
            RequestDispatcher rd = request.getRequestDispatcher("views/web/login.jsp");
            rd.forward(request,response);
        }


    }
}
