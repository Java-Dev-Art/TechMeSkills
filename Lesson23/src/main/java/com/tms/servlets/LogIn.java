package com.tms.servlets;

import com.tms.exceptions.RequestParNullException;
import com.tms.filters.FilterNews;
import com.tms.model.Category;
import com.tms.model.User;
import com.tms.utils.ValReqParamHttp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.tms.utils.ValReqParamHttp.validParNotNull;

@WebServlet("/login")
public class LogIn extends HttpServlet {
    private static final String USER_NAME_ADMIN = "art";
    private static  final String  USER_PASS_ADMIN = "0000";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = null;
        String userName = req.getParameter("username");
        String pass = req.getParameter("password");
        try {
            validParNotNull(userName);
            validParNotNull(pass);
            user = new User(userName,pass);
        }catch (RequestParNullException e){
            System.out.println(e.getMessage());
        }

        HttpSession session = req.getSession();
        session.setAttribute("name", userName);
        session.setAttribute("pass", pass);

        RequestDispatcher dispatcher = req.getRequestDispatcher(checkUsers(user,req));
        dispatcher.forward(req,resp);

//        if (user.getName().equals(userName) && user.getPass().equals(pass)) {
//            dispatcher = req.getRequestDispatcher("buy.html");
//            dispatcher.forward(req, resp);
//        } else {
//            dispatcher = req.getRequestDispatcher("login.jsp");
//            dispatcher.forward(req, resp);
//        }
    }
    private String checkUsers(User user, HttpServletRequest request){
        if (user != null
        && request.getParameter("username").equalsIgnoreCase(USER_NAME_ADMIN)
        && request.getParameter("password").equalsIgnoreCase(USER_PASS_ADMIN)){
            request.getSession().setAttribute("username",user);

            List < Category> categories = new ArrayList<>();

            Category laptop = new Category("Laptop","laptop.png");
            Category phone = new Category("Phone","phone.png");
            Category television = new Category("Television","television.png");
            Category ventilator = new Category("Ventilator","ven.png");
            Category scooter = new Category("Scooter", "scooter.png");
            Category camera = new Category("Camera", "camera.png");
            Category jps = new Category("JPS Navigator", "map.png");

            categories.add(laptop);
            categories.add(phone);
            categories.add(television);
            categories.add(ventilator);
            categories.add(scooter);
            categories.add(camera);
            categories.add(jps);

            request.setAttribute("categories",categories);

            return "shop.jsp";
        }else {
            return "login.jsp";
        }
    }
}
