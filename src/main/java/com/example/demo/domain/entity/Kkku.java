package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 企画マスタ
 */
@Entity(listener = KkkuListener.class)
@Table(name = "kkku")
public class Kkku {

    /** 企画ID */
    @Id
    @Column(name = "kkku_id")
    String kkkuId;

    /** 取扱単協コード1 */
    @Column(name = "tankyo_cd1")
    String tankyoCd1;

    /** 取扱単協コード2 */
    @Column(name = "tankyo_cd2")
    String tankyoCd2;

    /** 取扱単協コード3 */
    @Column(name = "tankyo_cd3")
    String tankyoCd3;

    /** 取扱単協コード4 */
    @Column(name = "tankyo_cd4")
    String tankyoCd4;

    /** 取扱単協コード5 */
    @Column(name = "tankyo_cd5")
    String tankyoCd5;

    /** 取組開始週 */
    @Id
    @Column(name = "kaishishu")
    String kaishishu;

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
     * Returns the tankyoCd1.
     * 
     * @return the tankyoCd1
     */
    public String getTankyoCd1() {
        return tankyoCd1;
    }

    /** 
     * Sets the tankyoCd1.
     * 
     * @param tankyoCd1 the tankyoCd1
     */
    public void setTankyoCd1(String tankyoCd1) {
        this.tankyoCd1 = tankyoCd1;
    }

    /** 
     * Returns the tankyoCd2.
     * 
     * @return the tankyoCd2
     */
    public String getTankyoCd2() {
        return tankyoCd2;
    }

    /** 
     * Sets the tankyoCd2.
     * 
     * @param tankyoCd2 the tankyoCd2
     */
    public void setTankyoCd2(String tankyoCd2) {
        this.tankyoCd2 = tankyoCd2;
    }

    /** 
     * Returns the tankyoCd3.
     * 
     * @return the tankyoCd3
     */
    public String getTankyoCd3() {
        return tankyoCd3;
    }

    /** 
     * Sets the tankyoCd3.
     * 
     * @param tankyoCd3 the tankyoCd3
     */
    public void setTankyoCd3(String tankyoCd3) {
        this.tankyoCd3 = tankyoCd3;
    }

    /** 
     * Returns the tankyoCd4.
     * 
     * @return the tankyoCd4
     */
    public String getTankyoCd4() {
        return tankyoCd4;
    }

    /** 
     * Sets the tankyoCd4.
     * 
     * @param tankyoCd4 the tankyoCd4
     */
    public void setTankyoCd4(String tankyoCd4) {
        this.tankyoCd4 = tankyoCd4;
    }

    /** 
     * Returns the tankyoCd5.
     * 
     * @return the tankyoCd5
     */
    public String getTankyoCd5() {
        return tankyoCd5;
    }

    /** 
     * Sets the tankyoCd5.
     * 
     * @param tankyoCd5 the tankyoCd5
     */
    public void setTankyoCd5(String tankyoCd5) {
        this.tankyoCd5 = tankyoCd5;
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
}