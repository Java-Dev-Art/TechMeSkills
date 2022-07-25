package com.tms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext sc = servletContextEvent.getServletContext();

        String url = sc.getInitParameter("DBURL");
        String user = sc.getInitParameter("DBUSER");
        String pass = sc.getInitParameter("DBPWD");

        DBConectionMenager dbConectionMenager = new DBConectionMenager(url,user,pass);
        sc.setAttribute("dbConectionMenager",dbConectionMenager);
        System.out.println("Connection with db");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext sc = servletContextEvent.getServletContext();

        DBConectionMenager dbConectionMenager = (DBConectionMenager) sc.getAttribute("dbConectionMenager");
        dbConectionMenager.closeConnection();

        System.out.println("Close connection ");

    }
}
