package com.wisdom.common.mapper;
import com.wisdom.common.model.KaiPiao_PuTongFaPiao;


public interface KaiPiao_PuTongFaPiaoMapper {

    KaiPiao_PuTongFaPiao getKaiPiao_PuTongFaPiaoById(Long id);

    Integer addKaiPiao_PuTongFaPiao(KaiPiao_PuTongFaPiao kaiPiao_PuTongFaPiao);

    Integer updateKaiPiao_PuTongFaPiao(KaiPiao_PuTongFaPiao kaiPiao_PuTongFaPiao);

	KaiPiao_PuTongFaPiao getKaiPiao_PuTongFaPiaoByKaipiaoqingkuangbiao_xiangmu_id(Long kaipiaoqingkuangbiao_xiangmu_id);
	
	KaiPiao_PuTongFaPiao getKaiPiao_PuTongFaPiaoByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

}
