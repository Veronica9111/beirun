package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class QueRenShouRuFangShi_LaoWuShiJianZhanBiFa implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public QueRenShouRuFangShi_LaoWuShiJianZhanBiFa() {}
private Long id;
private Timestamp shenqingriqi;
private String gongsimingcheng;
private String xiangmubu;
private Timestamp yifashengshijian;
private Timestamp yujizongshijian;
private String bili;
private Double hetongjine;
private Double suodeshuiyingquerenshouru;
private Double yiquerenshouru;
private Double weiquerenshouru;
private String tianbiaoren;
private String shenheren;
private String tianbiaorendianhua;
private String shenherendianhua;
private String tianbiaoriqi;
private String xiangmumingcheng;
private String shenheriqi;
private String fuheren;
private Long kaipiaoshenqingdan_id;
public QueRenShouRuFangShi_LaoWuShiJianZhanBiFa(Long id, Timestamp shenqingriqi, String gongsimingcheng, String xiangmubu, Timestamp yifashengshijian, Timestamp yujizongshijian, String bili, Double hetongjine, Double suodeshuiyingquerenshouru, Double yiquerenshouru, Double weiquerenshouru, String tianbiaoren, String shenheren, String tianbiaorendianhua, String shenherendianhua, String tianbiaoriqi, String xiangmumingcheng, String shenheriqi, String fuheren, Long kaipiaoshenqingdan_id) {
this.id=id;
this.shenqingriqi=shenqingriqi;
this.gongsimingcheng=gongsimingcheng;
this.xiangmubu=xiangmubu;
this.yifashengshijian=yifashengshijian;
this.yujizongshijian=yujizongshijian;
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
this.xiangmumingcheng=xiangmumingcheng;
this.shenheriqi=shenheriqi;
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

public void setYifashengshijian (Timestamp yifashengshijian) {
		this.yifashengshijian=yifashengshijian;
}

public String getYifashengshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String yifashengshijian = "";
	if(this.yifashengshijian != null) {
		yifashengshijian  = dateFormat.format(this.yifashengshijian);
	}

    return yifashengshijian;

}

public void setYujizongshijian (Timestamp yujizongshijian) {
		this.yujizongshijian=yujizongshijian;
}

public String getYujizongshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String yujizongshijian = "";
	if(this.yujizongshijian != null) {
		yujizongshijian  = dateFormat.format(this.yujizongshijian);
	}

    return yujizongshijian;

}

public void setBili (String bili) {
this.bili=bili;
}

public String getBili () {
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

public void setWeiquerenshouru (Double weiquerenshouru) {
	this.weiquerenshouru=weiquerenshouru;
}

public Double getWeiquerenshouru () {
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

public void setTianbiaoriqi (String tianbiaoriqi) {
this.tianbiaoriqi=tianbiaoriqi;
}

public String getTianbiaoriqi () {
return this.tianbiaoriqi;
}

public void setXiangmumingcheng (String xiangmumingcheng) {
this.xiangmumingcheng=xiangmumingcheng;
}

public String getXiangmumingcheng () {
return this.xiangmumingcheng;
}

public void setShenheriqi (String shenheriqi) {
this.shenheriqi=shenheriqi;
}

public String getShenheriqi () {
return this.shenheriqi;
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
