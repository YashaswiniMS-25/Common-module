<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<script type="text/javascript" src="validation.js"></script>
<script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="bgimage">
		<div class="menu">
			<h1 class="text1"
				style="font-family: Cursive; color: rgb(255, 140, 0);">
				Eco Club 
			</h1>
			

				<a href="login.jsp"><input type="image" src="log.png" alt="button" class="button"
					style="height: 30px; width: 65px;  margin: 10px 15px; position: relative; top: 20%; left: 40%;"></a>
			


		</div>
<h1 style="margin-left: auto;margin-right: auto;text-align: center">Add Student</h1>

	<form action="addstudent.do" name="form2" onsubmit="return validateform()">
		<table style="margin-left: auto; margin-right: auto;padding-bottom: 13%">
			<tr>
				<td>Student Name</td>
				
				<td>:</td>
				<td><input type="text" name="uname"placeholder="Enter name"><span id="namelocation"></span></td>
			</tr>

			<tr>
				<td>Student branch</td>
				
				<td>:</td>
				<td><input type="text" name="branch"placeholder="Enter branch"><span id="namelocation"></span></td>
			</tr>

			<tr>
				<td>role</td>
				<td>:</td>
				<td><input type="text" name="role" placeholder="Enter role of student"><span id="namelocation"></span></td>
			</tr>
			<tr>
				<td>cgpa</td>
				<td>:</td>
				<td><input type="text" name="cgpa"placeholder="Enter cgpa"><span id="namelocation"></span></td>
			</tr>
			<tr>
				<td>faculty incharge</td>
				<td>:</td>
				<td><input type="text" name="facultyincharge"placeholder="Enter facultyname"><span id="namelocation"></span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="add details"></td>
				<td></td>
		</table>



	</form>
	<div class="footer">
			<a href="https://www.website.com/contact-us/"
				style="font-size: 25px; float: left; text-decoration: none; color: chocolate">ContactUs</a>

			<a href="https://support.google.com/legal/answer/3463239?hl=en"
				style="text-align: center; font-size: 25px; text-decoration: none; color: chocolate">CopyRight</a>
			<a href="http://www.google.com"
				style="float: right; font-size: 25px; text-decoration: none; color: chocolate;">Help</a>
		</div>

</div>
</body>
</html>