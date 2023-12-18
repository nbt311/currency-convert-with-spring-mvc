<%--
  Created by IntelliJ IDEA.
  User: nbtru
  Date: 12/18/2023
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    Exchange Rate: <input type="text" name="exchangeRate" required/><br/>
    USD Amount: <input type="text" name="usdAmount" required/><br/>
    <input type="submit" value="Convert"/>
</form>
</body>
</html>

</body>
</html>
