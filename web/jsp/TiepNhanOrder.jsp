<%-- 
    Document   : TiepNhanOrder
    Created on : Dec 3, 2018, 7:27:16 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Tiếp nhận order</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/tiepNhanOrderCss.css">
    </head>
    <body>
        <div class="container">
            <jsp:include page="header.jsp"></jsp:include>
            <div class="ordertb">
                <table class="table table-primary">
                    <tr >
                        <td>#1</td>
                        <td>Bàn 1</td>
                        <td>(2 xuất) Cơm rang thập cẩm.<br>
                            (1 xuất) bún cá.<br>
                            (1 xuất) bún ngan.<br>
                            (1 xuất) mỳ xào bò.<br>
                        </td>
                        <td>(1 cốc) Trà sữa.</td>
                        <td> Cách đây 7 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#2</td>
                        <td>Bàn 2</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa.</td>
                        <td> Cách đây 6 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#3</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 4 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#4</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 3 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#5</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 3 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#6</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 2 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#7</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 1 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>
                    <tr>
                        <td>#8</td>
                        <td>Bàn 10</td>
                        <td>(2 xuất) Cơm rang thập cẩm.</td>
                        <td>(1 cốc) Trà sữa chân châu đường đen.</td>
                        <td> Cách đây 0 phút</td>
                        <td>
                            <input type="checkbox" class="checkbox">
                        </td>
                    </tr>

                </table>
                <input type="button" class="btn-info" value="Lưu dữ liệu hôm nay" id="savedata">
            </div>
        </div>
    </body>
</html>

