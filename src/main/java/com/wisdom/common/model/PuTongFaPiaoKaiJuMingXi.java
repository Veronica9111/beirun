package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class PuTongFaPiaoKaiJuMingXi implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public PuTongFaPiaoKaiJuMingXi() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double putong_11_xiaoshoue;
private Double putong_11_xiaoxiangshuie;
private Double putong_11_xiaoji;
private Double putong_3_xiaoshoue;
private Double putong_3_xiaoxiangshuie;
private Double putong_3_xiaoji;
private Double putong_17huowu_xiaoshoue;
private Double putong_17huowu_xiaoxiangshuie;
private Double putong_17huowu_xiaoji;
private Double putong_17fuwu_xiaoshoue;
private Double putong_17fuwu_xiaoxiangshuie;
private Double putong_17fuwu_xiaoji;
private Double putong_13_xiaoshoue;
private Double putong_13_xiaoxiangshuie;
private Double putong_13_xiaoji;
private Double putong_6_xiaoshoue;
private Double putong_6_xiaoxiangshuie;
private Double putong_6_xiaoji;
private Double putong_heji_11_xiaoshoue;
private Double putong_heji_11_xiaoxiangshuie;
private Double putong_heji_11_xiaoji;
private Double putong_heji_3_xiaoshoue;
private Double putong_heji_3_xiaoxiangshuie;
private Double putong_heji_3_xiaoji;
private Double putong_heji_17huowu_xiaoshoue;
private Double putong_heji_17huowu_xiaoxiangshuie;
private Double putong_heji_17huowu_xiaoji;
private Double putong_heji_17fuwu_xiaoshoue;
private Double putong_heji_17fuwu_xiaoxiangshuie;
private Double putong_heji_17fuwu_xiaoji;
private Double putong_heji_13_xiaoshoue;
private Double putong_heji_13_xiaoxiangshuie;
private Double putong_heji_13_xiaoji;
private Double putong_heji_6_xiaoshoue;
private Double putong_heji_6_xiaoxiangshuie;
private Double putong_heji_6_xiaoji;
private String kaipiaoneirong;
private String shenheren;
private String tianbiaoren;
private String shenherendianhua;
private String tianbiaorendianhua;
private Timestamp shenheriqi;
private Timestamp tianbiaoriqi;
private Long kaipiaoshenqingdan_id;
public PuTongFaPiaoKaiJuMingXi(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double putong_11_xiaoshoue, Double putong_11_xiaoxiangshuie, Double putong_11_xiaoji, Double putong_3_xiaoshoue, Double putong_3_xiaoxiangshuie, Double putong_3_xiaoji, Double putong_17huowu_xiaoshoue, Double putong_17huowu_xiaoxiangshuie, Double putong_17huowu_xiaoji, Double putong_17fuwu_xiaoshoue, Double putong_17fuwu_xiaoxiangshuie, Double putong_17fuwu_xiaoji, Double putong_13_xiaoshoue, Double putong_13_xiaoxiangshuie, Double putong_13_xiaoji, Double putong_6_xiaoshoue, Double putong_6_xiaoxiangshuie, Double putong_6_xiaoji, Double putong_heji_11_xiaoshoue, Double putong_heji_11_xiaoxiangshuie, Double putong_heji_11_xiaoji, Double putong_heji_3_xiaoshoue, Double putong_heji_3_xiaoxiangshuie, Double putong_heji_3_xiaoji, Double putong_heji_17huowu_xiaoshoue, Double putong_heji_17huowu_xiaoxiangshuie, Double putong_heji_17huowu_xiaoji, Double putong_heji_17fuwu_xiaoshoue, Double putong_heji_17fuwu_xiaoxiangshuie, Double putong_heji_17fuwu_xiaoji, Double putong_heji_13_xiaoshoue, Double putong_heji_13_xiaoxiangshuie, Double putong_heji_13_xiaoji, Double putong_heji_6_xiaoshoue, Double putong_heji_6_xiaoxiangshuie, Double putong_heji_6_xiaoji, String kaipiaoneirong, String shenheren, String tianbiaoren, String shenherendianhua, String tianbiaorendianhua, Timestamp shenheriqi, Timestamp tianbiaoriqi, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.putong_11_xiaoshoue=putong_11_xiaoshoue;
this.putong_11_xiaoxiangshuie=putong_11_xiaoxiangshuie;
this.putong_11_xiaoji=putong_11_xiaoji;
this.putong_3_xiaoshoue=putong_3_xiaoshoue;
this.putong_3_xiaoxiangshuie=putong_3_xiaoxiangshuie;
this.putong_3_xiaoji=putong_3_xiaoji;
this.putong_17huowu_xiaoshoue=putong_17huowu_xiaoshoue;
this.putong_17huowu_xiaoxiangshuie=putong_17huowu_xiaoxiangshuie;
this.putong_17huowu_xiaoji=putong_17huowu_xiaoji;
this.putong_17fuwu_xiaoshoue=putong_17fuwu_xiaoshoue;
this.putong_17fuwu_xiaoxiangshuie=putong_17fuwu_xiaoxiangshuie;
this.putong_17fuwu_xiaoji=putong_17fuwu_xiaoji;
this.putong_13_xiaoshoue=putong_13_xiaoshoue;
this.putong_13_xiaoxiangshuie=putong_13_xiaoxiangshuie;
this.putong_13_xiaoji=putong_13_xiaoji;
this.putong_6_xiaoshoue=putong_6_xiaoshoue;
this.putong_6_xiaoxiangshuie=putong_6_xiaoxiangshuie;
this.putong_6_xiaoji=putong_6_xiaoji;
this.putong_heji_11_xiaoshoue=putong_heji_11_xiaoshoue;
this.putong_heji_11_xiaoxiangshuie=putong_heji_11_xiaoxiangshuie;
this.putong_heji_11_xiaoji=putong_heji_11_xiaoji;
this.putong_heji_3_xiaoshoue=putong_heji_3_xiaoshoue;
this.putong_heji_3_xiaoxiangshuie=putong_heji_3_xiaoxiangshuie;
this.putong_heji_3_xiaoji=putong_heji_3_xiaoji;
this.putong_heji_17huowu_xiaoshoue=putong_heji_17huowu_xiaoshoue;
this.putong_heji_17huowu_xiaoxiangshuie=putong_heji_17huowu_xiaoxiangshuie;
this.putong_heji_17huowu_xiaoji=putong_heji_17huowu_xiaoji;
this.putong_heji_17fuwu_xiaoshoue=putong_heji_17fuwu_xiaoshoue;
this.putong_heji_17fuwu_xiaoxiangshuie=putong_heji_17fuwu_xiaoxiangshuie;
this.putong_heji_17fuwu_xiaoji=putong_heji_17fuwu_xiaoji;
this.putong_heji_13_xiaoshoue=putong_heji_13_xiaoshoue;
this.putong_heji_13_xiaoxiangshuie=putong_heji_13_xiaoxiangshuie;
this.putong_heji_13_xiaoji=putong_heji_13_xiaoji;
this.putong_heji_6_xiaoshoue=putong_heji_6_xiaoshoue;
this.putong_heji_6_xiaoxiangshuie=putong_heji_6_xiaoxiangshuie;
this.putong_heji_6_xiaoji=putong_heji_6_xiaoji;
this.kaipiaoneirong=kaipiaoneirong;
this.shenheren=shenheren;
this.tianbiaoren=tianbiaoren;
this.shenherendianhua=shenherendianhua;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenheriqi=shenheriqi;
this.tianbiaoriqi=tianbiaoriqi;
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
	String shenqingriqi = "";
	if(this.riqi != null) {
		shenqingriqi  = dateFormat.format(this.riqi);
	}
	return shenqingriqi;
}

