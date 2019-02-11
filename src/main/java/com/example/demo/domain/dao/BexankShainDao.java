package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Bexank;

import lombok.NonNull;

@Dao
@ConfigAutowireable
public interface BexankShainDao {

	@Select
	Optional<Bexank> selectById(@NonNull String id);

	@Select
	List<Bexank> selectAllData();

	@Insert
	int insert(Bexank bexank);

}
