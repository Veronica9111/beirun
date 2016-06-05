package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.XiangMuTaiZhang;

public interface KaiPiaoShenQingDanMapper {

	void addKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Long kaipiaoqingkuangbiao_xiangmu_id);
	
	void updateKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	KaiPiaoShenQingDan getKaiPiaoShenQingDanById(Long id);
}
