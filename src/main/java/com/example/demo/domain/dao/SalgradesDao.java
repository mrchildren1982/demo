package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Salgrades;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface SalgradesDao {

    /**
     * @param grade
     * @return the Salgrades entity
     */
    @Select
    Salgrades selectById(String grade);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Salgrades entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Salgrades entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Salgrades entity);
}