<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Success</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <div class="alert alert-success" role="alert">
        Заявка успешно сохранена
    </div>
    <div>
        <strong>Username:</strong><%= request.getAttribute("username") %><br>
        <strong>First Name:</strong><%= request.getAttribute("firstName") %><br>
        <strong>Last Name:</strong><%= request.getAttribute("lastName") %><br>
        <strong>Middle Name:</strong><%= request.getAttribute("middleName") %><br>
        <strong>Gender:</strong><%= request.getAttribute("gender") %><br>
        <strong>Date of Birth:</strong><%= request.getAttribute("dob") %><br>
        <strong>City:</strong><%= request.getAttribute("city") %><br>
        <strong>Phone Number:</strong><%= request.getAttribute("phoneNumber") %><br>
        <%--            <strong>First Name:</strong><c:out value="${username}"/><br>--%>
        <%--            <strong>Last Name:</strong> ${requestScope.lastName}<br>--%>
        <%--            <strong>Middle Name:</strong> ${requestScope.middleName}<br>--%>
        <%--            <strong>Gender:</strong> ${requestScope.gender}<br>--%>
        <%--            <strong>Date of Birth:</strong> ${requestScope.dob}<br>--%>
        <%--            <strong>City:</strong> ${requestScope.city}<br>--%>
        <%--            <strong>Phone Number:</strong> ${requestScope.phoneNumber}<br>--%>
    </div>
</div>
</body>
</html>