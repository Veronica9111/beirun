package com.wisdom.common.mapper;
import com.wisdom.common.model.User_Company;


public interface User_CompanyMapper {

    User_Company getUser_CompanyById(Long id);

    Integer addUser_Company(User_Company user_Company);

    Integer updateUser_Company(User_Company user_Company);

}
