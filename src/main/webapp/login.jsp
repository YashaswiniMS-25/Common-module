<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="bgimage">
		<div class="menu">
			<label class="text1"
				style="font-family: Cursive; color: rgb(255, 140, 0);">
				Eco Club 
			</label>
			

				<!-- <input type="image" src="log.png" alt="submit" class="button"
					style="height: 30px; width: 65px;  margin: 10px 15px; position: relative; top: 20%; left: 40%;"> -->
		


		</div>
${message}
<h1 style="text-align: center">Login here</h1>
<form action="login.do" style="margin-left: auto;margin-top: auto;padding-top:10%;padding-bottom: 15%">
Username:<input type="text" name="UserName" placeholder="Enter your username"><br><br>
Password<input type="password" name="Password" placeholder="Enter your password"><br><br>
<input type="submit" value="Login">
<input type="reset" value="cancel">
<a href="index.jsp">SignUp</a>




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