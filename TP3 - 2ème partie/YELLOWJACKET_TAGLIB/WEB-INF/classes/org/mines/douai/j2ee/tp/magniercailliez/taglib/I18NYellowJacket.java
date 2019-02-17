package org.mines.douai.j2ee.tp.magniercailliez.taglib;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class I18NYellowJacket extends TagSupport{
	private String lang = null;

	public void setLang (String string) {
		this.lang = string;
	}

	public String getLang() {
		return this.lang;
	}

	public int doStartTag() throws JspException {
		String pays_upperCase;
		String pays = pageContext.getRequest().getParameter("pays");

		try {
			if (getLang() == "fr") {
				if (pays == null) {
					pageContext.getOut().println("<html><body>");
					pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=fr\" method=\"post\">");
					pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
					pageContext.getOut().println("<OPTION value=\"france\"> France");
					pageContext.getOut().println("<OPTION value=\"belgique\">Belgique");
					pageContext.getOut().println("<OPTION value=\"allemagne\">Allemagne");
					pageContext.getOut().println("</SELECT>");
					pageContext.getOut().println(" <input type=\"submit\" value=\"Valider\">");
					pageContext.getOut().println("</FORM>");
					pageContext.getOut().println("</body></html>");	

				}
				if (pays != null) {
					int nombre_gilet_jaunes;
					switch (pays) {
					case "france":
						nombre_gilet_jaunes = 1000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=fr\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\" selected> France");
						pageContext.getOut().println("<OPTION value=\"belgique\">Belgique");
						pageContext.getOut().println("<OPTION value=\"allemagne\" >Allemagne");
						pays_upperCase = "France";
						break;
					case "belgique":
						nombre_gilet_jaunes = 2000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=fr\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgique\" selected>Belgique");
						pageContext.getOut().println("<OPTION value=\"allemagne\">Allemagne");
						pays_upperCase="Belgique";
						break;
					case "allemagne":
						nombre_gilet_jaunes = 3000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=fr\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgique\">Belgique");
						pageContext.getOut().println("<OPTION value=\"allemagne\" selected>Allemagne");
						pays_upperCase = "Allemagne";
						break;
					default:
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=fr\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgique\">Belgique");
						pageContext.getOut().println("<OPTION value=\"allemagne\" >Allemagne");
						nombre_gilet_jaunes = 0;
						pays_upperCase= pays;
					}

					pageContext.getOut().println("</SELECT>");
					pageContext.getOut().println(" <input type=\"submit\" value=\"Valider\">");
					pageContext.getOut().println("</FORM>");
					pageContext.getOut().println(nombre_gilet_jaunes + " gilets jaunes en " + pays_upperCase);
					pageContext.getOut().println("</body></html>");
				}
			}
			else if (getLang() == "en") {
				if (pays == null) {
					pageContext.getOut().println("<html><body>");
					pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=en\" method=\"post\">");
					pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
					pageContext.getOut().println("<OPTION value=\"france\"> France");
					pageContext.getOut().println("<OPTION value=\"belgium\">Belgium");
					pageContext.getOut().println("<OPTION value=\"germany\">Germany");
					pageContext.getOut().println("</SELECT>");
					pageContext.getOut().println(" <input type=\"submit\" value=\"Submit\">");
					pageContext.getOut().println("</FORM>");
					pageContext.getOut().println("</body></html>");	

				}
				if (pays != null) {
					int nombre_gilet_jaunes;
					switch (pays) {
					case "france":
						nombre_gilet_jaunes = 1000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=en\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\" selected> France");
						pageContext.getOut().println("<OPTION value=\"belgium\">Belgium");
						pageContext.getOut().println("<OPTION value=\"germany\" >Germany");
						pays_upperCase = "France";
						break;
					case "belgium":
						nombre_gilet_jaunes = 2000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=en\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgium\" selected>Belgium");
						pageContext.getOut().println("<OPTION value=\"germany\">Germany");
						pays_upperCase="Belgium";
						break;
					case "germany":
						nombre_gilet_jaunes = 3000;
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=en\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgium\">Belgium");
						pageContext.getOut().println("<OPTION value=\"germany\" selected>Germany");
						pays_upperCase = "Germany";
						break;
					default:
						pageContext.getOut().println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_TAGLIB/TagLibMultiLanguageYellowJacketServlet?lang=en\" method=\"post\">");
						pageContext.getOut().println("<SELECT name=\"pays\" size=\"1\">");
						pageContext.getOut().println("<OPTION value=\"france\"> France");
						pageContext.getOut().println("<OPTION value=\"belgium\">Belgium");
						pageContext.getOut().println("<OPTION value=\"germany\" >Germany");
						nombre_gilet_jaunes = 0;
						pays_upperCase=pays;
					}

					pageContext.getOut().println("</SELECT>");
					pageContext.getOut().println(" <input type=\"submit\" value=\"Submit\">");
					pageContext.getOut().println("</FORM>");
					pageContext.getOut().println("There are "+nombre_gilet_jaunes + " yellow jackets in " + pays_upperCase);
					pageContext.getOut().println("</body></html>");
				}
			}
		}
		catch (IOException e) {
			throw new JspException ("I/O Error", e);
		}
		return SKIP_BODY;
	}
}


