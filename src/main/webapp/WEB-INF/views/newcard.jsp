<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Card Form</title>

    <style>

        .error {
            color: #ff0000;
        }
    </style>

</head>

<body>

<h2>Card Form</h2>

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
Go back to <a href="<c:url value='/mydictionary' />">My dictionary</a>
</body>
</html>