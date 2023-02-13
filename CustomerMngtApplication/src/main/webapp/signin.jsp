<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: pink;">
	<form action="CustomerController" method="get"
		style="text-align: center;">
		<input type="hidden" name="action" value="signin"> CUSTOMER
		EMAILID           <input type="email" name="custemailid"><br>
		CUSTOMER PASSWORD <input type="password" name="custpassword"><br>

		<input type="submit" value="signin">
	</form>
</body>
</html>