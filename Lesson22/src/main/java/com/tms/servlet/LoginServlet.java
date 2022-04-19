package com.tms.servlet;

import com.tms.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String userPass = req.getParameter("pass");
        String userName = req.getParameter("name");
        System.out.println(userName);
        System.out.println(userPass);
        HttpSession session = req.getSession();
        session.setAttribute("name", userName);
        session.setAttribute("pass", userPass);
        ServletContext context = getServletContext();
        int total = (Integer) context.getAttribute("total-users");
        int current = (Integer) context.getAttribute("current-users");
        session.setAttribute("total", total);
        session.setAttribute("current", current);
        RequestDispatcher dispatcher;
        if (user.getName().equals(userName) && user.getPass().equals(userPass)) {
            dispatcher = req.getRequestDispatcher("admin.html");
            dispatcher.forward(req, resp);
        } else {
            dispatcher = req.getRequestDispatcher("home.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
