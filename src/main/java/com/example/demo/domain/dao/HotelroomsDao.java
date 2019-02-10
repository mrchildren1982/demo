package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.Hotelrooms;
import java.time.LocalDate;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface HotelroomsDao {

    /**
     * @param roomNbr
     * @param startDate
     * @return the Hotelrooms entity
     */
    @Select
    Hotelrooms selectById(Integer roomNbr, LocalDate startDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Hotelrooms entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Hotelrooms entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Hotelrooms entity);
}