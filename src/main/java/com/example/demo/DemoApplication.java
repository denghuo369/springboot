package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	
	@RequestMapping("/")
	public String index() {
		return "hello spring boot";
	}
	//访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
	public String hello() {
    	return "hello";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
