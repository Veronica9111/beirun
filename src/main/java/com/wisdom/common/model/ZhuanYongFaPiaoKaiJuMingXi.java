package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class ZhuanYongFaPiaoKaiJuMingXi implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public ZhuanYongFaPiaoKaiJuMingXi() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private Timestamp riqi;
private Double zhuanpiao_11_xiaoshoue;
private Double zhuanpiao_11_xiaoxiangshuie;
private Double zhuanpiao_11_xiaoji;
private Double zhuanpiao_3_xiaoshoue;
private Double zhuanpiao_3_xiaoxiangshuie;
private Double zhuanpiao_3_xiaoji;
private Double zhuanpiao_17huowu_xiaoshoue;
private Double zhuanpiao_17huowu_xiaoxiangshuie;
private Double zhuanpiao_17huowu_xiaoji;
private Double zhuanpiao_17fuwu_xiaoshoue;
private Double zhuanpiao_17fuwu_xiaoxiangshuie;
private Double zhuanpiao_17fuwu_xiaoji;
private Double zhuanpiao_13_xiaoshoue;
private Double zhuanpiao_13_xiaoxiangshuie;
private Double zhuanpiao_13_xiaoji;
private Double zhuanpiao_6_xiaoshoue;
private Double zhuanpiao_6_xiaoxiangshuie;
private Double zhuanpiao_6_xiaoji;
private Double zhuanpiao_heji_11_xiaoshoue;
private Double zhuanpiao_heji_11_xiaoxiangshuie;
private Double zhuanpiao_heji_11_xiaoji;
private Double zhuanpiao_heji_3_xiaoshoue;
private Double zhuanpiao_heji_3_xiaoxiangshuie;
private Double zhuanpiao_heji_3_xiaoji;
private Double zhuanpiao_heji_17huowu_xiaoshoue;
private Double zhuanpiao_heji_17huowu_xiaoxiangshuie;
private Double zhuanpiao_heji_17huowu_xiaoji;
private Double zhuanpiao_heji_17fuwu_xiaoshoue;
private Double zhuanpiao_heji_17fuwu_xiaoxiangshuie;
private Double zhuanpiao_heji_17fuwu_xiaoji;
private Double zhuanpiao_heji_13_xiaoshoue;
private Double zhuanpiao_heji_13_xiaoxiangshuie;
private Double zhuanpiao_heji_13_xiaoji;
private Double zhuanpiao_heji_6_xiaoshoue;
private Double zhuanpiao_heji_6_xiaoxiangshuie;
private Double zhuanpiao_heji_6_xiaoji;
private String kaipiaoneirong;
private String shenheren;
private String tianbiaoren;
private String shenherendianhua;
private String tianbiaorendianhua;
private Timestamp shenheriqi;
private Timestamp tianbiaoriqi;
private String fuheren;
private Long kaipiaoshenqingdan_id;
public ZhuanYongFaPiaoKaiJuMingXi(Long id, String fengongsimingcheng, String xiangmubu, Timestamp riqi, Double zhuanpiao_11_xiaoshoue, Double zhuanpiao_11_xiaoxiangshuie, Double zhuanpiao_11_xiaoji, Double zhuanpiao_3_xiaoshoue, Double zhuanpiao_3_xiaoxiangshuie, Double zhuanpiao_3_xiaoji, Double zhuanpiao_17huowu_xiaoshoue, Double zhuanpiao_17huowu_xiaoxiangshuie, Double zhuanpiao_17huowu_xiaoji, Double zhuanpiao_17fuwu_xiaoshoue, Double zhuanpiao_17fuwu_xiaoxiangshuie, Double zhuanpiao_17fuwu_xiaoji, Double zhuanpiao_13_xiaoshoue, Double zhuanpiao_13_xiaoxiangshuie, Double zhuanpiao_13_xiaoji, Double zhuanpiao_6_xiaoshoue, Double zhuanpiao_6_xiaoxiangshuie, Double zhuanpiao_6_xiaoji, Double zhuanpiao_heji_11_xiaoshoue, Double zhuanpiao_heji_11_xiaoxiangshuie, Double zhuanpiao_heji_11_xiaoji, Double zhuanpiao_heji_3_xiaoshoue, Double zhuanpiao_heji_3_xiaoxiangshuie, Double zhuanpiao_heji_3_xiaoji, Double zhuanpiao_heji_17huowu_xiaoshoue, Double zhuanpiao_heji_17huowu_xiaoxiangshuie, Double zhuanpiao_heji_17huowu_xiaoji, Double zhuanpiao_heji_17fuwu_xiaoshoue, Double zhuanpiao_heji_17fuwu_xiaoxiangshuie, Double zhuanpiao_heji_17fuwu_xiaoji, Double zhuanpiao_heji_13_xiaoshoue, Double zhuanpiao_heji_13_xiaoxiangshuie, Double zhuanpiao_heji_13_xiaoji, Double zhuanpiao_heji_6_xiaoshoue, Double zhuanpiao_heji_6_xiaoxiangshuie, Double zhuanpiao_heji_6_xiaoji, String kaipiaoneirong, String shenheren, String tianbiaoren, String shenherendianhua, String tianbiaorendianhua, Timestamp shenheriqi, Timestamp tianbiaoriqi, String fuheren, Long kaipiaoshenqingdan_id) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.riqi=riqi;
this.zhuanpiao_11_xiaoshoue=zhuanpiao_11_xiaoshoue;
this.zhuanpiao_11_xiaoxiangshuie=zhuanpiao_11_xiaoxiangshuie;
this.zhuanpiao_11_xiaoji=zhuanpiao_11_xiaoji;
this.zhuanpiao_3_xiaoshoue=zhuanpiao_3_xiaoshoue;
this.zhuanpiao_3_xiaoxiangshuie=zhuanpiao_3_xiaoxiangshuie;
this.zhuanpiao_3_xiaoji=zhuanpiao_3_xiaoji;
this.zhuanpiao_17huowu_xiaoshoue=zhuanpiao_17huowu_xiaoshoue;
this.zhuanpiao_17huowu_xiaoxiangshuie=zhuanpiao_17huowu_xiaoxiangshuie;
this.zhuanpiao_17huowu_xiaoji=zhuanpiao_17huowu_xiaoji;
this.zhuanpiao_17fuwu_xiaoshoue=zhuanpiao_17fuwu_xiaoshoue;
this.zhuanpiao_17fuwu_xiaoxiangshuie=zhuanpiao_17fuwu_xiaoxiangshuie;
this.zhuanpiao_17fuwu_xiaoji=zhuanpiao_17fuwu_xiaoji;
this.zhuanpiao_13_xiaoshoue=zhuanpiao_13_xiaoshoue;
this.zhuanpiao_13_xiaoxiangshuie=zhuanpiao_13_xiaoxiangshuie;
this.zhuanpiao_13_xiaoji=zhuanpiao_13_xiaoji;
this.zhuanpiao_6_xiaoshoue=zhuanpiao_6_xiaoshoue;
this.zhuanpiao_6_xiaoxiangshuie=zhuanpiao_6_xiaoxiangshuie;
this.zhuanpiao_6_xiaoji=zhuanpiao_6_xiaoji;
this.zhuanpiao_heji_11_xiaoshoue=zhuanpiao_heji_11_xiaoshoue;
this.zhuanpiao_heji_11_xiaoxiangshuie=zhuanpiao_heji_11_xiaoxiangshuie;
this.zhuanpiao_heji_11_xiaoji=zhuanpiao_heji_11_xiaoji;
this.zhuanpiao_heji_3_xiaoshoue=zhuanpiao_heji_3_xiaoshoue;
this.zhuanpiao_heji_3_xiaoxiangshuie=zhuanpiao_heji_3_xiaoxiangshuie;
this.zhuanpiao_heji_3_xiaoji=zhuanpiao_heji_3_xiaoji;
this.zhuanpiao_heji_17huowu_xiaoshoue=zhuanpiao_heji_17huowu_xiaoshoue;
this.zhuanpiao_heji_17huowu_xiaoxiangshuie=zhuanpiao_heji_17huowu_xiaoxiangshuie;
this.zhuanpiao_heji_17huowu_xiaoji=zhuanpiao_heji_17huowu_xiaoji;
this.zhuanpiao_heji_17fuwu_xiaoshoue=zhuanpiao_heji_17fuwu_xiaoshoue;
this.zhuanpiao_heji_17fuwu_xiaoxiangshuie=zhuanpiao_heji_17fuwu_xiaoxiangshuie;
this.zhuanpiao_heji_17fuwu_xiaoji=zhuanpiao_heji_17fuwu_xiaoji;
this.zhuanpiao_heji_13_xiaoshoue=zhuanpiao_heji_13_xiaoshoue;
this.zhuanpiao_heji_13_xiaoxiangshuie=zhuanpiao_heji_13_xiaoxiangshuie;
this.zhuanpiao_heji_13_xiaoji=zhuanpiao_heji_13_xiaoji;
this.zhuanpiao_heji_6_xiaoshoue=zhuanpiao_heji_6_xiaoshoue;
this.zhuanpiao_heji_6_xiaoxiangshuie=zhuanpiao_heji_6_xiaoxiangshuie;
this.zhuanpiao_heji_6_xiaoji=zhuanpiao_heji_6_xiaoji;
this.kaipiaoneirong=kaipiaoneirong;
this.shenheren=shenheren;
this.tianbiaoren=tianbiaoren;
this.shenherendianhua=shenherendianhua;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenheriqi=shenheriqi;
this.tianbiaoriqi=tianbiaoriqi;
this.fuheren=fuheren;
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

