package com.example.demo.domain.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.DataSourceType;
import com.example.demo.config.SwitchingDataSource;
import com.example.demo.domain.dao.BexankShainDao;
import com.example.demo.domain.dto.BexankDto;
import com.example.demo.domain.dto.BexankShainDto;
import com.example.demo.domain.entity.BShain;
import com.example.demo.domain.entity.Bexank;
import com.example.demo.exception.DataNotFoundException;

import lombok.NonNull;

@Service
@Transactional
public class BexankShainService {

	private static final Logger logger = LoggerFactory.getLogger(BexankShainService.class);

	@Autowired
	private com.example.demo.domain.repository.BexankShainRepository repository;

	@Autowired
	private BexankShainDao bexankShainDao;

	private static ModelMapper mapper = new ModelMapper();

	@SwitchingDataSource(DataSourceType.MYSQL)
	public BexankShainDto getById(@NonNull Long id) throws DataNotFoundException {

		logger.debug("ビーサンク社員テーブルサービス検索開始");

		Optional<BShain> shain = repository.findById(id);

		if (!shain.isPresent()) {
			throw new DataNotFoundException("該当のデータが存在しません");
		}

		logger.debug("ビーサンク社員テーブル検索サービス終了");

		BexankShainDto dto = mapper.map(shain.get(), BexankShainDto.class);

		return dto;

	}


	@SwitchingDataSource(DataSourceType.POSTGRES)
	public BexankDto getByDomaDaoById(@NonNull String id) throws DataNotFoundException {

		logger.debug("ビーサンク社員テーブルサービス検索開始");

		Optional<Bexank> shain = bexankShainDao.selectById(id);

		if (!shain.isPresent()) {
			throw new DataNotFoundException("該当のデータが存在しません");
		}

		logger.debug("ビーサンク社員テーブル検索サービス終了");

		BexankDto dto = mapper.map(shain.get(), BexankDto.class);

		return dto;

	}

	@SwitchingDataSource(DataSourceType.MYSQL)
	public List<BexankShainDto> selectAll() {

		List<BShain> shain = repository.findAll();
		if (shain.size() == 0) {
			return null;
		} else {
			List<BexankShainDto> list = new ArrayList<BexankShainDto>();
			for (BShain elem : shain) {

				BexankShainDto dto = mapper.map(elem, BexankShainDto.class);

				list.add(dto);

			}
			return list;

		}
	}

	@SwitchingDataSource(DataSourceType.POSTGRES)
	public List<BexankDto> selectByDomaDaoAll() {

		List<Bexank> shain = bexankShainDao.selectAllData();
		if (shain.size() == 0) {
			return null;
		} else {
			List<BexankDto> list = new ArrayList<>();
			for (Bexank elem : shain) {

				BexankDto dto = mapper.map(elem, BexankDto.class);

				list.add(dto);

			}
			return list;

		}
	}

	public void insertShain(@NonNull BexankShainDto shainDto) {
		BShain shain = mapper.map(shainDto, BShain.class);
		repository.save(shain);
		throw new RuntimeException();
	}

	@SwitchingDataSource(DataSourceType.POSTGRES)
	public void insertBexank(@NonNull BexankDto bexankDto) throws SQLException {

		Bexank bexank = mapper.map(bexankDto, Bexank.class);

		int count = bexankShainDao.insert(bexank);

		throw new RuntimeException();
	}

	public void updateShain(@NonNull BexankShainDto shainDto) {

		BShain shain = mapper.map(shainDto, BShain.class);
		repository.saveAndFlush(shain);
	}

	public void insertShains(@NonNull List<BexankShainDto> shainDtos) {

		List<BShain> shains = new ArrayList<>();
		for (BexankShainDto elem : shainDtos) {

			BShain shain = mapper.map(elem, BShain.class);
			shains.add(shain);
		}

		repository.saveAll(shains);

	}

	public void deleteAll() {

		repository.deleteAll();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
