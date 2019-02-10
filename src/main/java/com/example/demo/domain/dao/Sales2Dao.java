package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Sales2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface Sales2Dao {

    /**
     * @param company
     * @param year
     * @return the Sales2 entity
     */
    @Select
    Sales2 selectById(String company, Integer year);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Sales2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Sales2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Sales2 entity);
}