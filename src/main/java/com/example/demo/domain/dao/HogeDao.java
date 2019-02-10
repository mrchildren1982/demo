package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Hoge;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface HogeDao {

    /**
     * @param id
     * @return the Hoge entity
     */
    @Select
    Hoge selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Hoge entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Hoge entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Hoge entity);
}