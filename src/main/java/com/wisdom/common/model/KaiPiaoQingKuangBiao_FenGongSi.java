package com.wisdom.common.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class KaiPiaoQingKuangBiao_FenGongSi implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private String beizhu;
private Double hejijine;
private Double yikaipiaojine;
private String wangongjindu;
private Integer erji_shenhe_status;
private String yijishenheren;
private Double qita;
private Long company_id;
private Timestamp shengqingkaipiaoshijian;
private Integer yiji_shenhe_status;
private Double shuie;
private Double buhanshuijine;
private String erjishenheren;
private String erji_shenhe_beizhu;
private String yiji_shenhe_beizhu;
private Double shouqikuanxiang;
private Double kaijufapiao;
private Long id;
    public KaiPiaoQingKuangBiao_FenGongSi() {
        super();
    }

    public KaiPiaoQingKuangBiao_FenGongSi(String beizhu, Double hejijine, Double yikaipiaojine, String wangongjindu, Integer erji_shenhe_status, String yijishenheren, Double qita, Long company_id, Timestamp shengqingkaipiaoshijian, Integer yiji_shenhe_status, Double shuie, Double buhanshuijine, String erjishenheren, String erji_shenhe_beizhu, String yiji_shenhe_beizhu, Double shouqikuanxiang, Double kaijufapiao, Long id){
        this.beizhu = beizhu;
        this.hejijine = hejijine;
        this.yikaipiaojine = yikaipiaojine;
        this.wangongjindu = wangongjindu;
        this.erji_shenhe_status = erji_shenhe_status;
        this.yijishenheren = yijishenheren;
        this.qita = qita;
        this.company_id = company_id;
        this.shengqingkaipiaoshijian = shengqingkaipiaoshijian;
        this.yiji_shenhe_status = yiji_shenhe_status;
        this.shuie = shuie;
        this.buhanshuijine = buhanshuijine;
        this.erjishenheren = erjishenheren;
        this.erji_shenhe_beizhu = erji_shenhe_beizhu;
        this.yiji_shenhe_beizhu = yiji_shenhe_beizhu;
        this.shouqikuanxiang = shouqikuanxiang;
        this.kaijufapiao = kaijufapiao;
        this.id = id;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu){
        this.beizhu = beizhu;
    }

    public Double getHejijine() {
        return hejijine;
    }

    public void setHejijine(Double hejijine){
        this.hejijine = hejijine;
    }

    public Double getYikaipiaojine() {
        return yikaipiaojine;
    }

    public void setYikaipiaojine(Double yikaipiaojine){
        this.yikaipiaojine = yikaipiaojine;
    }

    public String getWangongjindu() {
        return wangongjindu;
    }

    public void setWangongjindu(String wangongjindu){
        this.wangongjindu = wangongjindu;
    }

    public Integer getErji_shenhe_status() {
        return erji_shenhe_status;
    }

    public void setErji_shenhe_status(Integer erji_shenhe_status){
        this.erji_shenhe_status = erji_shenhe_status;
    }

    public String getYijishenheren() {
        return yijishenheren;
    }

    public void setYijishenheren(String yijishenheren){
        this.yijishenheren = yijishenheren;
    }

    public Double getQita() {
        return qita;
    }

    public void setQita(Double qita){
        this.qita = qita;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id){
        this.company_id = company_id;
    }

    public String getShengqingkaipiaoshijian() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String shengqingkaipiaoshijian = "";
        if(this.shengqingkaipiaoshijian != null) {
            shengqingkaipiaoshijian = dateFormat.format(this.shengqingkaipiaoshijian);
        }
        return shengqingkaipiaoshijian;
    }

    public void setShengqingkaipiaoshijian(Timestamp shengqingkaipiaoshijian){
        this.shengqingkaipiaoshijian = shengqingkaipiaoshijian;
    }

    public Integer getYiji_shenhe_status() {
        return yiji_shenhe_status;
    }

    public void setYiji_shenhe_status(Integer yiji_shenhe_status){
        this.yiji_shenhe_status = yiji_shenhe_status;
    }

    public Double getShuie() {
        return shuie;
    }

    public void setShuie(Double shuie){
        this.shuie = shuie;
    }

    public Double getBuhanshuijine() {
        return buhanshuijine;
    }

    public void setBuhanshuijine(Double buhanshuijine){
        this.buhanshuijine = buhanshuijine;
    }

    public String getErjishenheren() {
        return erjishenheren;
    }

    public void setErjishenheren(String erjishenheren){
        this.erjishenheren = erjishenheren;
    }

    public String getErji_shenhe_beizhu() {
        return erji_shenhe_beizhu;
    }

    public void setErji_shenhe_beizhu(String erji_shenhe_beizhu){
        this.erji_shenhe_beizhu = erji_shenhe_beizhu;
    }

    public String getYiji_shenhe_beizhu() {
        return yiji_shenhe_beizhu;
    }

    public void setYiji_shenhe_beizhu(String yiji_shenhe_beizhu){
        this.yiji_shenhe_beizhu = yiji_shenhe_beizhu;
    }

    public Double getShouqikuanxiang() {
        return shouqikuanxiang;
    }

    public void setShouqikuanxiang(Double shouqikuanxiang){
        this.shouqikuanxiang = shouqikuanxiang;
    }

    public Double getKaijufapiao() {
        return kaijufapiao;
    }

    public void setKaijufapiao(Double kaijufapiao){
        this.kaijufapiao = kaijufapiao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}