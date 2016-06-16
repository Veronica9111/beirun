package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class JianYiJiShuiFangFaZhuanPiaoJiShui implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public JianYiJiShuiFangFaZhuanPiaoJiShui() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double jianyizhuan_3fuwu_xiaoshoue;
private Double jianyizhuan_3fuwu_xiaoxiangshuie;
private Double jianyizhuan_3fuwu_xiaoji;
private Double jianyizhuan_3huowu_xiaoshoue;
private Double jianyizhuan_3huowu_xiaoxiangshuie;
private Double jianyizhuan_3huowu_xiaoji;
private Double jianyizhuan_5fuwu_xiaoshoue;
private Double jianyizhuan_5fuwu_xiaoxiangshuie;
private Double jianyizhuan_5fuwu_xiaoji;
private Double jianyizhuan_5huowu_xiaoshoue;
private Double jianyizhuan_5huowu_xiaoxiangshuie;
private Double jianyizhuan_5huowu_xiaoji;
private Double jianyizhuan_4_xiaoshoue;
private Double jianyizhuan_4_xiaoxiangshuie;
private Double jianyizhuan_4_xiaoji;
private Double jianyizhuan_6_xiaoshoue;
private Double jianyizhuan_6_xiaoxiangshuie;
private Double jianyizhuan_6_xiaoji;
private String zhaiyao;
private Double jianyizhuan_3fuwu_qiyezibaojine;
private Double jianyizhuan_3huowu_qiyezibaojine;
private Double jianyizhuan_5fuwu_qiyezibaojine;
private Double jianyizhuan_5huowu_qiyezibaojine;
private Double jianyizhuan_4_qiyezibaojine;
private Double jianyizhuan_6_qiyezibaojine;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoshijian;
private Timestamp shenheshijian;
private String fuheren;
private Double jianyizhuan_heji_3fuwu_qiye;
private Double jianyizhuan_heji_3fuwu_xiaoshoue;
private Double jianyizhuan_heji_3fuwu_11_xiaoxiangshuie;
private Double jianyizhuan_heji_3fuwu_jiashuiheji;
private Double jianyizhuan_heji_3huowu_qiye;
private Double jianyizhuan_heji_3huowu_xiaoshoue;
private Double jianyizhuan_heji_3huowu_xiaoxiangshuie;
private Double jianyizhuan_heji_3huowu_jiashuiheji;
private Double jianyizhuan_heji_5fuwu_qiye;
private Double jianyizhuan_heji_5fuwu_xiaoshoue;
private Double jianyizhuan_heji_5fuwu_xiaoxiangshuie;
private Double jianyizhuan_heji_5fuwu_jiashuiheji;
private Double jianyizhuan_heji_5huowu_qiye;
private Double jianyizhuan_heji_5huowu_xiaoshoue;
private Double jianyizhuan_heji_5huowu_xiaoxiangshuie;
private Double jianyizhuan_heji_5huowu_jiashuiheji;
private Double jianyizhuan_heji_4_qiye;
private Double jianyizhuan_heji_4_xiaoshoue;
private Double jianyizhuan_heji_4_xiaoxiangshuie;
private Double jianyizhuan_heji_4_jiashuiheji;
private Double jianyizhuan_heji_6_qiye;
private Double jianyizhuan_heji_6_xiaoshoue;
private Double jianyizhuan_heji_6_xiaoxiangshuie;
private Double jianyizhuan_heji_6_jiashuiheji;
private Long kaipiaoshenqingdan_id;
public JianYiJiShuiFangFaZhuanPiaoJiShui(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double jianyizhuan_3fuwu_xiaoshoue, Double jianyizhuan_3fuwu_xiaoxiangshuie, Double jianyizhuan_3fuwu_xiaoji, Double jianyizhuan_3huowu_xiaoshoue, Double jianyizhuan_3huowu_xiaoxiangshuie, Double jianyizhuan_3huowu_xiaoji, Double jianyizhuan_5fuwu_xiaoshoue, Double jianyizhuan_5fuwu_xiaoxiangshuie, Double jianyizhuan_5fuwu_xiaoji, Double jianyizhuan_5huowu_xiaoshoue, Double jianyizhuan_5huowu_xiaoxiangshuie, Double jianyizhuan_5huowu_xiaoji, Double jianyizhuan_4_xiaoshoue, Double jianyizhuan_4_xiaoxiangshuie, Double jianyizhuan_4_xiaoji, Double jianyizhuan_6_xiaoshoue, Double jianyizhuan_6_xiaoxiangshuie, Double jianyizhuan_6_xiaoji, String zhaiyao, Double jianyizhuan_3fuwu_qiyezibaojine, Double jianyizhuan_3huowu_qiyezibaojine, Double jianyizhuan_5fuwu_qiyezibaojine, Double jianyizhuan_5huowu_qiyezibaojine, Double jianyizhuan_4_qiyezibaojine, Double jianyizhuan_6_qiyezibaojine, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoshijian, Timestamp shenheshijian, String fuheren, Double jianyizhuan_heji_3fuwu_qiye, Double jianyizhuan_heji_3fuwu_xiaoshoue, Double jianyizhuan_heji_3fuwu_11_xiaoxiangshuie, Double jianyizhuan_heji_3fuwu_jiashuiheji, Double jianyizhuan_heji_3huowu_qiye, Double jianyizhuan_heji_3huowu_xiaoshoue, Double jianyizhuan_heji_3huowu_xiaoxiangshuie, Double jianyizhuan_heji_3huowu_jiashuiheji, Double jianyizhuan_heji_5fuwu_qiye, Double jianyizhuan_heji_5fuwu_xiaoshoue, Double jianyizhuan_heji_5fuwu_xiaoxiangshuie, Double jianyizhuan_heji_5fuwu_jiashuiheji, Double jianyizhuan_heji_5huowu_qiye, Double jianyizhuan_heji_5huowu_xiaoshoue, Double jianyizhuan_heji_5huowu_xiaoxiangshuie, Double jianyizhuan_heji_5huowu_jiashuiheji, Double jianyizhuan_heji_4_qiye, Double jianyizhuan_heji_4_xiaoshoue, Double jianyizhuan_heji_4_xiaoxiangshuie, Double jianyizhuan_heji_4_jiashuiheji, Double jianyizhuan_heji_6_qiye, Double jianyizhuan_heji_6_xiaoshoue, Double jianyizhuan_heji_6_xiaoxiangshuie, Double jianyizhuan_heji_6_jiashuiheji, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.jianyizhuan_3fuwu_xiaoshoue=jianyizhuan_3fuwu_xiaoshoue;
this.jianyizhuan_3fuwu_xiaoxiangshuie=jianyizhuan_3fuwu_xiaoxiangshuie;
this.jianyizhuan_3fuwu_xiaoji=jianyizhuan_3fuwu_xiaoji;
this.jianyizhuan_3huowu_xiaoshoue=jianyizhuan_3huowu_xiaoshoue;
this.jianyizhuan_3huowu_xiaoxiangshuie=jianyizhuan_3huowu_xiaoxiangshuie;
this.jianyizhuan_3huowu_xiaoji=jianyizhuan_3huowu_xiaoji;
this.jianyizhuan_5fuwu_xiaoshoue=jianyizhuan_5fuwu_xiaoshoue;
this.jianyizhuan_5fuwu_xiaoxiangshuie=jianyizhuan_5fuwu_xiaoxiangshuie;
this.jianyizhuan_5fuwu_xiaoji=jianyizhuan_5fuwu_xiaoji;
this.jianyizhuan_5huowu_xiaoshoue=jianyizhuan_5huowu_xiaoshoue;
this.jianyizhuan_5huowu_xiaoxiangshuie=jianyizhuan_5huowu_xiaoxiangshuie;
this.jianyizhuan_5huowu_xiaoji=jianyizhuan_5huowu_xiaoji;
this.jianyizhuan_4_xiaoshoue=jianyizhuan_4_xiaoshoue;
this.jianyizhuan_4_xiaoxiangshuie=jianyizhuan_4_xiaoxiangshuie;
this.jianyizhuan_4_xiaoji=jianyizhuan_4_xiaoji;
this.jianyizhuan_6_xiaoshoue=jianyizhuan_6_xiaoshoue;
this.jianyizhuan_6_xiaoxiangshuie=jianyizhuan_6_xiaoxiangshuie;
this.jianyizhuan_6_xiaoji=jianyizhuan_6_xiaoji;
this.zhaiyao=zhaiyao;
this.jianyizhuan_3fuwu_qiyezibaojine=jianyizhuan_3fuwu_qiyezibaojine;
this.jianyizhuan_3huowu_qiyezibaojine=jianyizhuan_3huowu_qiyezibaojine;
this.jianyizhuan_5fuwu_qiyezibaojine=jianyizhuan_5fuwu_qiyezibaojine;
this.jianyizhuan_5huowu_qiyezibaojine=jianyizhuan_5huowu_qiyezibaojine;
this.jianyizhuan_4_qiyezibaojine=jianyizhuan_4_qiyezibaojine;
this.jianyizhuan_6_qiyezibaojine=jianyizhuan_6_qiyezibaojine;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoshijian=tianbiaoshijian;
this.shenheshijian=shenheshijian;
this.fuheren=fuheren;
this.jianyizhuan_heji_3fuwu_qiye=jianyizhuan_heji_3fuwu_qiye;
this.jianyizhuan_heji_3fuwu_xiaoshoue=jianyizhuan_heji_3fuwu_xiaoshoue;
this.jianyizhuan_heji_3fuwu_11_xiaoxiangshuie=jianyizhuan_heji_3fuwu_11_xiaoxiangshuie;
this.jianyizhuan_heji_3fuwu_jiashuiheji=jianyizhuan_heji_3fuwu_jiashuiheji;
this.jianyizhuan_heji_3huowu_qiye=jianyizhuan_heji_3huowu_qiye;
this.jianyizhuan_heji_3huowu_xiaoshoue=jianyizhuan_heji_3huowu_xiaoshoue;
this.jianyizhuan_heji_3huowu_xiaoxiangshuie=jianyizhuan_heji_3huowu_xiaoxiangshuie;
this.jianyizhuan_heji_3huowu_jiashuiheji=jianyizhuan_heji_3huowu_jiashuiheji;
this.jianyizhuan_heji_5fuwu_qiye=jianyizhuan_heji_5fuwu_qiye;
this.jianyizhuan_heji_5fuwu_xiaoshoue=jianyizhuan_heji_5fuwu_xiaoshoue;
this.jianyizhuan_heji_5fuwu_xiaoxiangshuie=jianyizhuan_heji_5fuwu_xiaoxiangshuie;
this.jianyizhuan_heji_5fuwu_jiashuiheji=jianyizhuan_heji_5fuwu_jiashuiheji;
this.jianyizhuan_heji_5huowu_qiye=jianyizhuan_heji_5huowu_qiye;
this.jianyizhuan_heji_5huowu_xiaoshoue=jianyizhuan_heji_5huowu_xiaoshoue;
this.jianyizhuan_heji_5huowu_xiaoxiangshuie=jianyizhuan_heji_5huowu_xiaoxiangshuie;
this.jianyizhuan_heji_5huowu_jiashuiheji=jianyizhuan_heji_5huowu_jiashuiheji;
this.jianyizhuan_heji_4_qiye=jianyizhuan_heji_4_qiye;
this.jianyizhuan_heji_4_xiaoshoue=jianyizhuan_heji_4_xiaoshoue;
this.jianyizhuan_heji_4_xiaoxiangshuie=jianyizhuan_heji_4_xiaoxiangshuie;
this.jianyizhuan_heji_4_jiashuiheji=jianyizhuan_heji_4_jiashuiheji;
this.jianyizhuan_heji_6_qiye=jianyizhuan_heji_6_qiye;
this.jianyizhuan_heji_6_xiaoshoue=jianyizhuan_heji_6_xiaoshoue;
this.jianyizhuan_heji_6_xiaoxiangshuie=jianyizhuan_heji_6_xiaoxiangshuie;
this.jianyizhuan_heji_6_jiashuiheji=jianyizhuan_heji_6_jiashuiheji;
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
	if(this.riqi != null){
		riqi  = dateFormat.format(this.riqi);
	}
	return riqi;
}

