package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "My second servlet review", urlPatterns = { "/hellosecond" })
public class HelloWorldSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorldSecond() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Hello World Servlet Second</title></head><body>")
				.append("<h2>Hello World Second !!</h2><hr>").append("현재 날짜와 시간은 : " + java.time.LocalDateTime.now())
				.append("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
