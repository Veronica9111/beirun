package com.wisdom.common.mapper;



import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.XiangMuTaiZhang;;

public interface XiangMuTaiZhangMapper {

	Integer addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	XiangMuTaiZhang getXiangMuTaiZhangById(Long id);
	
	Integer updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	List<XiangMuTaiZhang> getXiangMuTaiZhangByCompanyId(Long company_id);
	
	void updateTime(@Param("id")Long id, @Param("hetongqiandingshijian")Timestamp hetongqiandingshijian);
	
	void addTime( @Param("hetongqiandingshijian")Timestamp hetongqiandingshijian);

}
