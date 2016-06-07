package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.XiangMuTaiZhang;

public interface PuTongFaPiaoKaiJuMingXiMapper {

	void addPuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf);
	
	void updatePuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf);
	
	PuTongFaPiaoKaiJuMingXi getPuTongFaPiaoKaiJuMingXiById(Long id);
	
	List<PuTongFaPiaoKaiJuMingXi> getPuTongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

}
