package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Shain;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ShainDao {

    /**
     * @param id
     * @return the Shain entity
     */
    @Select
    Shain selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Shain entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Shain entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Shain entity);
}