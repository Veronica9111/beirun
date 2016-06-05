package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class WeiKaiJuFaPiaoMingXi_YiBan implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public WeiKaiJuFaPiaoMingXi_YiBan() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double yiban_weikai_11_xiaoshoue;
private Double yiban_weikai_11_xiaoxiangshuie;
private Double yiban_weikai_11_xiaoji;
private Double yiban_weikai_3_xiaoshoue;
private Double yiban_weikai_3_xiaoxiangshuie;
private Double yiban_weikai_3_xiaoji;
private Double yiban_weikai_17huowu_xiaoshoue;
private Double yiban_weikai_17huowu_xiaoxiangshuie;
private Double yiban_weikai_17huowu_xiaoji;
private Double yiban_weikai_17fuwu_xiaoshoue;
private Double yiban_weikai_17fuwu_xiaoxiangshuie;
private Double yiban_weikai_17fuwu_xiaoji;
private Double yiban_weikai_13_xiaoshoue;
private Double yiban_weikai_13_xiaoxiangshuie;
private Double yiban_weikai_13_xiaoji;
private Double yiban_weikai_6_xiaoshoue;
private Double yiban_weikai_6_xiaoxiangshuie;
private Double yiban_weikai_6_xiaoji;
private String zhaiyao;
private Double yiban_weikai_11_qiyezibaojine;
private Double yiban_weikai_3_qiyezibaojine;
private Double yiban_weikai_17huowu_qiyezibaojine;
private Double yiban_weikai_17fuwu_qiyezibaojine;
private Double yiban_weikai_13_qiyezibaojine;
private Double yiban_weikai_6_qiyezibaojine;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoshijian;
private Timestamp shenheshijian;
private String fuheren;
private Double yiban_weikai_heji_11_qiye;
private Double yiban_weikai_heji_11_xiaoshoue;
private Double yiban_weikai_heji_11_xiaoxiangshuie;
private Double yiban_weikai_heji_11_jiashuiheji;
private Double yiban_weikai_heji_3_qiye;
private Double yiban_weikai_heji_3_xiaoshoue;
private Double yiban_weikai_heji_3_xiaoxiangshuie;
private Double yiban_weikai_heji_3_jiashuiheji;
private Double yiban_weikai_heji_17huowu_qiye;
private Double yiban_weikai_heji_17huowu_xiaoshoue;
private Double yiban_weikai_heji_17huowu_xiaoxiangshuie;
private Double yiban_weikai_heji_17huowu_jiashuiheji;
private Double yiban_weikai_heji_17fuwu_qiye;
private Double yiban_weikai_heji_17fuwu_xiaoshoue;
private Double yiban_weikai_heji_17fuwu_xiaoxiangshuie;
private Double yiban_weikai_heji_17fuwu_jiashuiheji;
private Double yiban_weikai_heji_13_qiye;
private Double yiban_weikai_heji_13_xiaoshoue;
private Double yiban_weikai_heji_13_xiaoxiangshuie;
private Double yiban_weikai_heji_13_jiashuiheji;
private Double yiban_weikai_heji_6_qiye;
private Double yiban_weikai_heji_6_xiaoshoue;
private Double yiban_weikai_heji_6_xiaoxiangshuie;
private Double yiban_weikai_heji_6_jiashuiheji;
private Long kaipiaoshenqingdan_id;
public WeiKaiJuFaPiaoMingXi_YiBan(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double yiban_weikai_11_xiaoshoue, Double yiban_weikai_11_xiaoxiangshuie, Double yiban_weikai_11_xiaoji, Double yiban_weikai_3_xiaoshoue, Double yiban_weikai_3_xiaoxiangshuie, Double yiban_weikai_3_xiaoji, Double yiban_weikai_17huowu_xiaoshoue, Double yiban_weikai_17huowu_xiaoxiangshuie, Double yiban_weikai_17huowu_xiaoji, Double yiban_weikai_17fuwu_xiaoshoue, Double yiban_weikai_17fuwu_xiaoxiangshuie, Double yiban_weikai_17fuwu_xiaoji, Double yiban_weikai_13_xiaoshoue, Double yiban_weikai_13_xiaoxiangshuie, Double yiban_weikai_13_xiaoji, Double yiban_weikai_6_xiaoshoue, Double yiban_weikai_6_xiaoxiangshuie, Double yiban_weikai_6_xiaoji, String zhaiyao, Double yiban_weikai_11_qiyezibaojine, Double yiban_weikai_3_qiyezibaojine, Double yiban_weikai_17huowu_qiyezibaojine, Double yiban_weikai_17fuwu_qiyezibaojine, Double yiban_weikai_13_qiyezibaojine, Double yiban_weikai_6_qiyezibaojine, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoshijian, Timestamp shenheshijian, String fuheren, Double yiban_weikai_heji_11_qiye, Double yiban_weikai_heji_11_xiaoshoue, Double yiban_weikai_heji_11_xiaoxiangshuie, Double yiban_weikai_heji_11_jiashuiheji, Double yiban_weikai_heji_3_qiye, Double yiban_weikai_heji_3_xiaoshoue, Double yiban_weikai_heji_3_xiaoxiangshuie, Double yiban_weikai_heji_3_jiashuiheji, Double yiban_weikai_heji_17huowu_qiye, Double yiban_weikai_heji_17huowu_xiaoshoue, Double yiban_weikai_heji_17huowu_xiaoxiangshuie, Double yiban_weikai_heji_17huowu_jiashuiheji, Double yiban_weikai_heji_17fuwu_qiye, Double yiban_weikai_heji_17fuwu_xiaoshoue, Double yiban_weikai_heji_17fuwu_xiaoxiangshuie, Double yiban_weikai_heji_17fuwu_jiashuiheji, Double yiban_weikai_heji_13_qiye, Double yiban_weikai_heji_13_xiaoshoue, Double yiban_weikai_heji_13_xiaoxiangshuie, Double yiban_weikai_heji_13_jiashuiheji, Double yiban_weikai_heji_6_qiye, Double yiban_weikai_heji_6_xiaoshoue, Double yiban_weikai_heji_6_xiaoxiangshuie, Double yiban_weikai_heji_6_jiashuiheji, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.yiban_weikai_11_xiaoshoue=yiban_weikai_11_xiaoshoue;
this.yiban_weikai_11_xiaoxiangshuie=yiban_weikai_11_xiaoxiangshuie;
this.yiban_weikai_11_xiaoji=yiban_weikai_11_xiaoji;
this.yiban_weikai_3_xiaoshoue=yiban_weikai_3_xiaoshoue;
this.yiban_weikai_3_xiaoxiangshuie=yiban_weikai_3_xiaoxiangshuie;
this.yiban_weikai_3_xiaoji=yiban_weikai_3_xiaoji;
this.yiban_weikai_17huowu_xiaoshoue=yiban_weikai_17huowu_xiaoshoue;
this.yiban_weikai_17huowu_xiaoxiangshuie=yiban_weikai_17huowu_xiaoxiangshuie;
this.yiban_weikai_17huowu_xiaoji=yiban_weikai_17huowu_xiaoji;
this.yiban_weikai_17fuwu_xiaoshoue=yiban_weikai_17fuwu_xiaoshoue;
this.yiban_weikai_17fuwu_xiaoxiangshuie=yiban_weikai_17fuwu_xiaoxiangshuie;
this.yiban_weikai_17fuwu_xiaoji=yiban_weikai_17fuwu_xiaoji;
this.yiban_weikai_13_xiaoshoue=yiban_weikai_13_xiaoshoue;
this.yiban_weikai_13_xiaoxiangshuie=yiban_weikai_13_xiaoxiangshuie;
this.yiban_weikai_13_xiaoji=yiban_weikai_13_xiaoji;
this.yiban_weikai_6_xiaoshoue=yiban_weikai_6_xiaoshoue;
this.yiban_weikai_6_xiaoxiangshuie=yiban_weikai_6_xiaoxiangshuie;
this.yiban_weikai_6_xiaoji=yiban_weikai_6_xiaoji;
this.zhaiyao=zhaiyao;
this.yiban_weikai_11_qiyezibaojine=yiban_weikai_11_qiyezibaojine;
this.yiban_weikai_3_qiyezibaojine=yiban_weikai_3_qiyezibaojine;
this.yiban_weikai_17huowu_qiyezibaojine=yiban_weikai_17huowu_qiyezibaojine;
this.yiban_weikai_17fuwu_qiyezibaojine=yiban_weikai_17fuwu_qiyezibaojine;
this.yiban_weikai_13_qiyezibaojine=yiban_weikai_13_qiyezibaojine;
this.yiban_weikai_6_qiyezibaojine=yiban_weikai_6_qiyezibaojine;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoshijian=tianbiaoshijian;
this.shenheshijian=shenheshijian;
this.fuheren=fuheren;
this.yiban_weikai_heji_11_qiye=yiban_weikai_heji_11_qiye;
this.yiban_weikai_heji_11_xiaoshoue=yiban_weikai_heji_11_xiaoshoue;
this.yiban_weikai_heji_11_xiaoxiangshuie=yiban_weikai_heji_11_xiaoxiangshuie;
this.yiban_weikai_heji_11_jiashuiheji=yiban_weikai_heji_11_jiashuiheji;
this.yiban_weikai_heji_3_qiye=yiban_weikai_heji_3_qiye;
this.yiban_weikai_heji_3_xiaoshoue=yiban_weikai_heji_3_xiaoshoue;
this.yiban_weikai_heji_3_xiaoxiangshuie=yiban_weikai_heji_3_xiaoxiangshuie;
this.yiban_weikai_heji_3_jiashuiheji=yiban_weikai_heji_3_jiashuiheji;
this.yiban_weikai_heji_17huowu_qiye=yiban_weikai_heji_17huowu_qiye;
this.yiban_weikai_heji_17huowu_xiaoshoue=yiban_weikai_heji_17huowu_xiaoshoue;
this.yiban_weikai_heji_17huowu_xiaoxiangshuie=yiban_weikai_heji_17huowu_xiaoxiangshuie;
this.yiban_weikai_heji_17huowu_jiashuiheji=yiban_weikai_heji_17huowu_jiashuiheji;
this.yiban_weikai_heji_17fuwu_qiye=yiban_weikai_heji_17fuwu_qiye;
this.yiban_weikai_heji_17fuwu_xiaoshoue=yiban_weikai_heji_17fuwu_xiaoshoue;
this.yiban_weikai_heji_17fuwu_xiaoxiangshuie=yiban_weikai_heji_17fuwu_xiaoxiangshuie;
this.yiban_weikai_heji_17fuwu_jiashuiheji=yiban_weikai_heji_17fuwu_jiashuiheji;
this.yiban_weikai_heji_13_qiye=yiban_weikai_heji_13_qiye;
this.yiban_weikai_heji_13_xiaoshoue=yiban_weikai_heji_13_xiaoshoue;
this.yiban_weikai_heji_13_xiaoxiangshuie=yiban_weikai_heji_13_xiaoxiangshuie;
this.yiban_weikai_heji_13_jiashuiheji=yiban_weikai_heji_13_jiashuiheji;
this.yiban_weikai_heji_6_qiye=yiban_weikai_heji_6_qiye;
this.yiban_weikai_heji_6_xiaoshoue=yiban_weikai_heji_6_xiaoshoue;
this.yiban_weikai_heji_6_xiaoxiangshuie=yiban_weikai_heji_6_xiaoxiangshuie;
this.yiban_weikai_heji_6_jiashuiheji=yiban_weikai_heji_6_jiashuiheji;
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public void setId (Long id) {
this.id=id;
}

public Long getId () {
return this.id;
}

public void setFengongsimingcheng (String fengongsimingcheng) {
this.fengongsimingcheng=fengongsimingcheng;
}

public String getFengongsimingcheng () {
return this.fengongsimingcheng;
}

public void setXiangmubu (String xiangmubu) {
this.xiangmubu=xiangmubu;
}

public String getXiangmubu () {
return this.xiangmubu;
}

public void setRiqi (Timestamp riqi) {
		this.riqi=riqi;
}

public String getRiqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String riqi = "";
	if(this.riqi != null) {
		riqi  = dateFormat.format(this.riqi);
	}
return riqi;
}

