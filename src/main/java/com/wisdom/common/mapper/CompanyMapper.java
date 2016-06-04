package com.wisdom.common.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Company;

public interface CompanyMapper {

	List<Company> getAllCompanies();
	
	
}

