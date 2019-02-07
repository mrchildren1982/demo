package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetESDataController {

	private static final Logger logger = LoggerFactory.getLogger(GetESDataController.class);

	@Autowired
	private MessageSource msgSource;

	/**
	 * STBシリアル番号で検索する（絞り込み条件なし)
	 *
	 * @param stbSerial
	 *            STBシリアル番号
	 * @return 検索結果
	 */
	@RequestMapping(method = RequestMethod.GET, value = "{stbSerial}")
	public ResponseEntity<List> getAll(@PathVariable Integer stbSerial) {

		// TODO
		return null;

	}

}
