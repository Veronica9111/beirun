package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Permission;
import com.wisdom.common.model.Phrase;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;

public interface QueRenShouRuFangShi_QiTaMapper {

	Integer addQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt);
	
	QueRenShouRuFangShi_QiTa getQueRenShouRuFangShi_QiTaById(Long id);
	
	Integer updateQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt);

}
