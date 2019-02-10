package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Bexank;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface BexankDao {

    /**
     * @param id
     * @return the Bexank entity
     */
    @Select
    Bexank selectById(String id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Bexank entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Bexank entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Bexank entity);
}