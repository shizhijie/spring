<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<%--  <h1><spring:message code="spittr.welcome"/></h1> --%>
 <h1>Bienvenidos to Spittr(你好西班牙)!</h1>
<a href="<c:url value="/spittles" />">Spittles</a> | 
<a href="<c:url value="/spitter/register" />">Register</a>
