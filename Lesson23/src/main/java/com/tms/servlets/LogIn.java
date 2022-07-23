package com.tms.servlets;

import com.tms.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LogIn extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String userName = req.getParameter("username");
        String pass = req.getParameter("password");

        HttpSession session = req.getSession();
        session.setAttribute("name", userName);
        session.setAttribute("pass", pass);

        RequestDispatcher dispatcher;

        if (user.getName().equals(userName) && user.getPass().equals(pass)) {
            dispatcher = req.getRequestDispatcher("buy.html");
            dispatcher.forward(req, resp);
        } else {
            dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
