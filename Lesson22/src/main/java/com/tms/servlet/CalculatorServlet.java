package com.tms.servlet;

import com.tms.model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator calculator = new Calculator();
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String firstSum = req.getParameter("firstSum");
        String secondSum = req.getParameter("secondSum");

        String firstSub = req.getParameter("firstSub");
        String secondSub = req.getParameter("secondSub");

        String firstIncr = req.getParameter("firstIncr");
        String secondIncr = req.getParameter("secondIncr");

        String firstDiv = req.getParameter("firstDiv");
        String secondDiv = req.getParameter("secondDiv");

        if (Optional.ofNullable(firstSub).isPresent() && Optional.ofNullable(secondSub).isPresent()) {
            try {
                writer.println("<h1>Welcome SUBTRACTION your numbers </h1>");
                writer.println("<h1>" + calculator.subtraction(Integer.parseInt(firstSub), Integer.parseInt(secondSub)) + "</h1>");
                writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
                writer.println("<a href =/index.html>Return</a>");
            } finally {
                writer.close();
            }
        }
        if (Optional.ofNullable(firstSum).isPresent() && Optional.ofNullable(secondSum).isPresent()) {
            try {
                writer.println("<h1>Welcome sum your numbers </h1>");
                writer.println("<h1>" + calculator.sum(Integer.parseInt(firstSum), Integer.parseInt(secondSum)) + "</h1>");
                writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
                writer.println("<a href =/index.html>Return</a>");
            } finally {
                writer.close();
            }
        }

        if (Optional.ofNullable(firstIncr).isPresent() && Optional.ofNullable(secondIncr).isPresent()) {
            try {
                writer.println("<h1>Welcome INCREASE your numbers </h1>");
                writer.println("<h1>" + calculator.increase(Integer.parseInt(firstIncr), Integer.parseInt(secondIncr)) + "</h1>");
                writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
                writer.println("<a href =/index.html>Return</a>");
            } finally {
                writer.close();
            }
        }
        if (Optional.ofNullable(firstDiv).isPresent() && Optional.ofNullable(secondDiv).isPresent()) {
            try {
                writer.println("<h1>Welcome DIVISION your numbers </h1>");
                writer.println("<h1>" + calculator.division(Integer.parseInt(firstDiv), Integer.parseInt(secondDiv)) + "</h1>");
                writer.println("<a href =/log.html>LOG IN SYSTEM</a>");
                writer.println("<a href =/index.html>Return</a>");
            } finally {
                writer.close();
            }
        }
    }
}
