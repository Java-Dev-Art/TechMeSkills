package com.tms.servlet;

import com.tms.model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/inrc")
public class IncreaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator calculator = new Calculator();
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        try {
            writer.println("<h1>Welcome INCREASE your numbers </h1>");
            writer.println("<h1>" + calculator.increase(Integer.parseInt(first), Integer.parseInt(second)) + "</h1>");
            writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
            writer.println("<a href =/index.html>Return</a>");
        } finally {
            writer.close();
        }
    }
}
