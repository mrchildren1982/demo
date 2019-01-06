package com.example.demo.domain.dto;

import lombok.Data;

@Data
public class DepartmentDto {

	/** ID */
	private Integer id;

	/** 部署名 */
	private String name;

	/** バージョン情報  */
	private Long version;

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

	/**
	 * @return version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version セットする version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}


}