public void setJianyizhuan_3fuwu_xiaoshoue (Double jianyizhuan_3fuwu_xiaoshoue) {
	this.jianyizhuan_3fuwu_xiaoshoue=jianyizhuan_3fuwu_xiaoshoue;
}

public Double getJianyizhuan_3fuwu_xiaoshoue () {
return this.jianyizhuan_3fuwu_xiaoshoue;
}

public void setJianyizhuan_3fuwu_xiaoxiangshuie (Double jianyizhuan_3fuwu_xiaoxiangshuie) {
	this.jianyizhuan_3fuwu_xiaoxiangshuie=jianyizhuan_3fuwu_xiaoxiangshuie;
}

public Double getJianyizhuan_3fuwu_xiaoxiangshuie () {
return this.jianyizhuan_3fuwu_xiaoxiangshuie;
}

public void setJianyizhuan_3fuwu_xiaoji (Double jianyizhuan_3fuwu_xiaoji) {
	this.jianyizhuan_3fuwu_xiaoji=jianyizhuan_3fuwu_xiaoji;
}

public Double getJianyizhuan_3fuwu_xiaoji () {
return this.jianyizhuan_3fuwu_xiaoji;
}

public void setJianyizhuan_3huowu_xiaoshoue (Double jianyizhuan_3huowu_xiaoshoue) {
	this.jianyizhuan_3huowu_xiaoshoue=jianyizhuan_3huowu_xiaoshoue;
}

