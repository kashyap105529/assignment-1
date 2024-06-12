<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
	<br>
	<h1 id="heading">BMI Calculator</h1>
	<table>
		<caption style="font-weight: bolder;">Body Mass Index
			Calculator Form</caption>
      
      		<sf:form action="getBMI" modelAttribute="user" method="GET"
			name="form">
			
			<tr>
				<td>Enter Name:</td>
				<td><sf:input path="name" id="name" /></td>
				<td><sf:errors path="name" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><sf:input path="phoneNumber" id="phoneNumber" /></td>
				<td><sf:errors path="phoneNumber" /></td>
			</tr>
			<tr>
				<td>Height in CM:</td>
				<td><sf:input path="height" id="height" /></td>
				<td><sf:errors path="height" /></td>
			</tr>

			<tr>
				<td>Weight in KG:</td>
				<td><sf:input path="weight" id="weight" /></td>
				<td><sf:errors path="weight" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><sf:select path="genderType" id="genderType" items="${genderList}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="CalculateBMI" name="calculateBMI" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</sf:form>
	</table>
</body>
</html>