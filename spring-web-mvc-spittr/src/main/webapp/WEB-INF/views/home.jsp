<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<title>Spittr</title>
<%-- <link rel="stylesheet" type="text/css"
    href='<c:url value="/resources/style.css" />' /> --%>
</head>
<body>
    <!-- <h1>Welcome to Spittr</h1> -->
    <h1><spring:message code="spittr.welcome"/></h1>
    <a href="<c:url value='/spittles' />">Spittles</a> |
    <a href="<c:url value='/spitter/register' />">Register</a>
</body>
</html>
