package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;


public interface JinXiangFaPiaoMingXi_RenZhengMapper {

    JinXiangFaPiaoMingXi_RenZheng getJinXiangFaPiaoMingXi_RenZhengById(Long id);

    Integer addJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng);

    Integer updateJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng);

    List<JinXiangFaPiaoMingXi_RenZheng> getJinXiangFaPiaoMingXi_RenZhengByCompanyId(Long company_id);

}