public void setYiban_weikai_11_xiaoshoue (Double yiban_weikai_11_xiaoshoue) {
	this.yiban_weikai_11_xiaoshoue=yiban_weikai_11_xiaoshoue;
}

public Double getYiban_weikai_11_xiaoshoue () {
return this.yiban_weikai_11_xiaoshoue;
}

public void setYiban_weikai_11_xiaoxiangshuie (Double yiban_weikai_11_xiaoxiangshuie) {
	this.yiban_weikai_11_xiaoxiangshuie=yiban_weikai_11_xiaoxiangshuie;
}

public Double getYiban_weikai_11_xiaoxiangshuie () {
return this.yiban_weikai_11_xiaoxiangshuie;
}

public void setYiban_weikai_11_xiaoji (Double yiban_weikai_11_xiaoji) {
	this.yiban_weikai_11_xiaoji=yiban_weikai_11_xiaoji;
}

public Double getYiban_weikai_11_xiaoji () {
return this.yiban_weikai_11_xiaoji;
}

public void setYiban_weikai_3_xiaoshoue (Double yiban_weikai_3_xiaoshoue) {
	this.yiban_weikai_3_xiaoshoue=yiban_weikai_3_xiaoshoue;
}

public Double getYiban_weikai_3_xiaoshoue () {
return this.yiban_weikai_3_xiaoshoue;
}

