package ch11;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ListenerExam
 *
 */
@WebListener
public class ListenerExam implements ServletContextAttributeListener, ServletContextListener, HttpSessionListener,
		HttpSessionAttributeListener {
	/**
	 * Default constructor.
	 */
	// 리스너 생성자
	public ListenerExam() {
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	// ServletContext 시작
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().log("ServletContext 시작됨!!");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	// ServletContext 종료
	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().log("ServletContext 종료됨!!");
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	// ServletContext에 속성 추가
	public void attributeAdded(ServletContextAttributeEvent scae) {
		scae.getServletContext().log("ServletContext 속성 추가 : " + scae.getValue());
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	// ServletContext 속성 변경
	public void attributeReplaced(ServletContextAttributeEvent scae) {
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	// ServletContext 속성 삭제
	public void attributeRemoved(ServletContextAttributeEvent scae) {
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().getServletContext().log("Session 생성됨 : " + se.getSession().getId());
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent se) {
		se.getSession().getServletContext().log("Session 속성 추가 : " + se.getValue());
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent se) {
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent se) {
	}
}
