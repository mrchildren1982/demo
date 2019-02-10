package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Players;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PlayersDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Players entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Players entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Players entity);
}