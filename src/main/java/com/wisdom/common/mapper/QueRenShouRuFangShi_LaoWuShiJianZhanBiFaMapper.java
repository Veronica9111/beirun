package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Permission;
import com.wisdom.common.model.Phrase;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;

public interface QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper {

	Integer addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(QueRenShouRuFangShi_LaoWuShiJianZhanBiFa qrsrfs_lwsjzbf);
	
	QueRenShouRuFangShi_LaoWuShiJianZhanBiFa getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(long id);
	
	Integer updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(QueRenShouRuFangShi_LaoWuShiJianZhanBiFa qrsrfs_lwsjzbf);
	
	List<QueRenShouRuFangShi_LaoWuShiJianZhanBiFa> getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

}
