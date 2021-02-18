package ru.geekbrains.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(urlPatterns = {"/http-main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pageHeader","Server elem");
        getServletContext().getRequestDispatcher("/page_header").include(req,resp);
        resp.getWriter().println("<h1>Main</h1>");
    }
}
