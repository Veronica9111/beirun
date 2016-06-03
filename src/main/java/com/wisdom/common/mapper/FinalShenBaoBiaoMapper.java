package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.FinalShenBaoBiao;
import com.wisdom.common.model.Permission;

public interface FinalShenBaoBiaoMapper {



	FinalShenBaoBiao getShenBaoBiaoByProjectId(@Param("project_id")Integer projectId);
	

}


