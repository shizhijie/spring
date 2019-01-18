<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %><html>
<html>
<head>
    <title>Spittles List</title>
</head>
<body>
  	<div class="spittleView">
  		<div><c:out value="${spittle.message}"/></div>
  		<div><c:out value="${spittle.time}"/></div>
  	</div>
</body>
</html>