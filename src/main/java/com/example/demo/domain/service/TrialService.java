package com.example.demo.domain.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.dto.Company;
import com.example.demo.domain.dto.ManagementOrganization;
import com.example.demo.domain.dto.Trial;
import com.example.demo.domain.dto.TrialCompanyKey;
import com.example.demo.domain.dto.TrialMngKey;
import com.example.demo.domain.entity.TrialEntity;

/**
 * トライアルサービスクラス
 *
 * @author tbk40
 *
 */
@Transactional
@Service
public class TrialService {

	public List<TrialEntity> trialEntities;

	public List<Trial> getById() {

		List<Trial> trials = new ArrayList<>();
		int idx = 0;
		Long pretrialId = null;
		List<ManagementOrganization> managements = new ArrayList<>();
		List<Company> companies = new ArrayList<>();

		String preMetaName = null;

		for (TrialEntity entity : trialEntities) {

			Long trialId = entity.getTrialId();

			if (idx > 0 && trialId.compareTo(pretrialId) != 0) {

				Trial trial = Trial.builder().id(BigInteger.valueOf(pretrialId))
						.name(preMetaName)
						.management(managements)
						.companies(companies)
						.build();
				trials.add(trial);

				//初期化
				managements = new ArrayList<>();
				companies = new ArrayList<>();
			}
			//管理組織
			if (!containsManagementId(managements, entity.getManagementOrganizationId())) {

				ManagementOrganization management = ManagementOrganization.builder()
						.id(BigInteger.valueOf(entity.getManagementOrganizationId()))
						.managementName(entity.getManagementOrganizationName())
						.managementNameKana(entity.getManagementOrganizationNameKana())
						.build();
				managements.add(management);
			}

			if (!containsCompanyId(companies, entity.getComanyId())) {
				//企業
				Company company = Company.builder().id(BigInteger.valueOf(entity.getComanyId()))
						.companyName(entity.getCompanyName())
						.companyNameKana(entity.getCompanyNameKana())
						.build();

				companies.add(company);

			}



			if (idx == trialEntities.size() - 1) {

				Trial trial = Trial.builder().id(BigInteger.valueOf(trialId))
						.name(entity.getTrialName())
						.management(managements)
						.companies(companies)
						.build();
				trials.add(trial);

			}

			idx++;
			pretrialId = trialId;
			preMetaName = entity.getTrialName();
		}
		return trials;

	}

	public List<Trial> find() {

		List<Trial> trials = new ArrayList<>();


		List<Trial> trialsTmp = trialEntities.stream().map(entity -> createTrial(entity)).distinct()
				.collect(Collectors.toList());

		//取得結果から管理組織関連のプロパティを取り出し、トライアルID、企業IDごとにグルーピング化する
		Map<TrialMngKey, List<ManagementOrganization>> managementMap = trialEntities.stream()
				.map(entity -> createManagementOrganization(entity)).distinct()
				.collect(Collectors.groupingBy(mng -> new TrialMngKey(mng.getTrialId(),mng.getId())));

		//取得結果から企業関連のプロパティを取り出し、トライアルID、企業IDごとにグルーピング化する
		Map<TrialCompanyKey, List<Company>> companyMap = trialEntities.stream().map(entity -> createCompany(entity))
				.distinct()
				.collect(Collectors.groupingBy(cmp -> new TrialCompanyKey(cmp.getTrialId(), cmp.getId())));

		for (Trial c : trialsTmp) {

			List<ManagementOrganization> organizations = null;
			List<Company> companies = null;
			for (TrialMngKey key : managementMap.keySet()) {
				if (c.getId().compareTo(key.getTrialId()) == 0) {

					organizations = managementMap.get(key);
				}
			}

			for (TrialCompanyKey cmpKey : companyMap.keySet()) {

				if (c.getId().compareTo(cmpKey.getTrialId()) == 0) {

					companies = companyMap.get(cmpKey);
				}
			}

			Trial trial = Trial.builder().id(c.getId())
					.name(c.getName())
					.management(organizations)
					.companies(companies)
					.build();
			trials.add(trial);

		}
		return trials;

	}

	Function<ManagementOrganization, String> compisiteKey = mng -> {
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(mng.getTrialId())).append(":").append(String.valueOf(mng.getId()));
		return sb.toString();
	};

	Function<Company, String> compisiteKey2 = cmp -> {
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(cmp.getTrialId())).append(":").append(cmp.getId());
		return sb.toString();
	};

	private ManagementOrganization createManagementOrganization(TrialEntity entity) {

		return ManagementOrganization.builder()
				.id(BigInteger.valueOf(entity.getManagementOrganizationId()))
				.managementName(entity.getManagementOrganizationName())
				.managementNameKana(entity.getManagementOrganizationNameKana())
				.trialId(BigInteger.valueOf(entity.getTrialId()))
				.build();

	}

	private Company createCompany(TrialEntity entity) {

		return Company.builder().id(BigInteger.valueOf(entity.getComanyId()))
				.companyName(entity.getCompanyName())
				.companyNameKana(entity.getCompanyNameKana())
				.trialId(BigInteger.valueOf(entity.getTrialId()))
				.build();
	}

	private Trial createTrial(TrialEntity entity) {

		return Trial.builder()
				.id(BigInteger.valueOf(entity.getTrialId()))
				.name(entity.getTrialName())
				.build();

	}

	public List<TrialEntity> getTrialEntities() {

		return this.trialEntities;
	}

	public void setTrialEntities(List<TrialEntity> entities) {
		this.trialEntities = entities;

	}

	private boolean containsCompanyId(List<Company> companies, Long targetCompanyId) {

		return companies.stream().filter(company -> company.getId().compareTo(BigInteger.valueOf(targetCompanyId)) == 0)
				.count() > 0;

	}

	private boolean containsManagementId(List<ManagementOrganization> managementOrganizations,
			Long targetManagementId) {

		return managementOrganizations.stream()
				.filter(entity -> entity.getId().compareTo(BigInteger.valueOf(targetManagementId)) == 0).count() > 0;

	}
}
