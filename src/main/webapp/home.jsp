<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="font-size: 50px;">
	<div class="bgimage">
		<div class="menu">
			<label class="text1"
				style="font-family: Cursive; color: rgb(255, 140, 0); float: left;">
				Eco Club </label> &nbsp&nbsp&nbsp&nbsp
				<a href="adddstudent.jsp" style="padding-left:30px; "><input
				type="button" value="Addstudent"style="border-radius: 8px;font-size: 25px;"></a>&nbsp&nbsp <a href="getemail.jsp"
				style="text-align: center;"><input type="button" value="Update"style="border-radius: 8px;font-size: 25px;"></a>
				

			<a href="logout.jsp"><input type="image" src="log.png" alt="button" class="button"
				style="height: 30px; width: 65px; margin: 10px 15px; position: relative; top: 20%; left: 30%;"></a>



		</div>
		<h6 style="float: left; font-size: 15px">${message}</h6>
		
		<form action="searchform.do" style="float:right;">
<input type="text" name="role" placeholder="search here....">
<input type="submit" value="search">
</form>
<h1 style="text-align: center;font-size: 20px;">Search results</h1>
<table style="margin-left: auto;margin-right: auto;font-size: 25px;margin-top: 5%;">
<!-- <tr>
<th> Name</th>
<th>CGPA</th>
<th>Branch</th>
<th>Role</th>
<th>Faculty incharge</th>
</tr> -->

<c:forEach items="${results}" var="role">
<tr>

<td>${role.getUname() }</td>
<td>${role.getCgpa() }</td>
<td>${role.getBranch() }</td>
<td>${role.getRole() }</td>
<td>${role.getFacultyincharge()}</td>
</tr>

</c:forEach>
</table>


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