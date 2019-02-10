package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Employees2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface Employees2Dao {

    /**
     * @param empId
     * @return the Employees2 entity
     */
    @Select
    Employees2 selectById(String empId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Employees2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Employees2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Employees2 entity);
}