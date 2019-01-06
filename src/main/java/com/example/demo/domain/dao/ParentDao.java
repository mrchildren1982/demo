package com.example.demo.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.example.demo.domain.entity.Parent;
import com.example.demo.domain.entity.ParentAndChild;

//@ConfigAutowireable
@DomaRepository
@Dao
public interface ParentDao {

	@Select
	public List<Parent> selectAll();

	@Select
	public Parent selectById(Integer id);

	@Select
	public List<Parent> selectByFamilyId(Integer id);

	@Select
	public ParentAndChild selectParentAndChild(Integer parentId);


}
