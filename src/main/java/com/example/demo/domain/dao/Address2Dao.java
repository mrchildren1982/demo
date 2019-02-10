package com.example.demo.domain.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Address2;

/**
 */
@Dao(config = AppConfig.class)
@ConfigAutowireable
public interface Address2Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Address2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Address2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Address2 entity);
}