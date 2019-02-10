package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Meetings;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface MeetingsDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Meetings entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Meetings entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Meetings entity);
}