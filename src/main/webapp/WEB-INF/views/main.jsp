<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Main</title>
    </head>
<body>
<h1>Welcome to AvEng</h1><br>
<a href="<c:url value="/mydictionary" />">My dictionary</a><br>
<a href="<c:url value="/training" />">Training</a><br>
<a href="<c:url value="/statistics" />">Statistics</a><br>
<a href="<c:url value="/settings" />">Settings</a><br>
</body>
</html>