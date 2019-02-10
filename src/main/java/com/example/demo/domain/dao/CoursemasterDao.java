package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Coursemaster;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CoursemasterDao {

    /**
     * @param courseId
     * @return the Coursemaster entity
     */
    @Select
    Coursemaster selectById(String courseId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Coursemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Coursemaster entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Coursemaster entity);
}