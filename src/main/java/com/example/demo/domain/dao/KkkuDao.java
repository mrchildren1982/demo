package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Kkku;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface KkkuDao {

    /**
     * @param kkkuId
     * @param kaishishu
     * @return the Kkku entity
     */
    @Select
    Kkku selectById(String kkkuId, String kaishishu);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Kkku entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Kkku entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Kkku entity);
}