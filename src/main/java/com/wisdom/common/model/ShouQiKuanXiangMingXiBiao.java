package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class ShouQiKuanXiangMingXiBiao implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public ShouQiKuanXiangMingXiBiao() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private String fukuandanwei;
private Timestamp shouqishijian;
private Double shouqijine;
private String beizhu;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoriqi;
private Timestamp shenheriqi;
private Long kaipiaoshenqingdan_id;
public ShouQiKuanXiangMingXiBiao(Long id, String fengongsimingcheng, String xiangmubu, String fukuandanwei, Timestamp shouqishijian, Double shouqijine, String beizhu, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoriqi, Timestamp shenheriqi, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.fukuandanwei=fukuandanwei;
this.shouqishijian=shouqishijian;
this.shouqijine=shouqijine;
this.beizhu=beizhu;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoriqi=tianbiaoriqi;
this.shenheriqi=shenheriqi;
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

public void setFukuandanwei (String fukuandanwei) {
this.fukuandanwei=fukuandanwei;
}

public String getFukuandanwei () {
return this.fukuandanwei;
}

public void setShouqishijian (Timestamp shouqishijian) {
		this.shouqishijian=shouqishijian;
}

public String getShouqishijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String shenqingriqi = "";
	if(this.shouqishijian != null) {
		shenqingriqi  = dateFormat.format(this.shouqishijian);
	}
return shenqingriqi;
}

public void setShouqijine (Double shouqijine) {
	this.shouqijine=shouqijine;
}

public Double getShouqijine () {
return this.shouqijine;
}

public void setBeizhu (String beizhu) {
this.beizhu=beizhu;
}

public String getBeizhu () {
return this.beizhu;
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

public void setTianbiaoriqi (Timestamp tianbiaoriqi) {
		this.tianbiaoriqi=tianbiaoriqi;
}

public String getTianbiaoriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String shenqingriqi = "";
	if(this.tianbiaoriqi != null) {
		shenqingriqi  = dateFormat.format(this.tianbiaoriqi);
	}
return shenqingriqi;
}

public void setShenheriqi (Timestamp shenheriqi) {
		this.shenheriqi=shenheriqi;
}

public String getShenheriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String shenqingriqi = "";
	if(this.shenheriqi != null) {
		shenqingriqi  = dateFormat.format(this.shenheriqi);
	}
return shenqingriqi;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
