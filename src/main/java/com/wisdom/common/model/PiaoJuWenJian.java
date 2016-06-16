package com.wisdom.common.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class PiaoJuWenJian implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private Timestamp fapiaoriqi;
private String xiangmu;
private Long xiangmutaizhang_id;
private String wenjian;
private Integer field2;
private String field3;
private Integer field1;
private Long company_id;
private String field4;
private String field5;
private String fapiaohaoma;
private Integer zhanbi;
private Long id;
    public PiaoJuWenJian() {
        super();
    }

    public PiaoJuWenJian(Timestamp fapiaoriqi, String xiangmu, Long xiangmutaizhang_id, String wenjian, Integer field2, String field3, Integer field1, Long company_id, String field4, String field5, String fapiaohaoma, Integer zhanbi, Long id){
        this.fapiaoriqi = fapiaoriqi;
        this.xiangmu = xiangmu;
        this.xiangmutaizhang_id = xiangmutaizhang_id;
        this.wenjian = wenjian;
        this.field2 = field2;
        this.field3 = field3;
        this.field1 = field1;
        this.company_id = company_id;
        this.field4 = field4;
        this.field5 = field5;
        this.fapiaohaoma = fapiaohaoma;
        this.zhanbi = zhanbi;
        this.id = id;
    }

    public String getFapiaoriqi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fapiaoriqi = "";
        if(this.fapiaoriqi != null) {
            fapiaoriqi = dateFormat.format(this.fapiaoriqi);
        }
        return fapiaoriqi;
    }

    public void setFapiaoriqi(Timestamp fapiaoriqi){
        this.fapiaoriqi = fapiaoriqi;
    }

    public String getXiangmu() {
        return xiangmu;
    }

    public void setXiangmu(String xiangmu){
        this.xiangmu = xiangmu;
    }

    public Long getXiangmutaizhang_id() {
        return xiangmutaizhang_id;
    }

    public void setXiangmutaizhang_id(Long xiangmutaizhang_id){
        this.xiangmutaizhang_id = xiangmutaizhang_id;
    }

    public String getWenjian() {
        return wenjian;
    }

    public void setWenjian(String wenjian){
        this.wenjian = wenjian;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2){
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3){
        this.field3 = field3;
    }

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1){
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

    public String getFapiaohaoma() {
        return fapiaohaoma;
    }

    public void setFapiaohaoma(String fapiaohaoma){
        this.fapiaohaoma = fapiaohaoma;
    }

    public Integer getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(Integer zhanbi){
        this.zhanbi = zhanbi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}