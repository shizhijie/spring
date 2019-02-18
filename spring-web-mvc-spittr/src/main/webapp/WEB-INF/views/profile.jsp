<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>Profile</title>
</head>
<body>
  	<h1>Your Profile</h1>
  	<c:out value="${spitter.username}"/><br/>
  	<c:out value="${spitter.firstName}"/>
  		<c:out value="${spitter.lastName}"/>
</body>
</html>