package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.BexankShain;
import com.example.demo.domain.repository.BexankShainRepository;
import com.example.demo.exception.DataNotFoundException;

import lombok.NonNull;

@Service
@Transactional
public class BexankShainService {

	private static final Logger logger = LoggerFactory.getLogger(BexankShainService.class);

	@Autowired
	private BexankShainRepository repository;

	public BexankShain getById(@NonNull Long id) throws DataNotFoundException {

		logger.debug("ビーサンク社員テーブルサービス検索開始");

		Optional<BexankShain> shain = repository.findById(id);

		if (!shain.isPresent()) {
			throw new DataNotFoundException("該当のデータが存在しません");
		}

		logger.debug("ビーサンク社員テーブル検索サービス終了");


		return shain == null ? null : shain.get();
	}

	public List<BexankShain> selectAll() {

		return repository.findAll();
	}

	public BexankShain insertShain(@NonNull BexankShain shain) {
		return repository.save(shain);
	}

	public BexankShain updateShain(@NonNull BexankShain shain) {
		return repository.saveAndFlush(shain);
	}

	public List<BexankShain> insertShains(@NonNull List<BexankShain> shains) {

		return repository.saveAll(shains);

	}
	public void deleteAll() {

		repository.deleteAll();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
