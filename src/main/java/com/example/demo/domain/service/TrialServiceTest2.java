package com.example.demo.domain.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.dto.Trial;
import com.example.demo.domain.entity.TrialEntity;



public class TrialServiceTest2 {

	@Autowired
	public TrialService service;

	@Before
	public void init() {

		service = new TrialService();

	}

	@Test
	public void test001() {


		TrialServiceImpl serviceImpl  = new TrialServiceImpl() {

			@Override
			public List<TrialEntity> getTrialEntities () {

				List<TrialEntity> entities = new ArrayList<>();
				TrialEntity entity1 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity2 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				entities.add(entity1);
				entities.add(entity2);

				return entities;
			}
		};

		List<TrialEntity> entities = serviceImpl.getTrialEntities();
		service.setTrialEntities(entities);

		List<Trial> actual = service.find();

		actual.forEach(System.out::println);
		assertThat(actual.size(),is(1));

		assertThat(actual.get(0).getId(),is(BigInteger.valueOf(1L)));
		assertThat(actual.get(0).getCompanies().size(),is(1));
		assertThat(actual.get(0).getManagement().size(),is(1));


	}


	@Test
	public void test002() {


		TrialServiceImpl serviceImpl  = new TrialServiceImpl() {

			@Override
			public List<TrialEntity> getTrialEntities () {

				List<TrialEntity> entities = new ArrayList<>();
				TrialEntity entity1 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity2 = TrialEntity.builder()
						.trialId(2L)
						.trialName("トライアル2")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				entities.add(entity1);
				entities.add(entity2);

				return entities;
			}
		};

		List<TrialEntity> entities = serviceImpl.getTrialEntities();
		service.setTrialEntities(entities);

		List<Trial> actual = service.find();

		actual.forEach(System.out::println);
		assertThat(actual.size(),is(2));

		assertThat(actual.get(0).getId(),is(BigInteger.valueOf(1L)));
		assertThat(actual.get(0).getCompanies().size(),is(1));
		assertThat(actual.get(0).getManagement().size(),is(1));

		assertThat(actual.get(1).getId(),is(BigInteger.valueOf(2L)));
		assertThat(actual.get(1).getCompanies().size(),is(1));
		assertThat(actual.get(1).getManagement().size(),is(1));

	}



	@Test
	public void test003() {


		TrialServiceImpl serviceImpl  = new TrialServiceImpl() {

			@Override
			public List<TrialEntity> getTrialEntities () {

				List<TrialEntity> entities = new ArrayList<>();
				TrialEntity entity11 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity12 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity13 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(20L)
						.managementOrganizationName("管理組織2")
						.managementOrganizationNameKana("カンリソシキ2")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();


				TrialEntity entity21= TrialEntity.builder()
						.trialId(2L)
						.trialName("トライアル2")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationName("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				entities.add(entity11);
				entities.add(entity12);
				entities.add(entity13);
				entities.add(entity21);

				return entities;
			}
		};

		List<TrialEntity> entities = serviceImpl.getTrialEntities();
		service.setTrialEntities(entities);

		List<Trial> actual = service.find();

		actual.forEach(System.out::println);
		assertThat(actual.size(),is(2));

		assertThat(actual.get(0).getId(),is(BigInteger.valueOf(1L)));
		assertThat(actual.get(0).getCompanies().size(),is(1));
		assertThat(actual.get(0).getManagement().size(),is(2));

		assertThat(actual.get(1).getId(),is(BigInteger.valueOf(2L)));
		assertThat(actual.get(1).getCompanies().size(),is(1));
		assertThat(actual.get(1).getManagement().size(),is(1));

	}



	@Test
	public void test004() {


		TrialServiceImpl serviceImpl  = new TrialServiceImpl() {

			@Override
			public List<TrialEntity> getTrialEntities () {

				List<TrialEntity> entities = new ArrayList<>();
				TrialEntity entity11 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity12 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(20L)
						.managementOrganizationName("管理組織2")
						.managementOrganizationNameKana("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity13 = TrialEntity.builder()
						.trialId(1L)
						.trialName("トライアル1")
						.managementOrganizationId(30L)
						.managementOrganizationName("管理組織3")
						.managementOrganizationNameKana("カンリソシキ2")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();


				TrialEntity entity21= TrialEntity.builder()
						.trialId(2L)
						.trialName("トライアル2")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationName("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				TrialEntity entity31= TrialEntity.builder()
						.trialId(3L)
						.trialName("トライアル2")
						.managementOrganizationId(10L)
						.managementOrganizationName("管理組織1")
						.managementOrganizationName("カンリソシキ1")
						.comanyId(1L)
						.companyName("企業1")
						.companyNameKana("キギョウ1")
						.build();

				entities.add(entity11);
				entities.add(entity12);
				entities.add(entity13);
				entities.add(entity21);
				entities.add(entity31);

				return entities;
			}
		};

		List<TrialEntity> entities = serviceImpl.getTrialEntities();
		service.setTrialEntities(entities);

		List<Trial> actual = service.find();

		actual.forEach(System.out::println);
		assertThat(actual.size(),is(3));
		assertThat(actual.get(0).getId(),is(BigInteger.valueOf(1L)));
		assertThat(actual.get(0).getCompanies().size(),is(1));
		assertThat(actual.get(0).getManagement().size(),is(3));

		assertThat(actual.get(1).getId(),is(BigInteger.valueOf(2L)));
		assertThat(actual.get(1).getCompanies().size(),is(1));
		assertThat(actual.get(1).getManagement().size(),is(1));

		assertThat(actual.get(2).getId(),is(BigInteger.valueOf(3L)));
		assertThat(actual.get(2).getCompanies().size(),is(1));
		assertThat(actual.get(2).getManagement().size(),is(1));

	}












	public class TrialServiceImpl extends TrialService {


	}

}
