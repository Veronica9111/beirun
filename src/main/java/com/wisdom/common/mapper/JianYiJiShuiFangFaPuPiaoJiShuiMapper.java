package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.XiangMuTaiZhang;

public interface JianYiJiShuiFangFaPuPiaoJiShuiMapper {

	void addJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffpphs);
	
	void updateJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffpphs);
	
	JianYiJiShuiFangFaPuPiaoJiShui getJianYiJiShuiFangFaPuPiaoJiShuiById(Long id);
	
	List<JianYiJiShuiFangFaPuPiaoJiShui> getJianYiJiShuiFangFaPuPiaoJiShuiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

}