public void setZhuanpiao_11_xiaoshoue (Double zhuanpiao_11_xiaoshoue) {
	this.zhuanpiao_11_xiaoshoue=zhuanpiao_11_xiaoshoue;
}

public Double getZhuanpiao_11_xiaoshoue () {
return this.zhuanpiao_11_xiaoshoue;
}

public void setZhuanpiao_11_xiaoxiangshuie (Double zhuanpiao_11_xiaoxiangshuie) {
	this.zhuanpiao_11_xiaoxiangshuie=zhuanpiao_11_xiaoxiangshuie;
}

public Double getZhuanpiao_11_xiaoxiangshuie () {
return this.zhuanpiao_11_xiaoxiangshuie;
}

public void setZhuanpiao_11_xiaoji (Double zhuanpiao_11_xiaoji) {
	this.zhuanpiao_11_xiaoji=zhuanpiao_11_xiaoji;
}

public Double getZhuanpiao_11_xiaoji () {
return this.zhuanpiao_11_xiaoji;
}

public void setZhuanpiao_3_xiaoshoue (Double zhuanpiao_3_xiaoshoue) {
	this.zhuanpiao_3_xiaoshoue=zhuanpiao_3_xiaoshoue;
}

public Double getZhuanpiao_3_xiaoshoue () {
return this.zhuanpiao_3_xiaoshoue;
}