public void setPutong_11_xiaoshoue (Double putong_11_xiaoshoue) {
	this.putong_11_xiaoshoue=putong_11_xiaoshoue;
}

public Double getPutong_11_xiaoshoue () {
return this.putong_11_xiaoshoue;
}

public void setPutong_11_xiaoxiangshuie (Double putong_11_xiaoxiangshuie) {
	this.putong_11_xiaoxiangshuie=putong_11_xiaoxiangshuie;
}

public Double getPutong_11_xiaoxiangshuie () {
return this.putong_11_xiaoxiangshuie;
}

public void setPutong_11_xiaoji (Double putong_11_xiaoji) {
	this.putong_11_xiaoji=putong_11_xiaoji;
}

public Double getPutong_11_xiaoji () {
return this.putong_11_xiaoji;
}

public void setPutong_3_xiaoshoue (Double putong_3_xiaoshoue) {
	this.putong_3_xiaoshoue=putong_3_xiaoshoue;
}

public Double getPutong_3_xiaoshoue () {
return this.putong_3_xiaoshoue;
}

public void setPutong_3_xiaoxiangshuie (Double putong_3_xiaoxiangshuie) {
	this.putong_3_xiaoxiangshuie=putong_3_xiaoxiangshuie;
}

public Double getPutong_3_xiaoxiangshuie () {
return this.putong_3_xiaoxiangshuie;
}

