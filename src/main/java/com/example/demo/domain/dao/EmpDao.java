package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Emp;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface EmpDao {

    /**
     * @param empno
     * @return the Emp entity
     */
    @Select
    Emp selectById(String empno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Emp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Emp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Emp entity);
}