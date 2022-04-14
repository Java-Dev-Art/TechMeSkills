package com.tms.filter;

import com.tms.exception.LoginException;
import com.tms.model.User;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FilterLog implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        User user = new User();
        String name = servletRequest.getParameter("name");
        String pass = servletRequest.getParameter("pass");
        PrintWriter pw = servletResponse.getWriter();
        try {
            if (name != null && pass != null) {
                if (name.equalsIgnoreCase(user.getName()) && pass.equalsIgnoreCase(user.getPass())) {
                    System.out.println("VERY GOOD you are enter system");
                    filterChain.doFilter(servletRequest, servletResponse);
                } else {
                    pw.println("<h1>Please ENTER correct Name USER and PASSWORD</h1>");
                    pw.println("<a href = /log.html>RETURN</a>");
                    try {
                        throw new LoginException("Discourteous name or password!!");
                    } catch (LoginException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                pw.println("<h1>Please ENTER correct Name USER and PASSWORD</h1>");
                pw.println("<a href = /log.html>RETURN</a>");
                try {
                    throw new LoginException("name or password can't be NULL");
                } catch (LoginException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            pw.close();
        }
    }

    @Override
    public void destroy() {

    }
}
