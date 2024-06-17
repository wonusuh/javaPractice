package com.basic.jwbook2.ch05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalcServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int n1 = Integer.parseInt(req.getParameter("n1"));
        int n2 = Integer.parseInt(req.getParameter("n2"));
        String op = req.getParameter("op");
        long result = 0;
        switch (req.getParameter("op")) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.append("<html><head><h2>계산기 서블릿</h2></head><body>")
                .append("계산결과 : " + result)
                .append("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
