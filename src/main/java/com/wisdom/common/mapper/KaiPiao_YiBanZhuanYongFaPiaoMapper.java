package com.wisdom.common.mapper;
import com.wisdom.common.model.KaiPiao_YiBanZhuanYongFaPiao;


public interface KaiPiao_YiBanZhuanYongFaPiaoMapper {

    KaiPiao_YiBanZhuanYongFaPiao getKaiPiao_YiBanZhuanYongFaPiaoById(Long id);

    Integer addKaiPiao_YiBanZhuanYongFaPiao(KaiPiao_YiBanZhuanYongFaPiao kaiPiao_YiBanZhuanYongFaPiao);

    Integer updateKaiPiao_YiBanZhuanYongFaPiao(KaiPiao_YiBanZhuanYongFaPiao kaiPiao_YiBanZhuanYongFaPiao);

}
