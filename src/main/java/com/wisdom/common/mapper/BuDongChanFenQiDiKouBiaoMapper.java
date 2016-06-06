package com.wisdom.common.mapper;
import com.wisdom.common.model.BuDongChanFenQiDiKouBiao;


public interface BuDongChanFenQiDiKouBiaoMapper {

    BuDongChanFenQiDiKouBiao getBuDongChanFenQiDiKouBiaoById(Long id);

    Integer addBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao);

    Integer updateBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao);

}
