package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;


public interface JinXiangFaPiaoMingXi_FaPiaoMapper {

    JinXiangFaPiaoMingXi_FaPiao getJinXiangFaPiaoMingXi_FaPiaoById(Long id);

    Integer addJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

    Integer updateJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

	List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(Long company_id);

	Integer approveJinXiangFaPiaoMingXi_FaPiao(Integer id,Integer yiji_shenhe_status,String beizhu);
	
	List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByXiangmutaizhang_id(Long xiangmutaizhang_id);

	List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompany_idAndStatus(Long companyId);
}
