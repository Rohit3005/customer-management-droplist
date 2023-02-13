<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CUSTOMER SIGNIN PAGE</title>
</head>
<body style="background-color: yellow;">
	<form action="CustomerController" method="get"
		style="text-align: center;">
		<input type="hidden" name="action" value="signup"> CUSTOMER
		NAME <input type="text" name="custname"><br> CUSTOMER
		ADDRESS <input type="text" name="custaddress"><br> STATE
		<select name="addstate">
			<%
			List<String> options = new ArrayList<>();
			options.add("Maharashtra");
			options.add("Punjab");
			options.add("Hariyana");
			options.add("Kerla");
			options.add("Goa");
			options.add("J&K");

			for (String option : options) {
			%>
			<option value="<%=option%>"><%=option%></option>
			<%
			}
			%>

		</select>
		<script>
			var select = document.getElementById("selectedOption");
			select.addEventListener("change", function() {
				var selectedOption = select.value;
				// Do something with selectedOption
			});
		</script>

		<br> CUSTOMER CONTACTNUMBER<input type="text"
			name="custcontactnumber"><br> CUSTOMER ACC BALANCE <input
			type="text" name="custaccbalance"><br> CUSTOMER AGE <input
			type="text" name="custage"><br> CUSTOMER DOB <input
			type="text" name="custdob"><br> CUSTOMER EMAILID <input
			type="email" name="custemailid"><br> CUSTOMER PASSWORD <input
			type="password" name="custpassword"><br> <input
			type="submit" value="signup"> <input type="reset"
			value="clear">



	</form>

</body>
</html>