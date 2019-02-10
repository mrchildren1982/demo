package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Dept;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface DeptDao {

    /**
     * @param deptno
     * @return the Dept entity
     */
    @Select
    Dept selectById(String deptno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Dept entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Dept entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Dept entity);
}