public Double getJianyizhuan_3huowu_xiaoshoue () {
return this.jianyizhuan_3huowu_xiaoshoue;
}

public void setJianyizhuan_3huowu_xiaoxiangshuie (Double jianyizhuan_3huowu_xiaoxiangshuie) {
	this.jianyizhuan_3huowu_xiaoxiangshuie=jianyizhuan_3huowu_xiaoxiangshuie;
}

public Double getJianyizhuan_3huowu_xiaoxiangshuie () {
return this.jianyizhuan_3huowu_xiaoxiangshuie;
}

public void setJianyizhuan_3huowu_xiaoji (Double jianyizhuan_3huowu_xiaoji) {
	this.jianyizhuan_3huowu_xiaoji=jianyizhuan_3huowu_xiaoji;
}

public Double getJianyizhuan_3huowu_xiaoji () {
return this.jianyizhuan_3huowu_xiaoji;
}

public void setJianyizhuan_5fuwu_xiaoshoue (Double jianyizhuan_5fuwu_xiaoshoue) {
	this.jianyizhuan_5fuwu_xiaoshoue=jianyizhuan_5fuwu_xiaoshoue;
}

public Double getJianyizhuan_5fuwu_xiaoshoue () {
return this.jianyizhuan_5fuwu_xiaoshoue;
}

