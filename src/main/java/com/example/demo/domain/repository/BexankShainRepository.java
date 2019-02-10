package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.BShain;

@Repository
public interface BexankShainRepository extends JpaRepository<BShain, Long> {

	@Override
	Optional<BShain> findById(Long id);

	@Override
	List<BShain> findAll();

	@Override
	BShain save(BShain shain);

	@Override
	BShain saveAndFlush(BShain shain);

	@Override
	public void deleteAll();

	@Override
	public void deleteById(Long id);

}
