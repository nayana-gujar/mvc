<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="/saveStu">
        <table>
            <tr>
                <td>USERID:</td>
                <td><input type="text" name="sid" required></td>    
            </tr>

            <tr>
                <td>First Name:</td>
                <td><input type="text" name="fname" required></td>    
            </tr>

            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lname" required></td>    
            </tr>

            <tr>
                <td>Address:</td>
                <td><input type="text" name="saddress" required></td>    
            </tr>

            <tr>
                <td>Marks:</td>
                <td><input type="number" name="smarks" required></td>    
            </tr>

            <tr>
                <td><input type="submit" value="Reg"></td>    
            </tr>
        </table>
    </form>
</body>
</html>
