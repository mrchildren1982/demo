package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Products;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ProductsDao {

    /**
     * @param prodno
     * @return the Products entity
     */
    @Select
    Products selectById(String prodno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Products entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Products entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Products entity);
}