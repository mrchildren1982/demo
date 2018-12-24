package com.example.demo.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Child;

@Dao
@ConfigAutowireable
public interface ChildDao {

	@Select
	public List<Child> selectAll();

	@Select
	public Child selectById(Integer id);

	@Select
	public List<Child> selectByFamilyId(Integer familyId);

}
