<%--
 Created by IntelliJ IDEA.
 User: 1034511
 Date: 04-10-2022
 Time: 14:32
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<title>Tennis Player Application</title>
</head>
<body>
<h1>Welcome to my Application.</h1>
<h1>Player Name is : ${jspPlayerName}</h1>
<%@page import="java.time.LocalDate"%>
<%
System.out.println("Hello, from welcome jsp: "+request.getAttribute("jspPlayerName")+"\n");
LocalDate getCurrentDate = LocalDate.now();
System.out.println(getCurrentDate+"\n");
%>
<h1>Welcome to my Application.</h1>

<form action="/player.do" method="post">
<label> Player Name : <label>
<input type="text" name="welcomePlayerName" />
<input type="submit" value="Enter" /></form>
</body>
</html>