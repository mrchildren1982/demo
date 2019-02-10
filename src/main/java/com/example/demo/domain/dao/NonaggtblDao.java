package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Nonaggtbl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface NonaggtblDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Nonaggtbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Nonaggtbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Nonaggtbl entity);
}