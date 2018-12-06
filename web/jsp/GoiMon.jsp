<%-- 
    Document   : GoiMon
    Created on : Dec 3, 2018, 7:34:21 AM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Gọi món</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/goimoncss.css">
    </head>




    <body>
        <div class="btheader">
            <form>
                <input type="submit" class="btn-danger" value="Chuyển cho đầu bếp">
            </form>

            <input type="button" class="btn-dark" value="Reset">
            <select name="selectTab">
                <option value="${-1}">--Chọn bàn--</option>
                <c:forEach items="${tablist}" var="tab">
                    <option value="${tab.tableId}">${tab.tableName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="container">
            <jsp:include page="header.jsp"></jsp:include>
                <div class="menu">
                    <div class="itemmenu foodmenu">
                        <table class="foodtb table">
                        <c:set var="countTr" value="${fn:length(flist)}"/>
                        <c:forEach var="i" begin="0" end="${countTr-1}" step="2">
                            <tr>
                                <td>
                                    <div class="itemImgdiv">
                                        <img src="image/${flist.get(i).itemimage}" class="foodimg">
                                    </div>
                                    <div class="fooddetail">
                                        <div class="itemnum">
                                            <input type="button" value="+" class="btn-success">
                                            <input type="text" value="0">
                                            <input type="button" value="-" class="btn-danger">
                                        </div>
                                        <div class="itemname">
                                            ${flist.get(i).itemname} 
                                        </div>
                                        <div class="itemprice">
                                            <select>
                                                <c:forEach items="${flist.get(i).itemprice}" var="price">
                                                    <option>
                                                        ${price}
                                                    </option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                                <c:if test="${i+1 != countTr}">
                                    <td>
                                        <div class="itemImgdiv">
                                            <img src="image/${flist.get(i+1).itemimage}" class="foodimg">
                                        </div>
                                        <div class="fooddetail">
                                            <div class="itemnum">
                                                <input type="button" value="+" class="btn-success">
                                                <input type="text" value="0">
                                                <input type="button" value="-" class="btn-danger">
                                            </div>
                                            <div class="itemname">
                                                ${flist.get(i+1).itemname} 
                                            </div>
                                            <div class="itemprice">
                                                <select>
                                                    <c:forEach items="${flist.get(i+1).itemprice}" var="price">
                                                        <option>
                                                            ${price}
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </td>
                                </c:if>
                            </tr>
                        </c:forEach>


                    </table>
                </div>
                <div class="itemmenu drinkmenu">
                    <table class="table drinktable">

                        <c:forEach var="i" begin="0" end="${fn:length(dlist)-1}" step="1">
                            <tr>
                                <td>
                                    <div class="itemImgdiv">
                                        <img src="image/${dlist.get(i).itemimage}" class="foodimg">
                                    </div>
                                    <div class="fooddetail">
                                        <div class="itemnum">
                                            <input type="button" value="+" class="btn-success">
                                            <input type="text" value="0">
                                            <input type="button" value="-" class="btn-danger">
                                        </div>
                                        <div class="itemname">
                                            ${dlist.get(i).itemname}            
                                        </div>
                                        <div class="itemprice">
                                            <select>
                                                <c:forEach items="${flist.get(i+1).itemprice}" var="price">
                                                    <option>
                                                        ${price}
                                                    </option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                            </tr>        
                        </c:forEach>
                    </table>
                </div>


            </div>
        </div>
    </body>
</html>

