package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.TCmBank;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TCmBankDao {

    /**
     * @param bankCodeBank
     * @return the TCmBank entity
     */
    @Select
    TCmBank selectById(String bankCodeBank);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCmBank entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCmBank entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCmBank entity);
}