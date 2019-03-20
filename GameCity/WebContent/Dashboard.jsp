<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<form action="GameProcessing">
<h1>Welcome ${username} to the Game World..!!</h1>
<br>
<h2>Your balance is ${amount} </h2>
<br>
<h3>Click on Continue to Resume..........!!!!!!!</h3>

<input type="Submit" value="Continue" name="action"><br><br>
<input type="Submit" value="Logout" name="action">
</form> 



</center>

</body>
</html>