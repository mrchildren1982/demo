package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Skills;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface SkillsDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Skills entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Skills entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Skills entity);
}