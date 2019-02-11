package com.example.demo.domain.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class TrialCompanyKey {

	private BigInteger trialId;

	private BigInteger companyId;

}
