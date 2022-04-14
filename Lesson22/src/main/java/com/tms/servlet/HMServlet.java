package com.tms.servlet;

import com.tms.model.Calculator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class HMServlet extends HttpServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Init servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        Calculator calculator = new Calculator();
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        System.out.println(first);
        System.out.println(second);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        try {
            writer.println("<h1>Welcome sum your numbers </h1>");
            writer.println("<h1>" + calculator.sum(Integer.parseInt(first), Integer.parseInt(second)) + "</h1>");
            writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
            writer.println("<a href =/index.html>Return</a>");
        } finally {
            writer.close();
        }
    }

    @Override
    public void destroy() {
        System.out.println("Servlet was destroyed");
    }
}
