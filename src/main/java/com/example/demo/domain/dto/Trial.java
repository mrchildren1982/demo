package com.example.demo.domain.dto;

import java.math.BigInteger;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Trial {

	private BigInteger id;

	private String name;

	private List<ManagementOrganization> management;

	private List<Company> companies;

	@Override
	public String toString() {

		return "id: " + id + " name: " + name + " 管理組織: " + management + " 企業: " + companies;
	}
}
