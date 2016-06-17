package com.wisdom.common.model;import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XiangMuTaiZhang implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public XiangMuTaiZhang() {}
private Long id;
private String fengongsimingcheng;
private String xiangmubu;
private String danweimingcheng;
private String fadingdaibiaoren_lianxidianhua;
private String nashuirenshibiehao;
private String kaihuyinhang_yinhangzhanghao;
private String danweidizhi_lianxidianhua;
private String xiangmumingcheng;
private String xiangmufuzeren_lianxidianhua;
private String hetongleixing;
private String nashuileixing;
private String shuilv;
private String zhengshoulv;
private Double buhanshuijine;
private Double shuie;
private Double hejijine;
private Double juesuanjine;
private Double yujihetongzongchengben;
private Timestamp hetongqiandingshijian;
private Timestamp hetongkaigongshijian;
private Timestamp kaigongxukezhengshijian;
private Timestamp yujiwangongshijian;
private String hetongfukuanfangshi;
private String hetongwenjian;
private Long company_id;
public XiangMuTaiZhang(Long id, String fengongsimingcheng, String xiangmubu, String danweimingcheng, String fadingdaibiaoren_lianxidianhua, String nashuirenshibiehao, String kaihuyinhang_yinhangzhanghao, String danweidizhi_lianxidianhua, String xiangmumingcheng, String xiangmufuzeren_lianxidianhua, String hetongleixing, String nashuileixing, String shuilv, String zhengshoulv, Double buhanshuijine, Double shuie, Double hejijine, Double juesuanjine, Double yujihetongzongchengben, Timestamp hetongqiandingshijian, Timestamp hetongkaigongshijian, Timestamp kaigongxukezhengshijian, Timestamp yujiwangongshijian, String hetongfukuanfangshi, Long company_id, String hetongwenjian) {
this.id=id;
this.fengongsimingcheng=fengongsimingcheng;
this.xiangmubu=xiangmubu;
this.danweimingcheng=danweimingcheng;
this.fadingdaibiaoren_lianxidianhua=fadingdaibiaoren_lianxidianhua;
this.nashuirenshibiehao=nashuirenshibiehao;
this.kaihuyinhang_yinhangzhanghao=kaihuyinhang_yinhangzhanghao;
this.danweidizhi_lianxidianhua=danweidizhi_lianxidianhua;
this.xiangmumingcheng=xiangmumingcheng;
this.xiangmufuzeren_lianxidianhua=xiangmufuzeren_lianxidianhua;
this.hetongleixing=hetongleixing;
this.nashuileixing=nashuileixing;
this.shuilv=shuilv;
this.zhengshoulv=zhengshoulv;
this.buhanshuijine=buhanshuijine;
this.shuie=shuie;
this.hejijine=hejijine;
this.juesuanjine=juesuanjine;
this.yujihetongzongchengben=yujihetongzongchengben;
this.hetongqiandingshijian=hetongqiandingshijian;
this.hetongkaigongshijian=hetongkaigongshijian;
this.kaigongxukezhengshijian=kaigongxukezhengshijian;
this.yujiwangongshijian=yujiwangongshijian;
this.hetongfukuanfangshi=hetongfukuanfangshi;
this.company_id=company_id;
this.hetongwenjian = hetongwenjian;
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

public void setDanweimingcheng (String danweimingcheng) {
this.danweimingcheng=danweimingcheng;
}

public String getDanweimingcheng () {
return this.danweimingcheng;
}

public void setFadingdaibiaoren_lianxidianhua (String fadingdaibiaoren_lianxidianhua) {
this.fadingdaibiaoren_lianxidianhua=fadingdaibiaoren_lianxidianhua;
}

public String getFadingdaibiaoren_lianxidianhua () {
return this.fadingdaibiaoren_lianxidianhua;
}

public void setNashuirenshibiehao (String nashuirenshibiehao) {
this.nashuirenshibiehao=nashuirenshibiehao;
}

public String getNashuirenshibiehao () {
return this.nashuirenshibiehao;
}

public void setKaihuyinhang_yinhangzhanghao (String kaihuyinhang_yinhangzhanghao) {
this.kaihuyinhang_yinhangzhanghao=kaihuyinhang_yinhangzhanghao;
}

public String getKaihuyinhang_yinhangzhanghao () {
return this.kaihuyinhang_yinhangzhanghao;
}

public void setDanweidizhi_lianxidianhua (String danweidizhi_lianxidianhua) {
this.danweidizhi_lianxidianhua=danweidizhi_lianxidianhua;
}

public String getDanweidizhi_lianxidianhua () {
return this.danweidizhi_lianxidianhua;
}

public void setXiangmumingcheng (String xiangmumingcheng) {
this.xiangmumingcheng=xiangmumingcheng;
}

public String getXiangmumingcheng () {
return this.xiangmumingcheng;
}

public void setXiangmufuzeren_lianxidianhua (String xiangmufuzeren_lianxidianhua) {
this.xiangmufuzeren_lianxidianhua=xiangmufuzeren_lianxidianhua;
}

public String getXiangmufuzeren_lianxidianhua () {
return this.xiangmufuzeren_lianxidianhua;
}

public void setHetongleixing (String hetongleixing) {
this.hetongleixing=hetongleixing;
}

public String getHetongleixing () {
return this.hetongleixing;
}

public void setNashuileixing (String nashuileixing) {
this.nashuileixing=nashuileixing;
}

public String getNashuileixing () {
return this.nashuileixing;
}

public void setShuilv (String shuilv) {
this.shuilv=shuilv;
}

public String getShuilv () {
return this.shuilv;
}

public void setZhengshoulv (String zhengshoulv) {
this.zhengshoulv=zhengshoulv;
}

public String getZhengshoulv () {
return this.zhengshoulv;
}

public void setBuhanshuijine (Double buhanshuijine) {
	this.buhanshuijine=buhanshuijine;
}

public Double getBuhanshuijine () {
return this.buhanshuijine;
}

public void setShuie (Double shuie) {
	this.shuie=shuie;
}

public Double getShuie () {
return this.shuie;
}

public void setHejijine (Double hejijine) {
	this.hejijine=hejijine;
}

public Double getHejijine () {
return this.hejijine;
}

public void setJuesuanjine (Double juesuanjine) {
	this.juesuanjine=juesuanjine;
}

public Double getJuesuanjine () {
return this.juesuanjine;
}

public void setYujihetongzongchengben (Double yujihetongzongchengben) {
	this.yujihetongzongchengben=yujihetongzongchengben;
}

public Double getYujihetongzongchengben () {
return this.yujihetongzongchengben;
}

public void setHetongqiandingshijian (Timestamp hetongqiandingshijian) {
		this.hetongqiandingshijian=hetongqiandingshijian;
}

public String getHetongqiandingshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String hetongqiandingshijian = "";
	if(this.hetongqiandingshijian != null) {
		hetongqiandingshijian  = dateFormat.format(this.hetongqiandingshijian);
	}
return hetongqiandingshijian;
	//return this.hetongqiandingshijian;
}