public void setJianyizhuan_5fuwu_xiaoxiangshuie (Double jianyizhuan_5fuwu_xiaoxiangshuie) {
	this.jianyizhuan_5fuwu_xiaoxiangshuie=jianyizhuan_5fuwu_xiaoxiangshuie;
}

public Double getJianyizhuan_5fuwu_xiaoxiangshuie () {
return this.jianyizhuan_5fuwu_xiaoxiangshuie;
}

public void setJianyizhuan_5fuwu_xiaoji (Double jianyizhuan_5fuwu_xiaoji) {
	this.jianyizhuan_5fuwu_xiaoji=jianyizhuan_5fuwu_xiaoji;
}

public Double getJianyizhuan_5fuwu_xiaoji () {
return this.jianyizhuan_5fuwu_xiaoji;
}

public void setJianyizhuan_5huowu_xiaoshoue (Double jianyizhuan_5huowu_xiaoshoue) {
	this.jianyizhuan_5huowu_xiaoshoue=jianyizhuan_5huowu_xiaoshoue;
}

public Double getJianyizhuan_5huowu_xiaoshoue () {
return this.jianyizhuan_5huowu_xiaoshoue;
}

public void setJianyizhuan_5huowu_xiaoxiangshuie (Double jianyizhuan_5huowu_xiaoxiangshuie) {
	this.jianyizhuan_5huowu_xiaoxiangshuie=jianyizhuan_5huowu_xiaoxiangshuie;
}

