package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "department")
@Entity
public class Department {

	/** ID */
	@Id
	@Column(name= "id")
	private Integer id;

	/** 部署名 */
	@Column(name= "name")
	private String name;

	/** バージョン情報  */
	@Column(name= "version")
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
