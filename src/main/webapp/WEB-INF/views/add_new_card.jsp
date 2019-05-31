<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Card Form</title>
</head>

<body>

<h1>Card Form</h1>

<form:form method="POST" modelAttribute="card">
    <form:input type="hidden" path="id" id="id"/>
    <table>
        <tr>
            <td><label for="phraseInEnglish">Phrase: </label> </td>
            <td><form:input path="phraseInEnglish" id="phraseInEnglish"/></td>
        </tr>

        <tr>
            <td><label for="translation">Translation: </label> </td>
            <td><form:input path="translation" id="translation"/></td>
        </tr>

        <tr>
            <td><label for="defaultUsageExample">Default example: </label> </td>
            <td><form:input path="defaultUsageExample" id="defaultUsageExample"/></td>
        </tr>

        <tr>
            <td><label for="userUsageExample">User example: </label> </td>
            <td><form:input path="userUsageExample" id="userUsageExample"/></td>
        </tr>

        <tr>
            <td><label for="numberOfTrainings">Number of trainings: </label> </td>
            <td><form:input path="numberOfTrainings" id="numberOfTrainings"/></td>
        </tr>

        <tr>
            <td><label for="lastTrainingDate">Last training date: </label> </td>
            <td><form:input path="lastTrainingDate" id="lastTrainingDate"/></td>
        </tr>

        <tr>
            <td colspan="3">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" value="Update"/>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Register"/>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
</form:form>
<br/>
<br/>
<a href="<c:url value='/mydictionary' />">Go back to My dictionary</a>
</body>
</html>