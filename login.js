function login()
{ var x=document.getElementById("p1").value;
	var y=document.getElementById("p2").value;
	var logtype=document.getElementById("dd").value;
	if(logtype=="admin")
	{
	if( (x=="Admin") && (y=="Admin123") )
	{ alert("Admin Login Successfull!! Directing to Landing Page");
		document.location.href="Admin";
	} 
else
	{document.getElementById("err").style.display="block";}
}

}
function hide()
{
	document.getElementById("err").style.display="none";
}