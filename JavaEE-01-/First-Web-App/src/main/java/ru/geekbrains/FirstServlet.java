package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;


//1 дз по java ee (реализация обычного сервлета)


//сервлет это веб компанент который управляемый контейнером  (та часть программы которая отвечает на htpp запросы
//webxml это сердце приложения которое указывает что как происходит

public class FirstServlet implements Servlet{


    private static final Logger logger= LoggerFactory.getLogger(FirstServlet.class);
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException //через него сервлет получает возможность взаимодействовать с сервером приложения
    {
        logger.info("New reqwest to FirstServlet--INIT");
        this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New reqwest to FirstServlet");
        //перавй входной параметр запрос второй ответ
        //каждый раз когда будет приходить запрос будет вызываться именно этот метод

        res.getWriter().println("<h1> Hello servlt 33 </h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
