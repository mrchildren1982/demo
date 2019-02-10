package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Shops;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ShopsDao {

    /**
     * @param coCd
     * @param shopId
     * @return the Shops entity
     */
    @Select
    Shops selectById(String coCd, String shopId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Shops entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Shops entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Shops entity);
}