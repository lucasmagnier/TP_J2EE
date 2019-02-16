package org.mines.douai.j2ee.tp.magniercailliez.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YELLOWJACKETSERVLET
 */
@WebServlet("/YELLOWJACKETSERVLET")
public class YellowJacket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public YellowJacket() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println(
				"<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YELLOWJACKETSERVLET\" method=\"post\">");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String pays = request.getParameter("pays");
		String pays_upperCase;
		if (pays != null) {

			response.setContentType("text/html");
			java.io.PrintWriter out = response.getWriter();


			
			int nombre_gilet_jaunes;
			switch (pays) {
			case "france":
				nombre_gilet_jaunes = 1000;
				out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YELLOWJACKETSERVLET\" method=\"post\">");
				out.println("<SELECT name=\"pays\" size=\"1\">");
				out.println("<OPTION value=\"france\" selected> France");
				out.println("<OPTION value=\"belgique\">Belgique");
				out.println("<OPTION value=\"allemagne\" >Allemagne");
				pays_upperCase = "France";
				break;
			case "belgique":
				nombre_gilet_jaunes = 2000;
				out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YELLOWJACKETSERVLET\" method=\"post\">");
				out.println("<SELECT name=\"pays\" size=\"1\">");
				out.println("<OPTION value=\"france\"> France");
				out.println("<OPTION value=\"belgique\" selected>Belgique");
				out.println("<OPTION value=\"allemagne\">Allemagne");
				pays_upperCase="Belgique";
				break;
			case "allemagne":
				nombre_gilet_jaunes = 3000;
				out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YELLOWJACKETSERVLET\" method=\"post\">");
				out.println("<SELECT name=\"pays\" size=\"1\">");
				out.println("<OPTION value=\"france\"> France");
				out.println("<OPTION value=\"belgique\">Belgique");
				out.println("<OPTION value=\"allemagne\" selected>Allemagne");
				pays_upperCase = "Allemagne";
				break;
			default:
				out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_SERVLET/YELLOWJACKETSERVLET\" method=\"post\">");
				out.println("<SELECT name=\"pays\" size=\"1\">");
				out.println("<OPTION value=\"france\"> France");
				out.println("<OPTION value=\"belgique\">Belgique");
				out.println("<OPTION value=\"allemagne\" >Allemagne");
				nombre_gilet_jaunes = 0;
				pays_upperCase=pays;
			}
			
			out.println("</SELECT>");
			out.println(" <input type=\"submit\" value=\"Submit\">");
			out.println("</FORM>");
			out.println(nombre_gilet_jaunes + " gilets jaunes en " + pays_upperCase);
			out.println("</body></html>");
		}
		else {
			doGet(request, response);
		}
	}

}
