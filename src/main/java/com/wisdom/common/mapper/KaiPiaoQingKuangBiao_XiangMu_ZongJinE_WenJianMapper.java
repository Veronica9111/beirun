package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian;


public interface KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianMapper {

    KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianById(Long id);

    Integer addKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian(KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian kaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian);

    Integer updateKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian(KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian kaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian);

	List<KaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJian> getKaiPiaoQingKuangBiao_XiangMu_ZongJinE_WenJianByCompanyId(
			Integer id);

}
