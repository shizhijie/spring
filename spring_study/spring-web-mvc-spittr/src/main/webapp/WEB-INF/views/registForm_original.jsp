<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>spittr</title>
</head>
<body>
  	<h1>Register</h1>
  	<form method="post">
  		First name(名字):<input type="text" name="firstName"/><br/>
  		Last name(姓氏):<input type="text" name="lastName"/><br/>
  		UserName:<input type="text" name="username"/><br/>
  		Password:<input type="text" name="password"/><br/>
  		<input type="submit" value="Register"/>
  	</form>
</body>
</html>