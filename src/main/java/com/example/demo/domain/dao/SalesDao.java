package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Sales;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface SalesDao {

    /**
     * @param company
     * @param year
     * @return the Sales entity
     */
    @Select
    Sales selectById(String company, Integer year);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Sales entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Sales entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Sales entity);
}