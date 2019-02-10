package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Customers;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CustomersDao {

    /**
     * @param custno
     * @return the Customers entity
     */
    @Select
    Customers selectById(String custno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Customers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Customers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Customers entity);
}