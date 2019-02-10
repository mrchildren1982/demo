package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Hoge1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface Hoge1Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Hoge1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Hoge1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Hoge1 entity);
}