public void setHetongkaigongshijian (Timestamp hetongkaigongshijian) {
		this.hetongkaigongshijian=hetongkaigongshijian;
}

public String getHetongkaigongshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String rq = "";
	if(this.hetongfukuanfangshi != null) {
		rq  = dateFormat.format(this.hetongkaigongshijian);
	}
return rq;
}

public void setKaigongxukezhengshijian (Timestamp kaigongxukezhengshijian) {
		this.kaigongxukezhengshijian=kaigongxukezhengshijian;
}

public String getKaigongxukezhengshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String hetongqiandingshijian = "";
	if(this.kaigongxukezhengshijian != null) {
		hetongqiandingshijian  = dateFormat.format(this.kaigongxukezhengshijian);
	}
	return hetongqiandingshijian;
}

public void setYujiwangongshijian (Timestamp yujiwangongshijian) {
		this.yujiwangongshijian=yujiwangongshijian;
}

public String getYujiwangongshijian () {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String hetongqiandingshijian = "";
	if(this.yujiwangongshijian != null) {
		hetongqiandingshijian  = dateFormat.format(this.yujiwangongshijian);
	}
return hetongqiandingshijian;
}

public void setHetongfukuanfangshi (String hetongfukuanfangshi) {
this.hetongfukuanfangshi=hetongfukuanfangshi;
}

public String getHetongfukuanfangshi () {
return this.hetongfukuanfangshi;
}

public void setCompany_id (Long company_id) {
this.company_id=company_id;
}

public Long getCompany_id () {
return this.company_id;
}

public String getHetongwenjian() {
	return hetongwenjian;
}

public void setHetongwenjian(String hetongwenjian) {
	this.hetongwenjian = hetongwenjian;
}


}
