package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.TCmSwiftBic;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TCmSwiftBicDao {

    /**
     * @param bankCode
     * @return the TCmSwiftBic entity
     */
    @Select
    TCmSwiftBic selectById(String bankCode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCmSwiftBic entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCmSwiftBic entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCmSwiftBic entity);
}