package com.tms.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("/news")
//public class FilterNews implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("Filter");
//
//    }

//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        response.setContentType("text/html");
//        String site = "https://www.zerkalo.io/";
//        response.setStatus(response.SC_ACCEPTED);
//        response.setHeader("Location", site);
//        response.sendRedirect(site);
//        filterChain.doFilter(servletRequest, servletResponse);
//    }

//    @Override
//    public void destroy() {
//
//    }
//}
