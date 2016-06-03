package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.FinalXiaoXiang;
import com.wisdom.common.model.Permission;

public interface FinalXiaoXiangMapper {



	FinalXiaoXiang getXiaoXiangByProjectId(@Param("project_id")Integer projectId);
	

}
