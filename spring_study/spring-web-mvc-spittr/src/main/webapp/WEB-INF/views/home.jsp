<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Spittr</title>
<link rel="stylesheet" type="text/css"
    href='<c:url value="/resources/style.css" />' />
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value='/spittles' />">Spittles</a> |
    <a href="<c:url value='/spitter/register' />">Register</a>
</body>
</html>