public void setPutong_3_xiaoji (Double putong_3_xiaoji) {
	this.putong_3_xiaoji=putong_3_xiaoji;
}

public Double getPutong_3_xiaoji () {
return this.putong_3_xiaoji;
}

public void setPutong_17huowu_xiaoshoue (Double putong_17huowu_xiaoshoue) {
	this.putong_17huowu_xiaoshoue=putong_17huowu_xiaoshoue;
}

public Double getPutong_17huowu_xiaoshoue () {
return this.putong_17huowu_xiaoshoue;
}

public void setPutong_17huowu_xiaoxiangshuie (Double putong_17huowu_xiaoxiangshuie) {
	this.putong_17huowu_xiaoxiangshuie=putong_17huowu_xiaoxiangshuie;
}

public Double getPutong_17huowu_xiaoxiangshuie () {
return this.putong_17huowu_xiaoxiangshuie;
}

public void setPutong_17huowu_xiaoji (Double putong_17huowu_xiaoji) {
	this.putong_17huowu_xiaoji=putong_17huowu_xiaoji;
}

public Double getPutong_17huowu_xiaoji () {
return this.putong_17huowu_xiaoji;
}

public void setPutong_17fuwu_xiaoshoue (Double putong_17fuwu_xiaoshoue) {
	this.putong_17fuwu_xiaoshoue=putong_17fuwu_xiaoshoue;
}

public Double getPutong_17fuwu_xiaoshoue () {
return this.putong_17fuwu_xiaoshoue;
}

public void setPutong_17fuwu_xiaoxiangshuie (Double putong_17fuwu_xiaoxiangshuie) {
	this.putong_17fuwu_xiaoxiangshuie=putong_17fuwu_xiaoxiangshuie;
}

public Double getPutong_17fuwu_xiaoxiangshuie () {
return this.putong_17fuwu_xiaoxiangshuie;
}

public void setPutong_17fuwu_xiaoji (Double putong_17fuwu_xiaoji) {
	this.putong_17fuwu_xiaoji=putong_17fuwu_xiaoji;
}

public Double getPutong_17fuwu_xiaoji () {
return this.putong_17fuwu_xiaoji;
}

public void setPutong_13_xiaoshoue (Double putong_13_xiaoshoue) {
	this.putong_13_xiaoshoue=putong_13_xiaoshoue;
}

public Double getPutong_13_xiaoshoue () {
return this.putong_13_xiaoshoue;
}

public void setPutong_13_xiaoxiangshuie (Double putong_13_xiaoxiangshuie) {
	this.putong_13_xiaoxiangshuie=putong_13_xiaoxiangshuie;
}

public Double getPutong_13_xiaoxiangshuie () {
return this.putong_13_xiaoxiangshuie;
}

