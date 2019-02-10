package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Room;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface RoomDao {

    /**
     * @param roomId
     * @return the Room entity
     */
    @Select
    Room selectById(String roomId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Room entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Room entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Room entity);
}