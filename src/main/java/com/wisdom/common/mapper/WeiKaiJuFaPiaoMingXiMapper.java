package com.wisdom.common.mapper;

import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi;

public interface WeiKaiJuFaPiaoMingXiMapper {
	public Integer addWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);

	public WeiKaiJuFaPiaoMingXi getWeiKaiJuFaPiaoMingXiById(Long id);

	public void updateWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);
}
