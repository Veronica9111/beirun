package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Permission;
import com.wisdom.common.model.Phrase;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;

public interface QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper {

	public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(Long id);
	
	public Integer addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
	
	public Integer updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);

}