public void setYiban_weikai_3_xiaoxiangshuie (Double yiban_weikai_3_xiaoxiangshuie) {
	this.yiban_weikai_3_xiaoxiangshuie=yiban_weikai_3_xiaoxiangshuie;
}

public Double getYiban_weikai_3_xiaoxiangshuie () {
return this.yiban_weikai_3_xiaoxiangshuie;
}

public void setYiban_weikai_3_xiaoji (Double yiban_weikai_3_xiaoji) {
	this.yiban_weikai_3_xiaoji=yiban_weikai_3_xiaoji;
}

public Double getYiban_weikai_3_xiaoji () {
return this.yiban_weikai_3_xiaoji;
}

public void setYiban_weikai_17huowu_xiaoshoue (Double yiban_weikai_17huowu_xiaoshoue) {
	this.yiban_weikai_17huowu_xiaoshoue=yiban_weikai_17huowu_xiaoshoue;
}

public Double getYiban_weikai_17huowu_xiaoshoue () {
return this.yiban_weikai_17huowu_xiaoshoue;
}

public void setYiban_weikai_17huowu_xiaoxiangshuie (Double yiban_weikai_17huowu_xiaoxiangshuie) {
	this.yiban_weikai_17huowu_xiaoxiangshuie=yiban_weikai_17huowu_xiaoxiangshuie;
}

