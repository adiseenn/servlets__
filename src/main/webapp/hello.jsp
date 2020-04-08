<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</body>

<a href="${pageContext.request.contextPath}/">Exit</a>
<jsp:include page="_menu.jsp"></jsp:include>

<h3 class="text-center text-white pt-5">Welcome form</h3>
<div class="container">
    <div id="login-row" class="row justify-content-center align-items-center">
        <div id="login-column" class="col-md-6">
            <div id="login-box" class="col-md-12">
                <form id="login-form" class="form" action="" method="post">
                    <h3 class="text-center text-info">Welcome ${login}!</h3>
                    <div class="form-group">
                        <label for="username" class="text-info">Username: </label><br>
                        <input type="text" name="userName" id="username" class="form-control" value= "${login}">
                    </div>
                    <div class="form-group">
                        <a href="image">Get an image</a>
                    </div>
                    <form action="hello" method="post">
                        <label for="message" class="text-info">
                            Enter message
                            <input type="text" name="message" id="message" class="form-control">
                        </label>
                        <input type="submit" value="Send" class="btn btn-info btn-md">
                    </form>
                </form>
                </form>
            </div>
        </div>
    </div>
</div>
</html>

