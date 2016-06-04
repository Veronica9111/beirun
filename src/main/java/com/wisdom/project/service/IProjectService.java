package com.wisdom.project.service;



import com.wisdom.common.model.XiangMuTaiZhang;

public interface IProjectService {


	
	public Boolean addProject(XiangMuTaiZhang xmtz);
	
	public XiangMuTaiZhang getXiangMuTaiZhangById(Integer id);
	
	public Boolean updateProject(XiangMuTaiZhang xmtz);
	

}
