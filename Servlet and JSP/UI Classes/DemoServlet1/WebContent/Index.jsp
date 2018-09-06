<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <c:url scope="session" value="store.do" var="postUrl"/>
<form action="${sessionscopepostUrl}" method="post">
		Name : <input type="text" name="name" /><br /> 
		UserName :<input type="text" name="username" /><br />
		City : <input type="text" name="city" /><br /> 
		Mobile : <input type="text" name="mobile" /><br />
		Email : <input type="email" name="email" /><br />
		Interested in buying :<br>
		Electronics :<input type="checkbox" name="intrest" value="electronics"/><br />
		Mobile :<input type="checkbox" name="intrest" value="mobile"/><br />
		Stationary :<input type="checkbox" name="intrest" value="stationary"/><br />
		<input type="submit" value="store">
</form>
</body>
</html>