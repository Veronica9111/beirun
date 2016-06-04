package com.wisdom.common.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class KaiPiaoShenQingDan implements Serializable {
    
     private static final long serialVersionUID = 1L;
     private Integer id;
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
	private Integer xiangmutaizhang_id;
   
   public KaiPiaoShenQingDan() {
       super();
   }
   
   public KaiPiaoShenQingDan(Integer id,String fengongsimingcheng,String xiangmubu,String xiangmumingcheng,String hetongzongjine,Timestamp shenqingriqi,Double kaijufapiao,Double shouqikuanxiang,String wangongjindu,Double qita,String kaipiaoneirong,String tianbiaoren,String tianbiaorendianhua,Timestamp tianbiaoriqi,Integer xiangmutaizhang_id){
   	super();
		this.id = id;
		this.fengongsimingcheng = fengongsimingcheng;
		this.xiangmubu = xiangmubu;
		this.xiangmumingcheng = xiangmumingcheng;
		this.hetongzongjine = hetongzongjine;
		this.shenqingriqi = shenqingriqi;
		this.kaijufapiao = kaijufapiao;
		this.shouqikuanxiang = shouqikuanxiang;
		this.wangongjindu = wangongjindu;
		this.qita = qita;
		this.kaipiaoneirong = kaipiaoneirong;
		this.tianbiaoren = tianbiaoren;
		this.tianbiaorendianhua = tianbiaorendianhua;
		this.tianbiaoriqi = tianbiaoriqi;
		this.xiangmutaizhang_id = xiangmutaizhang_id;
	}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFengongsimingcheng() {
	return fengongsimingcheng;
}

public void setFengongsimingcheng(String fengongsimingcheng) {
	this.fengongsimingcheng = fengongsimingcheng;
}

public String getXiangmubu() {
	return xiangmubu;
}

public void setXiangmubu(String xiangmubu) {
	this.xiangmubu = xiangmubu;
}

public String getXiangmumingcheng() {
	return xiangmumingcheng;
}

public void setXiangmumingcheng(String xiangmumingcheng) {
	this.xiangmumingcheng = xiangmumingcheng;
}

public String getHetongzongjine() {
	return hetongzongjine;
}

public void setHetongzongjine(String hetongzongjine) {
	this.hetongzongjine = hetongzongjine;
}

public Timestamp getShenqingriqi() {
	return shenqingriqi;
}

public void setShenqingriqi(Timestamp shenqingriqi) {
	this.shenqingriqi = shenqingriqi;
}

public Double getKaijufapiao() {
	return kaijufapiao;
}

public void setKaijufapiao(Double kaijufapiao) {
	this.kaijufapiao = kaijufapiao;
}

public Double getShouqikuanxiang() {
	return shouqikuanxiang;
}

public void setShouqikuanxiang(Double shouqikuanxiang) {
	this.shouqikuanxiang = shouqikuanxiang;
}

public String getWangongjindu() {
	return wangongjindu;
}

public void setWangongjindu(String wangongjindu) {
	this.wangongjindu = wangongjindu;
}

public Double getQita() {
	return qita;
}

public void setQita(Double qita) {
	this.qita = qita;
}

public String getKaipiaoneirong() {
	return kaipiaoneirong;
}

public void setKaipiaoneirong(String kaipiaoneirong) {
	this.kaipiaoneirong = kaipiaoneirong;
}

public String getTianbiaoren() {
	return tianbiaoren;
}

public void setTianbiaoren(String tianbiaoren) {
	this.tianbiaoren = tianbiaoren;
}

public String getTianbiaorendianhua() {
	return tianbiaorendianhua;
}

public void setTianbiaorendianhua(String tianbiaorendianhua) {
	this.tianbiaorendianhua = tianbiaorendianhua;
}

public Timestamp getTianbiaoriqi() {
	return tianbiaoriqi;
}

public void setTianbiaoriqi(Timestamp tianbiaoriqi) {
	this.tianbiaoriqi = tianbiaoriqi;
}

public Integer getXiangmutaizhang_id() {
	return xiangmutaizhang_id;
}

public void setXiangmutaizhang_id(Integer xiangmutaizhang_id) {
	this.xiangmutaizhang_id = xiangmutaizhang_id;
}


   
   
 }