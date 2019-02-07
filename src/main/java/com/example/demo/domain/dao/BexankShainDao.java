package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Bexank;

@Dao
@ConfigAutowireable
public interface BexankShainDao {

	@Select
	public Optional<Bexank> selectById(String id);

	@Select
	public List<Bexank> selectAllData();

	@Insert
	public int insert(Bexank bexank);

	@Update
	public int update(Bexank bexank);

	@Delete
	public int delete(Bexank bexank);
}