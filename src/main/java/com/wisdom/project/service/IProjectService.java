package com.wisdom.project.service;



import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;

public interface IProjectService {


	
	public Boolean addProject(XiangMuTaiZhang xmtz);
	
	public KaiPiaoShenQingDan getKaiPiaoShenQingDanById(Long id);
	
	public XiangMuTaiZhang getXiangMuTaiZhangById(Long id);
	
	public Boolean updateProject(XiangMuTaiZhang xmtz);
	
	public List<XiangMuTaiZhang> getProjectsByCompanyId(Integer companyId);
	
	public List<Map<String, Object>> getMenu();
	
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Long projectId);
	
	public Boolean addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	public List<XiangMuTaiZhang> getXiangMuTaiZhangByCompanyId(Long companyId);
	
	public Boolean updateKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	public Boolean updateJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs);
	
	public Boolean addJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs);
	
	
	public JianYiJiShuiFangFaPuPiaoJiShui getJianYiJiShuiFangFaPuPiaoJiShuiById(Long id);
	public void updateTime(Long id, Timestamp hetongqiandingshijian);

	public List<KaiPiaoShenQingDan> getJianYiJiShuiFangFaZhuanPiaoJiShuiByProjectId(Integer projectId);

	public JianYiJiShuiFangFaZhuanPiaoJiShui getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Long id);

	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);


	public void addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id);

	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public void addWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);

	public void updateWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);

	public WeiKaiJuFaPiaoMingXi getWeiKaiJuFaPiaoMingXiById(Long id);

}
