<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validateForm() {

		var name = document.f1.UserName.value;
		var iChars = "!@#$%^^&*()+=-[]\\\';,./{}|\":<>?";
		var email = document.f1.EmailId.value;
		var phnno = document.f1.Contactno.value;
		var phn = /^\d{10}$/;
		var psswrd = document.f1.Password.value;
		var pswrd = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		var cnfp = document.f1.cnfPassword.value;
		var dob = document.f1.Dob.value;
		var Gender = document.f1.Gender.value;
		if (name == "" || name == null || name.length<3|| name.length>18) {
			document.getElementById("namelocation").innerHTML = alert(" name should be of length 3 to 18 ")
			return false;
		}
		for (var i = 0; i < document.f1.UserName.value.length; i++) {
			if (iChars.indexOf(document.f1.UserName.value.charAt(i)) != -1) {
				alert("special character not allowed");
				document.f1.UserName.focus();
				return false;
			}

		}
		if (email == "" || email == null || email.length<5 || email.length>56) {
			alert("invallid email")
			return false;
		}
		if (!phnno.match(phn)) {
			alert("contact number is invalid");

			return false;

		}
		if (psswrd.match(pswrd)) {

		} else {
			alert("password should contain one special character one numeric one lowercase and length should be 8 to 18")
			return false;
		}

		if (cnfp == psswrd || cnfp!="" ) {
			
		}
			
		else{
			alert("password didnt match");
			return false;
		}
		
		if (dob != "" || dob != null) {

		} else {
			alert("Dob is invalid");

		}

		if (Gender != "" || Gender != null) {

		} else {
			alert("enter gender")
		}

	}
</script>




</head>
<body>
	<div class="bgimage">
		<div class="menu">
			<label class="text1"
				style="font-family: Cursive; color: rgb(255, 140, 0);">
				Eco Club 
			</label>
			

				


		</div>

		<h1>Register Here</h1>
		
		<form action="user.do" name="f1" class="first"
			onsubmit="return validateForm()" style="padding-top: 25px">
			<table
				style="text-align: center; margin-left: auto; margin-right: auto; color: black; font-weight: bold;">
				<tr>
					<td>UserName</td>
					<td>:</td>
					<td><input type="text" name="UserName"
						placeholder="Enter Username"><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>

				<tr>
					<td>EmailId</td>
					<td>:</td>
					<td><input type="email" name="EmailId"
						placeholder="abc@gmail.com"><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>


				<tr>
					<td>USN</td>
					<td>:</td>
					<td><input type="text" name="Usn" placeholder="e.g 4MC17IS063"><span
						id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>

				<tr>
					<td>Branch</td>
					<td>:</td>
					<td><select name="Branch" id="Branch">
							<option value="Information Science And Engineering">ISE</option>
							<option value="Computer science And Engineering">CSE</option>
							<option value="Electronics and Communication Engineering">ECE</option>
							<option value="Mechanical Engineering">ME</option>
					</select><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>

				<tr>
					<td>Contact no</td>
					<td>:</td>
					<td><input type="text" name="Contactno"
						placeholder="e.g:8762131519"><span id="namelocation"></span></td>
				</tr>

				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>


				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="radio" id="male" name="Gender" value="male">
						<label for="male">Male</label> <input type="radio" id="female"
						name="Gender" value="female"> <label for="female">Female</label>
						<input type="radio" id="others" name="Gender" value="others">
						<label for="others">Others</label><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td>:</td>
					<td><input type="Date" name="Dob"
						placeholder="Choose Date of Birth"><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="Password"
						placeholder="enter strong password"><span
						id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td>:</td>
					<td><input type="password" name="cnfPassword"
						placeholder="Confirm password"><span id="namelocation"></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset" class="button"
						style="margin: 4px 2px; text-decoration: none; display: inline-block; font-size: 16px; margin-top: 15px; cursor: pointer; background-color: chocolate; border-radius: 12px;"></td>
					<td></td>
					<td><input type="submit" value="Save" class="button"
						style="margin: 4px 2px; text-decoration: none; display: inline-block; font-size: 16px; margin-top: 15px; cursor: pointer; background-color: chocolate; border-radius: 12px;"></td>
						<td><a href="login.jsp"><input type="button" value="Login" class="button"
						style="margin: 4px 2px; text-decoration: none; display: inline-block; font-size: 16px; margin-top: 15px; cursor: pointer; background-color: chocolate; border-radius: 12px;"></a></td>
				</tr>
				
				
			</table>


		</form>
		<pre>
		
		
		
		
		
		
		
			
		
		</pre>
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