public Double getYiban_weikai_17huowu_xiaoxiangshuie () {
return this.yiban_weikai_17huowu_xiaoxiangshuie;
}

public void setYiban_weikai_17huowu_xiaoji (Double yiban_weikai_17huowu_xiaoji) {
	this.yiban_weikai_17huowu_xiaoji=yiban_weikai_17huowu_xiaoji;
}

public Double getYiban_weikai_17huowu_xiaoji () {
return this.yiban_weikai_17huowu_xiaoji;
}

public void setYiban_weikai_17fuwu_xiaoshoue (Double yiban_weikai_17fuwu_xiaoshoue) {
	this.yiban_weikai_17fuwu_xiaoshoue=yiban_weikai_17fuwu_xiaoshoue;
}

public Double getYiban_weikai_17fuwu_xiaoshoue () {
return this.yiban_weikai_17fuwu_xiaoshoue;
}

public void setYiban_weikai_17fuwu_xiaoxiangshuie (Double yiban_weikai_17fuwu_xiaoxiangshuie) {
	this.yiban_weikai_17fuwu_xiaoxiangshuie=yiban_weikai_17fuwu_xiaoxiangshuie;
}

public Double getYiban_weikai_17fuwu_xiaoxiangshuie () {
return this.yiban_weikai_17fuwu_xiaoxiangshuie;
}

