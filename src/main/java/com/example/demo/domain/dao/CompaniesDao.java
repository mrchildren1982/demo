package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Companies;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CompaniesDao {

    /**
     * @param coCd
     * @return the Companies entity
     */
    @Select
    Companies selectById(String coCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Companies entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Companies entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Companies entity);
}