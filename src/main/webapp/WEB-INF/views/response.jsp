<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Response</title>
</head>

<body>
<h1>message : ${message}</h1>
<br/>
<a href="<c:url value='/mydictionary' />">Go back to My dictionary</a>

</body>

</html>