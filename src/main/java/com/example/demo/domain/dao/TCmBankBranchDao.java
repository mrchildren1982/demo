package com.example.demo.domain.dao;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.entity.TCmBankBranch;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TCmBankBranchDao {

    /**
     * @param bankCode
     * @return the TCmBankBranch entity
     */
    @Select
    TCmBankBranch selectById(String bankCode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCmBankBranch entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCmBankBranch entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCmBankBranch entity);
}