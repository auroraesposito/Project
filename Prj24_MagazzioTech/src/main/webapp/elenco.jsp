<%@page import="model.Articolo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Articoli</h1>

<table>



<% List<Articolo> articoli = (List<Articolo>) request.getAttribute("articoli"); %>

<% for (Articolo a: articoli){%>

<tr>
	<td><%=a.getDescrizione() %></td>
	<td><%=a.getQuantita() %></td>
</tr>

<% } %>

</table>




</body>
</html>