package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Countries;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CountriesDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Countries entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Countries entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Countries entity);
}