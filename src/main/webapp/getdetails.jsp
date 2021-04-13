<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
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
			

				<a href="login.jsp"><input type="image" src="log.png" alt="button" class="button"
					style="height: 30px; width: 65px;  margin: 10px 15px; position: relative; top: 20%; left: 40%;"></a>
			


		</div>




<h1 style="text-align: center ">Update</h1>
<form action="get.do" name="form3" onsubmit="return validateUpdate()" style="margin-left: auto;margin-right: auto;padding-top:5px">
<table style="text-align: center;margin-left: auto;margin-right: auto;padding-bottom:15%">
<tr>
<td>Candidate name</td>
<td>:</td>
<td><input type="text" name="UserName" placeholder="${entity.getUserName()}"><span id="namelocation"></span></td>
</tr>

<tr>
<td>canndidate dob</td>
<td>:</td>
<td><input type="text" name="Dob" placeholder="${entity.getDob()}"></td>

</tr>

<tr>
<td>candidate gender</td>
<td>:</td>
<td><input type="text" name="Gender" placeholder="${entity.getGender()}"></td>
</tr>

<tr>
<td>usn</td>
<td>:</td>
<td><input type="text" name="Usn"placeholder="${entity.getUsn()}"><span id="namelocation"></span></td>
</tr>

<tr>
<td>Branch</td>
<td>:</td>
<td><input type="text" name="Branch"placeholder="${entity.getBranch()}"></td>
</tr>

<tr>
<td>email</td>
<td>:</td>
<td><input type="text" name="EmailId" placeholder="${entity.getEmailId()}"></td>
</tr>
<tr>

<tr>
<td> contact no</td>
<td>:</td>
<td><input type="number" name="Contactno" placeholder="${entity.getContactno()}"></td>
</tr>
<tr></tr>
<tr></tr>

<tr>
<td> </td>
<td><input type="submit"name="" value="update"></td>
<td></td>

</tr>

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