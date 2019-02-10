package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.MtsMember;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface MtsMemberDao {

    /**
     * @param id
     * @return the MtsMember entity
     */
    @Select
    MtsMember selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MtsMember entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MtsMember entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MtsMember entity);
}