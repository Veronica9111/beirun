package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Permission;
import com.wisdom.common.model.Phrase;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;

public interface QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper {

	public QueRenShouRuFangShi_YiWanGongGongZuoLiangFa getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById( Long id);
	
	public Integer addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
	
	public Integer updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
}
