package com.example.demo.domain.dto;

import lombok.Data;

@Data
public class CustomerDto {

	private Integer id;

	private String name;

	public CustomerDto()
	{

	}

	public CustomerDto(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
}

