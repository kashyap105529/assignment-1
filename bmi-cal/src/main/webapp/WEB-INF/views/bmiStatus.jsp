<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 id="status">
		Id:${validUser.userId}<br>
		Name: ${validUser.name}<br>
		Height: ${validUser.height}<br>
		Weight: ${validUser.weight}<br>
		BMI: ${bmi}<br>
		Status: You are ${BMIstatus}<br>
	</h2>
</body>
</html>