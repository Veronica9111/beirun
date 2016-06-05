package com.wisdom.common.mapper;



import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.XiaoXiang_XiangMu;;

public interface XiaoXiang_XiangMuMapper {

	public Integer addXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu);
	
	public Integer updateXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu);
	
	public XiaoXiang_XiangMu getXiaoXiang_XiangMuById(Long id);

}
