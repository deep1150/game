<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of Games</h1><br>

<table border="1">
<tr><th>Game id</th><th>Game Name</th><th>Game Price</th><th>Click to play</th></tr>
<c:forEach items="${sessionScope.gamelist}" var="i">
<tr><td>${i.getGid()} </td>
<td>${i.getGname()} </td>
<td>${i.getGprice()} </td>
<td><a href="GameProcessing?action=play&gid=${i.getGid()}&gname=${i.getGname()}&gprice=${i.getGprice()}">Play</a></td>
</tr>



</c:forEach>
<tr><td></td></tr>
</table>

</body>
</html>