public void setPutong_13_xiaoji (Double putong_13_xiaoji) {
	this.putong_13_xiaoji=putong_13_xiaoji;
}

public Double getPutong_13_xiaoji () {
return this.putong_13_xiaoji;
}

public void setPutong_6_xiaoshoue (Double putong_6_xiaoshoue) {
	this.putong_6_xiaoshoue=putong_6_xiaoshoue;
}

public Double getPutong_6_xiaoshoue () {
return this.putong_6_xiaoshoue;
}

public void setPutong_6_xiaoxiangshuie (Double putong_6_xiaoxiangshuie) {
	this.putong_6_xiaoxiangshuie=putong_6_xiaoxiangshuie;
}

public Double getPutong_6_xiaoxiangshuie () {
return this.putong_6_xiaoxiangshuie;
}

public void setPutong_6_xiaoji (Double putong_6_xiaoji) {
	this.putong_6_xiaoji=putong_6_xiaoji;
}

public Double getPutong_6_xiaoji () {
return this.putong_6_xiaoji;
}

public void setPutong_heji_11_xiaoshoue (Double putong_heji_11_xiaoshoue) {
	this.putong_heji_11_xiaoshoue=putong_heji_11_xiaoshoue;
}

public Double getPutong_heji_11_xiaoshoue () {
return this.putong_heji_11_xiaoshoue;
}

public void setPutong_heji_11_xiaoxiangshuie (Double putong_heji_11_xiaoxiangshuie) {
	this.putong_heji_11_xiaoxiangshuie=putong_heji_11_xiaoxiangshuie;
}

public Double getPutong_heji_11_xiaoxiangshuie () {
return this.putong_heji_11_xiaoxiangshuie;
}

public void setPutong_heji_11_xiaoji (Double putong_heji_11_xiaoji) {
	this.putong_heji_11_xiaoji=putong_heji_11_xiaoji;
}

public Double getPutong_heji_11_xiaoji () {
return this.putong_heji_11_xiaoji;
}

public void setPutong_heji_3_xiaoshoue (Double putong_heji_3_xiaoshoue) {
	this.putong_heji_3_xiaoshoue=putong_heji_3_xiaoshoue;
}

public Double getPutong_heji_3_xiaoshoue () {
return this.putong_heji_3_xiaoshoue;
}

public void setPutong_heji_3_xiaoxiangshuie (Double putong_heji_3_xiaoxiangshuie) {
	this.putong_heji_3_xiaoxiangshuie=putong_heji_3_xiaoxiangshuie;
}

public Double getPutong_heji_3_xiaoxiangshuie () {
return this.putong_heji_3_xiaoxiangshuie;
}

public void setPutong_heji_3_xiaoji (Double putong_heji_3_xiaoji) {
	this.putong_heji_3_xiaoji=putong_heji_3_xiaoji;
}

public Double getPutong_heji_3_xiaoji () {
return this.putong_heji_3_xiaoji;
}

public void setPutong_heji_17huowu_xiaoshoue (Double putong_heji_17huowu_xiaoshoue) {
	this.putong_heji_17huowu_xiaoshoue=putong_heji_17huowu_xiaoshoue;
}

public Double getPutong_heji_17huowu_xiaoshoue () {
return this.putong_heji_17huowu_xiaoshoue;
}

public void setPutong_heji_17huowu_xiaoxiangshuie (Double putong_heji_17huowu_xiaoxiangshuie) {
	this.putong_heji_17huowu_xiaoxiangshuie=putong_heji_17huowu_xiaoxiangshuie;
}

public Double getPutong_heji_17huowu_xiaoxiangshuie () {
return this.putong_heji_17huowu_xiaoxiangshuie;
}

public void setPutong_heji_17huowu_xiaoji (Double putong_heji_17huowu_xiaoji) {
	this.putong_heji_17huowu_xiaoji=putong_heji_17huowu_xiaoji;
}

public Double getPutong_heji_17huowu_xiaoji () {
return this.putong_heji_17huowu_xiaoji;
}

