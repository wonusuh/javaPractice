package com.basic.jwbook2.ch08;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ProductService service;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        service = new ProductService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String view = "";
        if (action == null || "".equals(action)) {
            getServletContext().getRequestDispatcher("/pcontrol?action=list")
                    .forward(req, resp);
        } else {
            switch (action) {
                case "list":
                    view = list(req, resp);
                    break;
                case "info":
                    view = info(req, resp);
                    break;
            }
            getServletContext().getRequestDispatcher("/ch08/" + view)
                    .forward(req, resp);
        }
    }

    private String list(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("products", service.findAll());
        return "productList.jsp";
    }

    private String info(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("p", service.find(req.getParameter("id")));
        return "productInfo.jsp";
    }
}
