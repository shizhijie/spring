<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false"%>
<h1>Register</h1>

<sf:form method="post" modelAttribute="spitter">
	<sf:label path="firstName" cssErrorClass="error">First name(名字)</sf:label>:
  		<sf:input path="firstName" cssErrorClass="error" />
	<br />
	<sf:label path="lastName" cssErrorClass="error">Last name(姓氏)</sf:label>:
  		<sf:input path="lastName" cssErrorClass="error" />
	<br />
	<sf:label path="username" cssErrorClass="error">UserName</sf:label>:
  		<sf:input path="username" cssErrorClass="error" />
	<br />
	<sf:label path="password" cssErrorClass="error">Password</sf:label>:
  		<sf:input path="password" cssErrorClass="error" />
	<br />
	<input type="submit" value="Register" />
</sf:form>