package com.wisdom.common.mapper;

import java.util.List;

import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;

public interface JianYiJiShuiFangFaZhuanPiaoJiShuiMapper {
	
	public Integer addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public JianYiJiShuiFangFaZhuanPiaoJiShui getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Long id);

	public void updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);
	
	public List<JianYiJiShuiFangFaZhuanPiaoJiShui> getJianYiJiShuiFangFaZhuanPiaoJiShuiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);


}
