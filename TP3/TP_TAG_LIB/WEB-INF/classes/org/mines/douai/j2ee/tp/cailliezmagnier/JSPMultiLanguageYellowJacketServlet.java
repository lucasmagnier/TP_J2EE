package org.mines.douai.j2ee.tp.cailliezmagnier;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSPMultiLanguageYellowJacketServlet
 */
@WebServlet("/JSPMultiLanguageYellowJacket")
public class JSPMultiLanguageYellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JSPMultiLanguageYellowJacketServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String language = request.getParameter("lang");
		String html_if_no_language_choosen = "<html><body>Please, choose a language </br> You have to fill the lang parameter in the URL with en or fr </body></html>";
		
		if (language != null) {

			switch (language) {
			case "fr":
				this.getServletContext().getRequestDispatcher("/YellowJacket-fr.jsp").forward(request, response);
				break;
			case "en":
				this.getServletContext().getRequestDispatcher("/YellowJacket-en.jsp").forward(request, response);
				break;
			default:
				java.io.PrintWriter out = response.getWriter();
				out.println(html_if_no_language_choosen);
			}
		}
		else {
			java.io.PrintWriter out = response.getWriter();
			out.println(html_if_no_language_choosen);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
