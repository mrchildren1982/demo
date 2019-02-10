package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Sampletbl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface SampletblDao {

    /**
     * @param id
     * @return the Sampletbl entity
     */
    @Select
    Sampletbl selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Sampletbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Sampletbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Sampletbl entity);
}