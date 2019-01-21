<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>spittr</title>
    <style type="text/css">
    	/* span.error{
    		color:red;
    	} */
    	div.errors{
    		border: 2px solid red;
    		background-color: #ffcccc;
    	}
    	/* label.error {
			color:red;
		}
		input.error{
			background-color: #ffcccc;
		} */
    </style>
</head>
<body>
  	<h1>Register</h1>
  	<%-- <sf:form method="post" commandName="spitter"> --%>
  	<%-- <sf:form method="post" modelAttribute="spitter">
  		First name(名字):<sf:input path="firstName"/>
  						 <sf:errors path="firstName" cssClass="error"/><br/>
  		Last name(姓氏):<sf:input path="lastName"/>
  						<sf:errors path="lastName" cssClass="error"/><br/>
  		UserName:<sf:input path="username"/>
  				 <sf:errors path="username" cssClass="error"/><br/>
  		Password:<sf:input path="password"/>
  				 <sf:errors path="password" cssClass="error"/><br/>
  		<input type="submit" value="Register"/>
  	</sf:form> --%>
  	
  	<sf:form method="post" modelAttribute="spitter">
  		<sf:errors path="*" element="div" cssClass="errors"/>
  		First name(名字):<sf:input path="firstName"/><br/>
  		Last name(姓氏):<sf:input path="lastName"/><br/>
  		UserName:<sf:input path="username"/><br/>
  		Password:<sf:input path="password"/><br/>
  		<input type="submit" value="Register"/>
  		<%-- <a href="<spring:url href="spitter/register"/>">Register</a> --%>
  		
  		<!-- 赋值取值 -->
  		<%-- <spring:url value="/spitter/register" var="registerUrl"/>
  		<input type="text" value="${registerUrl}"/> --%>
  	</sf:form>
  	
  	<%-- <sf:form method="post" modelAttribute="spitter">
  		<sf:label path="firstName" cssErrorClass="error">First name(名字)</sf:label>:
  		<sf:input path="firstName" cssErrorClass="error"/><br/>
  		<sf:label path="lastName" cssErrorClass="error">Last name(姓氏)</sf:label>:
  		<sf:input path="lastName" cssErrorClass="error"/><br/>
  		<sf:label path="username" cssErrorClass="error">UserName</sf:label>:
  		<sf:input path="username" cssErrorClass="error"/><br/>
  		<sf:label path="password" cssErrorClass="error">Password</sf:label>:
  		<sf:input path="password" cssErrorClass="error"/><br/>
  		<input type="submit" value="Register"/>
  	</sf:form> --%>
  	
<!--   	<attribute>
			<description>Name of the model attribute under which the form object is exposed.
			Defaults to 'command'.</description>
			<name>modelAttribute</name>
			<required>false</required>
			<rtexprvalue>true</rtexprvalue>
		</attribute>
		<attribute>
			<description>DEPRECATED: Use "modelAttribute" instead.</description>
			<name>commandName</name>
			<required>false</required>
			<rtexprvalue>true</rtexprvalue>
		</attribute> -->
</body>
</html>