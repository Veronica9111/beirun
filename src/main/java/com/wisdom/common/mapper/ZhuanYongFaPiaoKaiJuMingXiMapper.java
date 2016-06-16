package com.wisdom.common.mapper;

import java.util.List;

import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;

public interface ZhuanYongFaPiaoKaiJuMingXiMapper {
	public Integer addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id);

	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);
	
	public List<ZhuanYongFaPiaoKaiJuMingXi> getZhuanYongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
}
