<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

<h2>User Registration Form</h2>

<form method="POST">

    Username:
    <input type="text" name="username" required>
    <br><br>

    Password:
    <input type="password" name="password" required>
    <br><br>

    <input type="submit" value="Register">

</form>

<?php

if($_SERVER["REQUEST_METHOD"] == "POST")
{
    // Receive form data
    $username = $_POST['username'];
    $password = $_POST['password'];

    // Hash the password
    $hashedPassword = password_hash($password, PASSWORD_DEFAULT);

    echo "<h3>Registration Successful</h3>";

    echo "Username: " . $username . "<br><br>";

    echo "Original Password: " . $password . "<br><br>";

    echo "Hashed Password: " . $hashedPassword;
}

?>

</body>
</html>