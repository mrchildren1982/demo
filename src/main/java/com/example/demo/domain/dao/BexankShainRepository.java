package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Bexank;

@Dao
@ConfigAutowireable
public interface BexankShainRepository {

	/** ビーサンクテーブルID指定検索 */
	@Select
	public Optional<Bexank> selectById(Long id);

	/** ビーサンクテーブル全件検索*/
	@Select
	public List<Bexank> selectAllData();
}