<%-- 
    Document   : AccountInfo
    Created on : Dec 5, 2018, 11:45:43 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin tài khoản</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="header.jsp"></jsp:include>
            <form action="Account" method="post">
                <input class="input-group"value="${username}" type="text">
                <input class="input-group" value="${password}" type="text">
                <input type="submit" class="btn-danger">
            </form>
        </div>
    </body>
</html>
