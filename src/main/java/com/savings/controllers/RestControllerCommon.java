package com.savings.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.savings.beans.ResponseBean;


@RestController
public class RestControllerCommon {
	ResponseBean rs=new ResponseBean();
	@RequestMapping(value="/balance" , method = RequestMethod.GET)
	public ResponseEntity<ResponseBean> checkBalance(){
		System.out.println("balance");
		try{
			String s=null;
			s.toString();
		}catch(Exception e){
			rs.setResponseMessage("Null value Sent");
			HttpHeaders headers = new HttpHeaders();
	        headers.add("Responded", "RestControllerCommon");
	        
			//throw new DataNotFoundException("Please Enter Correct Data");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(rs);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/deposit" , method = RequestMethod.GET)
	public ResponseEntity<String> checkDeposit(){
		System.out.println("deposit");
		String deposit="5003";
		HttpHeaders header =new HttpHeaders();
		header.set("name", "pooja");
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
