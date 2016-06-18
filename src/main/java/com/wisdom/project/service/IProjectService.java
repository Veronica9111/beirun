package com.wisdom.project.service;



import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;
import com.wisdom.common.model.JinXiangShuieZhuanChuMingXi_FenGongSi;
import com.wisdom.common.model.JinXiangShuieZhuanChuMingXi_XiangMuBu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_FenGongSi;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.BuDongChanFenQiDiKouBiao;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;
import com.wisdom.common.model.FenBaoXiangMuMingXi;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.PiaoJuWenJian;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.ShouQiKuanXiangMingXiBiao;
import com.wisdom.common.model.User;
import com.wisdom.common.model.User_Company;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi_YiBan;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.Role;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.XiaoXiang_XiangMu;
import com.wisdom.common.model.YiBanJiShuiFangFaNaShuiJianChaTiaoZheng;

public interface IProjectService {
	public BuDongChanFenQiDiKouBiao getBuDongChanFenQiDiKouBiaoById(Long id);

	public Boolean addBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao);

	public Boolean updateBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao);



	public JinXiangShuieZhuanChuMingXi_FenGongSi getJinXiangShuieZhuanChuMingXi_FenGongSiById(Long id);

	public Boolean addJinXiangShuieZhuanChuMingXi_FenGongSi(JinXiangShuieZhuanChuMingXi_FenGongSi jinXiangShuieZhuanChuMingXi_FenGongSi);

	public Boolean updateJinXiangShuieZhuanChuMingXi_FenGongSi(JinXiangShuieZhuanChuMingXi_FenGongSi jinXiangShuieZhuanChuMingXi_FenGongSi);

	public PiaoJuWenJian getPiaoJuWenJianById(Long id);

	public Boolean addPiaoJuWenJian(PiaoJuWenJian piaoJuWenJian);

	public Boolean updatePiaoJuWenJian(PiaoJuWenJian piaoJuWenJian);




	public JinXiangShuieZhuanChuMingXi_XiangMuBu getJinXiangShuieZhuanChuMingXi_XiangMuBuById(Long id);

	public Boolean addJinXiangShuieZhuanChuMingXi_XiangMuBu(JinXiangShuieZhuanChuMingXi_XiangMuBu jinXiangShuieZhuanChuMingXi_XiangMuBu);

	public Boolean updateJinXiangShuieZhuanChuMingXi_XiangMuBu(JinXiangShuieZhuanChuMingXi_XiangMuBu jinXiangShuieZhuanChuMingXi_XiangMuBu);

	public List<JinXiangFaPiaoMingXi_RenZheng> getJinXiangFaPiaoMingXi_RenZhengByCompanyId(Long company_id);

	public List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(Long company_id);
	
	public JinXiangFaPiaoMingXi_RenZheng getJinXiangFaPiaoMingXi_RenZhengById(Long id);

	public Boolean addJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng);

	public Boolean updateJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng);

	public JinXiangFaPiaoMingXi_FaPiao getJinXiangFaPiaoMingXi_FaPiaoById(Long id);

	public Boolean addJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

	public Boolean updateJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao);

	public List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByXiangmutaizhang_id(Long xiangmutaizhang_id);
	
	public KaiPiaoQingKuangBiao_XiangMu getKaiPiaoQingKuangBiao_XiangMuById(Long id);

	public Long addKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);

	public Boolean updateKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu);
	
	public Boolean addProject(XiangMuTaiZhang xmtz);
	
	public KaiPiaoShenQingDan getKaiPiaoShenQingDanById(Long id);
	
	public XiangMuTaiZhang getXiangMuTaiZhangById(Long id);
	
	public Boolean updateProject(XiangMuTaiZhang xmtz);
	
	public List<XiangMuTaiZhang> getXiangMuTaiZhangByCompany_id(Long companyId);
	
	public List<Map<String, Object>> getMenu(Integer uid);
	
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Long projectId);
	
	public Long addXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz);
	
	public Boolean updateKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	public Integer addKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd);
	
	public Boolean updateJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs);
	
	public Boolean addJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs);
	
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

	public Boolean updateProject(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);
	
	public Boolean addPuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf);
	
	public Boolean updatePuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf);
	
	public PuTongFaPiaoKaiJuMingXi getPuTongFaPiaoKaiJuMingXiById(Long id);
	
	public Boolean addShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf);
	
	public Boolean updateShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf);
	
	public ShouQiKuanXiangMingXiBiao getShouQiKuanXiangMingXiBiaoById(Long id);
	
	public List<ShouQiKuanXiangMingXiBiao> getShouQiKuanXiangMingXiBiaoByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(Long id);
	
	public Boolean addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
	
	public Boolean updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);

	public QueRenShouRuFangShi_YiWanGongGongZuoLiangFa getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(Long id);
	
	public Boolean addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
	
	public Boolean updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa);

	public FenBaoXiangMuMingXi getFenBaoXiangMuMingXiById(Long id);

	public Boolean addFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi);

	public Boolean updateFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi);

	public void addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id);

	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx);

	public void addWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);

	public void updateWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx);

	public WeiKaiJuFaPiaoMingXi getWeiKaiJuFaPiaoMingXiById(Long id);

	public XiaoXiang_XiangMu getXiaoXiang_XiangMuById(Long id);
	
	public Boolean addXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu);
	
	public Boolean updateXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu);

	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs);

	public WeiKaiJuFaPiaoMingXi_YiBan getWeiKaiJuFaPiaoMingXi_YiBanById(Long id);

	public void addWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan yb_wkjfpmx);

	public void updateWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan wkjfpmx_yb);
	
	public YiBanJiShuiFangFaNaShuiJianChaTiaoZheng getYiBanJiShuiFangFaNaShuiJianChaTiaoZhengById(Long id);

	public KaiPiaoQingKuangBiao_ZongGongSi getKaiPiaoQingKuangBiao_ZongGongSiById(Long id);

	public Boolean addKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi);

	public Boolean updateKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi);

	public KaiPiaoQingKuangBiao_FenGongSi getKaiPiaoQingKuangBiao_FenGongSiById(Long id);

	public Boolean addKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi);

	public Boolean updateKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi);

	public Boolean addYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(YiBanJiShuiFangFaNaShuiJianChaTiaoZheng yiBanJiShuiFangFaNaShuiJianChaTiaoZheng);

	public Boolean updateYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(YiBanJiShuiFangFaNaShuiJianChaTiaoZheng yiBanJiShuiFangFaNaShuiJianChaTiaoZheng);

	public User_Company getUser_CompanyById(Long id);

	public Boolean addUser_Company(User_Company user_Company);

	public Boolean updateUser_Company(User_Company user_Company);
	
	public Integer addXiangMuCompany(Company company);
	
	public List<Company> getCompaniesByUid(Integer uid);
	
	public List<KaiPiaoQingKuangBiao_ZongGongSi> getKaiPiaoQingKuangBiao_ZongGongSiByStatus(Integer status);
	
	public List<KaiPiaoQingKuangBiao_ZongGongSi> getAllKaiPiaoQingKuangBiao_ZongGongSi(Long companyId);
	
	public List<KaiPiaoQingKuangBiao_ZongGongSi> getAllKaiPiaoQingKuangBiao_ZongGongSiByCompanyId(Long companyId);
	
	public List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByXiangmutaizhang_id(Long xiangmutaizhang_id);
	
	public List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByCompanyId(Long company_id);
	
	//public List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByCompanyIds(List<Integer> companyIds);
	public List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByCompanyId(Integer company_id);

	public List<Role> getUserRoles(Integer uid);
	
	public User getUserById(Integer uid);

	public Integer approveJinXiangFaPiaoMingXi_RenZheng(Integer id, Integer yiji_shenhe_status, String beizhu);

	public Integer approveJinXiangFaPiaoMingXi_FaPiao(Integer id, Integer yiji_shenhe_status, String beizhu);
	
	public KaiPiaoShenQingDan getKaiPiaoShenQingDanByKaipiaoqingkuangbiao_xiangmu_id(Long id);
	
	public List<PuTongFaPiaoKaiJuMingXi> getPuTongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public List<ZhuanYongFaPiaoKaiJuMingXi> getZhuanYongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public List<JianYiJiShuiFangFaPuPiaoJiShui> getJianYiJiShuiFangFaPuPiaoJiShuiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public List<JianYiJiShuiFangFaZhuanPiaoJiShui> getJianYiJiShuiFangFaZhuanPiaoJiShuiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public List<QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa> getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public List<QueRenShouRuFangShi_YiWanGongGongZuoLiangFa> getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

	public List<QueRenShouRuFangShi_LaoWuShiJianZhanBiFa> getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);
	
	public 	List<QueRenShouRuFangShi_QiTa> getQueRenShouRuFangShi_QiTaByKaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id);

	public List<KaiPiaoQingKuangBiao_XiangMu>getAllKaiPiaoQingKuangBiao_XiangMu(Long companyId);
	
	public List<KaiPiaoQingKuangBiao_FenGongSi>getAllKaiPiaoQingKuangBiao_FenGongSi(Long companyId);
	
	public List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByXiangmutaizhang_id(Long xiangmutaizhang_id);

	public List<PiaoJuWenJian> getPiaoJuWenJianByCompany_id(Long companyId);
	
	public List<PiaoJuWenJian> getPiaoJuWenJianByCompany_idAndStatus(Long companyId);
	
	public Map<String, User> getUsers(Long companyId, Integer uid);
	
	public List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompany_idAndStatus(Long companyId);
	
}