public void setZhuanpiao_3_xiaoxiangshuie (Double zhuanpiao_3_xiaoxiangshuie) {
	this.zhuanpiao_3_xiaoxiangshuie=zhuanpiao_3_xiaoxiangshuie;
}

public Double getZhuanpiao_3_xiaoxiangshuie () {
return this.zhuanpiao_3_xiaoxiangshuie;
}

public void setZhuanpiao_3_xiaoji (Double zhuanpiao_3_xiaoji) {
	this.zhuanpiao_3_xiaoji=zhuanpiao_3_xiaoji;
}

public Double getZhuanpiao_3_xiaoji () {
return this.zhuanpiao_3_xiaoji;
}

public void setZhuanpiao_17huowu_xiaoshoue (Double zhuanpiao_17huowu_xiaoshoue) {
	this.zhuanpiao_17huowu_xiaoshoue=zhuanpiao_17huowu_xiaoshoue;
}

public Double getZhuanpiao_17huowu_xiaoshoue () {
return this.zhuanpiao_17huowu_xiaoshoue;
}

public void setZhuanpiao_17huowu_xiaoxiangshuie (Double zhuanpiao_17huowu_xiaoxiangshuie) {
	this.zhuanpiao_17huowu_xiaoxiangshuie=zhuanpiao_17huowu_xiaoxiangshuie;
}

