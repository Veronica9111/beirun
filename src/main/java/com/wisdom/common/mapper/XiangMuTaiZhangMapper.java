package com.wisdom.common.mapper;



import com.wisdom.common.model.XiangMuTaiZhang;;

public interface XiangMuTaiZhangMapper {

	Integer addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	XiangMuTaiZhang getXiangMuTaiZhangById(Integer id);
	
	void updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);

}
