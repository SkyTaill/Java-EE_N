package ru.geekbrains.Handler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/page_header")
public class PageHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String header = (String) req.getAttribute("pageHeader");
        resp.getWriter().println("<h1>Staf</h1>");
        resp.getWriter().println("<h1>Stafs</h1>");
        resp.getWriter().println("<h1>Basket</h1>");
        resp.getWriter().println("<h1>Menu-Меню</h1>");
    }
}
