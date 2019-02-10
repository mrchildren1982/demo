package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Employees;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface EmployeesDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Employees entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Employees entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Employees entity);
}