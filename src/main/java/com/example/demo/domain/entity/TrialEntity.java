package com.example.demo.domain.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TrialEntity {

	private Long trialId;

	private String trialName;

	private Long managementOrganizationId;

	private String managementOrganizationName;

	private String managementOrganizationNameKana;

	private Long comanyId;

	private String companyName;

	private String companyNameKana;


}
