package com.wisdom.common.model;import java.sql.Timestamp;

public class FinalJinXiang implements java.io.Serializable{
private static final long serialVersionUID = 1L;
public FinalJinXiang() {}
private Long id;
private Long project_id;
private Double shendikou_shuikong_fenshu;
private Double shendikou_shuikong_jine;
private Double shendikou_shuikong_shuie;
private Double shendikou_benqirenzheng_fenshu;
private Double shendikou_benqirenzheng_jine;
private Double shendikou_benqirenzheng_shuie;
private Double shendikou_qianqirenzheng_fenshu;
private Double shendikou_qianqirenzheng_jine;
private Double shendikou_qianqirenzheng_shuie;
private Double shendikou_koushui_fenshu;
private Double shendikou_koushui_jine;
private Double shendikou_koushui_shuie;
private Double shendikou_haiguan_fenshu;
private Double shendikou_haiguan_jine;
private Double shendikou_haiguan_shuie;
private Double shendikou_nongchanpin_fenshu;
private Double shendikou_nongchanpin_jine;
private Double shendikou_nongchanpin_shuie;
private Double shendikou_daikou_fenshu;
private Double shendikou_daikou_jine;
private Double shendikou_daikou_shuie;
private Double shendikou_qita_fenshu;
private Double shendikou_qita_jine;
private Double shendikou_qita_shuie;
private Double shendikou_pingzheng_fenshu;
private Double shendikou_pingzheng_jine;
private Double shendikou_pingzheng_shuie;
private Double shendikou_jinxiang_fenshu;
private Double shendikou_jinxiang_jine;
private Double shendikou_jinxiang_shuie;
private Double shendikou_dikouheji_fenshu;
private Double shendikou_dikouheji_jine;
private Double shendikou_dikouheji_shuie;
private Double zhuanchu_mianshui_shuie;
private Double zhuanchu_fulixiaofei_shuie;
private Double zhuanchu_feisunshi_shuie;
private Double zhuanchu_jianyijishui_shuie;
private Double zhuanchu_mianditui_shuie;
private Double zhuanchu_nashuijiancha_shuie;
private Double zhuanchu_hongzizhuanyong_shuie;
private Double zhuanchu_dijianqianshui_shuie;
private Double zhuanchu_tuishui_shuie;
private Double zhuanchu_zhuchuqingxing_shuie;
private Double daidikou_shuikong_fenshu;
private Double daidikou_shuikong_jine;
private Double daidikou_shuikong_shuie;
private Double daidikou_qichuweishenbao_fenshu;
private Double daidikou_qichuweishenbao_jine;
private Double daidikou_qichuweishenbao_shuie;
private Double daidikou_benqiweishenbao_fenshu;
private Double daidikou_benqiweishenbao_jine;
private Double daidikou_benqiweishenbao_shuie;
private Double daidikou_qimoweishenbao_fenshu;
private Double daidikou_qimoweishenbao_jine;
private Double daidikou_qimoweishenbao_shuie;
private Double daidikou_buxudikou_fenshu;
private Double daidikou_buxudikou_jine;
private Double daidikou_buxudikou_shuie;
private Double daidikou_qitapingzheng_fenshu;
private Double daidikou_qitapingzheng_jine;
private Double daidikou_qitapingzheng_shuie;
private Double daidikou_haiguan_fenshu;
private Double daidikou_haiguan_jine;
private Double daidikou_haiguan_shuie;
private Double daidikou_nongchanpin_fenshu;
private Double daidikou_nongchanpin_jine;
private Double daidikou_nongchanpin_shuie;
private Double daidikou_daikou_fenshu;
private Double daidikou_daikou_jine;
private Double daidikou_daikou_shuie;
private Double daidikou_qita_fenshu;
private Double daidikou_qita_jine;
private Double daidikou_qita_shuie;
private Double qita_shuikong_fenshu;
private Double qita_shuikong_jine;
private Double qita_shuikong_shuie;
private Double qita_daikou_fenshu;
private Double qita_daikou_jine;
private Double qita_daikou_shuie;
public FinalJinXiang(Long id, Long project_id, Double shendikou_shuikong_fenshu, Double shendikou_shuikong_jine, Double shendikou_shuikong_shuie, Double shendikou_benqirenzheng_fenshu, Double shendikou_benqirenzheng_jine, Double shendikou_benqirenzheng_shuie, Double shendikou_qianqirenzheng_fenshu, Double shendikou_qianqirenzheng_jine, Double shendikou_qianqirenzheng_shuie, Double shendikou_koushui_fenshu, Double shendikou_koushui_jine, Double shendikou_koushui_shuie, Double shendikou_haiguan_fenshu, Double shendikou_haiguan_jine, Double shendikou_haiguan_shuie, Double shendikou_nongchanpin_fenshu, Double shendikou_nongchanpin_jine, Double shendikou_nongchanpin_shuie, Double shendikou_daikou_fenshu, Double shendikou_daikou_jine, Double shendikou_daikou_shuie, Double shendikou_qita_fenshu, Double shendikou_qita_jine, Double shendikou_qita_shuie, Double shendikou_pingzheng_fenshu, Double shendikou_pingzheng_jine, Double shendikou_pingzheng_shuie, Double shendikou_jinxiang_fenshu, Double shendikou_jinxiang_jine, Double shendikou_jinxiang_shuie, Double shendikou_dikouheji_fenshu, Double shendikou_dikouheji_jine, Double shendikou_dikouheji_shuie, Double zhuanchu_mianshui_shuie, Double zhuanchu_fulixiaofei_shuie, Double zhuanchu_feisunshi_shuie, Double zhuanchu_jianyijishui_shuie, Double zhuanchu_mianditui_shuie, Double zhuanchu_nashuijiancha_shuie, Double zhuanchu_hongzizhuanyong_shuie, Double zhuanchu_dijianqianshui_shuie, Double zhuanchu_tuishui_shuie, Double zhuanchu_zhuchuqingxing_shuie, Double daidikou_shuikong_fenshu, Double daidikou_shuikong_jine, Double daidikou_shuikong_shuie, Double daidikou_qichuweishenbao_fenshu, Double daidikou_qichuweishenbao_jine, Double daidikou_qichuweishenbao_shuie, Double daidikou_benqiweishenbao_fenshu, Double daidikou_benqiweishenbao_jine, Double daidikou_benqiweishenbao_shuie, Double daidikou_qimoweishenbao_fenshu, Double daidikou_qimoweishenbao_jine, Double daidikou_qimoweishenbao_shuie, Double daidikou_buxudikou_fenshu, Double daidikou_buxudikou_jine, Double daidikou_buxudikou_shuie, Double daidikou_qitapingzheng_fenshu, Double daidikou_qitapingzheng_jine, Double daidikou_qitapingzheng_shuie, Double daidikou_haiguan_fenshu, Double daidikou_haiguan_jine, Double daidikou_haiguan_shuie, Double daidikou_nongchanpin_fenshu, Double daidikou_nongchanpin_jine, Double daidikou_nongchanpin_shuie, Double daidikou_daikou_fenshu, Double daidikou_daikou_jine, Double daidikou_daikou_shuie, Double daidikou_qita_fenshu, Double daidikou_qita_jine, Double daidikou_qita_shuie, Double qita_shuikong_fenshu, Double qita_shuikong_jine, Double qita_shuikong_shuie, Double qita_daikou_fenshu, Double qita_daikou_jine, Double qita_daikou_shuie) {
this.id=id;
this.project_id=project_id;
this.shendikou_shuikong_fenshu=shendikou_shuikong_fenshu;
this.shendikou_shuikong_jine=shendikou_shuikong_jine;
this.shendikou_shuikong_shuie=shendikou_shuikong_shuie;
this.shendikou_benqirenzheng_fenshu=shendikou_benqirenzheng_fenshu;
this.shendikou_benqirenzheng_jine=shendikou_benqirenzheng_jine;
this.shendikou_benqirenzheng_shuie=shendikou_benqirenzheng_shuie;
this.shendikou_qianqirenzheng_fenshu=shendikou_qianqirenzheng_fenshu;
this.shendikou_qianqirenzheng_jine=shendikou_qianqirenzheng_jine;
this.shendikou_qianqirenzheng_shuie=shendikou_qianqirenzheng_shuie;
this.shendikou_koushui_fenshu=shendikou_koushui_fenshu;
this.shendikou_koushui_jine=shendikou_koushui_jine;
this.shendikou_koushui_shuie=shendikou_koushui_shuie;
this.shendikou_haiguan_fenshu=shendikou_haiguan_fenshu;
this.shendikou_haiguan_jine=shendikou_haiguan_jine;
this.shendikou_haiguan_shuie=shendikou_haiguan_shuie;
this.shendikou_nongchanpin_fenshu=shendikou_nongchanpin_fenshu;
this.shendikou_nongchanpin_jine=shendikou_nongchanpin_jine;
this.shendikou_nongchanpin_shuie=shendikou_nongchanpin_shuie;
this.shendikou_daikou_fenshu=shendikou_daikou_fenshu;
this.shendikou_daikou_jine=shendikou_daikou_jine;
this.shendikou_daikou_shuie=shendikou_daikou_shuie;
this.shendikou_qita_fenshu=shendikou_qita_fenshu;
this.shendikou_qita_jine=shendikou_qita_jine;
this.shendikou_qita_shuie=shendikou_qita_shuie;
this.shendikou_pingzheng_fenshu=shendikou_pingzheng_fenshu;
this.shendikou_pingzheng_jine=shendikou_pingzheng_jine;
this.shendikou_pingzheng_shuie=shendikou_pingzheng_shuie;
this.shendikou_jinxiang_fenshu=shendikou_jinxiang_fenshu;
this.shendikou_jinxiang_jine=shendikou_jinxiang_jine;
this.shendikou_jinxiang_shuie=shendikou_jinxiang_shuie;
this.shendikou_dikouheji_fenshu=shendikou_dikouheji_fenshu;
this.shendikou_dikouheji_jine=shendikou_dikouheji_jine;
this.shendikou_dikouheji_shuie=shendikou_dikouheji_shuie;
this.zhuanchu_mianshui_shuie=zhuanchu_mianshui_shuie;
this.zhuanchu_fulixiaofei_shuie=zhuanchu_fulixiaofei_shuie;
this.zhuanchu_feisunshi_shuie=zhuanchu_feisunshi_shuie;
this.zhuanchu_jianyijishui_shuie=zhuanchu_jianyijishui_shuie;
this.zhuanchu_mianditui_shuie=zhuanchu_mianditui_shuie;
this.zhuanchu_nashuijiancha_shuie=zhuanchu_nashuijiancha_shuie;
this.zhuanchu_hongzizhuanyong_shuie=zhuanchu_hongzizhuanyong_shuie;
this.zhuanchu_dijianqianshui_shuie=zhuanchu_dijianqianshui_shuie;
this.zhuanchu_tuishui_shuie=zhuanchu_tuishui_shuie;
this.zhuanchu_zhuchuqingxing_shuie=zhuanchu_zhuchuqingxing_shuie;
this.daidikou_shuikong_fenshu=daidikou_shuikong_fenshu;
this.daidikou_shuikong_jine=daidikou_shuikong_jine;
this.daidikou_shuikong_shuie=daidikou_shuikong_shuie;
this.daidikou_qichuweishenbao_fenshu=daidikou_qichuweishenbao_fenshu;
this.daidikou_qichuweishenbao_jine=daidikou_qichuweishenbao_jine;
this.daidikou_qichuweishenbao_shuie=daidikou_qichuweishenbao_shuie;
this.daidikou_benqiweishenbao_fenshu=daidikou_benqiweishenbao_fenshu;
this.daidikou_benqiweishenbao_jine=daidikou_benqiweishenbao_jine;
this.daidikou_benqiweishenbao_shuie=daidikou_benqiweishenbao_shuie;
this.daidikou_qimoweishenbao_fenshu=daidikou_qimoweishenbao_fenshu;
this.daidikou_qimoweishenbao_jine=daidikou_qimoweishenbao_jine;
this.daidikou_qimoweishenbao_shuie=daidikou_qimoweishenbao_shuie;
this.daidikou_buxudikou_fenshu=daidikou_buxudikou_fenshu;
this.daidikou_buxudikou_jine=daidikou_buxudikou_jine;
this.daidikou_buxudikou_shuie=daidikou_buxudikou_shuie;
this.daidikou_qitapingzheng_fenshu=daidikou_qitapingzheng_fenshu;
this.daidikou_qitapingzheng_jine=daidikou_qitapingzheng_jine;
this.daidikou_qitapingzheng_shuie=daidikou_qitapingzheng_shuie;
this.daidikou_haiguan_fenshu=daidikou_haiguan_fenshu;
this.daidikou_haiguan_jine=daidikou_haiguan_jine;
this.daidikou_haiguan_shuie=daidikou_haiguan_shuie;
this.daidikou_nongchanpin_fenshu=daidikou_nongchanpin_fenshu;
this.daidikou_nongchanpin_jine=daidikou_nongchanpin_jine;
this.daidikou_nongchanpin_shuie=daidikou_nongchanpin_shuie;
this.daidikou_daikou_fenshu=daidikou_daikou_fenshu;
this.daidikou_daikou_jine=daidikou_daikou_jine;
this.daidikou_daikou_shuie=daidikou_daikou_shuie;
this.daidikou_qita_fenshu=daidikou_qita_fenshu;
this.daidikou_qita_jine=daidikou_qita_jine;
this.daidikou_qita_shuie=daidikou_qita_shuie;
this.qita_shuikong_fenshu=qita_shuikong_fenshu;
this.qita_shuikong_jine=qita_shuikong_jine;
this.qita_shuikong_shuie=qita_shuikong_shuie;
this.qita_daikou_fenshu=qita_daikou_fenshu;
this.qita_daikou_jine=qita_daikou_jine;
this.qita_daikou_shuie=qita_daikou_shuie;
}

public void setId (Long id) {
this.id=id;
}

public Long getId () {
return this.id;
}

public void setProject_id (Long project_id) {
this.project_id=project_id;
}

public Long getProject_id () {
return this.project_id;
}

public void setShendikou_shuikong_fenshu (Double shendikou_shuikong_fenshu) {
	this.shendikou_shuikong_fenshu=shendikou_shuikong_fenshu;
}

public Double getShendikou_shuikong_fenshu () {
return this.shendikou_shuikong_fenshu;
}

public void setShendikou_shuikong_jine (Double shendikou_shuikong_jine) {
	this.shendikou_shuikong_jine=shendikou_shuikong_jine;
}

public Double getShendikou_shuikong_jine () {
return this.shendikou_shuikong_jine;
}

public void setShendikou_shuikong_shuie (Double shendikou_shuikong_shuie) {
	this.shendikou_shuikong_shuie=shendikou_shuikong_shuie;
}

public Double getShendikou_shuikong_shuie () {
return this.shendikou_shuikong_shuie;
}

public void setShendikou_benqirenzheng_fenshu (Double shendikou_benqirenzheng_fenshu) {
	this.shendikou_benqirenzheng_fenshu=shendikou_benqirenzheng_fenshu;
}

public Double getShendikou_benqirenzheng_fenshu () {
return this.shendikou_benqirenzheng_fenshu;
}

public void setShendikou_benqirenzheng_jine (Double shendikou_benqirenzheng_jine) {
	this.shendikou_benqirenzheng_jine=shendikou_benqirenzheng_jine;
}

public Double getShendikou_benqirenzheng_jine () {
return this.shendikou_benqirenzheng_jine;
}

public void setShendikou_benqirenzheng_shuie (Double shendikou_benqirenzheng_shuie) {
	this.shendikou_benqirenzheng_shuie=shendikou_benqirenzheng_shuie;
}

public Double getShendikou_benqirenzheng_shuie () {
return this.shendikou_benqirenzheng_shuie;
}

public void setShendikou_qianqirenzheng_fenshu (Double shendikou_qianqirenzheng_fenshu) {
	this.shendikou_qianqirenzheng_fenshu=shendikou_qianqirenzheng_fenshu;
}

public Double getShendikou_qianqirenzheng_fenshu () {
return this.shendikou_qianqirenzheng_fenshu;
}

public void setShendikou_qianqirenzheng_jine (Double shendikou_qianqirenzheng_jine) {
	this.shendikou_qianqirenzheng_jine=shendikou_qianqirenzheng_jine;
}

public Double getShendikou_qianqirenzheng_jine () {
return this.shendikou_qianqirenzheng_jine;
}

public void setShendikou_qianqirenzheng_shuie (Double shendikou_qianqirenzheng_shuie) {
	this.shendikou_qianqirenzheng_shuie=shendikou_qianqirenzheng_shuie;
}

public Double getShendikou_qianqirenzheng_shuie () {
return this.shendikou_qianqirenzheng_shuie;
}

public void setShendikou_koushui_fenshu (Double shendikou_koushui_fenshu) {
	this.shendikou_koushui_fenshu=shendikou_koushui_fenshu;
}

public Double getShendikou_koushui_fenshu () {
return this.shendikou_koushui_fenshu;
}

public void setShendikou_koushui_jine (Double shendikou_koushui_jine) {
	this.shendikou_koushui_jine=shendikou_koushui_jine;
}

public Double getShendikou_koushui_jine () {
return this.shendikou_koushui_jine;
}

public void setShendikou_koushui_shuie (Double shendikou_koushui_shuie) {
	this.shendikou_koushui_shuie=shendikou_koushui_shuie;
}

public Double getShendikou_koushui_shuie () {
return this.shendikou_koushui_shuie;
}

public void setShendikou_haiguan_fenshu (Double shendikou_haiguan_fenshu) {
	this.shendikou_haiguan_fenshu=shendikou_haiguan_fenshu;
}

public Double getShendikou_haiguan_fenshu () {
return this.shendikou_haiguan_fenshu;
}

public void setShendikou_haiguan_jine (Double shendikou_haiguan_jine) {
	this.shendikou_haiguan_jine=shendikou_haiguan_jine;
}

public Double getShendikou_haiguan_jine () {
return this.shendikou_haiguan_jine;
}

public void setShendikou_haiguan_shuie (Double shendikou_haiguan_shuie) {
	this.shendikou_haiguan_shuie=shendikou_haiguan_shuie;
}

public Double getShendikou_haiguan_shuie () {
return this.shendikou_haiguan_shuie;
}

public void setShendikou_nongchanpin_fenshu (Double shendikou_nongchanpin_fenshu) {
	this.shendikou_nongchanpin_fenshu=shendikou_nongchanpin_fenshu;
}

public Double getShendikou_nongchanpin_fenshu () {
return this.shendikou_nongchanpin_fenshu;
}

public void setShendikou_nongchanpin_jine (Double shendikou_nongchanpin_jine) {
	this.shendikou_nongchanpin_jine=shendikou_nongchanpin_jine;
}

public Double getShendikou_nongchanpin_jine () {
return this.shendikou_nongchanpin_jine;
}

public void setShendikou_nongchanpin_shuie (Double shendikou_nongchanpin_shuie) {
	this.shendikou_nongchanpin_shuie=shendikou_nongchanpin_shuie;
}

public Double getShendikou_nongchanpin_shuie () {
return this.shendikou_nongchanpin_shuie;
}

public void setShendikou_daikou_fenshu (Double shendikou_daikou_fenshu) {
	this.shendikou_daikou_fenshu=shendikou_daikou_fenshu;
}

public Double getShendikou_daikou_fenshu () {
return this.shendikou_daikou_fenshu;
}

public void setShendikou_daikou_jine (Double shendikou_daikou_jine) {
	this.shendikou_daikou_jine=shendikou_daikou_jine;
}

public Double getShendikou_daikou_jine () {
return this.shendikou_daikou_jine;
}

public void setShendikou_daikou_shuie (Double shendikou_daikou_shuie) {
	this.shendikou_daikou_shuie=shendikou_daikou_shuie;
}

public Double getShendikou_daikou_shuie () {
return this.shendikou_daikou_shuie;
}

public void setShendikou_qita_fenshu (Double shendikou_qita_fenshu) {
	this.shendikou_qita_fenshu=shendikou_qita_fenshu;
}

public Double getShendikou_qita_fenshu () {
return this.shendikou_qita_fenshu;
}

public void setShendikou_qita_jine (Double shendikou_qita_jine) {
	this.shendikou_qita_jine=shendikou_qita_jine;
}

public Double getShendikou_qita_jine () {
return this.shendikou_qita_jine;
}

public void setShendikou_qita_shuie (Double shendikou_qita_shuie) {
	this.shendikou_qita_shuie=shendikou_qita_shuie;
}

public Double getShendikou_qita_shuie () {
return this.shendikou_qita_shuie;
}

public void setShendikou_pingzheng_fenshu (Double shendikou_pingzheng_fenshu) {
	this.shendikou_pingzheng_fenshu=shendikou_pingzheng_fenshu;
}

public Double getShendikou_pingzheng_fenshu () {
return this.shendikou_pingzheng_fenshu;
}

public void setShendikou_pingzheng_jine (Double shendikou_pingzheng_jine) {
	this.shendikou_pingzheng_jine=shendikou_pingzheng_jine;
}

public Double getShendikou_pingzheng_jine () {
return this.shendikou_pingzheng_jine;
}

public void setShendikou_pingzheng_shuie (Double shendikou_pingzheng_shuie) {
	this.shendikou_pingzheng_shuie=shendikou_pingzheng_shuie;
}

public Double getShendikou_pingzheng_shuie () {
return this.shendikou_pingzheng_shuie;
}

public void setShendikou_jinxiang_fenshu (Double shendikou_jinxiang_fenshu) {
	this.shendikou_jinxiang_fenshu=shendikou_jinxiang_fenshu;
}

public Double getShendikou_jinxiang_fenshu () {
return this.shendikou_jinxiang_fenshu;
}

public void setShendikou_jinxiang_jine (Double shendikou_jinxiang_jine) {
	this.shendikou_jinxiang_jine=shendikou_jinxiang_jine;
}

public Double getShendikou_jinxiang_jine () {
return this.shendikou_jinxiang_jine;
}

public void setShendikou_jinxiang_shuie (Double shendikou_jinxiang_shuie) {
	this.shendikou_jinxiang_shuie=shendikou_jinxiang_shuie;
}

public Double getShendikou_jinxiang_shuie () {
return this.shendikou_jinxiang_shuie;
}

public void setShendikou_dikouheji_fenshu (Double shendikou_dikouheji_fenshu) {
	this.shendikou_dikouheji_fenshu=shendikou_dikouheji_fenshu;
}

public Double getShendikou_dikouheji_fenshu () {
return this.shendikou_dikouheji_fenshu;
}

public void setShendikou_dikouheji_jine (Double shendikou_dikouheji_jine) {
	this.shendikou_dikouheji_jine=shendikou_dikouheji_jine;
}

public Double getShendikou_dikouheji_jine () {
return this.shendikou_dikouheji_jine;
}

public void setShendikou_dikouheji_shuie (Double shendikou_dikouheji_shuie) {
	this.shendikou_dikouheji_shuie=shendikou_dikouheji_shuie;
}

public Double getShendikou_dikouheji_shuie () {
return this.shendikou_dikouheji_shuie;
}

public void setZhuanchu_mianshui_shuie (Double zhuanchu_mianshui_shuie) {
	this.zhuanchu_mianshui_shuie=zhuanchu_mianshui_shuie;
}

public Double getZhuanchu_mianshui_shuie () {
return this.zhuanchu_mianshui_shuie;
}

public void setZhuanchu_fulixiaofei_shuie (Double zhuanchu_fulixiaofei_shuie) {
	this.zhuanchu_fulixiaofei_shuie=zhuanchu_fulixiaofei_shuie;
}

public Double getZhuanchu_fulixiaofei_shuie () {
return this.zhuanchu_fulixiaofei_shuie;
}

public void setZhuanchu_feisunshi_shuie (Double zhuanchu_feisunshi_shuie) {
	this.zhuanchu_feisunshi_shuie=zhuanchu_feisunshi_shuie;
}

public Double getZhuanchu_feisunshi_shuie () {
return this.zhuanchu_feisunshi_shuie;
}

public void setZhuanchu_jianyijishui_shuie (Double zhuanchu_jianyijishui_shuie) {
	this.zhuanchu_jianyijishui_shuie=zhuanchu_jianyijishui_shuie;
}

public Double getZhuanchu_jianyijishui_shuie () {
return this.zhuanchu_jianyijishui_shuie;
}

public void setZhuanchu_mianditui_shuie (Double zhuanchu_mianditui_shuie) {
	this.zhuanchu_mianditui_shuie=zhuanchu_mianditui_shuie;
}

public Double getZhuanchu_mianditui_shuie () {
return this.zhuanchu_mianditui_shuie;
}

public void setZhuanchu_nashuijiancha_shuie (Double zhuanchu_nashuijiancha_shuie) {
	this.zhuanchu_nashuijiancha_shuie=zhuanchu_nashuijiancha_shuie;
}

public Double getZhuanchu_nashuijiancha_shuie () {
return this.zhuanchu_nashuijiancha_shuie;
}

public void setZhuanchu_hongzizhuanyong_shuie (Double zhuanchu_hongzizhuanyong_shuie) {
	this.zhuanchu_hongzizhuanyong_shuie=zhuanchu_hongzizhuanyong_shuie;
}

public Double getZhuanchu_hongzizhuanyong_shuie () {
return this.zhuanchu_hongzizhuanyong_shuie;
}

public void setZhuanchu_dijianqianshui_shuie (Double zhuanchu_dijianqianshui_shuie) {
	this.zhuanchu_dijianqianshui_shuie=zhuanchu_dijianqianshui_shuie;
}

public Double getZhuanchu_dijianqianshui_shuie () {
return this.zhuanchu_dijianqianshui_shuie;
}

public void setZhuanchu_tuishui_shuie (Double zhuanchu_tuishui_shuie) {
	this.zhuanchu_tuishui_shuie=zhuanchu_tuishui_shuie;
}

public Double getZhuanchu_tuishui_shuie () {
return this.zhuanchu_tuishui_shuie;
}

public void setZhuanchu_zhuchuqingxing_shuie (Double zhuanchu_zhuchuqingxing_shuie) {
	this.zhuanchu_zhuchuqingxing_shuie=zhuanchu_zhuchuqingxing_shuie;
}

public Double getZhuanchu_zhuchuqingxing_shuie () {
return this.zhuanchu_zhuchuqingxing_shuie;
}

public void setDaidikou_shuikong_fenshu (Double daidikou_shuikong_fenshu) {
	this.daidikou_shuikong_fenshu=daidikou_shuikong_fenshu;
}

public Double getDaidikou_shuikong_fenshu () {
return this.daidikou_shuikong_fenshu;
}

public void setDaidikou_shuikong_jine (Double daidikou_shuikong_jine) {
	this.daidikou_shuikong_jine=daidikou_shuikong_jine;
}

public Double getDaidikou_shuikong_jine () {
return this.daidikou_shuikong_jine;
}

public void setDaidikou_shuikong_shuie (Double daidikou_shuikong_shuie) {
	this.daidikou_shuikong_shuie=daidikou_shuikong_shuie;
}

public Double getDaidikou_shuikong_shuie () {
return this.daidikou_shuikong_shuie;
}

public void setDaidikou_qichuweishenbao_fenshu (Double daidikou_qichuweishenbao_fenshu) {
	this.daidikou_qichuweishenbao_fenshu=daidikou_qichuweishenbao_fenshu;
}

public Double getDaidikou_qichuweishenbao_fenshu () {
return this.daidikou_qichuweishenbao_fenshu;
}

public void setDaidikou_qichuweishenbao_jine (Double daidikou_qichuweishenbao_jine) {
	this.daidikou_qichuweishenbao_jine=daidikou_qichuweishenbao_jine;
}

public Double getDaidikou_qichuweishenbao_jine () {
return this.daidikou_qichuweishenbao_jine;
}

public void setDaidikou_qichuweishenbao_shuie (Double daidikou_qichuweishenbao_shuie) {
	this.daidikou_qichuweishenbao_shuie=daidikou_qichuweishenbao_shuie;
}

public Double getDaidikou_qichuweishenbao_shuie () {
return this.daidikou_qichuweishenbao_shuie;
}

public void setDaidikou_benqiweishenbao_fenshu (Double daidikou_benqiweishenbao_fenshu) {
	this.daidikou_benqiweishenbao_fenshu=daidikou_benqiweishenbao_fenshu;
}

public Double getDaidikou_benqiweishenbao_fenshu () {
return this.daidikou_benqiweishenbao_fenshu;
}

public void setDaidikou_benqiweishenbao_jine (Double daidikou_benqiweishenbao_jine) {
	this.daidikou_benqiweishenbao_jine=daidikou_benqiweishenbao_jine;
}

public Double getDaidikou_benqiweishenbao_jine () {
return this.daidikou_benqiweishenbao_jine;
}

public void setDaidikou_benqiweishenbao_shuie (Double daidikou_benqiweishenbao_shuie) {
	this.daidikou_benqiweishenbao_shuie=daidikou_benqiweishenbao_shuie;
}

public Double getDaidikou_benqiweishenbao_shuie () {
return this.daidikou_benqiweishenbao_shuie;
}

public void setDaidikou_qimoweishenbao_fenshu (Double daidikou_qimoweishenbao_fenshu) {
	this.daidikou_qimoweishenbao_fenshu=daidikou_qimoweishenbao_fenshu;
}

public Double getDaidikou_qimoweishenbao_fenshu () {
return this.daidikou_qimoweishenbao_fenshu;
}

public void setDaidikou_qimoweishenbao_jine (Double daidikou_qimoweishenbao_jine) {
	this.daidikou_qimoweishenbao_jine=daidikou_qimoweishenbao_jine;
}

public Double getDaidikou_qimoweishenbao_jine () {
return this.daidikou_qimoweishenbao_jine;
}

public void setDaidikou_qimoweishenbao_shuie (Double daidikou_qimoweishenbao_shuie) {
	this.daidikou_qimoweishenbao_shuie=daidikou_qimoweishenbao_shuie;
}

public Double getDaidikou_qimoweishenbao_shuie () {
return this.daidikou_qimoweishenbao_shuie;
}

public void setDaidikou_buxudikou_fenshu (Double daidikou_buxudikou_fenshu) {
	this.daidikou_buxudikou_fenshu=daidikou_buxudikou_fenshu;
}

public Double getDaidikou_buxudikou_fenshu () {
return this.daidikou_buxudikou_fenshu;
}

public void setDaidikou_buxudikou_jine (Double daidikou_buxudikou_jine) {
	this.daidikou_buxudikou_jine=daidikou_buxudikou_jine;
}

public Double getDaidikou_buxudikou_jine () {
return this.daidikou_buxudikou_jine;
}

public void setDaidikou_buxudikou_shuie (Double daidikou_buxudikou_shuie) {
	this.daidikou_buxudikou_shuie=daidikou_buxudikou_shuie;
}

public Double getDaidikou_buxudikou_shuie () {
return this.daidikou_buxudikou_shuie;
}

public void setDaidikou_qitapingzheng_fenshu (Double daidikou_qitapingzheng_fenshu) {
	this.daidikou_qitapingzheng_fenshu=daidikou_qitapingzheng_fenshu;
}

public Double getDaidikou_qitapingzheng_fenshu () {
return this.daidikou_qitapingzheng_fenshu;
}

public void setDaidikou_qitapingzheng_jine (Double daidikou_qitapingzheng_jine) {
	this.daidikou_qitapingzheng_jine=daidikou_qitapingzheng_jine;
}

public Double getDaidikou_qitapingzheng_jine () {
return this.daidikou_qitapingzheng_jine;
}

public void setDaidikou_qitapingzheng_shuie (Double daidikou_qitapingzheng_shuie) {
	this.daidikou_qitapingzheng_shuie=daidikou_qitapingzheng_shuie;
}

public Double getDaidikou_qitapingzheng_shuie () {
return this.daidikou_qitapingzheng_shuie;
}

public void setDaidikou_haiguan_fenshu (Double daidikou_haiguan_fenshu) {
	this.daidikou_haiguan_fenshu=daidikou_haiguan_fenshu;
}

public Double getDaidikou_haiguan_fenshu () {
return this.daidikou_haiguan_fenshu;
}

public void setDaidikou_haiguan_jine (Double daidikou_haiguan_jine) {
	this.daidikou_haiguan_jine=daidikou_haiguan_jine;
}

public Double getDaidikou_haiguan_jine () {
return this.daidikou_haiguan_jine;
}

public void setDaidikou_haiguan_shuie (Double daidikou_haiguan_shuie) {
	this.daidikou_haiguan_shuie=daidikou_haiguan_shuie;
}

public Double getDaidikou_haiguan_shuie () {
return this.daidikou_haiguan_shuie;
}

public void setDaidikou_nongchanpin_fenshu (Double daidikou_nongchanpin_fenshu) {
	this.daidikou_nongchanpin_fenshu=daidikou_nongchanpin_fenshu;
}

public Double getDaidikou_nongchanpin_fenshu () {
return this.daidikou_nongchanpin_fenshu;
}

public void setDaidikou_nongchanpin_jine (Double daidikou_nongchanpin_jine) {
	this.daidikou_nongchanpin_jine=daidikou_nongchanpin_jine;
}

public Double getDaidikou_nongchanpin_jine () {
return this.daidikou_nongchanpin_jine;
}

public void setDaidikou_nongchanpin_shuie (Double daidikou_nongchanpin_shuie) {
	this.daidikou_nongchanpin_shuie=daidikou_nongchanpin_shuie;
}

public Double getDaidikou_nongchanpin_shuie () {
return this.daidikou_nongchanpin_shuie;
}

public void setDaidikou_daikou_fenshu (Double daidikou_daikou_fenshu) {
	this.daidikou_daikou_fenshu=daidikou_daikou_fenshu;
}

public Double getDaidikou_daikou_fenshu () {
return this.daidikou_daikou_fenshu;
}

public void setDaidikou_daikou_jine (Double daidikou_daikou_jine) {
	this.daidikou_daikou_jine=daidikou_daikou_jine;
}

public Double getDaidikou_daikou_jine () {
return this.daidikou_daikou_jine;
}

public void setDaidikou_daikou_shuie (Double daidikou_daikou_shuie) {
	this.daidikou_daikou_shuie=daidikou_daikou_shuie;
}

public Double getDaidikou_daikou_shuie () {
return this.daidikou_daikou_shuie;
}

public void setDaidikou_qita_fenshu (Double daidikou_qita_fenshu) {
	this.daidikou_qita_fenshu=daidikou_qita_fenshu;
}

public Double getDaidikou_qita_fenshu () {
return this.daidikou_qita_fenshu;
}

public void setDaidikou_qita_jine (Double daidikou_qita_jine) {
	this.daidikou_qita_jine=daidikou_qita_jine;
}

public Double getDaidikou_qita_jine () {
return this.daidikou_qita_jine;
}

public void setDaidikou_qita_shuie (Double daidikou_qita_shuie) {
	this.daidikou_qita_shuie=daidikou_qita_shuie;
}

public Double getDaidikou_qita_shuie () {
return this.daidikou_qita_shuie;
}

public void setQita_shuikong_fenshu (Double qita_shuikong_fenshu) {
	this.qita_shuikong_fenshu=qita_shuikong_fenshu;
}

public Double getQita_shuikong_fenshu () {
return this.qita_shuikong_fenshu;
}

public void setQita_shuikong_jine (Double qita_shuikong_jine) {
	this.qita_shuikong_jine=qita_shuikong_jine;
}

public Double getQita_shuikong_jine () {
return this.qita_shuikong_jine;
}

public void setQita_shuikong_shuie (Double qita_shuikong_shuie) {
	this.qita_shuikong_shuie=qita_shuikong_shuie;
}

public Double getQita_shuikong_shuie () {
return this.qita_shuikong_shuie;
}

public void setQita_daikou_fenshu (Double qita_daikou_fenshu) {
	this.qita_daikou_fenshu=qita_daikou_fenshu;
}

public Double getQita_daikou_fenshu () {
return this.qita_daikou_fenshu;
}

public void setQita_daikou_jine (Double qita_daikou_jine) {
	this.qita_daikou_jine=qita_daikou_jine;
}

public Double getQita_daikou_jine () {
return this.qita_daikou_jine;
}

public void setQita_daikou_shuie (Double qita_daikou_shuie) {
	this.qita_daikou_shuie=qita_daikou_shuie;
}

public Double getQita_daikou_shuie () {
return this.qita_daikou_shuie;
}


}
