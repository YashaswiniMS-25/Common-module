<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<script type="text/javascript" src="validation.js" ></script>

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
			

			<a href="logout.jsp"><input type="image" src="log.png" alt="button" class="button"
					style="height: 30px; width: 65px;  margin: 10px 15px; position: relative; top: 20%; left: 40%;"></a>
		


		</div>
	<form action="email.do" name="form1" onsubmit="return validatefield()">
		<table style="margin-left: auto;margin-right: auto; padding-bottom:15%;padding-top: 10%">
			<tr>

				<td>Email</td>
				<td>:</td>
				<td><input type="email" name="EmailId" placeholder="enter eamil"><span id="namelocation"></span></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>

				<td></td>
				<td></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				
						
				<td><input type="submit" value="Update"></td>
				
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