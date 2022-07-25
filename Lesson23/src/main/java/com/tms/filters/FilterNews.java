package com.tms.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/login")
public class FilterNews implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String password = servletRequest.getParameter("password");
        System.out.println(password + " " + "filter");
//        PrintWriter writer = servletResponse.getWriter();
//        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/index.jsp");
//        if (!pass.equals(password)){
//            servletResponse.setContentType("text/html");
//            writer.println("<!DOCTYPE html>");
//            writer.println("<html>");
//            writer.println("<head>");
//            writer.println("<title>Wrong PWD</title");
//            writer.println("</head>");
//            writer.println("<body>");
//            writer.println("<H1>nie tot pass</H1>");
//            writer.println("</body>");
//            writer.println("</html>");
//
//        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
