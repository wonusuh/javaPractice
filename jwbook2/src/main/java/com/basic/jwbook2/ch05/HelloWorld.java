package com.basic.jwbook2.ch05;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "my servlet", urlPatterns = "/hello")
public class HelloWorld extends HttpServlet {
    public HelloWorld() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
                .append("<h2>Hello World Servlet</h2>")
                .append("현재 날짜와 시간은 : ")
                .append(String.valueOf(java.time.LocalDateTime.now()))
                .append("</body></html>");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
