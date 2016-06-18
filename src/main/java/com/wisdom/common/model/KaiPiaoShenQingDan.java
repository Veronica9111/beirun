package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KaiPiaoShenQingDan implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public KaiPiaoShenQingDan() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private String xiangmumingcheng;
private String hetongzongjine;
private Timestamp shenqingriqi;
private Double kaijufapiao;
private Double shouqikuanxiang;
private String wangongjindu;
private Double qita;
private String kaipiaoneirong;
private String tianbiaoren;
private String tianbiaorendianhua;
private Timestamp tianbiaoriqi;
private Long kaipiaoqingkuangbiao_xiangmu_id;
private String fuheren;
private String fapiaowenjian;
private Double fenbaoxiangmu;
public KaiPiaoShenQingDan(Long id, String fengongsimingcheng, String xiangmubu, String xiangmumingcheng, String hetongzongjine, Timestamp shenqingriqi, Double kaijufapiao, Double shouqikuanxiang, String wangongjindu, Double qita, String kaipiaoneirong, String tianbiaoren, String tianbiaorendianhua, Timestamp tianbiaoriqi, Long kaipiaoqingkuangbiao_xiangmu_id, String fuheren, String fapiaowenjian, Double fenbaoxiangmu) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.xiangmumingcheng=xiangmumingcheng;
this.hetongzongjine=hetongzongjine;
this.shenqingriqi=shenqingriqi;
this.kaijufapiao=kaijufapiao;
this.shouqikuanxiang=shouqikuanxiang;
this.wangongjindu=wangongjindu;
this.qita=qita;
this.kaipiaoneirong=kaipiaoneirong;
this.tianbiaoren=tianbiaoren;
this.tianbiaorendianhua=tianbiaorendianhua;
this.tianbiaoriqi=tianbiaoriqi;
this.kaipiaoqingkuangbiao_xiangmu_id=kaipiaoqingkuangbiao_xiangmu_id;
this.fuheren=fuheren;
this.fapiaowenjian = fapiaowenjian;
this.fenbaoxiangmu = fenbaoxiangmu;
}

public Double getFenbaoxiangmu() {
	return fenbaoxiangmu;
}

public void setFenbaoxiangmu(Double fenbaoxiangmu) {
	this.fenbaoxiangmu = fenbaoxiangmu;
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

public void setXiangmumingcheng (String xiangmumingcheng) {
this.xiangmumingcheng=xiangmumingcheng;
}

public String getXiangmumingcheng () {
return this.xiangmumingcheng;
}

public void setHetongzongjine (String hetongzongjine) {
this.hetongzongjine=hetongzongjine;
}

public String getHetongzongjine () {
return this.hetongzongjine;
}

public void setShenqingriqi (Timestamp shenqingriqi) {
		this.shenqingriqi=shenqingriqi;
}

public String getShenqingriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String rq = "";
	if(this.shenqingriqi != null) {
		rq  = dateFormat.format(this.shenqingriqi);
	}
return rq;
}

public void setKaijufapiao (Double kaijufapiao) {
	this.kaijufapiao=kaijufapiao;
}

public Double getKaijufapiao () {
return this.kaijufapiao;
}

public void setShouqikuanxiang (Double shouqikuanxiang) {
	this.shouqikuanxiang=shouqikuanxiang;
}

public Double getShouqikuanxiang () {
return this.shouqikuanxiang;
}

public void setWangongjindu (String wangongjindu) {
this.wangongjindu=wangongjindu;
}

public String getWangongjindu () {
return this.wangongjindu;
}

public void setQita (Double qita) {
	this.qita=qita;
}

public Double getQita () {
return this.qita;
}

public void setKaipiaoneirong (String kaipiaoneirong) {
this.kaipiaoneirong=kaipiaoneirong;
}

public String getKaipiaoneirong () {
return this.kaipiaoneirong;
}

public void setTianbiaoren (String tianbiaoren) {
this.tianbiaoren=tianbiaoren;
}

public String getTianbiaoren () {
return this.tianbiaoren;
}

public void setTianbiaorendianhua (String tianbiaorendianhua) {
this.tianbiaorendianhua=tianbiaorendianhua;
}

public String getTianbiaorendianhua () {
return this.tianbiaorendianhua;
}

public void setTianbiaoriqi (Timestamp tianbiaoriqi) {
		this.tianbiaoriqi=tianbiaoriqi;
}

public String getTianbiaoriqi () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String rq = "";
	if(this.tianbiaoriqi != null) {
		rq  = dateFormat.format(this.tianbiaoriqi);
	}
return rq;
}

public void setKaipiaoqingkuangbiao_xiangmu_id (Long kaipiaoqingkuangbiao_xiangmu_id) {
this.kaipiaoqingkuangbiao_xiangmu_id=kaipiaoqingkuangbiao_xiangmu_id;
}

public Long getKaipiaoqingkuangbiao_xiangmu_id () {
return this.kaipiaoqingkuangbiao_xiangmu_id;
}

public void setFuheren (String fuheren) {
this.fuheren=fuheren;
}

public String getFuheren () {
return this.fuheren;
}

public String getFapiaowenjian() {
	return fapiaowenjian;
}

public void setFapiaowenjian(String fapiaowenjian) {
	this.fapiaowenjian = fapiaowenjian;
}


}
