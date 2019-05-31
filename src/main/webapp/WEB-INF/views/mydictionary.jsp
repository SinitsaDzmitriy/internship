<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>My Dictionary</title>

    <style>
        tr:first-child {
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>

</head>


<body>

<h2>List of Cards</h2>
<table>
    <tr>
        <td>Phrase</td>
        <td>Translation</td>
        <td>Default example</td>
        <td>My example</td>
        <td>Number of trainings</td>
        <td>Last</td>
    </tr>
    <c:forEach items="${cards}" var="card">
        <tr>
            <td><a href="<c:url value='/edit-${card.phraseInEnglish}-card' />">${card.phraseInEnglish}</a></td>
            <td>${card.translation}</td>
            <td>${card.defaultUsageExample}</td>
            <td>${card.userUsageExample}</td>
            <td>${card.numberOfTrainings}</td>
            <td>${card.lastTrainingDate}</td>
            <td><a href="<c:url value='/delete-${card.translation}-card' />">delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="<c:url value='/card/add'/>">add new card</a>
</body>
</html>