public void setYiban_weikai_17fuwu_xiaoji (Double yiban_weikai_17fuwu_xiaoji) {
	this.yiban_weikai_17fuwu_xiaoji=yiban_weikai_17fuwu_xiaoji;
}

public Double getYiban_weikai_17fuwu_xiaoji () {
return this.yiban_weikai_17fuwu_xiaoji;
}

public void setYiban_weikai_13_xiaoshoue (Double yiban_weikai_13_xiaoshoue) {
	this.yiban_weikai_13_xiaoshoue=yiban_weikai_13_xiaoshoue;
}

public Double getYiban_weikai_13_xiaoshoue () {
return this.yiban_weikai_13_xiaoshoue;
}

public void setYiban_weikai_13_xiaoxiangshuie (Double yiban_weikai_13_xiaoxiangshuie) {
	this.yiban_weikai_13_xiaoxiangshuie=yiban_weikai_13_xiaoxiangshuie;
}

public Double getYiban_weikai_13_xiaoxiangshuie () {
return this.yiban_weikai_13_xiaoxiangshuie;
}

public void setYiban_weikai_13_xiaoji (Double yiban_weikai_13_xiaoji) {
	this.yiban_weikai_13_xiaoji=yiban_weikai_13_xiaoji;
}

public Double getYiban_weikai_13_xiaoji () {
return this.yiban_weikai_13_xiaoji;
}

public void setYiban_weikai_6_xiaoshoue (Double yiban_weikai_6_xiaoshoue) {
	this.yiban_weikai_6_xiaoshoue=yiban_weikai_6_xiaoshoue;
}

public Double getYiban_weikai_6_xiaoshoue () {
return this.yiban_weikai_6_xiaoshoue;
}

public void setYiban_weikai_6_xiaoxiangshuie (Double yiban_weikai_6_xiaoxiangshuie) {
	this.yiban_weikai_6_xiaoxiangshuie=yiban_weikai_6_xiaoxiangshuie;
}

public Double getYiban_weikai_6_xiaoxiangshuie () {
return this.yiban_weikai_6_xiaoxiangshuie;
}

public void setYiban_weikai_6_xiaoji (Double yiban_weikai_6_xiaoji) {
	this.yiban_weikai_6_xiaoji=yiban_weikai_6_xiaoji;
}

public Double getYiban_weikai_6_xiaoji () {
return this.yiban_weikai_6_xiaoji;
}

public void setZhaiyao (String zhaiyao) {
this.zhaiyao=zhaiyao;
}

public String getZhaiyao () {
return this.zhaiyao;
}

public void setYiban_weikai_11_qiyezibaojine (Double yiban_weikai_11_qiyezibaojine) {
	this.yiban_weikai_11_qiyezibaojine=yiban_weikai_11_qiyezibaojine;
}

public Double getYiban_weikai_11_qiyezibaojine () {
return this.yiban_weikai_11_qiyezibaojine;
}

public void setYiban_weikai_3_qiyezibaojine (Double yiban_weikai_3_qiyezibaojine) {
	this.yiban_weikai_3_qiyezibaojine=yiban_weikai_3_qiyezibaojine;
}

public Double getYiban_weikai_3_qiyezibaojine () {
return this.yiban_weikai_3_qiyezibaojine;
}

public void setYiban_weikai_17huowu_qiyezibaojine (Double yiban_weikai_17huowu_qiyezibaojine) {
	this.yiban_weikai_17huowu_qiyezibaojine=yiban_weikai_17huowu_qiyezibaojine;
}

