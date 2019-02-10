package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Population;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PopulationDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Population entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Population entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Population entity);
}