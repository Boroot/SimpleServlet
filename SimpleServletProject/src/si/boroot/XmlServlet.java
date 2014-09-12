package si.boroot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3293015945796952155L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String Ulica = request.getParameter("Ulica");
		
		out.println("Hello from Get method!"+userName +"! Zivis na "+Ulica+" ulici !");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String polnoime = request.getParameter("fullName");
		out.println("Hello from POST method ! "+userName +" ! "
				+polnoime+" je tvoje celotno ime !");
		String prof = request.getParameter("prof");
		out.println("Po poklicu si "+ prof);
		//String lokacija = request.getParameter("location");
		String[] lokacija =request.getParameterValues("location");
		out.println("Trenutno si na "+ lokacija.length+" mestih. ");
		
		for(int i=0;i<lokacija.length;i++ ){
		out.println(lokacija[i]);
		}
	}
}

