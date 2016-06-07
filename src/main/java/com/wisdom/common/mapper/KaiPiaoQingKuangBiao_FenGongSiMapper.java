package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.KaiPiaoQingKuangBiao_FenGongSi;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;

public interface KaiPiaoQingKuangBiao_FenGongSiMapper {

    KaiPiaoQingKuangBiao_FenGongSi getKaiPiaoQingKuangBiao_FenGongSiById(Long id);

    Integer addKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi);

    Integer updateKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi);

    List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByCompanyId(Long company_id);
    
    List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByXiangmutaizhang_id(Long xiangmutaizhang_id);
    
    List<KaiPiaoQingKuangBiao_FenGongSi> getAllKaiPiaoQingKuangBiao_FenGongSi(Long company_id);

}
