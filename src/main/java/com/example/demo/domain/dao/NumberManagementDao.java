package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.NumberManagement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface NumberManagementDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(NumberManagement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(NumberManagement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(NumberManagement entity);
}