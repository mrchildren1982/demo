package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Receipts;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ReceiptsDao {

    /**
     * @param custId
     * @param seq
     * @return the Receipts entity
     */
    @Select
    Receipts selectById(String custId, Integer seq);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Receipts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Receipts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Receipts entity);
}