package com.wisdom.common.mapper;
import com.wisdom.common.model.FenBaoXiangMuMingXi;


public interface FenBaoXiangMuMingXiMapper {

    FenBaoXiangMuMingXi getFenBaoXiangMuMingXiById(Long id);

    Integer addFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi);

    Integer updateFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi);

}
