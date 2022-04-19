package com.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

@WebFilter("/log")
public class FilterLogFile implements Filter {
    private static String logFile;
    private static final String PATH = "/home/artur/TechmeSkills/TechMeSkills/Lesson22/src/main/logFiles/";
    private static final String FILE = PATH + " logFile.txt";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logFile = filterConfig.getInitParameter("logFile");
        System.out.println("LogFile " + logFile);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String user = servletRequest.getParameter("name");
        String pass = servletRequest.getParameter("pass");
        logToFile(user, pass);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    private void logToFile(String firstAttribute, String secondAttribute) throws IOException {
        File file = new File(FILE);
        file.createNewFile();
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(new Date() + ": USER : " + firstAttribute + ", PASS :" + secondAttribute);
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
