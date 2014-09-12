package si.boroot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
// @WebServlet(description = "A simple servlet", urlPatterns = { "/AdvancedServlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter ven = response.getWriter();
		String userName = request.getParameter("userName");
		
		//kreacija context objekta, kjer se objekt lahko prenaša med razliènimi brskalniki in uporabniki
		ServletContext context =request.getServletContext();
		
		//kreacija session objekta "seja"
		HttpSession seja = request.getSession();
		
		if (userName != "" && userName != null){
		seja.setAttribute("savedUserName", userName);
		context.setAttribute("savedUserName", userName);
		}
		
		ven.println("Request parameter ima username " +userName);
		ven.println("Session parameter ima username " +(String) seja.getAttribute("savedUserName"));
		ven.println("Context parameter ima username "+(String) context.getAttribute("savedUserName"));
	}
}
