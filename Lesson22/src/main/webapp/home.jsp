<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Work</title>
</head>
<body>
<H1>HELLO</H1>
<%
    String name = (String) session.getAttribute("name");
    String pass = (String) session.getAttribute("pass");
    int current = (Integer) session.getAttribute("current");
    int total = (Integer) session.getAttribute("total");
%>
User : <%=name%><br>
PASSWORD : <%=pass%><br>
TOTAL USERS : <%=total%><br>
CURRENT USERS : <%=current%><br>
<a href="/logout">LOG OUT</a><br>
<a href="/log">LOG IN</a><
<a href="index.html">back to calculator</a>

</body>
</html>