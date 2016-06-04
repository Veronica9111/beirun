package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.KaiPiaoShenQingDan;

public interface KaiPiaoShenQingDanMapper {

	void addKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Integer xiangmutaizhang_id);
}
