package com.wisdom.common.mapper;
import java.util.List;

import com.wisdom.common.model.PiaoJuWenJian;


public interface PiaoJuWenJianMapper {

    PiaoJuWenJian getPiaoJuWenJianById(Long id);

    Integer addPiaoJuWenJian(PiaoJuWenJian piaoJuWenJian);

    Integer updatePiaoJuWenJian(PiaoJuWenJian piaoJuWenJian);

	List<PiaoJuWenJian> getPiaoJuWenJianByCompany_id(Long companyId);

}
