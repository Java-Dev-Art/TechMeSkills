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
%>
User : <%=name%><br>
PASSWORD : <%=pass%>
<a href="index.html">back to calculator</a>

</body>
</html>