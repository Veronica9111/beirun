package com.wisdom.common.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class BuDongChanFenQiDiKouBiao implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private String tianbiaorendianhua;
private Timestamp tianbiaoshijian;
private Long id;
private String shenheren;
private Integer erji_shenhe_status;
private String field2;
private String field3;
private String field1;
private Long company_id;
private String field4;
private String field5;
private Double qimodaidikou;
private String erji_shenhe_beizhu;
private Double benqibudongchan;
private Double benqibukedikou;
private Timestamp shenheriqi;
private String beizhu;
private String erjishenheren;
private Long xiangmutaizhang_id;
private String yijishenheren;
private String tianbiaoren;
private Double benqikedikou;
private Double qichudaidikou;
private Integer yiji_shenhe_status;
private String shenherendianhua;
private String yiji_shenhe_beizhu;
    public BuDongChanFenQiDiKouBiao() {
        super();
    }

    public BuDongChanFenQiDiKouBiao(String tianbiaorendianhua, Timestamp tianbiaoshijian, Long id, String shenheren, Integer erji_shenhe_status, String field2, String field3, String field1, Long company_id, String field4, String field5, Double qimodaidikou, String erji_shenhe_beizhu, Double benqibudongchan, Double benqibukedikou, Timestamp shenheriqi, String beizhu, String erjishenheren, Long xiangmutaizhang_id, String yijishenheren, String tianbiaoren, Double benqikedikou, Double qichudaidikou, Integer yiji_shenhe_status, String shenherendianhua, String yiji_shenhe_beizhu){
        this.tianbiaorendianhua = tianbiaorendianhua;
        this.tianbiaoshijian = tianbiaoshijian;
        this.id = id;
        this.shenheren = shenheren;
        this.erji_shenhe_status = erji_shenhe_status;
        this.field2 = field2;
        this.field3 = field3;
        this.field1 = field1;
        this.company_id = company_id;
        this.field4 = field4;
        this.field5 = field5;
        this.qimodaidikou = qimodaidikou;
        this.erji_shenhe_beizhu = erji_shenhe_beizhu;
        this.benqibudongchan = benqibudongchan;
        this.benqibukedikou = benqibukedikou;
        this.shenheriqi = shenheriqi;
        this.beizhu = beizhu;
        this.erjishenheren = erjishenheren;
        this.xiangmutaizhang_id = xiangmutaizhang_id;
        this.yijishenheren = yijishenheren;
        this.tianbiaoren = tianbiaoren;
        this.benqikedikou = benqikedikou;
        this.qichudaidikou = qichudaidikou;
        this.yiji_shenhe_status = yiji_shenhe_status;
        this.shenherendianhua = shenherendianhua;
        this.yiji_shenhe_beizhu = yiji_shenhe_beizhu;
    }

    public String getTianbiaorendianhua() {
        return tianbiaorendianhua;
    }

    public void setTianbiaorendianhua(String tianbiaorendianhua){
        this.tianbiaorendianhua = tianbiaorendianhua;
    }

    public String getTianbiaoshijian() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tianbiaoshijian = "";
        if(this.tianbiaoshijian != null) {
            tianbiaoshijian = dateFormat.format(this.tianbiaoshijian);
        }
        return tianbiaoshijian;
    }

    public void setTianbiaoshijian(Timestamp tianbiaoshijian){
        this.tianbiaoshijian = tianbiaoshijian;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getShenheren() {
        return shenheren;
    }

    public void setShenheren(String shenheren){
        this.shenheren = shenheren;
    }

    public Integer getErji_shenhe_status() {
        return erji_shenhe_status;
    }

    public void setErji_shenhe_status(Integer erji_shenhe_status){
        this.erji_shenhe_status = erji_shenhe_status;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2){
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3){
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1){
        this.field1 = field1;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id){
        this.company_id = company_id;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4){
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5){
        this.field5 = field5;
    }

    public Double getQimodaidikou() {
        return qimodaidikou;
    }

    public void setQimodaidikou(Double qimodaidikou){
        this.qimodaidikou = qimodaidikou;
    }

    public String getErji_shenhe_beizhu() {
        return erji_shenhe_beizhu;
    }

    public void setErji_shenhe_beizhu(String erji_shenhe_beizhu){
        this.erji_shenhe_beizhu = erji_shenhe_beizhu;
    }

    public Double getBenqibudongchan() {
        return benqibudongchan;
    }

    public void setBenqibudongchan(Double benqibudongchan){
        this.benqibudongchan = benqibudongchan;
    }

    public Double getBenqibukedikou() {
        return benqibukedikou;
    }

    public void setBenqibukedikou(Double benqibukedikou){
        this.benqibukedikou = benqibukedikou;
    }

    public String getShenheriqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String shenheriqi = "";
        if(this.shenheriqi != null) {
            shenheriqi = dateFormat.format(this.shenheriqi);
        }
        return shenheriqi;
    }

    public void setShenheriqi(Timestamp shenheriqi){
        this.shenheriqi = shenheriqi;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu){
        this.beizhu = beizhu;
    }

    public String getErjishenheren() {
        return erjishenheren;
    }

    public void setErjishenheren(String erjishenheren){
        this.erjishenheren = erjishenheren;
    }

    public Long getXiangmutaizhang_id() {
        return xiangmutaizhang_id;
    }

    public void setXiangmutaizhang_id(Long xiangmutaizhang_id){
        this.xiangmutaizhang_id = xiangmutaizhang_id;
    }

    public String getYijishenheren() {
        return yijishenheren;
    }

    public void setYijishenheren(String yijishenheren){
        this.yijishenheren = yijishenheren;
    }

    public String getTianbiaoren() {
        return tianbiaoren;
    }

    public void setTianbiaoren(String tianbiaoren){
        this.tianbiaoren = tianbiaoren;
    }

    public Double getBenqikedikou() {
        return benqikedikou;
    }

    public void setBenqikedikou(Double benqikedikou){
        this.benqikedikou = benqikedikou;
    }

    public Double getQichudaidikou() {
        return qichudaidikou;
    }

    public void setQichudaidikou(Double qichudaidikou){
        this.qichudaidikou = qichudaidikou;
    }

    public Integer getYiji_shenhe_status() {
        return yiji_shenhe_status;
    }

    public void setYiji_shenhe_status(Integer yiji_shenhe_status){
        this.yiji_shenhe_status = yiji_shenhe_status;
    }

    public String getShenherendianhua() {
        return shenherendianhua;
    }

    public void setShenherendianhua(String shenherendianhua){
        this.shenherendianhua = shenherendianhua;
    }

    public String getYiji_shenhe_beizhu() {
        return yiji_shenhe_beizhu;
    }

    public void setYiji_shenhe_beizhu(String yiji_shenhe_beizhu){
        this.yiji_shenhe_beizhu = yiji_shenhe_beizhu;
    }

}