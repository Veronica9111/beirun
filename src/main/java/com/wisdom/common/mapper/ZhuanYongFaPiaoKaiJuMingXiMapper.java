package com.wisdom.common.mapper;

import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;

public interface ZhuanYongFaPiaoKaiJuMingXiMapper {
	public Integer addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id);

	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);
}
