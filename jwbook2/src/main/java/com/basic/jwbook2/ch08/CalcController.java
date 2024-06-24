package com.basic.jwbook2.ch08;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcControl")
public class CalcController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalcController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int n1 = Integer.parseInt(req.getParameter("n1"));
        int n2 = Integer.parseInt(req.getParameter("n2"));
        long result = 0;
        switch (req.getParameter("op")) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = (long) n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/ch08/calcResult.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
