<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 수치</title>
</head>
<body>
	<%
		String heightString = request.getParameter("height");
		String weightString = request.getParameter("weight");
	
		int height = Integer.parseInt(heightString);
		int weight = Integer.parseInt(weightString);
		
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		
	%>
	
	<table>
		<%
		String status = null;
		if(bmi <= 20){
			status = "저체중 \n";
		} else if(bmi <= 25) {
		    status = "정상 \n";
		} else if(bmi <= 30) {
			status = "과체중 \n";
		} else {
			status = "비만 \n";
		}
		%>	
		
		<h2>BMI 측정결과</h2> 
		
		<h1>당신은 <%= status %>입니다.</h1>
		
		<tr>
			<td>BMI 수치 : </td>
			<td><%= bmi %></td>
		</tr>		
	
	</table>
	
	

</body>
</html>