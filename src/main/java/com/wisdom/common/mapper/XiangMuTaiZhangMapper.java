package com.wisdom.common.mapper;



import java.util.List;

import com.wisdom.common.model.XiangMuTaiZhang;;

public interface XiangMuTaiZhangMapper {

	Integer addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	XiangMuTaiZhang getXiangMuTaiZhangById(Long id);
	
	void updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	List<XiangMuTaiZhang> getXiangMuTaiZhangByCompanyId(Long company_id);

}