public Double getJianyizhuan_5huowu_xiaoxiangshuie () {
return this.jianyizhuan_5huowu_xiaoxiangshuie;
}

public void setJianyizhuan_5huowu_xiaoji (Double jianyizhuan_5huowu_xiaoji) {
	this.jianyizhuan_5huowu_xiaoji=jianyizhuan_5huowu_xiaoji;
}

public Double getJianyizhuan_5huowu_xiaoji () {
return this.jianyizhuan_5huowu_xiaoji;
}

public void setJianyizhuan_4_xiaoshoue (Double jianyizhuan_4_xiaoshoue) {
	this.jianyizhuan_4_xiaoshoue=jianyizhuan_4_xiaoshoue;
}

public Double getJianyizhuan_4_xiaoshoue () {
return this.jianyizhuan_4_xiaoshoue;
}

public void setJianyizhuan_4_xiaoxiangshuie (Double jianyizhuan_4_xiaoxiangshuie) {
	this.jianyizhuan_4_xiaoxiangshuie=jianyizhuan_4_xiaoxiangshuie;
}

public Double getJianyizhuan_4_xiaoxiangshuie () {
return this.jianyizhuan_4_xiaoxiangshuie;
}

public void setJianyizhuan_4_xiaoji (Double jianyizhuan_4_xiaoji) {
	this.jianyizhuan_4_xiaoji=jianyizhuan_4_xiaoji;
}

public Double getJianyizhuan_4_xiaoji () {
return this.jianyizhuan_4_xiaoji;
}

public void setJianyizhuan_6_xiaoshoue (Double jianyizhuan_6_xiaoshoue) {
	this.jianyizhuan_6_xiaoshoue=jianyizhuan_6_xiaoshoue;
}

public Double getJianyizhuan_6_xiaoshoue () {
return this.jianyizhuan_6_xiaoshoue;
}

public void setJianyizhuan_6_xiaoxiangshuie (Double jianyizhuan_6_xiaoxiangshuie) {
	this.jianyizhuan_6_xiaoxiangshuie=jianyizhuan_6_xiaoxiangshuie;
}

public Double getJianyizhuan_6_xiaoxiangshuie () {
return this.jianyizhuan_6_xiaoxiangshuie;
}

public void setJianyizhuan_6_xiaoji (Double jianyizhuan_6_xiaoji) {
	this.jianyizhuan_6_xiaoji=jianyizhuan_6_xiaoji;
}

public Double getJianyizhuan_6_xiaoji () {
return this.jianyizhuan_6_xiaoji;
}

public void setZhaiyao (String zhaiyao) {
this.zhaiyao=zhaiyao;
}

public String getZhaiyao () {
return this.zhaiyao;
}

public void setJianyizhuan_3fuwu_qiyezibaojine (Double jianyizhuan_3fuwu_qiyezibaojine) {
	this.jianyizhuan_3fuwu_qiyezibaojine=jianyizhuan_3fuwu_qiyezibaojine;
}

