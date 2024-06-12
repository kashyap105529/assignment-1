<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Student Details</h1>
    <p th:text="'Name: ' + ${student.name}"></p>
    <p th:text="'Age: ' + ${student.age}"></p>
    <p th:text="'Course: ' + ${student.course}"></p>
</body>
</html>