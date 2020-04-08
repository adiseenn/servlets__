<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 08.04.2020
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Message</title>
</head>
<body>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</body>

<h3 class="text-center text-white pt-5">Welcome form</h3>
<div class="container">
    <div id="login-row" class="row justify-content-center align-items-center">
        <div id="login-column" class="col-md-6">
            <div id="login-box" class="col-md-12">
                <form id="login-form" class="form" action="" method="post">
                    <h3 class="text-center text-info">Message form!</h3>
                        <label for="message" class="text-info">
                            Your message:
                            <input type="text" name="message" id="message" class="form-control" value="${cookie.get("message").value}">
                        </label>
                </form>
                </form>
            </div>
        </div>
    </div>
</div>

</html>
