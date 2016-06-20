package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Company;

public interface CompanyMapper {

	List<Company> getAllCompanies();
	
	List<Company> getCompaniesByUid(Integer uid);
	Company getParentCompanyById(Integer id);
	
	List<Company> getXiangmuCompaniesByUid(Integer uid);
	
	List<Company>  getXiaoXiangFengGongsiCompaniesByUid(@Param("companyId")Integer companyId, @Param("uid")Integer uid);
	
	List<Company> getChildCompanyById(Integer id);
	
	Integer addXiangMuCompany(Company company);
	
	void updateCompanyName(@Param("companyName")String companyName, @Param("id")Integer id);
}

