package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.ShouQiKuanXiangMingXiBiao;
import com.wisdom.common.model.XiangMuTaiZhang;

public interface ShouQiKuanXiangMingXiBiaoMapper {

	void addShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf);
	
	void updateShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf);
	
	ShouQiKuanXiangMingXiBiao getShouQiKuanXiangMingXiBiaoById(Long id);
}
