<%--
  Created by IntelliJ IDEA.
  User: hasan
  Date: 7/29/2022
  Time: 1:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>User Detail List</h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <input type="button" value="Add User Detail"
               onclick="window.location.href='create'; return false;"
               class="add-button">

        <br><br>

        <table>
            <tr>
                <th>Father Name</th>
                <th>Mother Name</th>
                <th>User Name</th>
                <th>Action</th>
            </tr>

            <c:forEach var="userDetail" items="${userDetails}">

                <c:url var="updateLink" value="/user/detail/update">
                    <c:param name="userDetailId" value="${userDetail.id}"/>
                </c:url>

                <c:url var="deleteLink" value="/user/detail/delete">
                    <c:param name="userDetailId" value="${userDetail.id}"/>
                </c:url>

                <tr>
                    <td> ${userDetail.fatherName} </td>
                    <td> ${userDetail.motherName} </td>
                    <td> ${userDetail.user.firstName} ${userDetail.user.lastName} </td>
                    <td>
                        <a href="${updateLink}">Update</a> | <a href="${deleteLink}">Delete</a>
                    </td>
                </tr>

            </c:forEach>
        </table>

        <a href="${pageContext.request.contextPath}/user/list">User List</a>
    </div>


</body>
</html>
