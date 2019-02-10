package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Reservation;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ReservationDao {

    /**
     * @param reservationId
     * @return the Reservation entity
     */
    @Select
    Reservation selectById(Integer reservationId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Reservation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Reservation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Reservation entity);
}