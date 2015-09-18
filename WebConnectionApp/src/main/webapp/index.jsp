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
		<h4>For New User</h4>
		<form name="RegistrationPage" action="webapi/employee" method="post">
			<table border="1">
				<tr>
					<td class="heading">Name</td>
					<td><input name="name" size=15 type="text" />
				</tr>
				<tr>
					<td class="heading">Address</td>
					<td><input name="address" size=15 type="text" />
				</tr>
				<tr>
					<td class="heading">Email</td>
					<td><input name="email" size=15 type="text" />
				</tr>
			</table>
			<br> <input type="submit" value="submit">

		</form>
	</center>
</body>
</html>