public Double getZhuanpiao_17huowu_xiaoxiangshuie () {
return this.zhuanpiao_17huowu_xiaoxiangshuie;
}

public void setZhuanpiao_17huowu_xiaoji (Double zhuanpiao_17huowu_xiaoji) {
	this.zhuanpiao_17huowu_xiaoji=zhuanpiao_17huowu_xiaoji;
}

public Double getZhuanpiao_17huowu_xiaoji () {
return this.zhuanpiao_17huowu_xiaoji;
}

public void setZhuanpiao_17fuwu_xiaoshoue (Double zhuanpiao_17fuwu_xiaoshoue) {
	this.zhuanpiao_17fuwu_xiaoshoue=zhuanpiao_17fuwu_xiaoshoue;
}

public Double getZhuanpiao_17fuwu_xiaoshoue () {
return this.zhuanpiao_17fuwu_xiaoshoue;
}

public void setZhuanpiao_17fuwu_xiaoxiangshuie (Double zhuanpiao_17fuwu_xiaoxiangshuie) {
	this.zhuanpiao_17fuwu_xiaoxiangshuie=zhuanpiao_17fuwu_xiaoxiangshuie;
}

public Double getZhuanpiao_17fuwu_xiaoxiangshuie () {
return this.zhuanpiao_17fuwu_xiaoxiangshuie;
}

public void setZhuanpiao_17fuwu_xiaoji (Double zhuanpiao_17fuwu_xiaoji) {
	this.zhuanpiao_17fuwu_xiaoji=zhuanpiao_17fuwu_xiaoji;
}

public Double getZhuanpiao_17fuwu_xiaoji () {
return this.zhuanpiao_17fuwu_xiaoji;
}

public void setZhuanpiao_13_xiaoshoue (Double zhuanpiao_13_xiaoshoue) {
	this.zhuanpiao_13_xiaoshoue=zhuanpiao_13_xiaoshoue;
}

public Double getZhuanpiao_13_xiaoshoue () {
return this.zhuanpiao_13_xiaoshoue;
}

public void setZhuanpiao_13_xiaoxiangshuie (Double zhuanpiao_13_xiaoxiangshuie) {
	this.zhuanpiao_13_xiaoxiangshuie=zhuanpiao_13_xiaoxiangshuie;
}

public Double getZhuanpiao_13_xiaoxiangshuie () {
return this.zhuanpiao_13_xiaoxiangshuie;
}

public void setZhuanpiao_13_xiaoji (Double zhuanpiao_13_xiaoji) {
	this.zhuanpiao_13_xiaoji=zhuanpiao_13_xiaoji;
}

public Double getZhuanpiao_13_xiaoji () {
return this.zhuanpiao_13_xiaoji;
}

public void setZhuanpiao_6_xiaoshoue (Double zhuanpiao_6_xiaoshoue) {
	this.zhuanpiao_6_xiaoshoue=zhuanpiao_6_xiaoshoue;
}

public Double getZhuanpiao_6_xiaoshoue () {
return this.zhuanpiao_6_xiaoshoue;
}

public void setZhuanpiao_6_xiaoxiangshuie (Double zhuanpiao_6_xiaoxiangshuie) {
	this.zhuanpiao_6_xiaoxiangshuie=zhuanpiao_6_xiaoxiangshuie;
}

public Double getZhuanpiao_6_xiaoxiangshuie () {
return this.zhuanpiao_6_xiaoxiangshuie;
}

public void setZhuanpiao_6_xiaoji (Double zhuanpiao_6_xiaoji) {
	this.zhuanpiao_6_xiaoji=zhuanpiao_6_xiaoji;
}

