package ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "second product controller", urlPatterns = { "/pcontrol2" })
public class ProductControllerSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductServiceSecond service;

	public ProductControllerSecond() {
		service = new ProductServiceSecond();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String view = "";
		if (request.getParameter("action") == null) {
			getServletContext().getRequestDispatcher("/pcontrol2?action=list").forward(request, response);
		} else {
			switch (action) {
			case "list":
				view = list(request, response);
				break;
			case "info":
				view = info(request, response);
				break;
			}
			getServletContext().getRequestDispatcher("/ch08/" + view).forward(request, response);
		}
	}

	private String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("products", service.findAll());
		return "productListSecond.jsp";
	}

	private String info(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("p", service.find(request.getParameter("id")));
		return "productInfoSecond.jsp";
	}
}
