package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Departments2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface Departments2Dao {

    /**
     * @param deptId
     * @return the Departments2 entity
     */
    @Select
    Departments2 selectById(String deptId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Departments2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Departments2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Departments2 entity);
}