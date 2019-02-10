package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Orders;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface OrdersDao {

    /**
     * @param ordno
     * @param custno
     * @return the Orders entity
     */
    @Select
    Orders selectById(String ordno, String custno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Orders entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Orders entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Orders entity);
}