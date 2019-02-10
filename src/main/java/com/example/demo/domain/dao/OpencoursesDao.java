package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Opencourses;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface OpencoursesDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Opencourses entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Opencourses entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Opencourses entity);
}