public Double getJianyizhuan_3fuwu_qiyezibaojine () {
return this.jianyizhuan_3fuwu_qiyezibaojine;
}

public void setJianyizhuan_3huowu_qiyezibaojine (Double jianyizhuan_3huowu_qiyezibaojine) {
	this.jianyizhuan_3huowu_qiyezibaojine=jianyizhuan_3huowu_qiyezibaojine;
}

public Double getJianyizhuan_3huowu_qiyezibaojine () {
return this.jianyizhuan_3huowu_qiyezibaojine;
}

public void setJianyizhuan_5fuwu_qiyezibaojine (Double jianyizhuan_5fuwu_qiyezibaojine) {
	this.jianyizhuan_5fuwu_qiyezibaojine=jianyizhuan_5fuwu_qiyezibaojine;
}

public Double getJianyizhuan_5fuwu_qiyezibaojine () {
return this.jianyizhuan_5fuwu_qiyezibaojine;
}

public void setJianyizhuan_5huowu_qiyezibaojine (Double jianyizhuan_5huowu_qiyezibaojine) {
	this.jianyizhuan_5huowu_qiyezibaojine=jianyizhuan_5huowu_qiyezibaojine;
}

public Double getJianyizhuan_5huowu_qiyezibaojine () {
return this.jianyizhuan_5huowu_qiyezibaojine;
}

public void setJianyizhuan_4_qiyezibaojine (Double jianyizhuan_4_qiyezibaojine) {
	this.jianyizhuan_4_qiyezibaojine=jianyizhuan_4_qiyezibaojine;
}

public Double getJianyizhuan_4_qiyezibaojine () {
return this.jianyizhuan_4_qiyezibaojine;
}

public void setJianyizhuan_6_qiyezibaojine (Double jianyizhuan_6_qiyezibaojine) {
	this.jianyizhuan_6_qiyezibaojine=jianyizhuan_6_qiyezibaojine;
}

