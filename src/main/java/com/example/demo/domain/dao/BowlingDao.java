package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Bowling;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface BowlingDao {

    /**
     * @param year
     * @param month
     * @param name
     * @return the Bowling entity
     */
    @Select
    Bowling selectById(String year, String month, String name);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Bowling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Bowling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Bowling entity);
}