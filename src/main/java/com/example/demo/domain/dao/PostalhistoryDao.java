package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Postalhistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PostalhistoryDao {

    /**
     * @param name
     * @param pcode
     * @return the Postalhistory entity
     */
    @Select
    Postalhistory selectById(String name, String pcode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Postalhistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Postalhistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Postalhistory entity);
}