public Double getJianyizhuan_6_qiyezibaojine () {
return this.jianyizhuan_6_qiyezibaojine;
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
	if(this.tianbiaoshijian != null){
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
	if(this.shenheshijian != null){
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

public void setJianyizhuan_heji_3fuwu_qiye (Double jianyizhuan_heji_3fuwu_qiye) {
	this.jianyizhuan_heji_3fuwu_qiye=jianyizhuan_heji_3fuwu_qiye;
}

public Double getJianyizhuan_heji_3fuwu_qiye () {
return this.jianyizhuan_heji_3fuwu_qiye;
}

public void setJianyizhuan_heji_3fuwu_xiaoshoue (Double jianyizhuan_heji_3fuwu_xiaoshoue) {
	this.jianyizhuan_heji_3fuwu_xiaoshoue=jianyizhuan_heji_3fuwu_xiaoshoue;
}

public Double getJianyizhuan_heji_3fuwu_xiaoshoue () {
return this.jianyizhuan_heji_3fuwu_xiaoshoue;
}

public void setJianyizhuan_heji_3fuwu_11_xiaoxiangshuie (Double jianyizhuan_heji_3fuwu_11_xiaoxiangshuie) {
	this.jianyizhuan_heji_3fuwu_11_xiaoxiangshuie=jianyizhuan_heji_3fuwu_11_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_3fuwu_11_xiaoxiangshuie () {
return this.jianyizhuan_heji_3fuwu_11_xiaoxiangshuie;
}

public void setJianyizhuan_heji_3fuwu_jiashuiheji (Double jianyizhuan_heji_3fuwu_jiashuiheji) {
	this.jianyizhuan_heji_3fuwu_jiashuiheji=jianyizhuan_heji_3fuwu_jiashuiheji;
}

public Double getJianyizhuan_heji_3fuwu_jiashuiheji () {
return this.jianyizhuan_heji_3fuwu_jiashuiheji;
}

public void setJianyizhuan_heji_3huowu_qiye (Double jianyizhuan_heji_3huowu_qiye) {
	this.jianyizhuan_heji_3huowu_qiye=jianyizhuan_heji_3huowu_qiye;
}

public Double getJianyizhuan_heji_3huowu_qiye () {
return this.jianyizhuan_heji_3huowu_qiye;
}

public void setJianyizhuan_heji_3huowu_xiaoshoue (Double jianyizhuan_heji_3huowu_xiaoshoue) {
	this.jianyizhuan_heji_3huowu_xiaoshoue=jianyizhuan_heji_3huowu_xiaoshoue;
}

public Double getJianyizhuan_heji_3huowu_xiaoshoue () {
return this.jianyizhuan_heji_3huowu_xiaoshoue;
}

public void setJianyizhuan_heji_3huowu_xiaoxiangshuie (Double jianyizhuan_heji_3huowu_xiaoxiangshuie) {
	this.jianyizhuan_heji_3huowu_xiaoxiangshuie=jianyizhuan_heji_3huowu_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_3huowu_xiaoxiangshuie () {
return this.jianyizhuan_heji_3huowu_xiaoxiangshuie;
}

public void setJianyizhuan_heji_3huowu_jiashuiheji (Double jianyizhuan_heji_3huowu_jiashuiheji) {
	this.jianyizhuan_heji_3huowu_jiashuiheji=jianyizhuan_heji_3huowu_jiashuiheji;
}

public Double getJianyizhuan_heji_3huowu_jiashuiheji () {
return this.jianyizhuan_heji_3huowu_jiashuiheji;
}

public void setJianyizhuan_heji_5fuwu_qiye (Double jianyizhuan_heji_5fuwu_qiye) {
	this.jianyizhuan_heji_5fuwu_qiye=jianyizhuan_heji_5fuwu_qiye;
}

public Double getJianyizhuan_heji_5fuwu_qiye () {
return this.jianyizhuan_heji_5fuwu_qiye;
}

public void setJianyizhuan_heji_5fuwu_xiaoshoue (Double jianyizhuan_heji_5fuwu_xiaoshoue) {
	this.jianyizhuan_heji_5fuwu_xiaoshoue=jianyizhuan_heji_5fuwu_xiaoshoue;
}

public Double getJianyizhuan_heji_5fuwu_xiaoshoue () {
return this.jianyizhuan_heji_5fuwu_xiaoshoue;
}

public void setJianyizhuan_heji_5fuwu_xiaoxiangshuie (Double jianyizhuan_heji_5fuwu_xiaoxiangshuie) {
	this.jianyizhuan_heji_5fuwu_xiaoxiangshuie=jianyizhuan_heji_5fuwu_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_5fuwu_xiaoxiangshuie () {
return this.jianyizhuan_heji_5fuwu_xiaoxiangshuie;
}

public void setJianyizhuan_heji_5fuwu_jiashuiheji (Double jianyizhuan_heji_5fuwu_jiashuiheji) {
	this.jianyizhuan_heji_5fuwu_jiashuiheji=jianyizhuan_heji_5fuwu_jiashuiheji;
}

public Double getJianyizhuan_heji_5fuwu_jiashuiheji () {
return this.jianyizhuan_heji_5fuwu_jiashuiheji;
}

public void setJianyizhuan_heji_5huowu_qiye (Double jianyizhuan_heji_5huowu_qiye) {
	this.jianyizhuan_heji_5huowu_qiye=jianyizhuan_heji_5huowu_qiye;
}

public Double getJianyizhuan_heji_5huowu_qiye () {
return this.jianyizhuan_heji_5huowu_qiye;
}

public void setJianyizhuan_heji_5huowu_xiaoshoue (Double jianyizhuan_heji_5huowu_xiaoshoue) {
	this.jianyizhuan_heji_5huowu_xiaoshoue=jianyizhuan_heji_5huowu_xiaoshoue;
}

public Double getJianyizhuan_heji_5huowu_xiaoshoue () {
return this.jianyizhuan_heji_5huowu_xiaoshoue;
}

public void setJianyizhuan_heji_5huowu_xiaoxiangshuie (Double jianyizhuan_heji_5huowu_xiaoxiangshuie) {
	this.jianyizhuan_heji_5huowu_xiaoxiangshuie=jianyizhuan_heji_5huowu_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_5huowu_xiaoxiangshuie () {
return this.jianyizhuan_heji_5huowu_xiaoxiangshuie;
}

public void setJianyizhuan_heji_5huowu_jiashuiheji (Double jianyizhuan_heji_5huowu_jiashuiheji) {
	this.jianyizhuan_heji_5huowu_jiashuiheji=jianyizhuan_heji_5huowu_jiashuiheji;
}

public Double getJianyizhuan_heji_5huowu_jiashuiheji () {
return this.jianyizhuan_heji_5huowu_jiashuiheji;
}

public void setJianyizhuan_heji_4_qiye (Double jianyizhuan_heji_4_qiye) {
	this.jianyizhuan_heji_4_qiye=jianyizhuan_heji_4_qiye;
}

public Double getJianyizhuan_heji_4_qiye () {
return this.jianyizhuan_heji_4_qiye;
}

public void setJianyizhuan_heji_4_xiaoshoue (Double jianyizhuan_heji_4_xiaoshoue) {
	this.jianyizhuan_heji_4_xiaoshoue=jianyizhuan_heji_4_xiaoshoue;
}

public Double getJianyizhuan_heji_4_xiaoshoue () {
return this.jianyizhuan_heji_4_xiaoshoue;
}

public void setJianyizhuan_heji_4_xiaoxiangshuie (Double jianyizhuan_heji_4_xiaoxiangshuie) {
	this.jianyizhuan_heji_4_xiaoxiangshuie=jianyizhuan_heji_4_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_4_xiaoxiangshuie () {
return this.jianyizhuan_heji_4_xiaoxiangshuie;
}

public void setJianyizhuan_heji_4_jiashuiheji (Double jianyizhuan_heji_4_jiashuiheji) {
	this.jianyizhuan_heji_4_jiashuiheji=jianyizhuan_heji_4_jiashuiheji;
}

public Double getJianyizhuan_heji_4_jiashuiheji () {
return this.jianyizhuan_heji_4_jiashuiheji;
}

public void setJianyizhuan_heji_6_qiye (Double jianyizhuan_heji_6_qiye) {
	this.jianyizhuan_heji_6_qiye=jianyizhuan_heji_6_qiye;
}

public Double getJianyizhuan_heji_6_qiye () {
return this.jianyizhuan_heji_6_qiye;
}

public void setJianyizhuan_heji_6_xiaoshoue (Double jianyizhuan_heji_6_xiaoshoue) {
	this.jianyizhuan_heji_6_xiaoshoue=jianyizhuan_heji_6_xiaoshoue;
}

public Double getJianyizhuan_heji_6_xiaoshoue () {
return this.jianyizhuan_heji_6_xiaoshoue;
}

public void setJianyizhuan_heji_6_xiaoxiangshuie (Double jianyizhuan_heji_6_xiaoxiangshuie) {
	this.jianyizhuan_heji_6_xiaoxiangshuie=jianyizhuan_heji_6_xiaoxiangshuie;
}

public Double getJianyizhuan_heji_6_xiaoxiangshuie () {
return this.jianyizhuan_heji_6_xiaoxiangshuie;
}

public void setJianyizhuan_heji_6_jiashuiheji (Double jianyizhuan_heji_6_jiashuiheji) {
	this.jianyizhuan_heji_6_jiashuiheji=jianyizhuan_heji_6_jiashuiheji;
}

public Double getJianyizhuan_heji_6_jiashuiheji () {
return this.jianyizhuan_heji_6_jiashuiheji;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
