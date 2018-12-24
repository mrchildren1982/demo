package com.example.demo.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Parent;

@Dao
@ConfigAutowireable
public interface ParentDao {

	@Select
	public List<Parent> selectAll();

	@Select
	public Parent selectById(Integer id);

	@Select
	public List<Parent> selectByFamilyId(Integer familyId);

}