public void setPutong_heji_17fuwu_xiaoshoue (Double putong_heji_17fuwu_xiaoshoue) {
	this.putong_heji_17fuwu_xiaoshoue=putong_heji_17fuwu_xiaoshoue;
}

public Double getPutong_heji_17fuwu_xiaoshoue () {
return this.putong_heji_17fuwu_xiaoshoue;
}

public void setPutong_heji_17fuwu_xiaoxiangshuie (Double putong_heji_17fuwu_xiaoxiangshuie) {
	this.putong_heji_17fuwu_xiaoxiangshuie=putong_heji_17fuwu_xiaoxiangshuie;
}

public Double getPutong_heji_17fuwu_xiaoxiangshuie () {
return this.putong_heji_17fuwu_xiaoxiangshuie;
}

public void setPutong_heji_17fuwu_xiaoji (Double putong_heji_17fuwu_xiaoji) {
	this.putong_heji_17fuwu_xiaoji=putong_heji_17fuwu_xiaoji;
}

public Double getPutong_heji_17fuwu_xiaoji () {
return this.putong_heji_17fuwu_xiaoji;
}

public void setPutong_heji_13_xiaoshoue (Double putong_heji_13_xiaoshoue) {
	this.putong_heji_13_xiaoshoue=putong_heji_13_xiaoshoue;
}

public Double getPutong_heji_13_xiaoshoue () {
return this.putong_heji_13_xiaoshoue;
}

public void setPutong_heji_13_xiaoxiangshuie (Double putong_heji_13_xiaoxiangshuie) {
	this.putong_heji_13_xiaoxiangshuie=putong_heji_13_xiaoxiangshuie;
}

public Double getPutong_heji_13_xiaoxiangshuie () {
return this.putong_heji_13_xiaoxiangshuie;
}

public void setPutong_heji_13_xiaoji (Double putong_heji_13_xiaoji) {
	this.putong_heji_13_xiaoji=putong_heji_13_xiaoji;
}

public Double getPutong_heji_13_xiaoji () {
return this.putong_heji_13_xiaoji;
}

public void setPutong_heji_6_xiaoshoue (Double putong_heji_6_xiaoshoue) {
	this.putong_heji_6_xiaoshoue=putong_heji_6_xiaoshoue;
}

public Double getPutong_heji_6_xiaoshoue () {
return this.putong_heji_6_xiaoshoue;
}

public void setPutong_heji_6_xiaoxiangshuie (Double putong_heji_6_xiaoxiangshuie) {
	this.putong_heji_6_xiaoxiangshuie=putong_heji_6_xiaoxiangshuie;
}

public Double getPutong_heji_6_xiaoxiangshuie () {
return this.putong_heji_6_xiaoxiangshuie;
}

public void setPutong_heji_6_xiaoji (Double putong_heji_6_xiaoji) {
	this.putong_heji_6_xiaoji=putong_heji_6_xiaoji;
}

public Double getPutong_heji_6_xiaoji () {
return this.putong_heji_6_xiaoji;
}

public void setKaipiaoneirong (String kaipiaoneirong) {
this.kaipiaoneirong=kaipiaoneirong;
}

public String getKaipiaoneirong () {
return this.kaipiaoneirong;
}

public void setShenheren (String shenheren) {
this.shenheren=shenheren;
}

public String getShenheren () {
return this.shenheren;
}

public void setTianbiaoren (String tianbiaoren) {
this.tianbiaoren=tianbiaoren;
}

public String getTianbiaoren () {
return this.tianbiaoren;
}

public void setShenherendianhua (String shenherendianhua) {
this.shenherendianhua=shenherendianhua;
}

public String getShenherendianhua () {
return this.shenherendianhua;
}

public void setTianbiaorendianhua (String tianbiaorendianhua) {
this.tianbiaorendianhua=tianbiaorendianhua;
}

public String getTianbiaorendianhua () {
return this.tianbiaorendianhua;
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

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
