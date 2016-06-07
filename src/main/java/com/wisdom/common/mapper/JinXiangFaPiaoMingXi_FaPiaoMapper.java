package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;


public interface JinXiangFaPiaoMingXi_FaPiaoMapper {

    JinXiangFaPiaoMingXi_FaPiao getJinXiangFaPiaoMingXi_FaPiaoById(Long id);

    Integer addJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

    Integer updateJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

	List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(Long company_id);

}
