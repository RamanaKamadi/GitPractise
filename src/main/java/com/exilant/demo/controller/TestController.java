  package com.exilant.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Demo")
public class TestController {

	@GetMapping("/hello")
	public String  getDemo(@RequestBody String str,HttpRequest req){

		System.out.println("first....");
	        System.out.println("second......");
	        System.out.println("third......");
    		return "Hello ramana";
	}
	
}
