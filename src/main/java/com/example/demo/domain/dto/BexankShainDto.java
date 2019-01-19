package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BexankShainDto {

	/** 社員ID */
	private Long id;

	/** 社員名  */
	private String name;

	/** 経験年数 */
	private Long experience;

	public Long getId() {
		return this.id;

	}

	public void setId(Long id ) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getExperience() {
		return this.experience;
	}

	public void setExperience(Long experience) {
		this.experience = experience;
	}

}
