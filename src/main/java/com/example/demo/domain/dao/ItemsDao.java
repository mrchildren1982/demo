package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Items;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ItemsDao {

    /**
     * @param itemId
     * @param year
     * @return the Items entity
     */
    @Select
    Items selectById(String itemId, Integer year);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Items entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Items entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Items entity);
}