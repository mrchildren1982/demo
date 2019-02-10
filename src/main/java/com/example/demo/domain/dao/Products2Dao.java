package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Products2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface Products2Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Products2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Products2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Products2 entity);
}