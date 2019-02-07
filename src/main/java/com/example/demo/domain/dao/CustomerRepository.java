package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.entity.Customer;

/**
 * 顧客テーブル　リポジトリ
 *
 * @author 雅幸
 *
 */
@ConfigAutowireable
@Dao
public interface CustomerRepository {

	/**
	 * 顧客テーブル全件 検索
	 *
	 * @return 検索結果
	 */
	@Select
	List<Customer> selectAll();

	/**
	 * 顧客テーブル ID検索
	 * @param id ID
	 * @return 検索結果
	 */
	@Select
	Optional<Customer> selectById(Integer id);

	/**
	 * 顧客テーブル名前検索
	 *
	 * @param name
	 * @return
	 */
	@Select
	List<Customer> selectLikeName(String name);

	/**
	 * 顧客テーブル　条件指定検索
	 * @param customer
	 * @return
	 */
	@Select
	List<Customer> selectByCustomer(CustomerDto customer);

}
