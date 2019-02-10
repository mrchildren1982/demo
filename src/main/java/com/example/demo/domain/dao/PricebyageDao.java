package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Pricebyage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PricebyageDao {

    /**
     * @param productId
     * @param lowAge
     * @return the Pricebyage entity
     */
    @Select
    Pricebyage selectById(String productId, Integer lowAge);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Pricebyage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Pricebyage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Pricebyage entity);
}