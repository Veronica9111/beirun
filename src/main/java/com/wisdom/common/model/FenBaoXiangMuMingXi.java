package com.wisdom.common.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class FenBaoXiangMuMingXi implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private String fengongsimingcheng;
private String tianbiaorendianhua;
private String fb_mianshui_fapiaohaoma;
private Double fb_heji_mianshui_fenbaohetongjine;
private String fb_6_fapiaohaoma;
private Double fb_heji_miandi_fenbaohetongjine;
private Timestamp fb_mianshui_riqi;
private String fuheren;
private Double fb_heji_6_fenbaohetongjine;
private Timestamp tianbiaoshijian;
private Timestamp fb_11_riqi;
private String fb_miandi_fapiaohaoma;
private Double fb_5_fenbaohetongjine;
private Long id;
private Double fb_17_fenbaohetongjine;
private Double fb_heji_17_fenbaohetongjine;
private Timestamp fb_17_riqi;
private String fb_17_fapiaohaoma;
private Timestamp fb_6_riqi;
private Double fb_11_fenbaohetongjine;
private Double fb_6_fenbaohetongjine;
private Double fb_mianshui_fenbaohetongjine;
private Timestamp fb_5_riqi;
private Timestamp fb_3_riqi;
private String shenheren;
private String fb_5_fapiaohaoma;
private Double fb_miandi_fenbaohetongjine;
private String fb_3_fapiaohaoma;
private Timestamp fb_miandi_riqi;
private Double fb_heji_11_fenbaohetongjine;
private Double fb_heji_3_fenbaohetongjine;
private String fb_11_fapiaohaoma;
private String xiangmubu;
private Double fb_3_fenbaohetongjine;
private Double fb_heji_5_fenbaohetongjine;
private Timestamp shenheshijian;
private String tiaobiaoren;
private String shenherendianhua;
    public FenBaoXiangMuMingXi() {
        super();
    }

    public FenBaoXiangMuMingXi(String fengongsimingcheng, String tianbiaorendianhua, String fb_mianshui_fapiaohaoma, Double fb_heji_mianshui_fenbaohetongjine, String fb_6_fapiaohaoma, Double fb_heji_miandi_fenbaohetongjine, Timestamp fb_mianshui_riqi, String fuheren, Double fb_heji_6_fenbaohetongjine, Timestamp tianbiaoshijian, Timestamp fb_11_riqi, String fb_miandi_fapiaohaoma, Double fb_5_fenbaohetongjine, Long id, Double fb_17_fenbaohetongjine, Double fb_heji_17_fenbaohetongjine, Timestamp fb_17_riqi, String fb_17_fapiaohaoma, Timestamp fb_6_riqi, Double fb_11_fenbaohetongjine, Double fb_6_fenbaohetongjine, Double fb_mianshui_fenbaohetongjine, Timestamp fb_5_riqi, Timestamp fb_3_riqi, String shenheren, String fb_5_fapiaohaoma, Double fb_miandi_fenbaohetongjine, String fb_3_fapiaohaoma, Timestamp fb_miandi_riqi, Double fb_heji_11_fenbaohetongjine, Double fb_heji_3_fenbaohetongjine, String fb_11_fapiaohaoma, String xiangmubu, Double fb_3_fenbaohetongjine, Double fb_heji_5_fenbaohetongjine, Timestamp shenheshijian, String tiaobiaoren, String shenherendianhua){
        this.fengongsimingcheng = fengongsimingcheng;
        this.tianbiaorendianhua = tianbiaorendianhua;
        this.fb_mianshui_fapiaohaoma = fb_mianshui_fapiaohaoma;
        this.fb_heji_mianshui_fenbaohetongjine = fb_heji_mianshui_fenbaohetongjine;
        this.fb_6_fapiaohaoma = fb_6_fapiaohaoma;
        this.fb_heji_miandi_fenbaohetongjine = fb_heji_miandi_fenbaohetongjine;
        this.fb_mianshui_riqi = fb_mianshui_riqi;
        this.fuheren = fuheren;
        this.fb_heji_6_fenbaohetongjine = fb_heji_6_fenbaohetongjine;
        this.tianbiaoshijian = tianbiaoshijian;
        this.fb_11_riqi = fb_11_riqi;
        this.fb_miandi_fapiaohaoma = fb_miandi_fapiaohaoma;
        this.fb_5_fenbaohetongjine = fb_5_fenbaohetongjine;
        this.id = id;
        this.fb_17_fenbaohetongjine = fb_17_fenbaohetongjine;
        this.fb_heji_17_fenbaohetongjine = fb_heji_17_fenbaohetongjine;
        this.fb_17_riqi = fb_17_riqi;
        this.fb_17_fapiaohaoma = fb_17_fapiaohaoma;
        this.fb_6_riqi = fb_6_riqi;
        this.fb_11_fenbaohetongjine = fb_11_fenbaohetongjine;
        this.fb_6_fenbaohetongjine = fb_6_fenbaohetongjine;
        this.fb_mianshui_fenbaohetongjine = fb_mianshui_fenbaohetongjine;
        this.fb_5_riqi = fb_5_riqi;
        this.fb_3_riqi = fb_3_riqi;
        this.shenheren = shenheren;
        this.fb_5_fapiaohaoma = fb_5_fapiaohaoma;
        this.fb_miandi_fenbaohetongjine = fb_miandi_fenbaohetongjine;
        this.fb_3_fapiaohaoma = fb_3_fapiaohaoma;
        this.fb_miandi_riqi = fb_miandi_riqi;
        this.fb_heji_11_fenbaohetongjine = fb_heji_11_fenbaohetongjine;
        this.fb_heji_3_fenbaohetongjine = fb_heji_3_fenbaohetongjine;
        this.fb_11_fapiaohaoma = fb_11_fapiaohaoma;
        this.xiangmubu = xiangmubu;
        this.fb_3_fenbaohetongjine = fb_3_fenbaohetongjine;
        this.fb_heji_5_fenbaohetongjine = fb_heji_5_fenbaohetongjine;
        this.shenheshijian = shenheshijian;
        this.tiaobiaoren = tiaobiaoren;
        this.shenherendianhua = shenherendianhua;
    }

    public String getFengongsimingcheng() {
        return fengongsimingcheng;
    }

    public void setFengongsimingcheng(String fengongsimingcheng){
        this.fengongsimingcheng = fengongsimingcheng;
    }

    public String getTianbiaorendianhua() {
        return tianbiaorendianhua;
    }

    public void setTianbiaorendianhua(String tianbiaorendianhua){
        this.tianbiaorendianhua = tianbiaorendianhua;
    }

    public String getFb_mianshui_fapiaohaoma() {
        return fb_mianshui_fapiaohaoma;
    }

    public void setFb_mianshui_fapiaohaoma(String fb_mianshui_fapiaohaoma){
        this.fb_mianshui_fapiaohaoma = fb_mianshui_fapiaohaoma;
    }

    public Double getFb_heji_mianshui_fenbaohetongjine() {
        return fb_heji_mianshui_fenbaohetongjine;
    }

    public void setFb_heji_mianshui_fenbaohetongjine(Double fb_heji_mianshui_fenbaohetongjine){
        this.fb_heji_mianshui_fenbaohetongjine = fb_heji_mianshui_fenbaohetongjine;
    }

    public String getFb_6_fapiaohaoma() {
        return fb_6_fapiaohaoma;
    }

    public void setFb_6_fapiaohaoma(String fb_6_fapiaohaoma){
        this.fb_6_fapiaohaoma = fb_6_fapiaohaoma;
    }

    public Double getFb_heji_miandi_fenbaohetongjine() {
        return fb_heji_miandi_fenbaohetongjine;
    }

    public void setFb_heji_miandi_fenbaohetongjine(Double fb_heji_miandi_fenbaohetongjine){
        this.fb_heji_miandi_fenbaohetongjine = fb_heji_miandi_fenbaohetongjine;
    }

    public String getFb_mianshui_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_mianshui_riqi = "";
        if(this.fb_mianshui_riqi != null) {
            fb_mianshui_riqi = dateFormat.format(this.fb_mianshui_riqi);
        }
        return fb_mianshui_riqi;
    }

    public void setFb_mianshui_riqi(Timestamp fb_mianshui_riqi){
        this.fb_mianshui_riqi = fb_mianshui_riqi;
    }

    public String getFuheren() {
        return fuheren;
    }

    public void setFuheren(String fuheren){
        this.fuheren = fuheren;
    }

    public Double getFb_heji_6_fenbaohetongjine() {
        return fb_heji_6_fenbaohetongjine;
    }

    public void setFb_heji_6_fenbaohetongjine(Double fb_heji_6_fenbaohetongjine){
        this.fb_heji_6_fenbaohetongjine = fb_heji_6_fenbaohetongjine;
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

    public String getFb_11_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_11_riqi = "";
        if(this.fb_11_riqi != null) {
            fb_11_riqi = dateFormat.format(this.fb_11_riqi);
        }
        return fb_11_riqi;
    }

    public void setFb_11_riqi(Timestamp fb_11_riqi){
        this.fb_11_riqi = fb_11_riqi;
    }

    public String getFb_miandi_fapiaohaoma() {
        return fb_miandi_fapiaohaoma;
    }

    public void setFb_miandi_fapiaohaoma(String fb_miandi_fapiaohaoma){
        this.fb_miandi_fapiaohaoma = fb_miandi_fapiaohaoma;
    }

    public Double getFb_5_fenbaohetongjine() {
        return fb_5_fenbaohetongjine;
    }

    public void setFb_5_fenbaohetongjine(Double fb_5_fenbaohetongjine){
        this.fb_5_fenbaohetongjine = fb_5_fenbaohetongjine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Double getFb_17_fenbaohetongjine() {
        return fb_17_fenbaohetongjine;
    }

    public void setFb_17_fenbaohetongjine(Double fb_17_fenbaohetongjine){
        this.fb_17_fenbaohetongjine = fb_17_fenbaohetongjine;
    }

    public Double getFb_heji_17_fenbaohetongjine() {
        return fb_heji_17_fenbaohetongjine;
    }

    public void setFb_heji_17_fenbaohetongjine(Double fb_heji_17_fenbaohetongjine){
        this.fb_heji_17_fenbaohetongjine = fb_heji_17_fenbaohetongjine;
    }

    public String getFb_17_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_17_riqi = "";
        if(this.fb_17_riqi != null) {
            fb_17_riqi = dateFormat.format(this.fb_17_riqi);
        }
        return fb_17_riqi;
    }

    public void setFb_17_riqi(Timestamp fb_17_riqi){
        this.fb_17_riqi = fb_17_riqi;
    }

    public String getFb_17_fapiaohaoma() {
        return fb_17_fapiaohaoma;
    }

    public void setFb_17_fapiaohaoma(String fb_17_fapiaohaoma){
        this.fb_17_fapiaohaoma = fb_17_fapiaohaoma;
    }

    public String getFb_6_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_6_riqi = "";
        if(this.fb_6_riqi != null) {
            fb_6_riqi = dateFormat.format(this.fb_6_riqi);
        }
        return fb_6_riqi;
    }

    public void setFb_6_riqi(Timestamp fb_6_riqi){
        this.fb_6_riqi = fb_6_riqi;
    }

    public Double getFb_11_fenbaohetongjine() {
        return fb_11_fenbaohetongjine;
    }

    public void setFb_11_fenbaohetongjine(Double fb_11_fenbaohetongjine){
        this.fb_11_fenbaohetongjine = fb_11_fenbaohetongjine;
    }

    public Double getFb_6_fenbaohetongjine() {
        return fb_6_fenbaohetongjine;
    }

    public void setFb_6_fenbaohetongjine(Double fb_6_fenbaohetongjine){
        this.fb_6_fenbaohetongjine = fb_6_fenbaohetongjine;
    }

    public Double getFb_mianshui_fenbaohetongjine() {
        return fb_mianshui_fenbaohetongjine;
    }

    public void setFb_mianshui_fenbaohetongjine(Double fb_mianshui_fenbaohetongjine){
        this.fb_mianshui_fenbaohetongjine = fb_mianshui_fenbaohetongjine;
    }

    public String getFb_5_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_5_riqi = "";
        if(this.fb_5_riqi != null) {
            fb_5_riqi = dateFormat.format(this.fb_5_riqi);
        }
        return fb_5_riqi;
    }

    public void setFb_5_riqi(Timestamp fb_5_riqi){
        this.fb_5_riqi = fb_5_riqi;
    }

    public String getFb_3_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_3_riqi = "";
        if(this.fb_3_riqi != null) {
            fb_3_riqi = dateFormat.format(this.fb_3_riqi);
        }
        return fb_3_riqi;
    }

    public void setFb_3_riqi(Timestamp fb_3_riqi){
        this.fb_3_riqi = fb_3_riqi;
    }

    public String getShenheren() {
        return shenheren;
    }

    public void setShenheren(String shenheren){
        this.shenheren = shenheren;
    }

    public String getFb_5_fapiaohaoma() {
        return fb_5_fapiaohaoma;
    }

    public void setFb_5_fapiaohaoma(String fb_5_fapiaohaoma){
        this.fb_5_fapiaohaoma = fb_5_fapiaohaoma;
    }

    public Double getFb_miandi_fenbaohetongjine() {
        return fb_miandi_fenbaohetongjine;
    }

    public void setFb_miandi_fenbaohetongjine(Double fb_miandi_fenbaohetongjine){
        this.fb_miandi_fenbaohetongjine = fb_miandi_fenbaohetongjine;
    }

    public String getFb_3_fapiaohaoma() {
        return fb_3_fapiaohaoma;
    }

    public void setFb_3_fapiaohaoma(String fb_3_fapiaohaoma){
        this.fb_3_fapiaohaoma = fb_3_fapiaohaoma;
    }

    public String getFb_miandi_riqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fb_miandi_riqi = "";
        if(this.fb_miandi_riqi != null) {
            fb_miandi_riqi = dateFormat.format(this.fb_miandi_riqi);
        }
        return fb_miandi_riqi;
    }

    public void setFb_miandi_riqi(Timestamp fb_miandi_riqi){
        this.fb_miandi_riqi = fb_miandi_riqi;
    }

    public Double getFb_heji_11_fenbaohetongjine() {
        return fb_heji_11_fenbaohetongjine;
    }

    public void setFb_heji_11_fenbaohetongjine(Double fb_heji_11_fenbaohetongjine){
        this.fb_heji_11_fenbaohetongjine = fb_heji_11_fenbaohetongjine;
    }

    public Double getFb_heji_3_fenbaohetongjine() {
        return fb_heji_3_fenbaohetongjine;
    }

    public void setFb_heji_3_fenbaohetongjine(Double fb_heji_3_fenbaohetongjine){
        this.fb_heji_3_fenbaohetongjine = fb_heji_3_fenbaohetongjine;
    }

    public String getFb_11_fapiaohaoma() {
        return fb_11_fapiaohaoma;
    }

    public void setFb_11_fapiaohaoma(String fb_11_fapiaohaoma){
        this.fb_11_fapiaohaoma = fb_11_fapiaohaoma;
    }

    public String getXiangmubu() {
        return xiangmubu;
    }

    public void setXiangmubu(String xiangmubu){
        this.xiangmubu = xiangmubu;
    }

    public Double getFb_3_fenbaohetongjine() {
        return fb_3_fenbaohetongjine;
    }

    public void setFb_3_fenbaohetongjine(Double fb_3_fenbaohetongjine){
        this.fb_3_fenbaohetongjine = fb_3_fenbaohetongjine;
    }

    public Double getFb_heji_5_fenbaohetongjine() {
        return fb_heji_5_fenbaohetongjine;
    }

    public void setFb_heji_5_fenbaohetongjine(Double fb_heji_5_fenbaohetongjine){
        this.fb_heji_5_fenbaohetongjine = fb_heji_5_fenbaohetongjine;
    }

    public String getShenheshijian() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String shenheshijian = "";
        if(this.shenheshijian != null) {
            shenheshijian = dateFormat.format(this.shenheshijian);
        }
        return shenheshijian;
    }

    public void setShenheshijian(Timestamp shenheshijian){
        this.shenheshijian = shenheshijian;
    }

    public String getTiaobiaoren() {
        return tiaobiaoren;
    }

    public void setTiaobiaoren(String tiaobiaoren){
        this.tiaobiaoren = tiaobiaoren;
    }

    public String getShenherendianhua() {
        return shenherendianhua;
    }

    public void setShenherendianhua(String shenherendianhua){
        this.shenherendianhua = shenherendianhua;
    }

}