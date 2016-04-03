<html>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>
</head>
<body>
    <h2 style="text-align: center;">Hi there! Welcome to chat app!</h2>
<br>
<br>
<div class="col-md-4 col-md-offset-4">
    <form name="registration" action="script/request.php" method="post">
        <label>
            <input type="text" name="firstname" value="Your name">
        </label>
        <br>
        <label>
            <input type="password" name="pass" value="Password">
        </label>
        <br>
        <label>
            Accept the terms and conditions
            <input type="checkbox" name="terms" value="yes">
        </label>
        <br>
        <input type="button" name="start" value="Start" onclick="location.href='/WEB-INF/test.jsp'">
    </form>
</div>
</body>
</html>