public Double getYiban_weikai_17huowu_qiyezibaojine () {
return this.yiban_weikai_17huowu_qiyezibaojine;
}

public void setYiban_weikai_17fuwu_qiyezibaojine (Double yiban_weikai_17fuwu_qiyezibaojine) {
	this.yiban_weikai_17fuwu_qiyezibaojine=yiban_weikai_17fuwu_qiyezibaojine;
}

public Double getYiban_weikai_17fuwu_qiyezibaojine () {
return this.yiban_weikai_17fuwu_qiyezibaojine;
}

public void setYiban_weikai_13_qiyezibaojine (Double yiban_weikai_13_qiyezibaojine) {
	this.yiban_weikai_13_qiyezibaojine=yiban_weikai_13_qiyezibaojine;
}

public Double getYiban_weikai_13_qiyezibaojine () {
return this.yiban_weikai_13_qiyezibaojine;
}

public void setYiban_weikai_6_qiyezibaojine (Double yiban_weikai_6_qiyezibaojine) {
	this.yiban_weikai_6_qiyezibaojine=yiban_weikai_6_qiyezibaojine;
}

public Double getYiban_weikai_6_qiyezibaojine () {
return this.yiban_weikai_6_qiyezibaojine;
}

public void setTianbiaoren (String tianbiaoren) {
this.tianbiaoren=tianbiaoren;
}

public String getTianbiaoren () {
return this.tianbiaoren;
}

public void setShenheren (String shenheren) {
this.shenheren=shenheren;
}

public String getShenheren () {
return this.shenheren;
}

public void setTianbiaorendianhua (String tianbiaorendianhua) {
this.tianbiaorendianhua=tianbiaorendianhua;
}

public String getTianbiaorendianhua () {
return this.tianbiaorendianhua;
}

public void setShenherendianhua (String shenherendianhua) {
this.shenherendianhua=shenherendianhua;
}

public String getShenherendianhua () {
return this.shenherendianhua;
}

public void setTianbiaoshijian (Timestamp tianbiaoshijian) {
		this.tianbiaoshijian=tianbiaoshijian;
}

public String getTianbiaoshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String tianbiaoshijian = "";
	if(this.tianbiaoshijian != null) {
		tianbiaoshijian  = dateFormat.format(this.tianbiaoshijian);
	}
return tianbiaoshijian;
}

public void setShenheshijian (Timestamp shenheshijian) {
		this.shenheshijian=shenheshijian;
}

public String getShenheshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String shenheshijian = "";
	if(this.shenheshijian != null) {
		shenheshijian  = dateFormat.format(this.shenheshijian);
	}
return shenheshijian;
}

public void setFuheren (String fuheren) {
this.fuheren=fuheren;
}

public String getFuheren () {
return this.fuheren;
}

public void setYiban_weikai_heji_11_qiye (Double yiban_weikai_heji_11_qiye) {
	this.yiban_weikai_heji_11_qiye=yiban_weikai_heji_11_qiye;
}

public Double getYiban_weikai_heji_11_qiye () {
return this.yiban_weikai_heji_11_qiye;
}

public void setYiban_weikai_heji_11_xiaoshoue (Double yiban_weikai_heji_11_xiaoshoue) {
	this.yiban_weikai_heji_11_xiaoshoue=yiban_weikai_heji_11_xiaoshoue;
}

public Double getYiban_weikai_heji_11_xiaoshoue () {
return this.yiban_weikai_heji_11_xiaoshoue;
}

