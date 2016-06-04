package com.wisdom.common.mapper;



import java.util.List;

import com.wisdom.common.model.XiangMuTaiZhang;;

public interface XiangMuTaiZhangMapper {

	Integer addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	XiangMuTaiZhang getXiangMuTaiZhangById(Integer id);
	
	void updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	List<XiangMuTaiZhang> getXiangMuTaiZhangByCompanyId(Integer company_id);

}
