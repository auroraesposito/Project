
<ul class="menu">
<li class="menu_item">  <a href="/Prj26_Banca">Home </a></li>
<% if(session.getAttribute("logged") == null){%>
<li class="menu_item">  <a href="login">Login </a></li>
<%} %>

<% if(session.getAttribute("logged") != null){%>
<li class="menu_item"> <a href="conti"> Conti </a></li>
<li class="menu_item">  <a href="logout"> Logout </a></li>
<%} %>
</ul>

