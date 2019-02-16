<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>JSPYellowJacket</title>
    </head>
    <body>
    <%
    String pays = request.getParameter("pays");
    if (pays == null) {
    %>
    <FORM  action="http://localhost:8080/YELLOWJACKET_JSP/JSPYELLOWJACKET" method="post">
        <SELECT name="pays" size="1">
        <OPTION value="france"> France </OPTION>
        <OPTION value="belgique"> Belgique </OPTION>
        <OPTION value="allemagne"> Allemagne </OPTION>
        </SELECT>
        <input type="submit" value="Submit">
    </FORM>
    <%
    }
 
    String pays_upperCase;
    if (pays != null) {
    int nombre_gilet_jaunes;
	switch (pays) {
	case "france":
		nombre_gilet_jaunes = 1000;
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_JSP/JSPYELLOWJACKET\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\" selected> France");
		out.println("<OPTION value=\"belgique\">Belgique");
		out.println("<OPTION value=\"allemagne\" >Allemagne");
		pays_upperCase = "France";
		break;
	case "belgique":
		nombre_gilet_jaunes = 2000;
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_JSP/JSPYELLOWJACKET\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgique\" selected>Belgique");
		out.println("<OPTION value=\"allemagne\">Allemagne");
		pays_upperCase="Belgique";
		break;
	case "allemagne":
		nombre_gilet_jaunes = 3000;
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_JSP/JSPYELLOWJACKET\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgique\">Belgique");
		out.println("<OPTION value=\"allemagne\" selected>Allemagne");
		pays_upperCase = "Allemagne";
		break;
	default:
		out.println("<FORM  action=\"http://localhost:8080/YELLOWJACKET_JSP/JSPYELLOWJACKET\" method=\"post\">");
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
    %>
    </body>
</html>