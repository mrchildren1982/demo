package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Shuhzai;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ShuhzaiDao {

    /**
     * @param shuhzaiCd
     * @param kkkuId
     * @param kaishishu
     * @return the Shuhzai entity
     */
    @Select
    Shuhzai selectById(String shuhzaiCd, String kkkuId, String kaishishu);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Shuhzai entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Shuhzai entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Shuhzai entity);
}