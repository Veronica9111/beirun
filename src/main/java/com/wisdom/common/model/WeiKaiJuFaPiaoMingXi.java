package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class WeiKaiJuFaPiaoMingXi implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public WeiKaiJuFaPiaoMingXi() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double weikai_11_xiaoshoue;
private Double weikai_11_xiaoxiangshuie;
private Double weikai_11_xiaoji;
private Double weikai_3_xiaoshoue;
private Double weikai_3_xiaoxiangshuie;
private Double weikai_3_xiaoji;
private Double weikai_17huowu_xiaoshoue;
private Double weikai_17huowu_xiaoxiangshuie;
private Double weikai_17huowu_xiaoji;
private Double weikai_17fuwu_xiaoshoue;
private Double weikai_17fuwu_xiaoxiangshuie;
private Double weikai_17fuwu_xiaoji;
private Double weikai_13_xiaoshoue;
private Double weikai_13_xiaoxiangshuie;
private Double weikai_13_xiaoji;
private Double weikai_6_xiaoshoue;
private Double weikai_6_xiaoxiangshuie;
private Double weikai_6_xiaoji;
private String zhaiyao;
private Double weikai_11_qiyezibaojine;
private Double weikai_3_qiyezibaojine;
private Double weikai_17huowu_qiyezibaojine;
private Double weikai_17fuwu_qiyezibaojine;
private Double weikai_13_qiyezibaojine;
private Double weikai_6_qiyezibaojine;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoshijian;
private Timestamp shenheshijian;
private String fuheren;
private Double weikai_heji_11_qiye;
private Double weikai_heji_11_xiaoshoue;
private Double weikai_heji_11_xiaoxiangshuie;
private Double weikai_heji_11_jiashuiheji;
private Double weikai_heji_3_qiye;
private Double weikai_heji_3_xiaoshoue;
private Double weikai_heji_3_xiaoxiangshuie;
private Double weikai_heji_3_jiashuiheji;
private Double weikai_heji_17huowu_qiye;
private Double weikai_heji_17huowu_xiaoshoue;
private Double weikai_heji_17huowu_xiaoxiangshuie;
private Double weikai_heji_17huowu_jiashuiheji;
private Double weikai_heji_17fuwu_qiye;
private Double weikai_heji_17fuwu_xiaoshoue;
private Double weikai_heji_17fuwu_xiaoxiangshuie;
private Double weikai_heji_17fuwu_jiashuiheji;
private Double weikai_heji_13_qiye;
private Double weikai_heji_13_xiaoshoue;
private Double weikai_heji_13_xiaoxiangshuie;
private Double weikai_heji_13_jiashuiheji;
private Double weikai_heji_6_qiye;
private Double weikai_heji_6_xiaoshoue;
private Double weikai_heji_6_xiaoxiangshuie;
private Double weikai_heji_6_jiashuiheji;
private Long kaipiaoshenqingdan_id;
public WeiKaiJuFaPiaoMingXi(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double weikai_11_xiaoshoue, Double weikai_11_xiaoxiangshuie, Double weikai_11_xiaoji, Double weikai_3_xiaoshoue, Double weikai_3_xiaoxiangshuie, Double weikai_3_xiaoji, Double weikai_17huowu_xiaoshoue, Double weikai_17huowu_xiaoxiangshuie, Double weikai_17huowu_xiaoji, Double weikai_17fuwu_xiaoshoue, Double weikai_17fuwu_xiaoxiangshuie, Double weikai_17fuwu_xiaoji, Double weikai_13_xiaoshoue, Double weikai_13_xiaoxiangshuie, Double weikai_13_xiaoji, Double weikai_6_xiaoshoue, Double weikai_6_xiaoxiangshuie, Double weikai_6_xiaoji, String zhaiyao, Double weikai_11_qiyezibaojine, Double weikai_3_qiyezibaojine, Double weikai_17huowu_qiyezibaojine, Double weikai_17fuwu_qiyezibaojine, Double weikai_13_qiyezibaojine, Double weikai_6_qiyezibaojine, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoshijian, Timestamp shenheshijian, String fuheren, Double weikai_heji_11_qiye, Double weikai_heji_11_xiaoshoue, Double weikai_heji_11_xiaoxiangshuie, Double weikai_heji_11_jiashuiheji, Double weikai_heji_3_qiye, Double weikai_heji_3_xiaoshoue, Double weikai_heji_3_xiaoxiangshuie, Double weikai_heji_3_jiashuiheji, Double weikai_heji_17huowu_qiye, Double weikai_heji_17huowu_xiaoshoue, Double weikai_heji_17huowu_xiaoxiangshuie, Double weikai_heji_17huowu_jiashuiheji, Double weikai_heji_17fuwu_qiye, Double weikai_heji_17fuwu_xiaoshoue, Double weikai_heji_17fuwu_xiaoxiangshuie, Double weikai_heji_17fuwu_jiashuiheji, Double weikai_heji_13_qiye, Double weikai_heji_13_xiaoshoue, Double weikai_heji_13_xiaoxiangshuie, Double weikai_heji_13_jiashuiheji, Double weikai_heji_6_qiye, Double weikai_heji_6_xiaoshoue, Double weikai_heji_6_xiaoxiangshuie, Double weikai_heji_6_jiashuiheji, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.weikai_11_xiaoshoue=weikai_11_xiaoshoue;
this.weikai_11_xiaoxiangshuie=weikai_11_xiaoxiangshuie;
this.weikai_11_xiaoji=weikai_11_xiaoji;
this.weikai_3_xiaoshoue=weikai_3_xiaoshoue;
this.weikai_3_xiaoxiangshuie=weikai_3_xiaoxiangshuie;
this.weikai_3_xiaoji=weikai_3_xiaoji;
this.weikai_17huowu_xiaoshoue=weikai_17huowu_xiaoshoue;
this.weikai_17huowu_xiaoxiangshuie=weikai_17huowu_xiaoxiangshuie;
this.weikai_17huowu_xiaoji=weikai_17huowu_xiaoji;
this.weikai_17fuwu_xiaoshoue=weikai_17fuwu_xiaoshoue;
this.weikai_17fuwu_xiaoxiangshuie=weikai_17fuwu_xiaoxiangshuie;
this.weikai_17fuwu_xiaoji=weikai_17fuwu_xiaoji;
this.weikai_13_xiaoshoue=weikai_13_xiaoshoue;
this.weikai_13_xiaoxiangshuie=weikai_13_xiaoxiangshuie;
this.weikai_13_xiaoji=weikai_13_xiaoji;
this.weikai_6_xiaoshoue=weikai_6_xiaoshoue;
this.weikai_6_xiaoxiangshuie=weikai_6_xiaoxiangshuie;
this.weikai_6_xiaoji=weikai_6_xiaoji;
this.zhaiyao=zhaiyao;
this.weikai_11_qiyezibaojine=weikai_11_qiyezibaojine;
this.weikai_3_qiyezibaojine=weikai_3_qiyezibaojine;
this.weikai_17huowu_qiyezibaojine=weikai_17huowu_qiyezibaojine;
this.weikai_17fuwu_qiyezibaojine=weikai_17fuwu_qiyezibaojine;
this.weikai_13_qiyezibaojine=weikai_13_qiyezibaojine;
this.weikai_6_qiyezibaojine=weikai_6_qiyezibaojine;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoshijian=tianbiaoshijian;
this.shenheshijian=shenheshijian;
this.fuheren=fuheren;
this.weikai_heji_11_qiye=weikai_heji_11_qiye;
this.weikai_heji_11_xiaoshoue=weikai_heji_11_xiaoshoue;
this.weikai_heji_11_xiaoxiangshuie=weikai_heji_11_xiaoxiangshuie;
this.weikai_heji_11_jiashuiheji=weikai_heji_11_jiashuiheji;
this.weikai_heji_3_qiye=weikai_heji_3_qiye;
this.weikai_heji_3_xiaoshoue=weikai_heji_3_xiaoshoue;
this.weikai_heji_3_xiaoxiangshuie=weikai_heji_3_xiaoxiangshuie;
this.weikai_heji_3_jiashuiheji=weikai_heji_3_jiashuiheji;
this.weikai_heji_17huowu_qiye=weikai_heji_17huowu_qiye;
this.weikai_heji_17huowu_xiaoshoue=weikai_heji_17huowu_xiaoshoue;
this.weikai_heji_17huowu_xiaoxiangshuie=weikai_heji_17huowu_xiaoxiangshuie;
this.weikai_heji_17huowu_jiashuiheji=weikai_heji_17huowu_jiashuiheji;
this.weikai_heji_17fuwu_qiye=weikai_heji_17fuwu_qiye;
this.weikai_heji_17fuwu_xiaoshoue=weikai_heji_17fuwu_xiaoshoue;
this.weikai_heji_17fuwu_xiaoxiangshuie=weikai_heji_17fuwu_xiaoxiangshuie;
this.weikai_heji_17fuwu_jiashuiheji=weikai_heji_17fuwu_jiashuiheji;
this.weikai_heji_13_qiye=weikai_heji_13_qiye;
this.weikai_heji_13_xiaoshoue=weikai_heji_13_xiaoshoue;
this.weikai_heji_13_xiaoxiangshuie=weikai_heji_13_xiaoxiangshuie;
this.weikai_heji_13_jiashuiheji=weikai_heji_13_jiashuiheji;
this.weikai_heji_6_qiye=weikai_heji_6_qiye;
this.weikai_heji_6_xiaoshoue=weikai_heji_6_xiaoshoue;
this.weikai_heji_6_xiaoxiangshuie=weikai_heji_6_xiaoxiangshuie;
this.weikai_heji_6_jiashuiheji=weikai_heji_6_jiashuiheji;
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

public void setWeikai_11_xiaoshoue (Double weikai_11_xiaoshoue) {
	this.weikai_11_xiaoshoue=weikai_11_xiaoshoue;
}

public Double getWeikai_11_xiaoshoue () {
return this.weikai_11_xiaoshoue;
}

public void setWeikai_11_xiaoxiangshuie (Double weikai_11_xiaoxiangshuie) {
	this.weikai_11_xiaoxiangshuie=weikai_11_xiaoxiangshuie;
}

public Double getWeikai_11_xiaoxiangshuie () {
return this.weikai_11_xiaoxiangshuie;
}

public void setWeikai_11_xiaoji (Double weikai_11_xiaoji) {
	this.weikai_11_xiaoji=weikai_11_xiaoji;
}

public Double getWeikai_11_xiaoji () {
return this.weikai_11_xiaoji;
}

public void setWeikai_3_xiaoshoue (Double weikai_3_xiaoshoue) {
	this.weikai_3_xiaoshoue=weikai_3_xiaoshoue;
}

public Double getWeikai_3_xiaoshoue () {
return this.weikai_3_xiaoshoue;
}

public void setWeikai_3_xiaoxiangshuie (Double weikai_3_xiaoxiangshuie) {
	this.weikai_3_xiaoxiangshuie=weikai_3_xiaoxiangshuie;
}

public Double getWeikai_3_xiaoxiangshuie () {
return this.weikai_3_xiaoxiangshuie;
}

public void setWeikai_3_xiaoji (Double weikai_3_xiaoji) {
	this.weikai_3_xiaoji=weikai_3_xiaoji;
}

public Double getWeikai_3_xiaoji () {
return this.weikai_3_xiaoji;
}

public void setWeikai_17huowu_xiaoshoue (Double weikai_17huowu_xiaoshoue) {
	this.weikai_17huowu_xiaoshoue=weikai_17huowu_xiaoshoue;
}

public Double getWeikai_17huowu_xiaoshoue () {
return this.weikai_17huowu_xiaoshoue;
}

public void setWeikai_17huowu_xiaoxiangshuie (Double weikai_17huowu_xiaoxiangshuie) {
	this.weikai_17huowu_xiaoxiangshuie=weikai_17huowu_xiaoxiangshuie;
}

public Double getWeikai_17huowu_xiaoxiangshuie () {
return this.weikai_17huowu_xiaoxiangshuie;
}

public void setWeikai_17huowu_xiaoji (Double weikai_17huowu_xiaoji) {
	this.weikai_17huowu_xiaoji=weikai_17huowu_xiaoji;
}

public Double getWeikai_17huowu_xiaoji () {
return this.weikai_17huowu_xiaoji;
}

public void setWeikai_17fuwu_xiaoshoue (Double weikai_17fuwu_xiaoshoue) {
	this.weikai_17fuwu_xiaoshoue=weikai_17fuwu_xiaoshoue;
}

public Double getWeikai_17fuwu_xiaoshoue () {
return this.weikai_17fuwu_xiaoshoue;
}

public void setWeikai_17fuwu_xiaoxiangshuie (Double weikai_17fuwu_xiaoxiangshuie) {
	this.weikai_17fuwu_xiaoxiangshuie=weikai_17fuwu_xiaoxiangshuie;
}

public Double getWeikai_17fuwu_xiaoxiangshuie () {
return this.weikai_17fuwu_xiaoxiangshuie;
}

public void setWeikai_17fuwu_xiaoji (Double weikai_17fuwu_xiaoji) {
	this.weikai_17fuwu_xiaoji=weikai_17fuwu_xiaoji;
}

public Double getWeikai_17fuwu_xiaoji () {
return this.weikai_17fuwu_xiaoji;
}

public void setWeikai_13_xiaoshoue (Double weikai_13_xiaoshoue) {
	this.weikai_13_xiaoshoue=weikai_13_xiaoshoue;
}

public Double getWeikai_13_xiaoshoue () {
return this.weikai_13_xiaoshoue;
}

public void setWeikai_13_xiaoxiangshuie (Double weikai_13_xiaoxiangshuie) {
	this.weikai_13_xiaoxiangshuie=weikai_13_xiaoxiangshuie;
}

public Double getWeikai_13_xiaoxiangshuie () {
return this.weikai_13_xiaoxiangshuie;
}

public void setWeikai_13_xiaoji (Double weikai_13_xiaoji) {
	this.weikai_13_xiaoji=weikai_13_xiaoji;
}

public Double getWeikai_13_xiaoji () {
return this.weikai_13_xiaoji;
}

public void setWeikai_6_xiaoshoue (Double weikai_6_xiaoshoue) {
	this.weikai_6_xiaoshoue=weikai_6_xiaoshoue;
}

public Double getWeikai_6_xiaoshoue () {
return this.weikai_6_xiaoshoue;
}

public void setWeikai_6_xiaoxiangshuie (Double weikai_6_xiaoxiangshuie) {
	this.weikai_6_xiaoxiangshuie=weikai_6_xiaoxiangshuie;
}

public Double getWeikai_6_xiaoxiangshuie () {
return this.weikai_6_xiaoxiangshuie;
}

public void setWeikai_6_xiaoji (Double weikai_6_xiaoji) {
	this.weikai_6_xiaoji=weikai_6_xiaoji;
}

public Double getWeikai_6_xiaoji () {
return this.weikai_6_xiaoji;
}

public void setZhaiyao (String zhaiyao) {
this.zhaiyao=zhaiyao;
}

public String getZhaiyao () {
return this.zhaiyao;
}

public void setWeikai_11_qiyezibaojine (Double weikai_11_qiyezibaojine) {
	this.weikai_11_qiyezibaojine=weikai_11_qiyezibaojine;
}

public Double getWeikai_11_qiyezibaojine () {
return this.weikai_11_qiyezibaojine;
}

public void setWeikai_3_qiyezibaojine (Double weikai_3_qiyezibaojine) {
	this.weikai_3_qiyezibaojine=weikai_3_qiyezibaojine;
}

public Double getWeikai_3_qiyezibaojine () {
return this.weikai_3_qiyezibaojine;
}

public void setWeikai_17huowu_qiyezibaojine (Double weikai_17huowu_qiyezibaojine) {
	this.weikai_17huowu_qiyezibaojine=weikai_17huowu_qiyezibaojine;
}

public Double getWeikai_17huowu_qiyezibaojine () {
return this.weikai_17huowu_qiyezibaojine;
}

public void setWeikai_17fuwu_qiyezibaojine (Double weikai_17fuwu_qiyezibaojine) {
	this.weikai_17fuwu_qiyezibaojine=weikai_17fuwu_qiyezibaojine;
}

public Double getWeikai_17fuwu_qiyezibaojine () {
return this.weikai_17fuwu_qiyezibaojine;
}

public void setWeikai_13_qiyezibaojine (Double weikai_13_qiyezibaojine) {
	this.weikai_13_qiyezibaojine=weikai_13_qiyezibaojine;
}

public Double getWeikai_13_qiyezibaojine () {
return this.weikai_13_qiyezibaojine;
}

public void setWeikai_6_qiyezibaojine (Double weikai_6_qiyezibaojine) {
	this.weikai_6_qiyezibaojine=weikai_6_qiyezibaojine;
}

public Double getWeikai_6_qiyezibaojine () {
return this.weikai_6_qiyezibaojine;
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

public void setWeikai_heji_11_qiye (Double weikai_heji_11_qiye) {
	this.weikai_heji_11_qiye=weikai_heji_11_qiye;
}

public Double getWeikai_heji_11_qiye () {
return this.weikai_heji_11_qiye;
}

public void setWeikai_heji_11_xiaoshoue (Double weikai_heji_11_xiaoshoue) {
	this.weikai_heji_11_xiaoshoue=weikai_heji_11_xiaoshoue;
}

public Double getWeikai_heji_11_xiaoshoue () {
return this.weikai_heji_11_xiaoshoue;
}

public void setWeikai_heji_11_xiaoxiangshuie (Double weikai_heji_11_xiaoxiangshuie) {
	this.weikai_heji_11_xiaoxiangshuie=weikai_heji_11_xiaoxiangshuie;
}

public Double getWeikai_heji_11_xiaoxiangshuie () {
return this.weikai_heji_11_xiaoxiangshuie;
}

public void setWeikai_heji_11_jiashuiheji (Double weikai_heji_11_jiashuiheji) {
	this.weikai_heji_11_jiashuiheji=weikai_heji_11_jiashuiheji;
}

public Double getWeikai_heji_11_jiashuiheji () {
return this.weikai_heji_11_jiashuiheji;
}

public void setWeikai_heji_3_qiye (Double weikai_heji_3_qiye) {
	this.weikai_heji_3_qiye=weikai_heji_3_qiye;
}

public Double getWeikai_heji_3_qiye () {
return this.weikai_heji_3_qiye;
}

public void setWeikai_heji_3_xiaoshoue (Double weikai_heji_3_xiaoshoue) {
	this.weikai_heji_3_xiaoshoue=weikai_heji_3_xiaoshoue;
}

public Double getWeikai_heji_3_xiaoshoue () {
return this.weikai_heji_3_xiaoshoue;
}

public void setWeikai_heji_3_xiaoxiangshuie (Double weikai_heji_3_xiaoxiangshuie) {
	this.weikai_heji_3_xiaoxiangshuie=weikai_heji_3_xiaoxiangshuie;
}

public Double getWeikai_heji_3_xiaoxiangshuie () {
return this.weikai_heji_3_xiaoxiangshuie;
}

public void setWeikai_heji_3_jiashuiheji (Double weikai_heji_3_jiashuiheji) {
	this.weikai_heji_3_jiashuiheji=weikai_heji_3_jiashuiheji;
}

public Double getWeikai_heji_3_jiashuiheji () {
return this.weikai_heji_3_jiashuiheji;
}

public void setWeikai_heji_17huowu_qiye (Double weikai_heji_17huowu_qiye) {
	this.weikai_heji_17huowu_qiye=weikai_heji_17huowu_qiye;
}

public Double getWeikai_heji_17huowu_qiye () {
return this.weikai_heji_17huowu_qiye;
}

public void setWeikai_heji_17huowu_xiaoshoue (Double weikai_heji_17huowu_xiaoshoue) {
	this.weikai_heji_17huowu_xiaoshoue=weikai_heji_17huowu_xiaoshoue;
}

public Double getWeikai_heji_17huowu_xiaoshoue () {
return this.weikai_heji_17huowu_xiaoshoue;
}

public void setWeikai_heji_17huowu_xiaoxiangshuie (Double weikai_heji_17huowu_xiaoxiangshuie) {
	this.weikai_heji_17huowu_xiaoxiangshuie=weikai_heji_17huowu_xiaoxiangshuie;
}

public Double getWeikai_heji_17huowu_xiaoxiangshuie () {
return this.weikai_heji_17huowu_xiaoxiangshuie;
}

public void setWeikai_heji_17huowu_jiashuiheji (Double weikai_heji_17huowu_jiashuiheji) {
	this.weikai_heji_17huowu_jiashuiheji=weikai_heji_17huowu_jiashuiheji;
}

public Double getWeikai_heji_17huowu_jiashuiheji () {
return this.weikai_heji_17huowu_jiashuiheji;
}

public void setWeikai_heji_17fuwu_qiye (Double weikai_heji_17fuwu_qiye) {
	this.weikai_heji_17fuwu_qiye=weikai_heji_17fuwu_qiye;
}

public Double getWeikai_heji_17fuwu_qiye () {
return this.weikai_heji_17fuwu_qiye;
}

public void setWeikai_heji_17fuwu_xiaoshoue (Double weikai_heji_17fuwu_xiaoshoue) {
	this.weikai_heji_17fuwu_xiaoshoue=weikai_heji_17fuwu_xiaoshoue;
}

public Double getWeikai_heji_17fuwu_xiaoshoue () {
return this.weikai_heji_17fuwu_xiaoshoue;
}

public void setWeikai_heji_17fuwu_xiaoxiangshuie (Double weikai_heji_17fuwu_xiaoxiangshuie) {
	this.weikai_heji_17fuwu_xiaoxiangshuie=weikai_heji_17fuwu_xiaoxiangshuie;
}

public Double getWeikai_heji_17fuwu_xiaoxiangshuie () {
return this.weikai_heji_17fuwu_xiaoxiangshuie;
}

public void setWeikai_heji_17fuwu_jiashuiheji (Double weikai_heji_17fuwu_jiashuiheji) {
	this.weikai_heji_17fuwu_jiashuiheji=weikai_heji_17fuwu_jiashuiheji;
}

public Double getWeikai_heji_17fuwu_jiashuiheji () {
return this.weikai_heji_17fuwu_jiashuiheji;
}

public void setWeikai_heji_13_qiye (Double weikai_heji_13_qiye) {
	this.weikai_heji_13_qiye=weikai_heji_13_qiye;
}

public Double getWeikai_heji_13_qiye () {
return this.weikai_heji_13_qiye;
}

public void setWeikai_heji_13_xiaoshoue (Double weikai_heji_13_xiaoshoue) {
	this.weikai_heji_13_xiaoshoue=weikai_heji_13_xiaoshoue;
}

public Double getWeikai_heji_13_xiaoshoue () {
return this.weikai_heji_13_xiaoshoue;
}

public void setWeikai_heji_13_xiaoxiangshuie (Double weikai_heji_13_xiaoxiangshuie) {
	this.weikai_heji_13_xiaoxiangshuie=weikai_heji_13_xiaoxiangshuie;
}

public Double getWeikai_heji_13_xiaoxiangshuie () {
return this.weikai_heji_13_xiaoxiangshuie;
}

public void setWeikai_heji_13_jiashuiheji (Double weikai_heji_13_jiashuiheji) {
	this.weikai_heji_13_jiashuiheji=weikai_heji_13_jiashuiheji;
}

public Double getWeikai_heji_13_jiashuiheji () {
return this.weikai_heji_13_jiashuiheji;
}

public void setWeikai_heji_6_qiye (Double weikai_heji_6_qiye) {
	this.weikai_heji_6_qiye=weikai_heji_6_qiye;
}

public Double getWeikai_heji_6_qiye () {
return this.weikai_heji_6_qiye;
}

public void setWeikai_heji_6_xiaoshoue (Double weikai_heji_6_xiaoshoue) {
	this.weikai_heji_6_xiaoshoue=weikai_heji_6_xiaoshoue;
}

public Double getWeikai_heji_6_xiaoshoue () {
return this.weikai_heji_6_xiaoshoue;
}

public void setWeikai_heji_6_xiaoxiangshuie (Double weikai_heji_6_xiaoxiangshuie) {
	this.weikai_heji_6_xiaoxiangshuie=weikai_heji_6_xiaoxiangshuie;
}

public Double getWeikai_heji_6_xiaoxiangshuie () {
return this.weikai_heji_6_xiaoxiangshuie;
}

public void setWeikai_heji_6_jiashuiheji (Double weikai_heji_6_jiashuiheji) {
	this.weikai_heji_6_jiashuiheji=weikai_heji_6_jiashuiheji;
}

public Double getWeikai_heji_6_jiashuiheji () {
return this.weikai_heji_6_jiashuiheji;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
