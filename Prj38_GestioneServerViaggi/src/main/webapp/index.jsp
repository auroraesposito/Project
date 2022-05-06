<%@page import="model.Server"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Servers</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class=row>
	
			<table class="table">
 				 <tr>
    				<th>Nome Server</th>
    				<th>indirizzo</th>
    				<th>status</th>
  				</tr>
  			<% List<Server> servers = (List<Server>) request.getAttribute("servers"); %>
  			<%for (Server s: servers){ %>
  			
  	
  				<tr>
    				<td><%=s.getNome() %></td>
    				<td><%=s.getIndirizzo()%>:<%=s.getPorta()%></td>
    				<td><button onclick=check('http://<%=s.getIndirizzo()%>:<%=s.getPorta()%>')>check</button></td>
  				</tr>
  				
  			<%} %>
			</table>

	
		</div>
	
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script>
		function check(url) {
			console.log(url);
			fetch(url, {
				method: 'head'
			})
			.then(r => r.text())
			.then(r => {
				console.dir("ok")
				})
			.catch(err => console.error("nope"));

		}


</script>

</body>
</html>