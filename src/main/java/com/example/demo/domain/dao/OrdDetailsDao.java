package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.OrdDetails;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface OrdDetailsDao {

    /**
     * @param ordno
     * @return the OrdDetails entity
     */
    @Select
    OrdDetails selectById(String ordno);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(OrdDetails entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(OrdDetails entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(OrdDetails entity);
}