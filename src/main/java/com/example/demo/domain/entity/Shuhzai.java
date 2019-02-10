package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 消費材マスタ
 */
@Entity(listener = ShuhzaiListener.class)
@Table(name = "shuhzai")
public class Shuhzai {

    /** 消費材コード */
    @Id
    @Column(name = "shuhzai_cd")
    String shuhzaiCd;

    /** 企画ID */
    @Id
    @Column(name = "kkku_id")
    String kkkuId;

    /** 開始週 */
    @Id
    @Column(name = "kaishishu")
    String kaishishu;

    /** ほげ */
    @Column(name = "hoge")
    String hoge;

    /** 削除フラグ */
    @Column(name = "skj_flag")
    String skjFlag;

    /** 
     * Returns the shuhzaiCd.
     * 
     * @return the shuhzaiCd
     */
    public String getShuhzaiCd() {
        return shuhzaiCd;
    }

    /** 
     * Sets the shuhzaiCd.
     * 
     * @param shuhzaiCd the shuhzaiCd
     */
    public void setShuhzaiCd(String shuhzaiCd) {
        this.shuhzaiCd = shuhzaiCd;
    }

    /** 
     * Returns the kkkuId.
     * 
     * @return the kkkuId
     */
    public String getKkkuId() {
        return kkkuId;
    }

    /** 
     * Sets the kkkuId.
     * 
     * @param kkkuId the kkkuId
     */
    public void setKkkuId(String kkkuId) {
        this.kkkuId = kkkuId;
    }

    /** 
     * Returns the kaishishu.
     * 
     * @return the kaishishu
     */
    public String getKaishishu() {
        return kaishishu;
    }

    /** 
     * Sets the kaishishu.
     * 
     * @param kaishishu the kaishishu
     */
    public void setKaishishu(String kaishishu) {
        this.kaishishu = kaishishu;
    }

    /** 
     * Returns the hoge.
     * 
     * @return the hoge
     */
    public String getHoge() {
        return hoge;
    }

    /** 
     * Sets the hoge.
     * 
     * @param hoge the hoge
     */
    public void setHoge(String hoge) {
        this.hoge = hoge;
    }

    /** 
     * Returns the skjFlag.
     * 
     * @return the skjFlag
     */
    public String getSkjFlag() {
        return skjFlag;
    }

    /** 
     * Sets the skjFlag.
     * 
     * @param skjFlag the skjFlag
     */
    public void setSkjFlag(String skjFlag) {
        this.skjFlag = skjFlag;
    }
}