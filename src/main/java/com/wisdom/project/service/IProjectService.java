package com.wisdom.project.service;



import java.util.List;
import java.util.Map;

import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.XiangMuTaiZhang;

public interface IProjectService {


	
	public Boolean addProject(XiangMuTaiZhang xmtz);
	
	public XiangMuTaiZhang getXiangMuTaiZhangById(Integer id);
	
	public Boolean updateProject(XiangMuTaiZhang xmtz);
	
	public List<XiangMuTaiZhang> getProjectsByCompanyId(Integer companyId);
	
	public List<Map<String, Object>> getMenu();
	
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Integer projectId);
	
	public Boolean addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);

}
