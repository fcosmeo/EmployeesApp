<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="service" class="pe.edu.utp.employeesapp.models.ServiceBean" scope="page"/>
<html>
<head>
    <title>List Regions</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>
<table class="table-condensed">
    <tr>
        <th>Nro Employee</th>
        <th>Birht Date</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Hire Date</th>
    </tr>
    <c:forEach var="employee" items="${service.allEmployees}">
        <tr>
            <td><c:out value="${employee.no}"/> </td>
            <td><c:out value="${employee.dateBirth}"/> </td>
            <td><c:out value="${employee.nameFirst}"/> </td>
            <td><c:out value="${employee.nameLast}"/> </td>
            <td><c:out value="${employee.dateHire}"/> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
