package com.demo.jwt.token.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author peyman.ekhtiar on 2021-04-22
 */
@RestController
@CrossOrigin()
public class TestController {

	@RequestMapping({ "/test" })
	public String hello() {
		return "WELCOME TO DEMO";
	}

}
