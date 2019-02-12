package org.mines.douai.j2ee.tp.magniercailliez.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YellowJacketServlet
 */
@WebServlet("/YellowJacketServlet")
public class YellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YellowJacketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientName = request.getParameter("name");
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		out.println("<html><body>");
		//out.println("");
		//out.println("Hello World "  + clientName + " !");
		
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YellowJacketServlet\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgique\">Belgique");
		out.println("<OPTION value=\"allemagne\">Allemagne");
		out.println("</SELECT>");
		out.println(" <input type=\"submit\" value=\"Submit\">");
		out.println("</FORM>");

		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		//doGet(request, response);
		String pays = request.getParameter("pays");
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YellowJacketServlet\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgique\">Belgique");
		out.println("<OPTION value=\"allemagne\">Allemagne");
		out.println("</SELECT>");
		out.println(" <input type=\"submit\" value=\"Submit\">");
		out.println("</FORM>");
	
		int nombre_gilet_jaunes ; 
		switch (pays)
		{
		  case "france":
			  nombre_gilet_jaunes = 1000;
		    break;
		  case "belgique":
			  nombre_gilet_jaunes = 2000;
		    break;
		  case "allemagne":
			  nombre_gilet_jaunes = 3000 ; 
		    break;
		  default:
			  nombre_gilet_jaunes = 4000 ; 
		}
		
		out.println(nombre_gilet_jaunes+" gilets jaunes en "+pays);
		out.println("</body></html>");
	}

}
