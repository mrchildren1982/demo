package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Usr;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface UsrDao {

    /**
     * @param userId
     * @return the Usr entity
     */
    @Select
    Usr selectById(String userId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Usr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Usr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Usr entity);
}