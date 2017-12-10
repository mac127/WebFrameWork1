<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>

Customer ID (id001,id002,id003,id004,id005):
		<input type="text" name="customerId"><br>
		Passsword (00001,00002,00003,00004,00005):
		<input type="password" name="password"><br>
		<input type="submit" value="press">


<p> <a href = "${pageContext.request.contextPath }/offers">Show current Offers</a></p>

</body>
</html>
