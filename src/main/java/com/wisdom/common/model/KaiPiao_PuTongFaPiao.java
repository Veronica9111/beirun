package com.wisdom.common.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class KaiPiao_PuTongFaPiao implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private Double hejijine;
private String kaipiaoneirong;
private Integer shuilv;
private String field2;
private String field3;
private String field1;
private Timestamp shenqingriqi;
private Double shuie;
private Double xiaoshoue;
private String field4;
private Double xiaoji;
private Long id;
private Long kaipiaoshenqingdan_id;
    public KaiPiao_PuTongFaPiao() {
        super();
    }

    public KaiPiao_PuTongFaPiao(Double hejijine, String kaipiaoneirong, Integer shuilv, String field2, String field3, String field1, Timestamp shenqingriqi, Double shuie, Double xiaoshoue, String field4, Double xiaoji, Long id, Long kaipiaoshenqingdan_id){
        this.hejijine = hejijine;
        this.kaipiaoneirong = kaipiaoneirong;
        this.shuilv = shuilv;
        this.field2 = field2;
        this.field3 = field3;
        this.field1 = field1;
        this.shenqingriqi = shenqingriqi;
        this.shuie = shuie;
        this.xiaoshoue = xiaoshoue;
        this.field4 = field4;
        this.xiaoji = xiaoji;
        this.id = id;
        this.kaipiaoshenqingdan_id = kaipiaoshenqingdan_id;
    }

    public Double getHejijine() {
        return hejijine;
    }

    public void setHejijine(Double hejijine){
        this.hejijine = hejijine;
    }

    public String getKaipiaoneirong() {
        return kaipiaoneirong;
    }

    public void setKaipiaoneirong(String kaipiaoneirong){
        this.kaipiaoneirong = kaipiaoneirong;
    }

    public Integer getShuilv() {
        return shuilv;
    }

    public void setShuilv(Integer shuilv){
        this.shuilv = shuilv;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2){
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3){
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1){
        this.field1 = field1;
    }

    public String getShenqingriqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String shenqingriqi = "";
        if(this.shenqingriqi != null) {
            shenqingriqi = dateFormat.format(this.shenqingriqi);
        }
        return shenqingriqi;
    }

    public void setShenqingriqi(Timestamp shenqingriqi){
        this.shenqingriqi = shenqingriqi;
    }

    public Double getShuie() {
        return shuie;
    }

    public void setShuie(Double shuie){
        this.shuie = shuie;
    }

    public Double getXiaoshoue() {
        return xiaoshoue;
    }

    public void setXiaoshoue(Double xiaoshoue){
        this.xiaoshoue = xiaoshoue;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4){
        this.field4 = field4;
    }

    public Double getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(Double xiaoji){
        this.xiaoji = xiaoji;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getKaipiaoshenqingdan_id() {
        return kaipiaoshenqingdan_id;
    }

    public void setKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id){
        this.kaipiaoshenqingdan_id = kaipiaoshenqingdan_id;
    }

}