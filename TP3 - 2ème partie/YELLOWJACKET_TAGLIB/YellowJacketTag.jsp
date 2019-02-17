<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String language = request.getParameter("lang");

if (language != null) {

	switch (language) {
	case "fr": 
	%>
      <%@ taglib prefix="tag_tp" uri="WEB-INF/tlds/tp.tld"%>
		<tag_tp:i18nYellowJacket lang="fr"/>
	<%
	
	break;
	case "en": %>
	<%@ taglib prefix="tag_tp" uri="WEB-INF/tlds/tp.tld"%>
		<tag_tp:i18nYellowJacket lang="en"/>
	<%
	}
}
%>

</body>
</html>