/**
 * 
 */
function validatefield() {
	var email = document.form1.EmailId.value;
	if (email == "" || email == null) {
		document.getElementById("namelocation").innerHTML = alert("enter email");
		return false;

	}
	}
	
	function validateform(){
		var name=document.form2.uname.value;
		var branch=document.form2.branch.value;
		var cgpa=document.form2.cgpa.value;
		var role=document.form2.role.value;
		var fincharge=document.form2.facultyincharge.value;
		
		if(name==null || name==""){
			document.getElementById("namelocation").innerHTML=alert("enter name");
			return false;
			
		}
		if(branch==null || branch==""){
			document.getElementById("namelocation").innerHTML=alert("enter branch name");
			return false;
		}
		if(cgpa=="" || cgpa==null){
			alert("enter cgpa ");
			return false;
		}
		if(role=="" || role==null){
			document.getElementById("namelocation").innerHTML=alert("enter role");
			return false;
		}
		if(fincharge==""|| fincharge==null){
			document.getElementById("namelocation").innerHTML=alert("enter fincharge");
			return false;
		}
	}

function validateUpdate(){
	var name=document.form3.UserName.value;
	var usn=document.form3.Usn.value;
	var branch=document.form3.Branch.value;
	var gender=document.form3.Gender.value;
	var email=document.form3.EmailId.value;
	var dob=document.form3.Dob.value;
	var contactno=document.form3.Contactno.value;
	if(name=="" || name==null){
		document.getElementById("namelocation").innerHTML=alert("ënter name");
		return false;
	}
	if(usn=="" || usn==null){
		document.getElementById("namelocation").innerHTML=alert("ënter usn");
		return false;
		
	}
	if(branch=="" || branch==""){
		document.getElementById("namelocation").innerHTML=alert("ënter branch");
		return false;
		
	}
	
}