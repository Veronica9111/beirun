package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JianYiJiShuiFangFaPuPiaoJiShui implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public JianYiJiShuiFangFaPuPiaoJiShui() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double jianyipu_3fuwu_xiaoshoue;
private Double jianyipu_3fuwu_xiaoxiangshuie;
private Double jianyipu_3fuwu_xiaoji;
private Double jianyipu_3huowu_xiaoshoue;
private Double jianyipu_3huowu_xiaoxiangshuie;
private Double jianyipu_3huowu_xiaoji;
private Double jianyipu_5fuwu_xiaoshoue;
private Double jianyipu_5fuwu_xiaoxiangshuie;
private Double jianyipu_5fuwu_xiaoji;
private Double jianyipu_5huowu_xiaoshoue;
private Double jianyipu_5huowu_xiaoxiangshuie;
private Double jianyipu_5huowu_xiaoji;
private Double jianyipu_4_xiaoshoue;
private Double jianyipu_4_xiaoxiangshuie;
private Double jianyipu_4_xiaoji;
private Double jianyipu_6_xiaoshoue;
private Double jianyipu_6_xiaoxiangshuie;
private Double jianyipu_6_xiaoji;
private String zhaiyao;
private Double jianyipu_3fuwu_qiyezibaojine;
private Double jianyipu_3huowu_qiyezibaojine;
private Double jianyipu_5fuwu_qiyezibaojine;
private Double jianyipu_5huowu_qiyezibaojine;
private Double jianyipu_4_qiyezibaojine;
private Double jianyipu_6_qiyezibaojine;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoshijian;
private Timestamp shenheshijian;
private String fuheren;
private Double jianyipu_heji_3fuwu_qiye;
private Double jianyipu_heji_3fuwu_xiaoshoue;
private Double jianyipu_heji_3fuwu_11_xiaoxiangshuie;
private Double jianyipu_heji_3fuwu_jiashuiheji;
private Double jianyipu_heji_3huowu_qiye;
private Double jianyipu_heji_3huowu_xiaoshoue;
private Double jianyipu_heji_3huowu_xiaoxiangshuie;
private Double jianyipu_heji_3huowu_jiashuiheji;
private Double jianyipu_heji_5fuwu_qiye;
private Double jianyipu_heji_5fuwu_xiaoshoue;
private Double jianyipu_heji_5fuwu_xiaoxiangshuie;
private Double jianyipu_heji_5fuwu_jiashuiheji;
private Double jianyipu_heji_5huowu_qiye;
private Double jianyipu_heji_5huowu_xiaoshoue;
private Double jianyipu_heji_5huowu_xiaoxiangshuie;
private Double jianyipu_heji_5huowu_jiashuiheji;
private Double jianyipu_heji_4_qiye;
private Double jianyipu_heji_4_xiaoshoue;
private Double jianyipu_heji_4_xiaoxiangshuie;
private Double jianyipu_heji_4_jiashuiheji;
private Double jianyipu_heji_6_qiye;
private Double jianyipu_heji_6_xiaoshoue;
private Double jianyipu_heji_6_xiaoxiangshuie;
private Double jianyipu_heji_6_jiashuiheji;
private Long kaipiaoshenqingdan_id;
public JianYiJiShuiFangFaPuPiaoJiShui(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double jianyipu_3fuwu_xiaoshoue, Double jianyipu_3fuwu_xiaoxiangshuie, Double jianyipu_3fuwu_xiaoji, Double jianyipu_3huowu_xiaoshoue, Double jianyipu_3huowu_xiaoxiangshuie, Double jianyipu_3huowu_xiaoji, Double jianyipu_5fuwu_xiaoshoue, Double jianyipu_5fuwu_xiaoxiangshuie, Double jianyipu_5fuwu_xiaoji, Double jianyipu_5huowu_xiaoshoue, Double jianyipu_5huowu_xiaoxiangshuie, Double jianyipu_5huowu_xiaoji, Double jianyipu_4_xiaoshoue, Double jianyipu_4_xiaoxiangshuie, Double jianyipu_4_xiaoji, Double jianyipu_6_xiaoshoue, Double jianyipu_6_xiaoxiangshuie, Double jianyipu_6_xiaoji, String zhaiyao, Double jianyipu_3fuwu_qiyezibaojine, Double jianyipu_3huowu_qiyezibaojine, Double jianyipu_5fuwu_qiyezibaojine, Double jianyipu_5huowu_qiyezibaojine, Double jianyipu_4_qiyezibaojine, Double jianyipu_6_qiyezibaojine, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoshijian, Timestamp shenheshijian, String fuheren, Double jianyipu_heji_3fuwu_qiye, Double jianyipu_heji_3fuwu_xiaoshoue, Double jianyipu_heji_3fuwu_11_xiaoxiangshuie, Double jianyipu_heji_3fuwu_jiashuiheji, Double jianyipu_heji_3huowu_qiye, Double jianyipu_heji_3huowu_xiaoshoue, Double jianyipu_heji_3huowu_xiaoxiangshuie, Double jianyipu_heji_3huowu_jiashuiheji, Double jianyipu_heji_5fuwu_qiye, Double jianyipu_heji_5fuwu_xiaoshoue, Double jianyipu_heji_5fuwu_xiaoxiangshuie, Double jianyipu_heji_5fuwu_jiashuiheji, Double jianyipu_heji_5huowu_qiye, Double jianyipu_heji_5huowu_xiaoshoue, Double jianyipu_heji_5huowu_xiaoxiangshuie, Double jianyipu_heji_5huowu_jiashuiheji, Double jianyipu_heji_4_qiye, Double jianyipu_heji_4_xiaoshoue, Double jianyipu_heji_4_xiaoxiangshuie, Double jianyipu_heji_4_jiashuiheji, Double jianyipu_heji_6_qiye, Double jianyipu_heji_6_xiaoshoue, Double jianyipu_heji_6_xiaoxiangshuie, Double jianyipu_heji_6_jiashuiheji, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.jianyipu_3fuwu_xiaoshoue=jianyipu_3fuwu_xiaoshoue;
this.jianyipu_3fuwu_xiaoxiangshuie=jianyipu_3fuwu_xiaoxiangshuie;
this.jianyipu_3fuwu_xiaoji=jianyipu_3fuwu_xiaoji;
this.jianyipu_3huowu_xiaoshoue=jianyipu_3huowu_xiaoshoue;
this.jianyipu_3huowu_xiaoxiangshuie=jianyipu_3huowu_xiaoxiangshuie;
this.jianyipu_3huowu_xiaoji=jianyipu_3huowu_xiaoji;
this.jianyipu_5fuwu_xiaoshoue=jianyipu_5fuwu_xiaoshoue;
this.jianyipu_5fuwu_xiaoxiangshuie=jianyipu_5fuwu_xiaoxiangshuie;
this.jianyipu_5fuwu_xiaoji=jianyipu_5fuwu_xiaoji;
this.jianyipu_5huowu_xiaoshoue=jianyipu_5huowu_xiaoshoue;
this.jianyipu_5huowu_xiaoxiangshuie=jianyipu_5huowu_xiaoxiangshuie;
this.jianyipu_5huowu_xiaoji=jianyipu_5huowu_xiaoji;
this.jianyipu_4_xiaoshoue=jianyipu_4_xiaoshoue;
this.jianyipu_4_xiaoxiangshuie=jianyipu_4_xiaoxiangshuie;
this.jianyipu_4_xiaoji=jianyipu_4_xiaoji;
this.jianyipu_6_xiaoshoue=jianyipu_6_xiaoshoue;
this.jianyipu_6_xiaoxiangshuie=jianyipu_6_xiaoxiangshuie;
this.jianyipu_6_xiaoji=jianyipu_6_xiaoji;
this.zhaiyao=zhaiyao;
this.jianyipu_3fuwu_qiyezibaojine=jianyipu_3fuwu_qiyezibaojine;
this.jianyipu_3huowu_qiyezibaojine=jianyipu_3huowu_qiyezibaojine;
this.jianyipu_5fuwu_qiyezibaojine=jianyipu_5fuwu_qiyezibaojine;
this.jianyipu_5huowu_qiyezibaojine=jianyipu_5huowu_qiyezibaojine;
this.jianyipu_4_qiyezibaojine=jianyipu_4_qiyezibaojine;
this.jianyipu_6_qiyezibaojine=jianyipu_6_qiyezibaojine;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoshijian=tianbiaoshijian;
this.shenheshijian=shenheshijian;
this.fuheren=fuheren;
this.jianyipu_heji_3fuwu_qiye=jianyipu_heji_3fuwu_qiye;
this.jianyipu_heji_3fuwu_xiaoshoue=jianyipu_heji_3fuwu_xiaoshoue;
this.jianyipu_heji_3fuwu_11_xiaoxiangshuie=jianyipu_heji_3fuwu_11_xiaoxiangshuie;
this.jianyipu_heji_3fuwu_jiashuiheji=jianyipu_heji_3fuwu_jiashuiheji;
this.jianyipu_heji_3huowu_qiye=jianyipu_heji_3huowu_qiye;
this.jianyipu_heji_3huowu_xiaoshoue=jianyipu_heji_3huowu_xiaoshoue;
this.jianyipu_heji_3huowu_xiaoxiangshuie=jianyipu_heji_3huowu_xiaoxiangshuie;
this.jianyipu_heji_3huowu_jiashuiheji=jianyipu_heji_3huowu_jiashuiheji;
this.jianyipu_heji_5fuwu_qiye=jianyipu_heji_5fuwu_qiye;
this.jianyipu_heji_5fuwu_xiaoshoue=jianyipu_heji_5fuwu_xiaoshoue;
this.jianyipu_heji_5fuwu_xiaoxiangshuie=jianyipu_heji_5fuwu_xiaoxiangshuie;
this.jianyipu_heji_5fuwu_jiashuiheji=jianyipu_heji_5fuwu_jiashuiheji;
this.jianyipu_heji_5huowu_qiye=jianyipu_heji_5huowu_qiye;
this.jianyipu_heji_5huowu_xiaoshoue=jianyipu_heji_5huowu_xiaoshoue;
this.jianyipu_heji_5huowu_xiaoxiangshuie=jianyipu_heji_5huowu_xiaoxiangshuie;
this.jianyipu_heji_5huowu_jiashuiheji=jianyipu_heji_5huowu_jiashuiheji;
this.jianyipu_heji_4_qiye=jianyipu_heji_4_qiye;
this.jianyipu_heji_4_xiaoshoue=jianyipu_heji_4_xiaoshoue;
this.jianyipu_heji_4_xiaoxiangshuie=jianyipu_heji_4_xiaoxiangshuie;
this.jianyipu_heji_4_jiashuiheji=jianyipu_heji_4_jiashuiheji;
this.jianyipu_heji_6_qiye=jianyipu_heji_6_qiye;
this.jianyipu_heji_6_xiaoshoue=jianyipu_heji_6_xiaoshoue;
this.jianyipu_heji_6_xiaoxiangshuie=jianyipu_heji_6_xiaoxiangshuie;
this.jianyipu_heji_6_jiashuiheji=jianyipu_heji_6_jiashuiheji;
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

public void setJianyipu_3fuwu_xiaoshoue (Double jianyipu_3fuwu_xiaoshoue) {
	this.jianyipu_3fuwu_xiaoshoue=jianyipu_3fuwu_xiaoshoue;
}

public Double getJianyipu_3fuwu_xiaoshoue () {
return this.jianyipu_3fuwu_xiaoshoue;
}

public void setJianyipu_3fuwu_xiaoxiangshuie (Double jianyipu_3fuwu_xiaoxiangshuie) {
	this.jianyipu_3fuwu_xiaoxiangshuie=jianyipu_3fuwu_xiaoxiangshuie;
}

public Double getJianyipu_3fuwu_xiaoxiangshuie () {
return this.jianyipu_3fuwu_xiaoxiangshuie;
}

public void setJianyipu_3fuwu_xiaoji (Double jianyipu_3fuwu_xiaoji) {
	this.jianyipu_3fuwu_xiaoji=jianyipu_3fuwu_xiaoji;
}

public Double getJianyipu_3fuwu_xiaoji () {
return this.jianyipu_3fuwu_xiaoji;
}

public void setJianyipu_3huowu_xiaoshoue (Double jianyipu_3huowu_xiaoshoue) {
	this.jianyipu_3huowu_xiaoshoue=jianyipu_3huowu_xiaoshoue;
}

public Double getJianyipu_3huowu_xiaoshoue () {
return this.jianyipu_3huowu_xiaoshoue;
}

public void setJianyipu_3huowu_xiaoxiangshuie (Double jianyipu_3huowu_xiaoxiangshuie) {
	this.jianyipu_3huowu_xiaoxiangshuie=jianyipu_3huowu_xiaoxiangshuie;
}

public Double getJianyipu_3huowu_xiaoxiangshuie () {
return this.jianyipu_3huowu_xiaoxiangshuie;
}

public void setJianyipu_3huowu_xiaoji (Double jianyipu_3huowu_xiaoji) {
	this.jianyipu_3huowu_xiaoji=jianyipu_3huowu_xiaoji;
}

public Double getJianyipu_3huowu_xiaoji () {
return this.jianyipu_3huowu_xiaoji;
}

public void setJianyipu_5fuwu_xiaoshoue (Double jianyipu_5fuwu_xiaoshoue) {
	this.jianyipu_5fuwu_xiaoshoue=jianyipu_5fuwu_xiaoshoue;
}

public Double getJianyipu_5fuwu_xiaoshoue () {
return this.jianyipu_5fuwu_xiaoshoue;
}

public void setJianyipu_5fuwu_xiaoxiangshuie (Double jianyipu_5fuwu_xiaoxiangshuie) {
	this.jianyipu_5fuwu_xiaoxiangshuie=jianyipu_5fuwu_xiaoxiangshuie;
}

public Double getJianyipu_5fuwu_xiaoxiangshuie () {
return this.jianyipu_5fuwu_xiaoxiangshuie;
}

public void setJianyipu_5fuwu_xiaoji (Double jianyipu_5fuwu_xiaoji) {
	this.jianyipu_5fuwu_xiaoji=jianyipu_5fuwu_xiaoji;
}

public Double getJianyipu_5fuwu_xiaoji () {
return this.jianyipu_5fuwu_xiaoji;
}

public void setJianyipu_5huowu_xiaoshoue (Double jianyipu_5huowu_xiaoshoue) {
	this.jianyipu_5huowu_xiaoshoue=jianyipu_5huowu_xiaoshoue;
}

public Double getJianyipu_5huowu_xiaoshoue () {
return this.jianyipu_5huowu_xiaoshoue;
}

public void setJianyipu_5huowu_xiaoxiangshuie (Double jianyipu_5huowu_xiaoxiangshuie) {
	this.jianyipu_5huowu_xiaoxiangshuie=jianyipu_5huowu_xiaoxiangshuie;
}

public Double getJianyipu_5huowu_xiaoxiangshuie () {
return this.jianyipu_5huowu_xiaoxiangshuie;
}

public void setJianyipu_5huowu_xiaoji (Double jianyipu_5huowu_xiaoji) {
	this.jianyipu_5huowu_xiaoji=jianyipu_5huowu_xiaoji;
}

public Double getJianyipu_5huowu_xiaoji () {
return this.jianyipu_5huowu_xiaoji;
}

public void setJianyipu_4_xiaoshoue (Double jianyipu_4_xiaoshoue) {
	this.jianyipu_4_xiaoshoue=jianyipu_4_xiaoshoue;
}

public Double getJianyipu_4_xiaoshoue () {
return this.jianyipu_4_xiaoshoue;
}

public void setJianyipu_4_xiaoxiangshuie (Double jianyipu_4_xiaoxiangshuie) {
	this.jianyipu_4_xiaoxiangshuie=jianyipu_4_xiaoxiangshuie;
}

public Double getJianyipu_4_xiaoxiangshuie () {
return this.jianyipu_4_xiaoxiangshuie;
}

public void setJianyipu_4_xiaoji (Double jianyipu_4_xiaoji) {
	this.jianyipu_4_xiaoji=jianyipu_4_xiaoji;
}

public Double getJianyipu_4_xiaoji () {
return this.jianyipu_4_xiaoji;
}

public void setJianyipu_6_xiaoshoue (Double jianyipu_6_xiaoshoue) {
	this.jianyipu_6_xiaoshoue=jianyipu_6_xiaoshoue;
}

public Double getJianyipu_6_xiaoshoue () {
return this.jianyipu_6_xiaoshoue;
}

public void setJianyipu_6_xiaoxiangshuie (Double jianyipu_6_xiaoxiangshuie) {
	this.jianyipu_6_xiaoxiangshuie=jianyipu_6_xiaoxiangshuie;
}

public Double getJianyipu_6_xiaoxiangshuie () {
return this.jianyipu_6_xiaoxiangshuie;
}

public void setJianyipu_6_xiaoji (Double jianyipu_6_xiaoji) {
	this.jianyipu_6_xiaoji=jianyipu_6_xiaoji;
}

public Double getJianyipu_6_xiaoji () {
return this.jianyipu_6_xiaoji;
}

public void setZhaiyao (String zhaiyao) {
this.zhaiyao=zhaiyao;
}

public String getZhaiyao () {
return this.zhaiyao;
}

public void setJianyipu_3fuwu_qiyezibaojine (Double jianyipu_3fuwu_qiyezibaojine) {
	this.jianyipu_3fuwu_qiyezibaojine=jianyipu_3fuwu_qiyezibaojine;
}

public Double getJianyipu_3fuwu_qiyezibaojine () {
return this.jianyipu_3fuwu_qiyezibaojine;
}

public void setJianyipu_3huowu_qiyezibaojine (Double jianyipu_3huowu_qiyezibaojine) {
	this.jianyipu_3huowu_qiyezibaojine=jianyipu_3huowu_qiyezibaojine;
}

public Double getJianyipu_3huowu_qiyezibaojine () {
return this.jianyipu_3huowu_qiyezibaojine;
}

public void setJianyipu_5fuwu_qiyezibaojine (Double jianyipu_5fuwu_qiyezibaojine) {
	this.jianyipu_5fuwu_qiyezibaojine=jianyipu_5fuwu_qiyezibaojine;
}

public Double getJianyipu_5fuwu_qiyezibaojine () {
return this.jianyipu_5fuwu_qiyezibaojine;
}

public void setJianyipu_5huowu_qiyezibaojine (Double jianyipu_5huowu_qiyezibaojine) {
	this.jianyipu_5huowu_qiyezibaojine=jianyipu_5huowu_qiyezibaojine;
}

public Double getJianyipu_5huowu_qiyezibaojine () {
return this.jianyipu_5huowu_qiyezibaojine;
}

public void setJianyipu_4_qiyezibaojine (Double jianyipu_4_qiyezibaojine) {
	this.jianyipu_4_qiyezibaojine=jianyipu_4_qiyezibaojine;
}

public Double getJianyipu_4_qiyezibaojine () {
return this.jianyipu_4_qiyezibaojine;
}

public void setJianyipu_6_qiyezibaojine (Double jianyipu_6_qiyezibaojine) {
	this.jianyipu_6_qiyezibaojine=jianyipu_6_qiyezibaojine;
}

public Double getJianyipu_6_qiyezibaojine () {
return this.jianyipu_6_qiyezibaojine;
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

public void setJianyipu_heji_3fuwu_qiye (Double jianyipu_heji_3fuwu_qiye) {
	this.jianyipu_heji_3fuwu_qiye=jianyipu_heji_3fuwu_qiye;
}

public Double getJianyipu_heji_3fuwu_qiye () {
return this.jianyipu_heji_3fuwu_qiye;
}

public void setJianyipu_heji_3fuwu_xiaoshoue (Double jianyipu_heji_3fuwu_xiaoshoue) {
	this.jianyipu_heji_3fuwu_xiaoshoue=jianyipu_heji_3fuwu_xiaoshoue;
}

public Double getJianyipu_heji_3fuwu_xiaoshoue () {
return this.jianyipu_heji_3fuwu_xiaoshoue;
}

public void setJianyipu_heji_3fuwu_11_xiaoxiangshuie (Double jianyipu_heji_3fuwu_11_xiaoxiangshuie) {
	this.jianyipu_heji_3fuwu_11_xiaoxiangshuie=jianyipu_heji_3fuwu_11_xiaoxiangshuie;
}

public Double getJianyipu_heji_3fuwu_11_xiaoxiangshuie () {
return this.jianyipu_heji_3fuwu_11_xiaoxiangshuie;
}

public void setJianyipu_heji_3fuwu_jiashuiheji (Double jianyipu_heji_3fuwu_jiashuiheji) {
	this.jianyipu_heji_3fuwu_jiashuiheji=jianyipu_heji_3fuwu_jiashuiheji;
}

public Double getJianyipu_heji_3fuwu_jiashuiheji () {
return this.jianyipu_heji_3fuwu_jiashuiheji;
}

public void setJianyipu_heji_3huowu_qiye (Double jianyipu_heji_3huowu_qiye) {
	this.jianyipu_heji_3huowu_qiye=jianyipu_heji_3huowu_qiye;
}

public Double getJianyipu_heji_3huowu_qiye () {
return this.jianyipu_heji_3huowu_qiye;
}

public void setJianyipu_heji_3huowu_xiaoshoue (Double jianyipu_heji_3huowu_xiaoshoue) {
	this.jianyipu_heji_3huowu_xiaoshoue=jianyipu_heji_3huowu_xiaoshoue;
}

public Double getJianyipu_heji_3huowu_xiaoshoue () {
return this.jianyipu_heji_3huowu_xiaoshoue;
}

public void setJianyipu_heji_3huowu_xiaoxiangshuie (Double jianyipu_heji_3huowu_xiaoxiangshuie) {
	this.jianyipu_heji_3huowu_xiaoxiangshuie=jianyipu_heji_3huowu_xiaoxiangshuie;
}

public Double getJianyipu_heji_3huowu_xiaoxiangshuie () {
return this.jianyipu_heji_3huowu_xiaoxiangshuie;
}

public void setJianyipu_heji_3huowu_jiashuiheji (Double jianyipu_heji_3huowu_jiashuiheji) {
	this.jianyipu_heji_3huowu_jiashuiheji=jianyipu_heji_3huowu_jiashuiheji;
}

public Double getJianyipu_heji_3huowu_jiashuiheji () {
return this.jianyipu_heji_3huowu_jiashuiheji;
}

public void setJianyipu_heji_5fuwu_qiye (Double jianyipu_heji_5fuwu_qiye) {
	this.jianyipu_heji_5fuwu_qiye=jianyipu_heji_5fuwu_qiye;
}

public Double getJianyipu_heji_5fuwu_qiye () {
return this.jianyipu_heji_5fuwu_qiye;
}

public void setJianyipu_heji_5fuwu_xiaoshoue (Double jianyipu_heji_5fuwu_xiaoshoue) {
	this.jianyipu_heji_5fuwu_xiaoshoue=jianyipu_heji_5fuwu_xiaoshoue;
}

public Double getJianyipu_heji_5fuwu_xiaoshoue () {
return this.jianyipu_heji_5fuwu_xiaoshoue;
}

public void setJianyipu_heji_5fuwu_xiaoxiangshuie (Double jianyipu_heji_5fuwu_xiaoxiangshuie) {
	this.jianyipu_heji_5fuwu_xiaoxiangshuie=jianyipu_heji_5fuwu_xiaoxiangshuie;
}

public Double getJianyipu_heji_5fuwu_xiaoxiangshuie () {
return this.jianyipu_heji_5fuwu_xiaoxiangshuie;
}

public void setJianyipu_heji_5fuwu_jiashuiheji (Double jianyipu_heji_5fuwu_jiashuiheji) {
	this.jianyipu_heji_5fuwu_jiashuiheji=jianyipu_heji_5fuwu_jiashuiheji;
}

public Double getJianyipu_heji_5fuwu_jiashuiheji () {
return this.jianyipu_heji_5fuwu_jiashuiheji;
}

public void setJianyipu_heji_5huowu_qiye (Double jianyipu_heji_5huowu_qiye) {
	this.jianyipu_heji_5huowu_qiye=jianyipu_heji_5huowu_qiye;
}

public Double getJianyipu_heji_5huowu_qiye () {
return this.jianyipu_heji_5huowu_qiye;
}

public void setJianyipu_heji_5huowu_xiaoshoue (Double jianyipu_heji_5huowu_xiaoshoue) {
	this.jianyipu_heji_5huowu_xiaoshoue=jianyipu_heji_5huowu_xiaoshoue;
}

public Double getJianyipu_heji_5huowu_xiaoshoue () {
return this.jianyipu_heji_5huowu_xiaoshoue;
}

public void setJianyipu_heji_5huowu_xiaoxiangshuie (Double jianyipu_heji_5huowu_xiaoxiangshuie) {
	this.jianyipu_heji_5huowu_xiaoxiangshuie=jianyipu_heji_5huowu_xiaoxiangshuie;
}

public Double getJianyipu_heji_5huowu_xiaoxiangshuie () {
return this.jianyipu_heji_5huowu_xiaoxiangshuie;
}

public void setJianyipu_heji_5huowu_jiashuiheji (Double jianyipu_heji_5huowu_jiashuiheji) {
	this.jianyipu_heji_5huowu_jiashuiheji=jianyipu_heji_5huowu_jiashuiheji;
}

public Double getJianyipu_heji_5huowu_jiashuiheji () {
return this.jianyipu_heji_5huowu_jiashuiheji;
}

public void setJianyipu_heji_4_qiye (Double jianyipu_heji_4_qiye) {
	this.jianyipu_heji_4_qiye=jianyipu_heji_4_qiye;
}

public Double getJianyipu_heji_4_qiye () {
return this.jianyipu_heji_4_qiye;
}

public void setJianyipu_heji_4_xiaoshoue (Double jianyipu_heji_4_xiaoshoue) {
	this.jianyipu_heji_4_xiaoshoue=jianyipu_heji_4_xiaoshoue;
}

public Double getJianyipu_heji_4_xiaoshoue () {
return this.jianyipu_heji_4_xiaoshoue;
}

public void setJianyipu_heji_4_xiaoxiangshuie (Double jianyipu_heji_4_xiaoxiangshuie) {
	this.jianyipu_heji_4_xiaoxiangshuie=jianyipu_heji_4_xiaoxiangshuie;
}

public Double getJianyipu_heji_4_xiaoxiangshuie () {
return this.jianyipu_heji_4_xiaoxiangshuie;
}

public void setJianyipu_heji_4_jiashuiheji (Double jianyipu_heji_4_jiashuiheji) {
	this.jianyipu_heji_4_jiashuiheji=jianyipu_heji_4_jiashuiheji;
}

public Double getJianyipu_heji_4_jiashuiheji () {
return this.jianyipu_heji_4_jiashuiheji;
}

public void setJianyipu_heji_6_qiye (Double jianyipu_heji_6_qiye) {
	this.jianyipu_heji_6_qiye=jianyipu_heji_6_qiye;
}

public Double getJianyipu_heji_6_qiye () {
return this.jianyipu_heji_6_qiye;
}

public void setJianyipu_heji_6_xiaoshoue (Double jianyipu_heji_6_xiaoshoue) {
	this.jianyipu_heji_6_xiaoshoue=jianyipu_heji_6_xiaoshoue;
}

public Double getJianyipu_heji_6_xiaoshoue () {
return this.jianyipu_heji_6_xiaoshoue;
}

public void setJianyipu_heji_6_xiaoxiangshuie (Double jianyipu_heji_6_xiaoxiangshuie) {
	this.jianyipu_heji_6_xiaoxiangshuie=jianyipu_heji_6_xiaoxiangshuie;
}

public Double getJianyipu_heji_6_xiaoxiangshuie () {
return this.jianyipu_heji_6_xiaoxiangshuie;
}

public void setJianyipu_heji_6_jiashuiheji (Double jianyipu_heji_6_jiashuiheji) {
	this.jianyipu_heji_6_jiashuiheji=jianyipu_heji_6_jiashuiheji;
}

public Double getJianyipu_heji_6_jiashuiheji () {
return this.jianyipu_heji_6_jiashuiheji;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
