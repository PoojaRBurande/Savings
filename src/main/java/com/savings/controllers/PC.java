package com.savings.controllers;

import java.util.LinkedList;

public class PC {
	LinkedList<Integer> list=new LinkedList<>();
	int capacity =2;
	
	public void produce() throws InterruptedException {
		// TODO Auto-generated method stub
		boolean a;
		int value=0;
		while(true){
			synchronized (this) {
			while(list.size()==capacity)	
				wait();
				System.out.println("Producer Produced -"+value);
				list.add(value++);
			notify();
			Thread.sleep(1000);
			
		}
	}
}
	
	public void consume() throws InterruptedException {
		// TODO Auto-generated method stub
		while(true){
			synchronized (this) {
				
				while(list.size()==0)
					wait();
				int val=list.removeFirst();		
				System.out.println("Consumer consumed -"+val);
				notify();
				Thread.sleep(1000);
				
			}
		}
	}
}

/*<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$("#getDetails").click(function(){
		alert("clicked");
		var data="pooja";
		$.ajax({
			type: "POST",
			url: "userDetail",
			data: JSON.stringify(data),
			success : function(UserBean){
				alert(UserBean.address);
				var htmlRow ="<tr><td>"+UserBean.username+"</td></tr>";
				$("#userTable").append(htmlRow);
			}
		})
	});

	
});
</script>
</head>
<body>
<input type="text" id="userId" name="userId">
<button id="getDetails" name="getDetails">get</button>

<table class="table table-striped table-fixed table-hover table-bordered" id="userTable" name="userTable">
<thead>
<tr>
<th>UserName</th>
<th> Mobile Number</th>
<th> Email Address</th>
<th> Date of Birth</th>
<th> Address</th>
</tr>
</thead>
</table>
</body>
</html>

	controller part-----------------
@RequestMapping(value = "/userDetail", method = RequestMethod.POST)
	public @ResponseBody UserBean getUserDetails(@RequestBody String userid) {
		
		String userId = "pooja";
		UserBean user= userHelper.getUser(userId);
		return user;
	} 
	Data base call-------------------
	@SuppressWarnings("rawtypes")
		UserBean customer = (UserBean)getJdbcTemplate().queryForObject(
				query, new Object[] { userId }, 
		new BeanPropertyRowMapper(UserBean.class));
	
	*/
























