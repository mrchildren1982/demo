package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Pairings;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PairingsDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Pairings entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Pairings entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Pairings entity);
}