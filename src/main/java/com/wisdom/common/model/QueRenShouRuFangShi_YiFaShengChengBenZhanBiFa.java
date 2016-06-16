package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa() {}
private Long id;
private Timestamp shenqingriqi;
private Double leijiyifashengchengben;
private Double yujizongchengben;
private Double bili;
private Double hetongjine;
private Double suodeshuiyingquerenshouru;
private Double yiquerenshouru;
private String weiquerenshouru;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private Timestamp tianbiaoriqi;
private Timestamp shenheriqi;
private String fengongsimingcheng;
private String xiangmubu;
private String xiangmumingcheng;
private String fuheren;
private Long kaipiaoshenqingdan_id;
public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(Long id, Timestamp shenqingriqi, Double leijiyifashengchengben, Double yujizongchengben, Double bili, Double hetongjine, Double suodeshuiyingquerenshouru, Double yiquerenshouru, String weiquerenshouru, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, Timestamp tianbiaoriqi, Timestamp shenheriqi, String fengongsimingcheng, String xiangmubu, String xiangmumingcheng, String fuheren, Long kaipiaoshenqingdan_id) {
this.id=id;
this.shenqingriqi=shenqingriqi;
this.leijiyifashengchengben=leijiyifashengchengben;
this.yujizongchengben=yujizongchengben;
this.bili=bili;
this.hetongjine=hetongjine;
this.suodeshuiyingquerenshouru=suodeshuiyingquerenshouru;
this.yiquerenshouru=yiquerenshouru;
this.weiquerenshouru=weiquerenshouru;
this.tianbiaoren=tianbiaoren;
this.shenheren=shenheren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.shenherendianhua=shenherendianhua;
this.tianbiaoriqi=tianbiaoriqi;
this.shenheriqi=shenheriqi;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
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

public void setLeijiyifashengchengben (Double leijiyifashengchengben) {
	this.leijiyifashengchengben=leijiyifashengchengben;
}

public Double getLeijiyifashengchengben () {
return this.leijiyifashengchengben;
}

public void setYujizongchengben (Double yujizongchengben) {
	this.yujizongchengben=yujizongchengben;
}

public Double getYujizongchengben () {
return this.yujizongchengben;
}

public void setBili (Double bili) {
	this.bili=bili;
}

public Double getBili () {
return this.bili;
}

public void setHetongjine (Double hetongjine) {
	this.hetongjine=hetongjine;
}

public Double getHetongjine () {
return this.hetongjine;
}

public void setSuodeshuiyingquerenshouru (Double suodeshuiyingquerenshouru) {
	this.suodeshuiyingquerenshouru=suodeshuiyingquerenshouru;
}

public Double getSuodeshuiyingquerenshouru () {
return this.suodeshuiyingquerenshouru;
}

public void setYiquerenshouru (Double yiquerenshouru) {
	this.yiquerenshouru=yiquerenshouru;
}

public Double getYiquerenshouru () {
return this.yiquerenshouru;
}

public void setWeiquerenshouru (String weiquerenshouru) {
this.weiquerenshouru=weiquerenshouru;
}

public String getWeiquerenshouru () {
return this.weiquerenshouru;
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
	String tianbiaoriqi = "";
	if(this.tianbiaoriqi != null) {
		tianbiaoriqi  = dateFormat.format(this.tianbiaoriqi);
	}

    return tianbiaoriqi;

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
