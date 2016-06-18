package com.wisdom.common.mapper;

import java.util.List;

import com.wisdom.common.model.Company;

public interface CompanyMapper {

	List<Company> getAllCompanies();
	
	List<Company> getCompaniesByUid(Integer uid);
	Company getParentCompanyById(Integer id);
	
	Integer addXiangMuCompany(Company company);
}

