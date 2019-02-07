package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ビーサンクテーブルエンティティ
 *
 * @author 雅幸
 *
 */
@Entity
@Table(name = "bexank")
public class Bexank {

	/** ID */
	@Id
	@Column(name = "id")
	private Long id;

	/** 名前 */
	@Column(name = "name")
	private String name;

	/** 優先度 */
	@Column(name = "priority")
	private Integer priority;

	/** 参加フラグ */
	@Column(name = "sanka_flag")
	private String sankaFlag;

	/** 新人チームフラグ */
	@Column(name = "sinjin_team_flag")
	private String shinjinTeamFlag;

	/** チーム */
	@Column(name = "team")
	private String team;

	@Column(name = "zaiseki_flag")
	private String zaisekiFlag;

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority セットする priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * @return sankaFlag
	 */
	public String getSankaFlag() {
		return sankaFlag;
	}

	/**
	 * @param sankaFlag セットする sankaFlag
	 */
	public void setSankaFlag(String sankaFlag) {
		this.sankaFlag = sankaFlag;
	}

	/**
	 * @return shinjinTeamFlag
	 */
	public String getShinjinTeamFlag() {
		return shinjinTeamFlag;
	}

	/**
	 * @param shinjinTeamFlag セットする shinjinTeamFlag
	 */
	public void setShinjinTeamFlag(String shinjinTeamFlag) {
		this.shinjinTeamFlag = shinjinTeamFlag;
	}

	/**
	 * @return team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team セットする team
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return zaisekiFlag
	 */
	public String getZaisekiFlag() {
		return zaisekiFlag;
	}

	/**
	 * @param zaisekiFlag セットする zaisekiFlag
	 */
	public void setZaisekiFlag(String zaisekiFlag) {
		this.zaisekiFlag = zaisekiFlag;
	}



}
