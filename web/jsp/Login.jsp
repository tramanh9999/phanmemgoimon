
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Đăng nhập</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="css/login_css.css" rel="stylesheet">
    </head>
    <body id="LoginForm">
        <div class="container">
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>Login</h2>
                        <p>Please enter your username and password</p>
                    </div>
                    <form id="Login" method="post" action="Login">
                        <div class="form-group">
                            <input type="text" class="form-control" id="inputEmail" placeholder="Username" name="username" value="${username}">
                        </div>  
                        <div class="form-group">
                            <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="password" value="${password}">
                        </div>
                        <span class="redMess">${message}</span>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </div>
            </div></div></div>
</body>
</html>
