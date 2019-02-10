package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.MeetingRoom;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface MeetingRoomDao {

    /**
     * @param roomId
     * @return the MeetingRoom entity
     */
    @Select
    MeetingRoom selectById(Integer roomId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MeetingRoom entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MeetingRoom entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MeetingRoom entity);
}