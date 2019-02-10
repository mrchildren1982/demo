package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Postalcode;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PostalcodeDao {

    /**
     * @param pcode
     * @return the Postalcode entity
     */
    @Select
    Postalcode selectById(String pcode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Postalcode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Postalcode entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Postalcode entity);
}