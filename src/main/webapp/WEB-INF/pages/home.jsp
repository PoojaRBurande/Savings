<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" ></script>

<script type="text/javascript">
$(document).ready(function(){
$("#balance").click(function(){
	  alert("balance");
	  $.ajax({
		  url:"deposit",
		  success: function(){
			 alert("success"); 
		  }});
	  		
	  });
	
$("#deposit").click(function(){
	  alert("deposit");
	  $.ajax({
		  url:"deposit",
		  success: function(){
			 alert("success"); 
		  }});
	  		
	  });
	});

</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
Welcome home ${nameEntered}
<br></br>
<button id="balance" name="balance">Show Balance</button>
<button id="deposit" name="deposit">Last Deposit</button>

</body>
</html>