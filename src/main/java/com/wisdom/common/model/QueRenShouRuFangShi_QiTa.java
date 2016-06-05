package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class QueRenShouRuFangShi_QiTa implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public QueRenShouRuFangShi_QiTa() {}
private Long id;
private String gongsimingcheng;
private String xiangmubu;
private Timestamp shenqingriqi;
private Double fashengjine;
private Double yujizonge;
private Double bili;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoriqi;
private Timestamp shenheriqi;
private String xiangmumingcheng;
private String fuheren;
private Long kaipiaoshenqingdan_id;
public QueRenShouRuFangShi_QiTa(Long id, String gongsimingcheng, String xiangmubu, Timestamp shenqingriqi, Double fashengjine, Double yujizonge, Double bili, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoriqi, Timestamp shenheriqi, String xiangmumingcheng, String fuheren, Long kaipiaoshenqingdan_id) {
this.id=id;
this.gongsimingcheng=gongsimingcheng;
this.xiangmubu=xiangmubu;
this.shenqingriqi=shenqingriqi;
this.fashengjine=fashengjine;
this.yujizonge=yujizonge;
this.bili=bili;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoriqi=tianbiaoriqi;
this.shenheriqi=shenheriqi;
this.xiangmumingcheng=xiangmumingcheng;
this.fuheren=fuheren;
this.kaipiaoshenqingdan_id=kaipiaoshenqingdan_id;
}

public void setId (Long id) {
this.id=id;
}

public Long getId () {
return this.id;
}

public void setGongsimingcheng (String gongsimingcheng) {
this.gongsimingcheng=gongsimingcheng;
}

public String getGongsimingcheng () {
return this.gongsimingcheng;
}

public void setXiangmubu (String xiangmubu) {
this.xiangmubu=xiangmubu;
}

public String getXiangmubu () {
return this.xiangmubu;
}

public void setShenqingriqi (Timestamp shenqingriqi) {
		this.shenqingriqi=shenqingriqi;
}

public String getShenqingriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String shenqingriqi = "";
	if(this.shenqingriqi != null) {
		shenqingriqi  = dateFormat.format(this.shenqingriqi);
	}

return shenqingriqi;
}

public void setFashengjine (Double fashengjine) {
	this.fashengjine=fashengjine;
}

public Double getFashengjine () {
return this.fashengjine;
}

public void setYujizonge (Double yujizonge) {
	this.yujizonge=yujizonge;
}

public Double getYujizonge () {
return this.yujizonge;
}

public void setBili (Double bili) {
	this.bili=bili;
}

public Double getBili () {
return this.bili;
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

public Timestamp getTianbiaoriqi () {
return this.tianbiaoriqi;
}

public void setShenheriqi (Timestamp shenheriqi) {
		this.shenheriqi=shenheriqi;
}

public Timestamp getShenheriqi () {
return this.shenheriqi;
}

public void setXiangmumingcheng (String xiangmumingcheng) {
this.xiangmumingcheng=xiangmumingcheng;
}

public String getXiangmumingcheng () {
return this.xiangmumingcheng;
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
