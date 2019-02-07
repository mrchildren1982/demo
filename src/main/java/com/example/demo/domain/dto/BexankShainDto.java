package com.example.demo.domain.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.example.demo.annotation.Phone;

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
	@Min(1)
	@Max(10)
	private String name;

	/** 経験年数 */
	private Long experience;

	/** 電話番号 */
	@Phone
	private String phoneNumber;

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

	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber セットする phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
