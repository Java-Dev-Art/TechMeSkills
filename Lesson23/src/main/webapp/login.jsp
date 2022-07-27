
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login form example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <%--    Put elements int center of page--%>
    <div class="col-md-8 offset-md-4">
        <h2>HELLO, welcome </h2>
        <p>Please, enter your password and username </p>
        <br>
<%--        <h2>username : art</h2>--%>
<%--        <br>--%>
<%--        <h2>pass : 0000</h2>--%>
        <form method="post" class="needs-validation" novalidate action="/login">
            <input type="hidden" name="command" value="sign-in"/>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" class="form-control w-25" id="username" placeholder="Enter username" name="username"
                       required>
                <div class="invalid-feedback">Username should be entered!</div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control w-25" id="password" placeholder="Enter password" name="password"
                       required>
                <div class="invalid-feedback">Password should be entered!</div>
            </div>
            <button type="submit" class="btn btn-primary" id="loginBtn" >Login</button>
        </form>
    </div>
</div>
<script>
    document.getElementById("loginBtn").disabled=true;

    document.getElementById("username").addEventListener('keyup',e =>{
            document.getElementById("loginBtn").disabled = e.target.value === "";
        }
    );
    document.getElementById("password").addEventListener('keyup',e =>{
            document.getElementById("loginBtn").disabled = e.target.value === "";
        }
    );
</script>
</body>
</html>