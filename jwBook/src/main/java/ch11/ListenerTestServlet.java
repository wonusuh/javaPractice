package ch11;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListenerTestServlet
 */
@WebServlet(description = "test servlet for the listener", urlPatterns = { "/ListenerTestServlet" })
public class ListenerTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext sc;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		sc = getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		sc.setAttribute("name", "홍길동");
		HttpSession s = request.getSession();
		s.setAttribute("ssName", s.getId() + " : 세선 속성 저장!!");
	}
}