public Double getZhuanpiao_6_xiaoji () {
return this.zhuanpiao_6_xiaoji;
}

public void setZhuanpiao_heji_11_xiaoshoue (Double zhuanpiao_heji_11_xiaoshoue) {
	this.zhuanpiao_heji_11_xiaoshoue=zhuanpiao_heji_11_xiaoshoue;
}

public Double getZhuanpiao_heji_11_xiaoshoue () {
return this.zhuanpiao_heji_11_xiaoshoue;
}

public void setZhuanpiao_heji_11_xiaoxiangshuie (Double zhuanpiao_heji_11_xiaoxiangshuie) {
	this.zhuanpiao_heji_11_xiaoxiangshuie=zhuanpiao_heji_11_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_11_xiaoxiangshuie () {
return this.zhuanpiao_heji_11_xiaoxiangshuie;
}

public void setZhuanpiao_heji_11_xiaoji (Double zhuanpiao_heji_11_xiaoji) {
	this.zhuanpiao_heji_11_xiaoji=zhuanpiao_heji_11_xiaoji;
}

public Double getZhuanpiao_heji_11_xiaoji () {
return this.zhuanpiao_heji_11_xiaoji;
}

public void setZhuanpiao_heji_3_xiaoshoue (Double zhuanpiao_heji_3_xiaoshoue) {
	this.zhuanpiao_heji_3_xiaoshoue=zhuanpiao_heji_3_xiaoshoue;
}

public Double getZhuanpiao_heji_3_xiaoshoue () {
return this.zhuanpiao_heji_3_xiaoshoue;
}

public void setZhuanpiao_heji_3_xiaoxiangshuie (Double zhuanpiao_heji_3_xiaoxiangshuie) {
	this.zhuanpiao_heji_3_xiaoxiangshuie=zhuanpiao_heji_3_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_3_xiaoxiangshuie () {
return this.zhuanpiao_heji_3_xiaoxiangshuie;
}

public void setZhuanpiao_heji_3_xiaoji (Double zhuanpiao_heji_3_xiaoji) {
	this.zhuanpiao_heji_3_xiaoji=zhuanpiao_heji_3_xiaoji;
}

public Double getZhuanpiao_heji_3_xiaoji () {
return this.zhuanpiao_heji_3_xiaoji;
}

public void setZhuanpiao_heji_17huowu_xiaoshoue (Double zhuanpiao_heji_17huowu_xiaoshoue) {
	this.zhuanpiao_heji_17huowu_xiaoshoue=zhuanpiao_heji_17huowu_xiaoshoue;
}

public Double getZhuanpiao_heji_17huowu_xiaoshoue () {
return this.zhuanpiao_heji_17huowu_xiaoshoue;
}

public void setZhuanpiao_heji_17huowu_xiaoxiangshuie (Double zhuanpiao_heji_17huowu_xiaoxiangshuie) {
	this.zhuanpiao_heji_17huowu_xiaoxiangshuie=zhuanpiao_heji_17huowu_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_17huowu_xiaoxiangshuie () {
return this.zhuanpiao_heji_17huowu_xiaoxiangshuie;
}

public void setZhuanpiao_heji_17huowu_xiaoji (Double zhuanpiao_heji_17huowu_xiaoji) {
	this.zhuanpiao_heji_17huowu_xiaoji=zhuanpiao_heji_17huowu_xiaoji;
}

public Double getZhuanpiao_heji_17huowu_xiaoji () {
return this.zhuanpiao_heji_17huowu_xiaoji;
}

public void setZhuanpiao_heji_17fuwu_xiaoshoue (Double zhuanpiao_heji_17fuwu_xiaoshoue) {
	this.zhuanpiao_heji_17fuwu_xiaoshoue=zhuanpiao_heji_17fuwu_xiaoshoue;
}

public Double getZhuanpiao_heji_17fuwu_xiaoshoue () {
return this.zhuanpiao_heji_17fuwu_xiaoshoue;
}

public void setZhuanpiao_heji_17fuwu_xiaoxiangshuie (Double zhuanpiao_heji_17fuwu_xiaoxiangshuie) {
	this.zhuanpiao_heji_17fuwu_xiaoxiangshuie=zhuanpiao_heji_17fuwu_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_17fuwu_xiaoxiangshuie () {
return this.zhuanpiao_heji_17fuwu_xiaoxiangshuie;
}

public void setZhuanpiao_heji_17fuwu_xiaoji (Double zhuanpiao_heji_17fuwu_xiaoji) {
	this.zhuanpiao_heji_17fuwu_xiaoji=zhuanpiao_heji_17fuwu_xiaoji;
}

public Double getZhuanpiao_heji_17fuwu_xiaoji () {
return this.zhuanpiao_heji_17fuwu_xiaoji;
}

public void setZhuanpiao_heji_13_xiaoshoue (Double zhuanpiao_heji_13_xiaoshoue) {
	this.zhuanpiao_heji_13_xiaoshoue=zhuanpiao_heji_13_xiaoshoue;
}

public Double getZhuanpiao_heji_13_xiaoshoue () {
return this.zhuanpiao_heji_13_xiaoshoue;
}

public void setZhuanpiao_heji_13_xiaoxiangshuie (Double zhuanpiao_heji_13_xiaoxiangshuie) {
	this.zhuanpiao_heji_13_xiaoxiangshuie=zhuanpiao_heji_13_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_13_xiaoxiangshuie () {
return this.zhuanpiao_heji_13_xiaoxiangshuie;
}

public void setZhuanpiao_heji_13_xiaoji (Double zhuanpiao_heji_13_xiaoji) {
	this.zhuanpiao_heji_13_xiaoji=zhuanpiao_heji_13_xiaoji;
}

public Double getZhuanpiao_heji_13_xiaoji () {
return this.zhuanpiao_heji_13_xiaoji;
}

public void setZhuanpiao_heji_6_xiaoshoue (Double zhuanpiao_heji_6_xiaoshoue) {
	this.zhuanpiao_heji_6_xiaoshoue=zhuanpiao_heji_6_xiaoshoue;
}

public Double getZhuanpiao_heji_6_xiaoshoue () {
return this.zhuanpiao_heji_6_xiaoshoue;
}

public void setZhuanpiao_heji_6_xiaoxiangshuie (Double zhuanpiao_heji_6_xiaoxiangshuie) {
	this.zhuanpiao_heji_6_xiaoxiangshuie=zhuanpiao_heji_6_xiaoxiangshuie;
}

public Double getZhuanpiao_heji_6_xiaoxiangshuie () {
return this.zhuanpiao_heji_6_xiaoxiangshuie;
}

public void setZhuanpiao_heji_6_xiaoji (Double zhuanpiao_heji_6_xiaoji) {
	this.zhuanpiao_heji_6_xiaoji=zhuanpiao_heji_6_xiaoji;
}

public Double getZhuanpiao_heji_6_xiaoji () {
return this.zhuanpiao_heji_6_xiaoji;
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
	String shenheriqi = "";
	if(this.shenheriqi != null) {
		shenheriqi  = dateFormat.format(this.shenheriqi);
	}
return shenheriqi;
}

public void setTianbiaoriqi (Timestamp tianbiaoriqi) {
		this.tianbiaoriqi=tianbiaoriqi;
}

public String getTianbiaoriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String tianbiaoriqi = "";
	if(this.tianbiaoriqi != null) {
		tianbiaoriqi  = dateFormat.format(this.tianbiaoriqi);
	}
return tianbiaoriqi;
}

public void setFuheren (String fuheren) {
this.fuheren=fuheren;
}

public String getFuheren () {
return this.fuheren;
}

public void setKaipiaoshenqingdan_id (Long kaipiaoshenqingdan_id) {
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public Long getKaipiaoshenqingdan_id () {
return this.kaipiaoshenqingdan_id;
}


}
