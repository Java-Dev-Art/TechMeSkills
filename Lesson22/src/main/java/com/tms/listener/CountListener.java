package com.tms.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountListener implements HttpSessionListener {
    ServletContext context;
    static int total = 0, current = 0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        total++;
        current++;
        context = httpSessionEvent.getSession().getServletContext();
        context.setAttribute("total-users", total);
        context.setAttribute("current-users", current);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        current--;
        context.setAttribute("current-users", current);
    }
}
