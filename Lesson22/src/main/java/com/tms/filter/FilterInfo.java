package com.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@WebFilter("/*")
public class FilterInfo implements Filter {
    private FilterConfig config = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String path = request.getServletPath();
        System.out.println("#INFO :" + new Date() + " -ServletPath: " + path + ", URL : " + request.getRequestURL() + ", METHOD :" + request.getMethod());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        this.config = null;
    }
}
