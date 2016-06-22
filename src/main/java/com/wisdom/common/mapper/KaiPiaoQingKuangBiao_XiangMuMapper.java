package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;
import com.wisdom.common.model.XiangMuTaiZhang;


public interface KaiPiaoQingKuangBiao_XiangMuMapper {

    KaiPiaoQingKuangBiao_XiangMu getKaiPiaoQingKuangBiao_XiangMuById(Long id);

    Integer addKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);

    Integer updateKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);
    
    List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByXiangmutaizhang_id(Long company_id);
    
   // List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByCompanyIds(List<Integer> list);
    List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByCompanyId(Integer company_id);
    
    List<KaiPiaoQingKuangBiao_XiangMu> getAllKaiPiaoQingKuangBiao_XiangMu(Long company_id);
    
    Integer updateKaiPiaoQingKuangBiao_XiangMuYiKaiPiaoJinE(Long id);
    
    Integer updateKaiPiaoQingKuangBiao_XiangMuYiKaiPiaoJinEAtAdd(Long id);

}
