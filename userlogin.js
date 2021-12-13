function userlogin()
{ 
var logtype=document.getElementById("dd").value;
	if(logtype=="user")
	{
	 alert("User Login Successfull!! Directing to Landing Page");
		document.location.href="attraction";
}

}
function hide()
{
	document.getElementById("err").style.display="none";
}