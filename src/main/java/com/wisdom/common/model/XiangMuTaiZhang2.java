package com.wisdom.common.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XiangMuTaiZhang2 implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
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
    private Integer company_id;




 
    public XiangMuTaiZhang2() {
        super();
    }
 
    public XiangMuTaiZhang2(Integer id,String fengongsimingcheng,String xiangmubu,String danweimingcheng,String fadingdaibiaoren_lianxidianhua,String nashuirenshibiehao,String kaihuyinhang_yinhangzhanghao,String danweidizhi_lianxidianhua,String xiangmumingcheng,String xiangmufuzeren_lianxidianhua,String hetongleixing,String shuilv,String zhengshoulv,Double buhanshuijine,Double shuie,Double hejijine,Double juesuanjine,Double yujihetongzongchengben,Timestamp hetongqiandingshijian,Timestamp hetongkaigongshijian,Timestamp kaigongxukezhengshijian,Timestamp yujiwangongshijian,String hetongfukuanfangshi, Integer company_id) {
        super();
        this.id = id;
        this.fengongsimingcheng = fengongsimingcheng;
        this.xiangmubu = xiangmubu;
        this.danweimingcheng = danweimingcheng;
        this.fadingdaibiaoren_lianxidianhua = fadingdaibiaoren_lianxidianhua;
        this.nashuirenshibiehao = nashuirenshibiehao;
        this.kaihuyinhang_yinhangzhanghao = kaihuyinhang_yinhangzhanghao;
        this.danweidizhi_lianxidianhua = danweidizhi_lianxidianhua;
        this.xiangmumingcheng = xiangmumingcheng;
        this.xiangmufuzeren_lianxidianhua = xiangmufuzeren_lianxidianhua;
        this.hetongleixing = hetongleixing;
        this.shuilv = shuilv;
        this.zhengshoulv = zhengshoulv;
        this.buhanshuijine = buhanshuijine;
        this.shuie = shuie;
        this.hejijine = hejijine;
        this.juesuanjine = juesuanjine;
        this.yujihetongzongchengben = yujihetongzongchengben;
        this.hetongqiandingshijian = hetongqiandingshijian;
        this.hetongkaigongshijian = hetongkaigongshijian;
        this.kaigongxukezhengshijian = kaigongxukezhengshijian;
        this.yujiwangongshijian = yujiwangongshijian;
        this.hetongfukuanfangshi= hetongfukuanfangshi;
        this.company_id = company_id;



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

	public String getDanweimingcheng() {
		return danweimingcheng;
	}

	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}

	public String getFadingdaibiaoren_lianxidianhua() {
		return fadingdaibiaoren_lianxidianhua;
	}

	public void setFadingdaibiaoren_lianxidianhua(String fadingdaibiaoren_lianxidianhua) {
		this.fadingdaibiaoren_lianxidianhua = fadingdaibiaoren_lianxidianhua;
	}

	public String getNashuirenshibiehao() {
		return nashuirenshibiehao;
	}

	public void setNashuirenshibiehao(String nashuirenshibiehao) {
		this.nashuirenshibiehao = nashuirenshibiehao;
	}

	public String getKaihuyinhang_yinhangzhanghao() {
		return kaihuyinhang_yinhangzhanghao;
	}

	public void setKaihuyinhang_yinhangzhanghao(String kaihuyinhang_yinhangzhanghao) {
		this.kaihuyinhang_yinhangzhanghao = kaihuyinhang_yinhangzhanghao;
	}

	public String getDanweidizhi_lianxidianhua() {
		return danweidizhi_lianxidianhua;
	}

	public void setDanweidizhi_lianxidianhua(String danweidizhi_lianxidianhua) {
		this.danweidizhi_lianxidianhua = danweidizhi_lianxidianhua;
	}

	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}

	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}

	public String getXiangmufuzeren_lianxidianhua() {
		return xiangmufuzeren_lianxidianhua;
	}

	public void setXiangmufuzeren_lianxidianhua(String xiangmufuzeren_lianxidianhua) {
		this.xiangmufuzeren_lianxidianhua = xiangmufuzeren_lianxidianhua;
	}

	public String getHetongleixing() {
		return hetongleixing;
	}

	public void setHetongleixing(String hetongleixing) {
		this.hetongleixing = hetongleixing;
	}

	public String getShuilv() {
		return shuilv;
	}

	public void setShuilv(String shuilv) {
		this.shuilv = shuilv;
	}

	public String getZhengshoulv() {
		return zhengshoulv;
	}

	public void setZhengshoulv(String zhengshoulv) {
		this.zhengshoulv = zhengshoulv;
	}

	public Double getBuhanshuijine() {
		return buhanshuijine;
	}

	public void setBuhanshuijine(Double buhanshuijine) {
		this.buhanshuijine = buhanshuijine;
	}

	public Double getShuie() {
		return shuie;
	}

	public void setShuie(Double shuie) {
		this.shuie = shuie;
	}

	public Double getHejijine() {
		return hejijine;
	}

	public void setHejijine(Double hejijine) {
		this.hejijine = hejijine;
	}

	public Double getJuesuanjine() {
		return juesuanjine;
	}

	public void setJuesuanjine(Double juesuanjine) {
		this.juesuanjine = juesuanjine;
	}

	public Double getYujihetongzongchengben() {
		return yujihetongzongchengben;
	}

	public void setYujihetongzongchengben(Double yujihetongzongchengben) {
		this.yujihetongzongchengben = yujihetongzongchengben;
	}

	public String getHetongqiandingshijian() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String hetongqiandingshijian  = dateFormat.format(new Date());
		return hetongqiandingshijian;
	}

	public void setHetongqiandingshijian(Timestamp hetongqiandingshijian) {
		this.hetongqiandingshijian = hetongqiandingshijian;
	}

	public String getHetongkaigongshijian() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String hetongkaigongshijian  = dateFormat.format(new Date());
		return hetongkaigongshijian;
	}

	public void setHetongkaigongshijian(Timestamp hetongkaigongshijian) {
		this.hetongkaigongshijian = hetongkaigongshijian;
	}

	public String getKaigongxukezhengshijian() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String kaigongxukezhengshijian  = dateFormat.format(new Date());
		return kaigongxukezhengshijian;
	}

	public void setKaigongxukezhengshijian(Timestamp kaigongxukezhengshijian) {
		this.kaigongxukezhengshijian = kaigongxukezhengshijian;
	}

	public String getYujiwangongshijian() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String yujiwangongshijian  = dateFormat.format(new Date());
		return yujiwangongshijian;
	}

	public void setYujiwangongshijian(Timestamp yujiwangongshijian) {
		this.yujiwangongshijian = yujiwangongshijian;
	}

	public String getHetongfukuanfangshi() {
		return hetongfukuanfangshi;
	}

	public void setHetongfukuanfangshi(String hetongfukuanfangshi) {
		this.hetongfukuanfangshi = hetongfukuanfangshi;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
    
    
    
    
 

}
