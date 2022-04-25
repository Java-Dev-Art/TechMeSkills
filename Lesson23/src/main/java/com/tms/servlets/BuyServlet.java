package com.tms.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/buy")
public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bil = req.getParameter("billets");
        String shop = req.getParameter("shop");
        System.out.println(bil);
        System.out.println(shop);
        System.out.println("hell");

        String[] service = req.getParameterValues("buy");
        for (String serv : service) {
            System.out.println(serv);
            if (serv.equalsIgnoreCase("shop")) {
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/shop");
                requestDispatcher.forward(req, resp);
            }
            if (serv.equalsIgnoreCase("shop")) {
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/shop");
                requestDispatcher.forward(req, resp);
            }
        }

//        if (Optional.ofNullable(bil).isPresent()){
//            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/billets.jsp");
//            requestDispatcher.forward(req,resp);
//        }else if (Optional.ofNullable(shop).isPresent()){
//            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/shop");
//            requestDispatcher.forward(req,resp);
//        }else {
//            resp.setContentType("text/html");
//            PrintWriter writer = resp.getWriter();
//            try {
//                writer.println("<h1>Sorry, you can check something !!!</h1>");
//            }finally {
//                writer.close();
//            }
//        }

    }

}
