<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculate" method="post">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required><br><br>

        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required><br><br>

        <label for="operation">Operation:</label>
        <select id="operation" name="operation">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select><br><br>

        <button type="submit">Calculate</button>
    </form>
</body>
</html>
