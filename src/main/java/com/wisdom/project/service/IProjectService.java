package com.wisdom.project.service;



import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.XiangMuTaiZhang;

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
	
	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);
	
	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);
	
	public JianYiJiShuiFangFaPuPiaoJiShui getJianYiJiShuiFangFaPuPiaoJiShuiById(Long id);
	public void updateTime(Long id, Timestamp hetongqiandingshijian);
	
	public Boolean addQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa queRenShouRuFangShi_QiTa);
	
	public QueRenShouRuFangShi_QiTa getQueRenShouRuFangShi_QiTaById(Long id);
	
	public Boolean updateQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa queRenShouRuFangShi_QiTa);

	public Boolean addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa);

	public QueRenShouRuFangShi_LaoWuShiJianZhanBiFa getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(Long id);
	
	public Boolean updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa);

	public List<KaiPiaoShenQingDan> getJianYiJiShuiFangFaZhuanPiaoJiShuiByProjectId(Integer projectId);

	public JianYiJiShuiFangFaZhuanPiaoJiShui getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Long id);

	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(Long id);
	
	public Boolean addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
	
	public Boolean updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);

	public QueRenShouRuFangShi_YiWanGongGongZuoLiangFa getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(Long id);
	
	public Boolean addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
	
	public Boolean updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
}
