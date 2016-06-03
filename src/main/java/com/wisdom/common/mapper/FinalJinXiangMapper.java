package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.FinalJinXiang;
import com.wisdom.common.model.Permission;

public interface FinalJinXiangMapper {



	FinalJinXiang getJinXiangByProjectId(@Param("project_id")Integer projectId);
	

}
