package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.DataObject;


@RestController
@RequestMapping("/hello/")
public class HelloController {

	private static String[] names = {"tuyano","hanako","taro","sachiko","ichiro"};

	private static String[] emails = {"soyoda@tuuyao.com","hanako@floer","taro@yamada","sachiko@happy","ichiro@baseball"};

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataObject> index(@PathVariable int id) {
		return ResponseEntity.ok(new DataObject(id, names[id],emails[id]));
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<DataObject> create(@RequestBody @Validated DataObject data, BindingResult result) {

//		if (result.hasErrors()) {
//
//		}


//		names[0] = "makino";
//		emails[0] = "makino@hogehoge";

		return ResponseEntity.ok(new DataObject(data.getId(),data.getName(),data.getValue()));
	}
}