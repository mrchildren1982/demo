package com.example.demo.controller;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoge")
@Validated
public class HogeController {

	@GetMapping
	public String get(@Valid @Email @RequestParam("email") String email) {
//			, BindingResult result) {

		return "your mail address is " + email;

	}

}
