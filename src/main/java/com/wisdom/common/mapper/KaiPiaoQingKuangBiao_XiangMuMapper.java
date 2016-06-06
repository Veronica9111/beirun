package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.XiangMuTaiZhang;


public interface KaiPiaoQingKuangBiao_XiangMuMapper {

    KaiPiaoQingKuangBiao_XiangMu getKaiPiaoQingKuangBiao_XiangMuById(Long id);

    Integer addKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);

    Integer updateKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);
    
    List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByXiangmutaizhang_id(Long company_id);

}
