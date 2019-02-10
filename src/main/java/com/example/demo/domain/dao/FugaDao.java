package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Fuga;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface FugaDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Fuga entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Fuga entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Fuga entity);
}