public void setYiban_weikai_heji_11_xiaoxiangshuie (Double yiban_weikai_heji_11_xiaoxiangshuie) {
	this.yiban_weikai_heji_11_xiaoxiangshuie=yiban_weikai_heji_11_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_11_xiaoxiangshuie () {
return this.yiban_weikai_heji_11_xiaoxiangshuie;
}

public void setYiban_weikai_heji_11_jiashuiheji (Double yiban_weikai_heji_11_jiashuiheji) {
	this.yiban_weikai_heji_11_jiashuiheji=yiban_weikai_heji_11_jiashuiheji;
}

public Double getYiban_weikai_heji_11_jiashuiheji () {
return this.yiban_weikai_heji_11_jiashuiheji;
}

public void setYiban_weikai_heji_3_qiye (Double yiban_weikai_heji_3_qiye) {
	this.yiban_weikai_heji_3_qiye=yiban_weikai_heji_3_qiye;
}

public Double getYiban_weikai_heji_3_qiye () {
return this.yiban_weikai_heji_3_qiye;
}

public void setYiban_weikai_heji_3_xiaoshoue (Double yiban_weikai_heji_3_xiaoshoue) {
	this.yiban_weikai_heji_3_xiaoshoue=yiban_weikai_heji_3_xiaoshoue;
}

public Double getYiban_weikai_heji_3_xiaoshoue () {
return this.yiban_weikai_heji_3_xiaoshoue;
}

public void setYiban_weikai_heji_3_xiaoxiangshuie (Double yiban_weikai_heji_3_xiaoxiangshuie) {
	this.yiban_weikai_heji_3_xiaoxiangshuie=yiban_weikai_heji_3_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_3_xiaoxiangshuie () {
return this.yiban_weikai_heji_3_xiaoxiangshuie;
}

public void setYiban_weikai_heji_3_jiashuiheji (Double yiban_weikai_heji_3_jiashuiheji) {
	this.yiban_weikai_heji_3_jiashuiheji=yiban_weikai_heji_3_jiashuiheji;
}

public Double getYiban_weikai_heji_3_jiashuiheji () {
return this.yiban_weikai_heji_3_jiashuiheji;
}

public void setYiban_weikai_heji_17huowu_qiye (Double yiban_weikai_heji_17huowu_qiye) {
	this.yiban_weikai_heji_17huowu_qiye=yiban_weikai_heji_17huowu_qiye;
}

public Double getYiban_weikai_heji_17huowu_qiye () {
return this.yiban_weikai_heji_17huowu_qiye;
}

public void setYiban_weikai_heji_17huowu_xiaoshoue (Double yiban_weikai_heji_17huowu_xiaoshoue) {
	this.yiban_weikai_heji_17huowu_xiaoshoue=yiban_weikai_heji_17huowu_xiaoshoue;
}

public Double getYiban_weikai_heji_17huowu_xiaoshoue () {
return this.yiban_weikai_heji_17huowu_xiaoshoue;
}

public void setYiban_weikai_heji_17huowu_xiaoxiangshuie (Double yiban_weikai_heji_17huowu_xiaoxiangshuie) {
	this.yiban_weikai_heji_17huowu_xiaoxiangshuie=yiban_weikai_heji_17huowu_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_17huowu_xiaoxiangshuie () {
return this.yiban_weikai_heji_17huowu_xiaoxiangshuie;
}

public void setYiban_weikai_heji_17huowu_jiashuiheji (Double yiban_weikai_heji_17huowu_jiashuiheji) {
	this.yiban_weikai_heji_17huowu_jiashuiheji=yiban_weikai_heji_17huowu_jiashuiheji;
}

public Double getYiban_weikai_heji_17huowu_jiashuiheji () {
return this.yiban_weikai_heji_17huowu_jiashuiheji;
}

public void setYiban_weikai_heji_17fuwu_qiye (Double yiban_weikai_heji_17fuwu_qiye) {
	this.yiban_weikai_heji_17fuwu_qiye=yiban_weikai_heji_17fuwu_qiye;
}

public Double getYiban_weikai_heji_17fuwu_qiye () {
return this.yiban_weikai_heji_17fuwu_qiye;
}

public void setYiban_weikai_heji_17fuwu_xiaoshoue (Double yiban_weikai_heji_17fuwu_xiaoshoue) {
	this.yiban_weikai_heji_17fuwu_xiaoshoue=yiban_weikai_heji_17fuwu_xiaoshoue;
}

public Double getYiban_weikai_heji_17fuwu_xiaoshoue () {
return this.yiban_weikai_heji_17fuwu_xiaoshoue;
}

public void setYiban_weikai_heji_17fuwu_xiaoxiangshuie (Double yiban_weikai_heji_17fuwu_xiaoxiangshuie) {
	this.yiban_weikai_heji_17fuwu_xiaoxiangshuie=yiban_weikai_heji_17fuwu_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_17fuwu_xiaoxiangshuie () {
return this.yiban_weikai_heji_17fuwu_xiaoxiangshuie;
}

public void setYiban_weikai_heji_17fuwu_jiashuiheji (Double yiban_weikai_heji_17fuwu_jiashuiheji) {
	this.yiban_weikai_heji_17fuwu_jiashuiheji=yiban_weikai_heji_17fuwu_jiashuiheji;
}

public Double getYiban_weikai_heji_17fuwu_jiashuiheji () {
return this.yiban_weikai_heji_17fuwu_jiashuiheji;
}

public void setYiban_weikai_heji_13_qiye (Double yiban_weikai_heji_13_qiye) {
	this.yiban_weikai_heji_13_qiye=yiban_weikai_heji_13_qiye;
}

public Double getYiban_weikai_heji_13_qiye () {
return this.yiban_weikai_heji_13_qiye;
}

public void setYiban_weikai_heji_13_xiaoshoue (Double yiban_weikai_heji_13_xiaoshoue) {
	this.yiban_weikai_heji_13_xiaoshoue=yiban_weikai_heji_13_xiaoshoue;
}

public Double getYiban_weikai_heji_13_xiaoshoue () {
return this.yiban_weikai_heji_13_xiaoshoue;
}

public void setYiban_weikai_heji_13_xiaoxiangshuie (Double yiban_weikai_heji_13_xiaoxiangshuie) {
	this.yiban_weikai_heji_13_xiaoxiangshuie=yiban_weikai_heji_13_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_13_xiaoxiangshuie () {
return this.yiban_weikai_heji_13_xiaoxiangshuie;
}

public void setYiban_weikai_heji_13_jiashuiheji (Double yiban_weikai_heji_13_jiashuiheji) {
	this.yiban_weikai_heji_13_jiashuiheji=yiban_weikai_heji_13_jiashuiheji;
}

public Double getYiban_weikai_heji_13_jiashuiheji () {
return this.yiban_weikai_heji_13_jiashuiheji;
}

public void setYiban_weikai_heji_6_qiye (Double yiban_weikai_heji_6_qiye) {
	this.yiban_weikai_heji_6_qiye=yiban_weikai_heji_6_qiye;
}

public Double getYiban_weikai_heji_6_qiye () {
return this.yiban_weikai_heji_6_qiye;
}

public void setYiban_weikai_heji_6_xiaoshoue (Double yiban_weikai_heji_6_xiaoshoue) {
	this.yiban_weikai_heji_6_xiaoshoue=yiban_weikai_heji_6_xiaoshoue;
}

public Double getYiban_weikai_heji_6_xiaoshoue () {
return this.yiban_weikai_heji_6_xiaoshoue;
}

public void setYiban_weikai_heji_6_xiaoxiangshuie (Double yiban_weikai_heji_6_xiaoxiangshuie) {
	this.yiban_weikai_heji_6_xiaoxiangshuie=yiban_weikai_heji_6_xiaoxiangshuie;
}

public Double getYiban_weikai_heji_6_xiaoxiangshuie () {
return this.yiban_weikai_heji_6_xiaoxiangshuie;
}

public void setYiban_weikai_heji_6_jiashuiheji (Double yiban_weikai_heji_6_jiashuiheji) {
	this.yiban_weikai_heji_6_jiashuiheji=yiban_weikai_heji_6_jiashuiheji;
}

public Double getYiban_weikai_heji_6_jiashuiheji () {
return this.yiban_weikai_heji_6_jiashuiheji;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
