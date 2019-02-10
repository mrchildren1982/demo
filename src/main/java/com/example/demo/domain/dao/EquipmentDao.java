package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Equipment;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface EquipmentDao {

    /**
     * @param equipmentId
     * @param roomId
     * @return the Equipment entity
     */
    @Select
    Equipment selectById(String equipmentId, String roomId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Equipment entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Equipment entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Equipment entity);
}