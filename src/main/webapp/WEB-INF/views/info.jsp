<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title
</title>

</head>
<body>


<h1>
    Player Info
</h1>
<p>
    Name : ${name} <br>
    Age : ${age} <br>
    Nationality : ${nationality} <br>
    Id: ${id}
</p>
<%
    System.out.println(request.getAttribute("playerName"));
%>


</body>
</html>