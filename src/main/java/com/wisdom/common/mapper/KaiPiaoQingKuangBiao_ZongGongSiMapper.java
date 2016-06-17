package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;


public interface KaiPiaoQingKuangBiao_ZongGongSiMapper {

    KaiPiaoQingKuangBiao_ZongGongSi getKaiPiaoQingKuangBiao_ZongGongSiById(Long id);

    Integer addKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi);

    Integer updateKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi);
    
    List<KaiPiaoQingKuangBiao_ZongGongSi> getKaiPiaoQingKuangBiao_ZongGongSiByStatus(Integer status);
    
    List<KaiPiaoQingKuangBiao_ZongGongSi> getAllKaiPiaoQingKuangBiao_ZongGongSi(Long company_id);
    
    List<KaiPiaoQingKuangBiao_ZongGongSi> getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(Long company_id);

}