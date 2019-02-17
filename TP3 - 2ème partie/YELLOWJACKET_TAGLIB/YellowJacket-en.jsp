<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Yellow Jacket - English</title>
    </head>
    <body>
    <%
    String pays = request.getParameter("pays");
    if (pays == null) {
    %>
    <FORM  action="http://localhost:8080/TP_TAG_LIB/JSPMultiLanguageYellowJacket?lang=en" method="post">
        <SELECT name="pays" size="1">
        <OPTION value="france"> France </OPTION>
        <OPTION value="belgium"> Belgium </OPTION>
        <OPTION value="germany"> Germany </OPTION>
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
		out.println("<FORM  action=\"http://localhost:8080/TP_TAG_LIB/JSPMultiLanguageYellowJacket?lang=en\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\" selected> France");
		out.println("<OPTION value=\"belgium\">Belgium");
		out.println("<OPTION value=\"germany\" >Germany");
		pays_upperCase = "France";
		break;
	case "belgium":
		nombre_gilet_jaunes = 2000;
		out.println("<FORM  action=\"http://localhost:8080/TP_TAG_LIB/JSPMultiLanguageYellowJacket?lang=en\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgium\" selected>Belgium");
		out.println("<OPTION value=\"germany\">Germany");
		pays_upperCase="Belgium";
		break;
	case "germany":
		nombre_gilet_jaunes = 3000;
		out.println("<FORM  action=\"http://localhost:8080/TP_TAG_LIB/JSPMultiLanguageYellowJacket?lang=en\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgium\">Belgium");
		out.println("<OPTION value=\"germany\" selected>Germany");
		pays_upperCase = "Germany";
		break;
	default:
		out.println("<FORM  action=\"http://localhost:8080/TP_TAG_LIB/JSPMultiLanguageYellowJacket?lang=en\" method=\"post\">");
		out.println("<SELECT name=\"pays\" size=\"1\">");
		out.println("<OPTION value=\"france\"> France");
		out.println("<OPTION value=\"belgium\">Belgium");
		out.println("<OPTION value=\"germany\" >Germany");
		nombre_gilet_jaunes = 0;
		pays_upperCase=pays;
	}
	
	out.println("</SELECT>");
	out.println(" <input type=\"submit\" value=\"Submit\">");
	out.println("</FORM>");
	out.println("There are "+nombre_gilet_jaunes + " yellow jackets in " + pays_upperCase);
	out.println("</body></html>");
    }
    %>
    </body>
</html>