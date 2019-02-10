package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Persons;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PersonsDao {

    /**
     * @param name
     * @return the Persons entity
     */
    @Select
    Persons selectById(String name);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Persons entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Persons entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Persons entity);
}