package com.wisdom.project.service.impl;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdom.common.mapper.BuDongChanFenQiDiKouBiaoMapper;
import com.wisdom.common.mapper.CompanyMapper;
import com.wisdom.common.mapper.FenBaoXiangMuMingXiMapper;
import com.wisdom.common.mapper.JianYiJiShuiFangFaZhuanPiaoJiShuiMapper;
import com.wisdom.common.mapper.JinXiangFaPiaoMingXi_FaPiaoMapper;
import com.wisdom.common.mapper.JinXiangFaPiaoMingXi_RenZhengMapper;
import com.wisdom.common.mapper.JinXiangShuieZhuanChuMingXi_FenGongSiMapper;
import com.wisdom.common.mapper.JinXiangShuieZhuanChuMingXi_XiangMuBuMapper;
import com.wisdom.common.mapper.KaiPiaoQingKuangBiao_FenGongSiMapper;
import com.wisdom.common.mapper.KaiPiaoQingKuangBiao_XiangMuMapper;
import com.wisdom.common.mapper.KaiPiaoQingKuangBiao_ZongGongSiMapper;
import com.wisdom.common.mapper.JianYiJiShuiFangFaPuPiaoJiShuiMapper;
import com.wisdom.common.mapper.KaiPiaoShenQingDanMapper;
import com.wisdom.common.mapper.WeiKaiJuFaPiaoMingXiMapper;
import com.wisdom.common.mapper.WeiKaiJuFaPiaoMingXi_YiBanMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.mapper.ZhuanYongFaPiaoKaiJuMingXiMapper;
import com.wisdom.common.mapper.PermissionMapper;
import com.wisdom.common.mapper.PuTongFaPiaoKaiJuMingXiMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_QiTaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;
import com.wisdom.common.mapper.QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;
import com.wisdom.common.mapper.RecordMapper;
import com.wisdom.common.mapper.RoleMapper;
import com.wisdom.common.mapper.ShouQiKuanXiangMingXiBiaoMapper;
import com.wisdom.common.mapper.UserMapper;
import com.wisdom.common.mapper.User_CompanyMapper;
import com.wisdom.common.mapper.XiangMuTaiZhangMapper;
import com.wisdom.common.mapper.XiaoXiang_XiangMuMapper;
import com.wisdom.common.mapper.YiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper;
import com.wisdom.common.model.BuDongChanFenQiDiKouBiao;
import com.wisdom.common.model.Company;
import com.wisdom.common.model.FenBaoXiangMuMingXi;
import com.wisdom.common.model.JianYiJiShuiFangFaZhuanPiaoJiShui;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_FaPiao;
import com.wisdom.common.model.JinXiangFaPiaoMingXi_RenZheng;
import com.wisdom.common.model.JinXiangShuieZhuanChuMingXi_FenGongSi;
import com.wisdom.common.model.JinXiangShuieZhuanChuMingXi_XiangMuBu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_FenGongSi;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_XiangMu;
import com.wisdom.common.model.KaiPiaoQingKuangBiao_ZongGongSi;
import com.wisdom.common.model.JianYiJiShuiFangFaPuPiaoJiShui;
import com.wisdom.common.model.KaiPiaoShenQingDan;
import com.wisdom.common.model.PuTongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi;
import com.wisdom.common.model.WeiKaiJuFaPiaoMingXi_YiBan;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.ZhuanYongFaPiaoKaiJuMingXi;
import com.wisdom.common.model.QueRenShouRuFangShi_LaoWuShiJianZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_QiTa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa;
import com.wisdom.common.model.QueRenShouRuFangShi_YiWanGongGongZuoLiangFa;
import com.wisdom.common.model.Record;
import com.wisdom.common.model.Role;
import com.wisdom.common.model.ShouQiKuanXiangMingXiBiao;
import com.wisdom.common.model.User;
import com.wisdom.common.model.User_Company;
import com.wisdom.common.model.XiangMuTaiZhang;
import com.wisdom.common.model.XiaoXiang_XiangMu;
import com.wisdom.common.model.YiBanJiShuiFangFaNaShuiJianChaTiaoZheng;
import com.wisdom.invoice.service.IInvoiceService;
import com.wisdom.project.service.IProjectService;
import com.wisdom.user.service.impl.UserServiceImpl;

@Service("projectService")
public class ProjectServiceImpl implements IProjectService {
    
	@Autowired
    private JinXiangFaPiaoMingXi_RenZhengMapper jinXiangFaPiaoMingXi_RenZhengMapper;

    @Autowired
    private JinXiangFaPiaoMingXi_FaPiaoMapper jinXiangFaPiaoMingXi_FaPiaoMapper;
	
    @Autowired
    private KaiPiaoQingKuangBiao_FenGongSiMapper kaiPiaoQingKuangBiao_FenGongSiMapper;
    
	@Autowired
	private XiangMuTaiZhangMapper xiangmutaizhangMapper;

	@Autowired
	private CompanyMapper companyMapper;

    @Autowired
    private BuDongChanFenQiDiKouBiaoMapper buDongChanFenQiDiKouBiaoMapper;






    public void setBuDongChanFenQiDiKouBiaoMapper(BuDongChanFenQiDiKouBiaoMapper buDongChanFenQiDiKouBiaoMapper){
        this.buDongChanFenQiDiKouBiaoMapper = buDongChanFenQiDiKouBiaoMapper;
    }

    public BuDongChanFenQiDiKouBiaoMapper getBuDongChanFenQiDiKouBiaoMapper() {
        return buDongChanFenQiDiKouBiaoMapper;
    }







    @Override
    public BuDongChanFenQiDiKouBiao getBuDongChanFenQiDiKouBiaoById(Long id){
        return buDongChanFenQiDiKouBiaoMapper.getBuDongChanFenQiDiKouBiaoById(id);
    }

    @Override
    public Boolean addBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao){
        buDongChanFenQiDiKouBiaoMapper.addBuDongChanFenQiDiKouBiao(buDongChanFenQiDiKouBiao);
        return true;
    }

    @Override
    public Boolean updateBuDongChanFenQiDiKouBiao(BuDongChanFenQiDiKouBiao buDongChanFenQiDiKouBiao){
        buDongChanFenQiDiKouBiaoMapper.updateBuDongChanFenQiDiKouBiao(buDongChanFenQiDiKouBiao);
        return true;
    }


	@Autowired
	private KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper;

	@Autowired
	private JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper;

	@Autowired
	private JianYiJiShuiFangFaPuPiaoJiShuiMapper jianYiJiShuiFangFaPuPiaoJiShuiMapper;

	@Autowired
	private PuTongFaPiaoKaiJuMingXiMapper puTongFaPiaoKaiJuMingXiMapper;

	@Autowired
	private ShouQiKuanXiangMingXiBiaoMapper shouQiKuanXiangMingXiBiaoMapper;

	@Autowired
	private YiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper;

    @Autowired
    private FenBaoXiangMuMingXiMapper fenBaoXiangMuMingXiMapper;
	
	
    @Autowired
    private User_CompanyMapper user_CompanyMapper;
    @Autowired
    private KaiPiaoQingKuangBiao_XiangMuMapper kaiPiaoQingKuangBiao_XiangMuMapper;

    @Autowired
    private KaiPiaoQingKuangBiao_ZongGongSiMapper kaiPiaoQingKuangBiao_ZongGongSiMapper;
    
    @Autowired
    private RoleMapper roleMapper;
    
    @Autowired
    private UserMapper userMapper;
    
    public void setRoleMapper(RoleMapper roleMapper){
        this.roleMapper = roleMapper;
    }

    public RoleMapper getRoleMapper() {
        return roleMapper;
    }

    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
        
    }

    public void setJinXiangFaPiaoMingXi_RenZhengMapper(JinXiangFaPiaoMingXi_RenZhengMapper jinXiangFaPiaoMingXi_RenZhengMapper){
        this.jinXiangFaPiaoMingXi_RenZhengMapper = jinXiangFaPiaoMingXi_RenZhengMapper;
    }

    public JinXiangFaPiaoMingXi_RenZhengMapper getJinXiangFaPiaoMingXi_RenZhengMapper() {
        return jinXiangFaPiaoMingXi_RenZhengMapper;
    }

    public void setJinXiangFaPiaoMingXi_FaPiaoMapper(JinXiangFaPiaoMingXi_FaPiaoMapper jinXiangFaPiaoMingXi_FaPiaoMapper){
        this.jinXiangFaPiaoMingXi_FaPiaoMapper = jinXiangFaPiaoMingXi_FaPiaoMapper;
    }

    public JinXiangFaPiaoMingXi_FaPiaoMapper getJinXiangFaPiaoMingXi_FaPiaoMapper() {
        return jinXiangFaPiaoMingXi_FaPiaoMapper;
    }
    
    public void setKaiPiaoQingKuangBiao_FenGongSiMapper(KaiPiaoQingKuangBiao_FenGongSiMapper kaiPiaoQingKuangBiao_FenGongSiMapper){
        this.kaiPiaoQingKuangBiao_FenGongSiMapper = kaiPiaoQingKuangBiao_FenGongSiMapper;
    }

    public KaiPiaoQingKuangBiao_FenGongSiMapper getKaiPiaoQingKuangBiao_FenGongSiMapper() {
        return kaiPiaoQingKuangBiao_FenGongSiMapper;
    }

    public void setKaiPiaoQingKuangBiao_ZongGongSiMapper(KaiPiaoQingKuangBiao_ZongGongSiMapper kaiPiaoQingKuangBiao_ZongGongSiMapper){
        this.kaiPiaoQingKuangBiao_ZongGongSiMapper = kaiPiaoQingKuangBiao_ZongGongSiMapper;
    }

    public KaiPiaoQingKuangBiao_ZongGongSiMapper getKaiPiaoQingKuangBiao_ZongGongSiMapper() {
        return kaiPiaoQingKuangBiao_ZongGongSiMapper;
    }

    @Override
    public KaiPiaoQingKuangBiao_FenGongSi getKaiPiaoQingKuangBiao_FenGongSiById(Long id){
        return kaiPiaoQingKuangBiao_FenGongSiMapper.getKaiPiaoQingKuangBiao_FenGongSiById(id);
    }

    @Override
    public Boolean addKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi){
        kaiPiaoQingKuangBiao_FenGongSiMapper.addKaiPiaoQingKuangBiao_FenGongSi(kaiPiaoQingKuangBiao_FenGongSi);
        return true;
    }

    @Override
    public Boolean updateKaiPiaoQingKuangBiao_FenGongSi(KaiPiaoQingKuangBiao_FenGongSi kaiPiaoQingKuangBiao_FenGongSi){
        kaiPiaoQingKuangBiao_FenGongSiMapper.updateKaiPiaoQingKuangBiao_FenGongSi(kaiPiaoQingKuangBiao_FenGongSi);
        return true;
    }


    public void setFenBaoXiangMuMingXiMapper(FenBaoXiangMuMingXiMapper fenBaoXiangMuMingXiMapper){
        this.fenBaoXiangMuMingXiMapper = fenBaoXiangMuMingXiMapper;
    }

    public FenBaoXiangMuMingXiMapper getFenBaoXiangMuMingXiMapper() {
        return fenBaoXiangMuMingXiMapper;
    }
    
    
	public void setYiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper(YiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper){
        this.yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper = yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper;
    }

    public YiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper getYiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper() {
        return yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper;
    }
	
	public ShouQiKuanXiangMingXiBiaoMapper getShouQiKuanXiangMingXiBiaoMapper() {
		return shouQiKuanXiangMingXiBiaoMapper;
	}

	public void setShouQiKuanXiangMingXiBiaoMapper(ShouQiKuanXiangMingXiBiaoMapper shouQiKuanXiangMingXiBiaoMapper) {
		this.shouQiKuanXiangMingXiBiaoMapper = shouQiKuanXiangMingXiBiaoMapper;
	}

	public PuTongFaPiaoKaiJuMingXiMapper getPuTongFaPiaoKaiJuMingXiMapper() {
		return puTongFaPiaoKaiJuMingXiMapper;
	}

	public void setPuTongFaPiaoKaiJuMingXiMapper(PuTongFaPiaoKaiJuMingXiMapper puTongFaPiaoKaiJuMingXiMapper) {
		this.puTongFaPiaoKaiJuMingXiMapper = puTongFaPiaoKaiJuMingXiMapper;
	}

	private ZhuanYongFaPiaoKaiJuMingXiMapper zhuanYongFaPiaoKaiJuMingXiMapper;

	@Autowired
	private WeiKaiJuFaPiaoMingXiMapper weiKaiJuFaPiaoMingXiMapper;

	@Autowired
	private WeiKaiJuFaPiaoMingXi_YiBanMapper weiKaiJuFaPiaoMingXi_YiBanMapper;

	@Autowired
	public WeiKaiJuFaPiaoMingXiMapper getWeiKaiJuFaPiaoMingXiMapper() {
		return weiKaiJuFaPiaoMingXiMapper;
	}

	public KaiPiaoQingKuangBiao_XiangMuMapper getKaiPiaoQingKuangBiao_XiangMuMapper() {
		return kaiPiaoQingKuangBiao_XiangMuMapper;
	}

	public void setKaiPiaoQingKuangBiao_XiangMuMapper(
			KaiPiaoQingKuangBiao_XiangMuMapper kaiPiaoQingKuangBiao_XiangMuMapper) {
		this.kaiPiaoQingKuangBiao_XiangMuMapper = kaiPiaoQingKuangBiao_XiangMuMapper;
	}

	@Autowired
	public void setWeiKaiJuFaPiaoMingXiMapper(WeiKaiJuFaPiaoMingXiMapper weiKaiJuFaPiaoMingXiMapper) {
		this.weiKaiJuFaPiaoMingXiMapper = weiKaiJuFaPiaoMingXiMapper;
	}

	@Autowired
	public WeiKaiJuFaPiaoMingXi_YiBanMapper getWeiKaiJuFaPiaoMingXi_YiBanMapper() {
		return weiKaiJuFaPiaoMingXi_YiBanMapper;
	}

	@Autowired
	public void setWeiKaiJuFaPiaoMingXi_YiBanMapper(WeiKaiJuFaPiaoMingXi_YiBanMapper weiKaiJuFaPiaoMingXi_YiBanMapper) {
		this.weiKaiJuFaPiaoMingXi_YiBanMapper = weiKaiJuFaPiaoMingXi_YiBanMapper;
	}

	@Autowired
	public ZhuanYongFaPiaoKaiJuMingXiMapper getZhuanYongFaPiaoKaiJuMingXiMapper() {
		return zhuanYongFaPiaoKaiJuMingXiMapper;
	}

	public void setzhuanYongFaPiaoKaiJuMingXiMapper(ZhuanYongFaPiaoKaiJuMingXiMapper zhuanYongFaPiaoKaiJuMingXiMapper) {
		this.zhuanYongFaPiaoKaiJuMingXiMapper = zhuanYongFaPiaoKaiJuMingXiMapper;
	}

	private QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;

	@Autowired
	private QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;

	@Autowired
	private QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;

	@Autowired
	private QueRenShouRuFangShi_QiTaMapper queRenShouRuFangShi_QiTaMapper;

	@Autowired
	private XiaoXiang_XiangMuMapper xiaoXiang_XiangMuMapper;

	public JianYiJiShuiFangFaPuPiaoJiShuiMapper getJianYiJiShuiFangFaPuPiaoJiShuiMapper() {
		return jianYiJiShuiFangFaPuPiaoJiShuiMapper;
	}

	public void setJianYiJiShuiFangFaPuPiaoJiShuiMapper(
			JianYiJiShuiFangFaPuPiaoJiShuiMapper jianYiJiShuiFangFaPuPiaoJiShuiMapper) {
		this.jianYiJiShuiFangFaPuPiaoJiShuiMapper = jianYiJiShuiFangFaPuPiaoJiShuiMapper;
	}

    public void setUser_CompanyMapper(User_CompanyMapper user_CompanyMapper){
        this.user_CompanyMapper = user_CompanyMapper;
    }

    public User_CompanyMapper getUser_CompanyMapper() {
        return user_CompanyMapper;
    }

	
	private static final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);

	public void setXiangMuTaiZhangMapper(XiangMuTaiZhangMapper xiangmutaizhangMapper) {
		this.xiangmutaizhangMapper = xiangmutaizhangMapper;
	}

	public void setKaiPiaoShenQingDanMapper(KaiPiaoShenQingDanMapper kaiPiaoShenQingDanMapper) {
		this.kaiPiaoShenQingDanMapper = kaiPiaoShenQingDanMapper;
	}

	public void setJianYiJiShuiFangFaZhuanPiaoJiShuiMapper(
			JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper) {
		this.jianyijishuifangfazhuanpiaojishuiMapper = jianyijishuifangfazhuanpiaojishuiMapper;
	}

	public JianYiJiShuiFangFaZhuanPiaoJiShuiMapper getJianyijishuifangfazhuanpiaojishuiMapper() {
		return jianyijishuifangfazhuanpiaojishuiMapper;
	}

	public void setJianyijishuifangfazhuanpiaojishuiMapper(
			JianYiJiShuiFangFaZhuanPiaoJiShuiMapper jianyijishuifangfazhuanpiaojishuiMapper) {
		this.jianyijishuifangfazhuanpiaojishuiMapper = jianyijishuifangfazhuanpiaojishuiMapper;
	}

	public void setCompanyMapper(CompanyMapper companyMapper) {
		this.companyMapper = companyMapper;
	}

	public void setQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper(
			QueRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper) {
		this.queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper = queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper;
	}

	public void setQueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper(
			QueRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper) {
		this.queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper = queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper;
	}

	public void setQueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper(
			QueRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper) {
		this.queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper = queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper;
	}

	public void setQueRenShouRuFangShi_QiTaMapper(QueRenShouRuFangShi_QiTaMapper queRenShouRuFangShi_QiTaMapper) {
		this.queRenShouRuFangShi_QiTaMapper = queRenShouRuFangShi_QiTaMapper;
	}

	public void setXiaoXiang_XiangMuMapper(XiaoXiang_XiangMuMapper xiaoXiang_XiangMuMapper) {
		this.xiaoXiang_XiangMuMapper = xiaoXiang_XiangMuMapper;
	}

	@Override
	public Boolean addProject(XiangMuTaiZhang xmtz) {
		xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
		return true;
	}

	@Override
	public XiangMuTaiZhang getXiangMuTaiZhangById(Long id) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangById(id);
	}

	@Override
	public Boolean updateProject(XiangMuTaiZhang xmtz) {

		Integer result = xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		return true;
	}

	@Override
	public Boolean addJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {

		jianyijishuifangfazhuanpiaojishuiMapper.addJianYiJiShuiFangFaZhuanPiaoJiShui(jyjsffzpjs);
		return true;
	}

	public List<Company> getSubCompanyByParent(List<Company> companies, Integer parentId) {
		List<Company> retList = new ArrayList<>();
		for (Company company : companies) {
			if (company.getParent_id() == parentId) {
				retList.add(company);
			}
		}
		return retList;

	}

	@Override
	public List<Map<String, Object>> getMenu(Integer uid) {
		/*
		 * [ {'text':name, 'nodes': [{},{}]} ]
		 */
		List<Map<String, Object>> retList = new ArrayList<>();
		//List<Company> companies = companyMapper.getAllCompanies();
		List<Object> thirdList = new ArrayList<>();
		for(Integer i = 0; i < 5; i++){
			Map<String, Object> thirdLeaf = new HashMap<>();
			String text = "第三层菜单" + String.valueOf(i);
			thirdLeaf.put("text", text);
			thirdLeaf.put("level", "5");
			thirdList.add(thirdLeaf);
		}
		List<Object> secondList = new ArrayList<>();
		for(Integer i = 0; i < 3; i++){
			Map<String, Object> secondLeaf = new HashMap<>();
			String text = "第二层菜单" + String.valueOf(i);
			secondLeaf.put("text", text);
			secondLeaf.put("level", "4");
			secondLeaf.put("nodes", thirdList);
			secondList.add(secondLeaf);
		}
		
		List<Object> firstList = new ArrayList<>();
		for(Integer i = 0; i< 2; i++){
			Map<String, Object> firstLeaf = new HashMap<>();
			String text = "第一层菜单" + String.valueOf(i);
			firstLeaf.put("text", text);
			firstLeaf.put("level", "3");
			firstLeaf.put("nodes", secondList);
			firstList.add(firstLeaf);
		}
		
		List<Company> companies = new ArrayList<>();
		List<Role> roles = roleMapper.getUserRoles(uid);
		boolean showAll = false;
		for(Role role: roles){
			if(role.getName().contains("审核")||role.getName().contains("主任")||role.getName().contains("所长")){
				companies = companyMapper.getAllCompanies();
				showAll = true;
				break;
			}
		}
		if(!showAll){
			companies = this.getCompaniesByUid(uid);
		}
		
		for (Company company : companies) {
			if (company.getLevel() == 0) {
				List<Company> subCompanies = getSubCompanyByParent(companies, company.getId());
				List<Object> tmpSubList = new ArrayList<>();
				for (Company subCompany : subCompanies) {
					List<Company> subSubCompanies = getSubCompanyByParent(companies, subCompany.getId());

					List<Object> tmpList = new ArrayList<>();
					for (Company subSubCompany : subSubCompanies) {
						Map<String, Object> tmpMap = new HashMap<>();
						tmpMap.put("text", subSubCompany.getName());
						tmpMap.put("expanded", "false");
						tmpMap.put("level", "2");
						tmpMap.put("nodes", firstList);
						tmpMap.put("company_id", subSubCompany.getId());
						tmpList.add(tmpMap);
					}
					Map<String, Object> tmpMapSub = new HashMap<>();
					tmpMapSub.put("text", subCompany.getName());
					tmpMapSub.put("expanded", "false");
					tmpMapSub.put("level", "1");
					tmpMapSub.put("nodes", tmpList);
					tmpMapSub.put("company_id", subCompany.getId());
					tmpSubList.add(tmpMapSub);

				}
				Map<String, Object> tmpMapAll = new HashMap<>();
				tmpMapAll.put("text", company.getName());
				tmpMapAll.put("nodes", tmpSubList);
				tmpMapAll.put("expanded", "false");
				tmpMapAll.put("level", "0");
				tmpMapAll.put("company_id", company.getId());
				retList.add(tmpMapAll);
			}
		}

		return retList;
	}

	@Override
	public WeiKaiJuFaPiaoMingXi getWeiKaiJuFaPiaoMingXiById(Long id) {
		return weiKaiJuFaPiaoMingXiMapper.getWeiKaiJuFaPiaoMingXiById(id);
	}

	@Override
	public void addWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx) {
		weiKaiJuFaPiaoMingXiMapper.addWeiKaiJuFaPiaoMingXi(wkjfpmx);
	}

	@Override
	public void updateWeiKaiJuFaPiaoMingXi(WeiKaiJuFaPiaoMingXi wkjfpmx) {
		weiKaiJuFaPiaoMingXiMapper.updateWeiKaiJuFaPiaoMingXi(wkjfpmx);
	}

	@Override
	public WeiKaiJuFaPiaoMingXi_YiBan getWeiKaiJuFaPiaoMingXi_YiBanById(Long id) {
		return weiKaiJuFaPiaoMingXi_YiBanMapper.getWeiKaiJuFaPiaoMingXi_YiBanById(id);
	}

	@Override
	public void addWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan wkjfpmx_yb) {
		weiKaiJuFaPiaoMingXi_YiBanMapper.addWeiKaiJuFaPiaoMingXi_YiBan(wkjfpmx_yb);
	}

	@Override
	public void updateWeiKaiJuFaPiaoMingXi_YiBan(WeiKaiJuFaPiaoMingXi_YiBan wkjfpmx_yb) {
		weiKaiJuFaPiaoMingXi_YiBanMapper.updateWeiKaiJuFaPiaoMingXi_YiBan(wkjfpmx_yb);
	}

	@Override
	public ZhuanYongFaPiaoKaiJuMingXi getZhuanYongFaPiaoKaiJuMingXiById(Long id) {
		return zhuanYongFaPiaoKaiJuMingXiMapper.getZhuanYongFaPiaoKaiJuMingXiById(id);
	}

	@Override
	public void addZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx) {
		zhuanYongFaPiaoKaiJuMingXiMapper.addZhuanYongFaPiaoKaiJuMingXi(zyfpkjmx);
	}

	@Override
	public void updateZhuanYongFaPiaoKaiJuMingXi(ZhuanYongFaPiaoKaiJuMingXi zyfpkjmx) {
		zhuanYongFaPiaoKaiJuMingXiMapper.updateZhuanYongFaPiaoKaiJuMingXi(zyfpkjmx);
	}

	@Override
	public List<KaiPiaoShenQingDan> getKaiPiaoShenQingDanByProjectId(Long projectId) {
		List<KaiPiaoShenQingDan> kaipiaoshenqingdanlist = kaiPiaoShenQingDanMapper
				.getKaiPiaoShenQingDanByProjectId(projectId);

		return kaipiaoshenqingdanlist;
	}
	
	@Override
	public List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByXiangmutaizhang_id(Long xiangmutaizhang_id) {
		List<KaiPiaoQingKuangBiao_XiangMu> kaipiaoshenqingdanlist = kaiPiaoQingKuangBiao_XiangMuMapper
				.getKaiPiaoQingKuangBiao_XiangMuByXiangmutaizhang_id(xiangmutaizhang_id);

		return kaipiaoshenqingdanlist;
	}
	
	@Override
	public List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByXiangmutaizhang_id(Long xiangmutaizhang_id) {
		List<KaiPiaoQingKuangBiao_FenGongSi> list = kaiPiaoQingKuangBiao_FenGongSiMapper
				.getKaiPiaoQingKuangBiao_FenGongSiByXiangmutaizhang_id(xiangmutaizhang_id);

		return list;
	}
	
	@Override
	public List<KaiPiaoQingKuangBiao_FenGongSi> getKaiPiaoQingKuangBiao_FenGongSiByCompanyId(Long company_id) {
		List<KaiPiaoQingKuangBiao_FenGongSi> list = kaiPiaoQingKuangBiao_FenGongSiMapper
				.getKaiPiaoQingKuangBiao_FenGongSiByCompanyId(company_id);

		return list;
	}

	 @Override
	    public KaiPiaoQingKuangBiao_XiangMu getKaiPiaoQingKuangBiao_XiangMuById(Long id){
	        return kaiPiaoQingKuangBiao_XiangMuMapper.getKaiPiaoQingKuangBiao_XiangMuById(id);
	    }

	    @Override
	    public Boolean addKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu){
	        kaiPiaoQingKuangBiao_XiangMuMapper.addKaiPiaoQingKuangBiao_XiangMu(kaiPiaoQingKuangBiao_XiangMu);
	        return true;
	    }

	    @Override
	    public Boolean updateKaiPiaoQingKuangBiao_XiangMu(KaiPiaoQingKuangBiao_XiangMu kaiPiaoQingKuangBiao_XiangMu){
	        kaiPiaoQingKuangBiao_XiangMuMapper.updateKaiPiaoQingKuangBiao_XiangMu(kaiPiaoQingKuangBiao_XiangMu);
	        return true;
	    }
	
	@Override
	public JianYiJiShuiFangFaZhuanPiaoJiShui getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Long Id) {
		JianYiJiShuiFangFaZhuanPiaoJiShui jianyijishuifangfazhuanpiaojishui = jianyijishuifangfazhuanpiaojishuiMapper
				.getJianYiJiShuiFangFaZhuanPiaoJiShuiById(Id);

		return jianyijishuifangfazhuanpiaojishui;
	}

	@Override
	public Long addXiangMuTaiZhang(XiangMuTaiZhang xmtz) {
		@SuppressWarnings("unused")
		Integer result = xiangmutaizhangMapper.addXiangMuTaiZhang(xmtz);
		/*
		 * xmtz = xmtz; Long id = xmtz.getId(); String hetongqiandingshijian =
		 * xmtz.getHetongkaigongshijian(); String hetongkaigongshijian =
		 * xmtz.getHetongkaigongshijian(); String kaigongxukezhengshijian =
		 * xmtz.getKaigongxukezhengshijian(); String yujiwangongshijian =
		 * xmtz.getYujiwangongshijian();
		 * 
		 * this.updateTime(id, hetongqiandingshijian, hetongkaigongshijian,
		 * kaigongxukezhengshijian,yujiwangongshijian);
		 */
		return xmtz.getId();
	}

	@Override
	public Boolean updateXiangMuTaiZhang(XiangMuTaiZhang xmtz) {

		xiangmutaizhangMapper.updateXiangMuTaiZhang(xmtz);
		return true;
	}

	@Override
	public List<XiangMuTaiZhang> getXiangMuTaiZhangByCompany_id(Long companyId) {
		return xiangmutaizhangMapper.getXiangMuTaiZhangByCompany_id(companyId);

	}

	@Override
	public List<KaiPiaoShenQingDan> getJianYiJiShuiFangFaZhuanPiaoJiShuiByProjectId(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	public KaiPiaoShenQingDan getKaiPiaoShenQingDanById(Long id) {
		return kaiPiaoShenQingDanMapper.getKaiPiaoShenQingDanById(id);
	}

	@Override
	public Boolean updateKaiPiaoShenQingDan(KaiPiaoShenQingDan kpsqd) {
		kaiPiaoShenQingDanMapper.updateKaiPiaoShenQingDan(kpsqd);
		return true;
	}

	@Override
	public Boolean updateJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs) {
		jianYiJiShuiFangFaPuPiaoJiShuiMapper.updateJianYiJiShuiFangFaPuPiaoJiShui(jyjsffppjs);
		return true;
	}

	@Override
	public Boolean addJianYiJiShuiFangFaPuPiaoJiShui(JianYiJiShuiFangFaPuPiaoJiShui jyjsffppjs) {
		jianYiJiShuiFangFaPuPiaoJiShuiMapper.addJianYiJiShuiFangFaPuPiaoJiShui(jyjsffppjs);
		return true;
	}

	@Override
	public JianYiJiShuiFangFaPuPiaoJiShui getJianYiJiShuiFangFaPuPiaoJiShuiById(Long id) {
		return jianYiJiShuiFangFaPuPiaoJiShuiMapper.getJianYiJiShuiFangFaPuPiaoJiShuiById(id);
	}

	public void updateTime(Long id, Timestamp hetongqiandingshijian) {
		xiangmutaizhangMapper.updateTime(id, hetongqiandingshijian);
		xiangmutaizhangMapper.addTime(hetongqiandingshijian);

	}

	@Override
	public Boolean addQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt) {
		queRenShouRuFangShi_QiTaMapper.addQueRenShouRuFangShi_QiTa(qrsrfs_qt);
		return true;
	}

	@Override
	public Boolean updateJianYiJiShuiFangFaZhuanPiaoJiShui(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {
		jianyijishuifangfazhuanpiaojishuiMapper.updateJianYiJiShuiFangFaZhuanPiaoJiShui(jyjsffzpjs);
		return true;
	}

	public QueRenShouRuFangShi_QiTa getQueRenShouRuFangShi_QiTaById(Long id) {
		return queRenShouRuFangShi_QiTaMapper.getQueRenShouRuFangShi_QiTaById(id);
	}

	@Override
	public Boolean updateQueRenShouRuFangShi_QiTa(QueRenShouRuFangShi_QiTa qrsrfs_qt) {

		queRenShouRuFangShi_QiTaMapper.updateQueRenShouRuFangShi_QiTa(qrsrfs_qt);
		return true;
	}

	@Override
	public Boolean addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(
			QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa) {
		queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper
				.addQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(queRenShouRuFangShi_LaoWuShiJianZhanBiFa);
		return true;
	}

	@Override
	public QueRenShouRuFangShi_LaoWuShiJianZhanBiFa getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(Long id) {
		return queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper.getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaById(id);

	}

	@Override
	public Boolean updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(
			QueRenShouRuFangShi_LaoWuShiJianZhanBiFa queRenShouRuFangShi_LaoWuShiJianZhanBiFa) {
		queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper
				.updateQueRenShouRuFangShi_LaoWuShiJianZhanBiFa(queRenShouRuFangShi_LaoWuShiJianZhanBiFa);
		return true;
	}

	@Override
	public QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(Long id) {
		// TODO Auto-generated method stub
		return queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper
				.getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaById(id);
	}

	@Override
	public Boolean addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(
			QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper
				.addQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
		return true;
	}

	@Override
	public Boolean updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(
			QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa queRenShouRuFangShi_YiFaShengChengBenZhanBiFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper
				.updateQueRenShouRuFangShi_YiFaShengChengBenZhanBiFa(queRenShouRuFangShi_YiFaShengChengBenZhanBiFa);
		return true;
	}
   
    @Autowired
    private JinXiangShuieZhuanChuMingXi_XiangMuBuMapper jinXiangShuieZhuanChuMingXi_XiangMuBuMapper;






   

   

    public void setJinXiangShuieZhuanChuMingXi_XiangMuBuMapper(JinXiangShuieZhuanChuMingXi_XiangMuBuMapper jinXiangShuieZhuanChuMingXi_XiangMuBuMapper){
        this.jinXiangShuieZhuanChuMingXi_XiangMuBuMapper = jinXiangShuieZhuanChuMingXi_XiangMuBuMapper;
    }

    public JinXiangShuieZhuanChuMingXi_XiangMuBuMapper getJinXiangShuieZhuanChuMingXi_XiangMuBuMapper() {
        return jinXiangShuieZhuanChuMingXi_XiangMuBuMapper;
    }







 
  

   
    @Override
    public JinXiangShuieZhuanChuMingXi_XiangMuBu getJinXiangShuieZhuanChuMingXi_XiangMuBuById(Long id){
        return jinXiangShuieZhuanChuMingXi_XiangMuBuMapper.getJinXiangShuieZhuanChuMingXi_XiangMuBuById(id);
    }

    @Override
    public Boolean addJinXiangShuieZhuanChuMingXi_XiangMuBu(JinXiangShuieZhuanChuMingXi_XiangMuBu jinXiangShuieZhuanChuMingXi_XiangMuBu){
        jinXiangShuieZhuanChuMingXi_XiangMuBuMapper.addJinXiangShuieZhuanChuMingXi_XiangMuBu(jinXiangShuieZhuanChuMingXi_XiangMuBu);
        return true;
    }

    @Override
    public Boolean updateJinXiangShuieZhuanChuMingXi_XiangMuBu(JinXiangShuieZhuanChuMingXi_XiangMuBu jinXiangShuieZhuanChuMingXi_XiangMuBu){
        jinXiangShuieZhuanChuMingXi_XiangMuBuMapper.updateJinXiangShuieZhuanChuMingXi_XiangMuBu(jinXiangShuieZhuanChuMingXi_XiangMuBu);
        return true;
    }



	@Override
	public Boolean addPuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf) {
		puTongFaPiaoKaiJuMingXiMapper.addPuTongFaPiaoKaiJuMingXi(ptf);
		return true;
	}

	@Override
	public Boolean updatePuTongFaPiaoKaiJuMingXi(PuTongFaPiaoKaiJuMingXi ptf) {
		puTongFaPiaoKaiJuMingXiMapper.updatePuTongFaPiaoKaiJuMingXi(ptf);
		return true;
	}

	public QueRenShouRuFangShi_YiWanGongGongZuoLiangFa getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(Long id) {
		// TODO Auto-generated method stub
		return queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper.getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaById(id);
	}

	@Override
	public Boolean addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(
			QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper
				.addQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(queRenShouRuFangShi_YiWanGongGongZuoLiangFa);
		return true;
	}

	@Override
	public PuTongFaPiaoKaiJuMingXi getPuTongFaPiaoKaiJuMingXiById(Long id) {
		return puTongFaPiaoKaiJuMingXiMapper.getPuTongFaPiaoKaiJuMingXiById(id);
	}

	@Override
	public Boolean addShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf) {
		shouQiKuanXiangMingXiBiaoMapper.addShouQiKuanXiangMingXiBiao(ptf);
		return true;
	}

	@Override
	public Boolean updateShouQiKuanXiangMingXiBiao(ShouQiKuanXiangMingXiBiao ptf) {
		shouQiKuanXiangMingXiBiaoMapper.updateShouQiKuanXiangMingXiBiao(ptf);
		return true;
	}

	public Boolean updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(
			QueRenShouRuFangShi_YiWanGongGongZuoLiangFa queRenShouRuFangShi_YiWanGongGongZuoLiangFa) {
		// TODO Auto-generated method stub
		queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper
				.updateQueRenShouRuFangShi_YiWanGongGongZuoLiangFa(queRenShouRuFangShi_YiWanGongGongZuoLiangFa);

		return true;
	}

	@Override
	public XiaoXiang_XiangMu getXiaoXiang_XiangMuById(Long id) {
		// TODO Auto-generated method stub
		return xiaoXiang_XiangMuMapper.getXiaoXiang_XiangMuById(id);
	}

	@Override
	public Boolean addXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu) {
		// TODO Auto-generated method stub
		xiaoXiang_XiangMuMapper.addXiaoXiang_XiangMu(xiaoXiang_XiangMu);
		return true;
	}

	@Override
	public ShouQiKuanXiangMingXiBiao getShouQiKuanXiangMingXiBiaoById(Long id) {
		return shouQiKuanXiangMingXiBiaoMapper.getShouQiKuanXiangMingXiBiaoById(id);
	}

	public Boolean updateXiaoXiang_XiangMu(XiaoXiang_XiangMu xiaoXiang_XiangMu) {
		// TODO Auto-generated method stub
		xiaoXiang_XiangMuMapper.updateXiaoXiang_XiangMu(xiaoXiang_XiangMu);
		return true;
	}

	@Override
	public Boolean updateProject(JianYiJiShuiFangFaZhuanPiaoJiShui jyjsffzpjs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 @Override
	    public YiBanJiShuiFangFaNaShuiJianChaTiaoZheng getYiBanJiShuiFangFaNaShuiJianChaTiaoZhengById(Long id){
	        return yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper.getYiBanJiShuiFangFaNaShuiJianChaTiaoZhengById(id);
	    }

	    @Override
	    public Boolean addYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(YiBanJiShuiFangFaNaShuiJianChaTiaoZheng yiBanJiShuiFangFaNaShuiJianChaTiaoZheng){
	        yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper.addYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(yiBanJiShuiFangFaNaShuiJianChaTiaoZheng);
	        return true;
	    }

	    @Override
	    public Boolean updateYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(YiBanJiShuiFangFaNaShuiJianChaTiaoZheng yiBanJiShuiFangFaNaShuiJianChaTiaoZheng){
	        yiBanJiShuiFangFaNaShuiJianChaTiaoZhengMapper.updateYiBanJiShuiFangFaNaShuiJianChaTiaoZheng(yiBanJiShuiFangFaNaShuiJianChaTiaoZheng);
	        return true;
	    }

		@Override
		public FenBaoXiangMuMingXi getFenBaoXiangMuMingXiById(Long id) {
			return fenBaoXiangMuMingXiMapper.getFenBaoXiangMuMingXiById(id);
		}

		@Override
		public Boolean addFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi) {
			fenBaoXiangMuMingXiMapper.addFenBaoXiangMuMingXi(fenBaoXiangMuMingXi);
			return null;
		}

	    @Override
	    public KaiPiaoQingKuangBiao_ZongGongSi getKaiPiaoQingKuangBiao_ZongGongSiById(Long id){
	        return kaiPiaoQingKuangBiao_ZongGongSiMapper.getKaiPiaoQingKuangBiao_ZongGongSiById(id);
	    }

	    @Override
	    public Boolean addKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi){
	        kaiPiaoQingKuangBiao_ZongGongSiMapper.addKaiPiaoQingKuangBiao_ZongGongSi(kaiPiaoQingKuangBiao_ZongGongSi);
	        return true;
	    }

	    @Override
	    public Boolean updateKaiPiaoQingKuangBiao_ZongGongSi(KaiPiaoQingKuangBiao_ZongGongSi kaiPiaoQingKuangBiao_ZongGongSi){
	        kaiPiaoQingKuangBiao_ZongGongSiMapper.updateKaiPiaoQingKuangBiao_ZongGongSi(kaiPiaoQingKuangBiao_ZongGongSi);
	        return true;
	    }
		

		@Override
		public Boolean updateFenBaoXiangMuMingXi(FenBaoXiangMuMingXi fenBaoXiangMuMingXi) {
			fenBaoXiangMuMingXiMapper.updateFenBaoXiangMuMingXi(fenBaoXiangMuMingXi);
			return null;
		}
		
	    @Override
	    public JinXiangFaPiaoMingXi_FaPiao getJinXiangFaPiaoMingXi_FaPiaoById(Long id){
	        return jinXiangFaPiaoMingXi_FaPiaoMapper.getJinXiangFaPiaoMingXi_FaPiaoById(id);
	    }

	    @Override
	    public Boolean addJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao){
	        jinXiangFaPiaoMingXi_FaPiaoMapper.addJinXiangFaPiaoMingXi_FaPiao(jinXiangFaPiaoMingXi_FaPiao);
	        return true;
	    }
	    
	    public User_Company getUser_CompanyById(Long id){
	        return user_CompanyMapper.getUser_CompanyById(id);
	    }

	    @Override
	    public Boolean addUser_Company(User_Company user_Company){
	        user_CompanyMapper.addUser_Company(user_Company);
	        return true;
	    }

	    @Override
	    public Boolean updateJinXiangFaPiaoMingXi_FaPiao(JinXiangFaPiaoMingXi_FaPiao jinXiangFaPiaoMingXi_FaPiao){
	        jinXiangFaPiaoMingXi_FaPiaoMapper.updateJinXiangFaPiaoMingXi_FaPiao(jinXiangFaPiaoMingXi_FaPiao);
	        return true;
	    }
	    
	    public Boolean updateUser_Company(User_Company user_Company){
	        user_CompanyMapper.updateUser_Company(user_Company);
	        return true;
	    }

		@Override
		public List<Company> getCompaniesByUid(Integer uid) {
			return companyMapper.getCompaniesByUid(uid);

		}

		@Override
		public List<KaiPiaoQingKuangBiao_ZongGongSi> getKaiPiaoQingKuangBiao_ZongGongSiByStatus(Integer status) {
			// TODO Auto-generated method stub
			return kaiPiaoQingKuangBiao_ZongGongSiMapper.getKaiPiaoQingKuangBiao_ZongGongSiByStatus(status);
		}

		@Override
		public List<KaiPiaoQingKuangBiao_ZongGongSi> getAllKaiPiaoQingKuangBiao_ZongGongSi() {
			// TODO Auto-generated method stub
			return kaiPiaoQingKuangBiao_ZongGongSiMapper.getAllKaiPiaoQingKuangBiao_ZongGongSi();
		}

		@Override
		public List<KaiPiaoQingKuangBiao_XiangMu> getKaiPiaoQingKuangBiao_XiangMuByCompanyId(Integer company_id) {
			// TODO Auto-generated method stub
			return kaiPiaoQingKuangBiao_XiangMuMapper.getKaiPiaoQingKuangBiao_XiangMuByCompanyId(company_id);
		}

	    @Override
	    public JinXiangFaPiaoMingXi_RenZheng getJinXiangFaPiaoMingXi_RenZhengById(Long id){
	        return jinXiangFaPiaoMingXi_RenZhengMapper.getJinXiangFaPiaoMingXi_RenZhengById(id);
	    }
		@Override
		public List<Role> getUserRoles(Integer uid) {
			// TODO Auto-generated method stub
			return roleMapper.getUserRoles(uid);
		}

		@Override
		public User getUserById(Integer uid) {
			// TODO Auto-generated method stub
			return userMapper.getUserById(uid);
		}

	    @Override
	    public Boolean addJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng){
	        jinXiangFaPiaoMingXi_RenZhengMapper.addJinXiangFaPiaoMingXi_RenZheng(jinXiangFaPiaoMingXi_RenZheng);
	        return true;
	    }

	    @Override
	    public Boolean updateJinXiangFaPiaoMingXi_RenZheng(JinXiangFaPiaoMingXi_RenZheng jinXiangFaPiaoMingXi_RenZheng){
	        jinXiangFaPiaoMingXi_RenZhengMapper.updateJinXiangFaPiaoMingXi_RenZheng(jinXiangFaPiaoMingXi_RenZheng);
	        return true;
	    }
	    @Autowired
	    private JinXiangShuieZhuanChuMingXi_FenGongSiMapper jinXiangShuieZhuanChuMingXi_FenGongSiMapper;






	    public void setJinXiangShuieZhuanChuMingXi_FenGongSiMapper(JinXiangShuieZhuanChuMingXi_FenGongSiMapper jinXiangShuieZhuanChuMingXi_FenGongSiMapper){
	        this.jinXiangShuieZhuanChuMingXi_FenGongSiMapper = jinXiangShuieZhuanChuMingXi_FenGongSiMapper;
	    }

	    public JinXiangShuieZhuanChuMingXi_FenGongSiMapper getJinXiangShuieZhuanChuMingXi_FenGongSiMapper() {
	        return jinXiangShuieZhuanChuMingXi_FenGongSiMapper;
	    }







	    @Override
	    public JinXiangShuieZhuanChuMingXi_FenGongSi getJinXiangShuieZhuanChuMingXi_FenGongSiById(Long id){
	        return jinXiangShuieZhuanChuMingXi_FenGongSiMapper.getJinXiangShuieZhuanChuMingXi_FenGongSiById(id);
	    }

	    @Override
	    public Boolean addJinXiangShuieZhuanChuMingXi_FenGongSi(JinXiangShuieZhuanChuMingXi_FenGongSi jinXiangShuieZhuanChuMingXi_FenGongSi){
	        jinXiangShuieZhuanChuMingXi_FenGongSiMapper.addJinXiangShuieZhuanChuMingXi_FenGongSi(jinXiangShuieZhuanChuMingXi_FenGongSi);
	        return true;
	    }

	    @Override
	    public Boolean updateJinXiangShuieZhuanChuMingXi_FenGongSi(JinXiangShuieZhuanChuMingXi_FenGongSi jinXiangShuieZhuanChuMingXi_FenGongSi){
	        jinXiangShuieZhuanChuMingXi_FenGongSiMapper.updateJinXiangShuieZhuanChuMingXi_FenGongSi(jinXiangShuieZhuanChuMingXi_FenGongSi);
	        return true;
	    }

		@Override
		public KaiPiaoShenQingDan getKaiPiaoShenQingDanByKaipiaoqingkuangbiao_xiangmu_id(Long kaipiaoqingkuangbiao_xiangmu_id) {
			// TODO Auto-generated method stub
			return kaiPiaoShenQingDanMapper.getKaiPiaoShenQingDanByKaipiaoqingkuangbiao_xiangmu_id(kaipiaoqingkuangbiao_xiangmu_id);
		}

		@Override
		public List<PuTongFaPiaoKaiJuMingXi> getPuTongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return puTongFaPiaoKaiJuMingXiMapper.getPuTongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<ZhuanYongFaPiaoKaiJuMingXi> getZhuanYongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return zhuanYongFaPiaoKaiJuMingXiMapper.getZhuanYongFaPiaoKaiJuMingXiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<JianYiJiShuiFangFaPuPiaoJiShui> getJianYiJiShuiFangFaPuPiaoJiShuiBykaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return jianYiJiShuiFangFaPuPiaoJiShuiMapper.getJianYiJiShuiFangFaPuPiaoJiShuiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<JianYiJiShuiFangFaZhuanPiaoJiShui> getJianYiJiShuiFangFaZhuanPiaoJiShuiBykaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return jianyijishuifangfazhuanpiaojishuiMapper.getJianYiJiShuiFangFaZhuanPiaoJiShuiBykaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<ShouQiKuanXiangMingXiBiao> getShouQiKuanXiangMingXiBiaoByKaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return shouQiKuanXiangMingXiBiaoMapper.getShouQiKuanXiangMingXiBiaoByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<QueRenShouRuFangShi_YiFaShengChengBenZhanBiFa> getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaBykaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return queRenShouRuFangShi_YiFaShengChengBenZhanBiFaMapper.getQueRenShouRuFangShi_YiFaShengChengBenZhanBiFaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<QueRenShouRuFangShi_YiWanGongGongZuoLiangFa> getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaByKaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return queRenShouRuFangShi_YiWanGongGongZuoLiangFaMapper.getQueRenShouRuFangShi_YiWanGongGongZuoLiangFaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<QueRenShouRuFangShi_LaoWuShiJianZhanBiFa> getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaByKaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return queRenShouRuFangShi_LaoWuShiJianZhanBiFaMapper.getQueRenShouRuFangShi_LaoWuShiJianZhanBiFaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}

		@Override
		public List<QueRenShouRuFangShi_QiTa> getQueRenShouRuFangShi_QiTaByKaipiaoshenqingdan_id(
				Long kaipiaoshenqingdan_id) {
			// TODO Auto-generated method stub
			return queRenShouRuFangShi_QiTaMapper.getQueRenShouRuFangShi_QiTaByKaipiaoshenqingdan_id(kaipiaoshenqingdan_id);
		}
		
        @Override
        public List<JinXiangFaPiaoMingXi_RenZheng> getJinXiangFaPiaoMingXi_RenZhengByCompanyId(Long company_id) {
			// TODO Auto-generated method stub
			return jinXiangFaPiaoMingXi_RenZhengMapper.getJinXiangFaPiaoMingXi_RenZhengByCompanyId(company_id);
		}

		@Override
		public List<JinXiangFaPiaoMingXi_FaPiao> getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(Long company_id) {
			// TODO Auto-generated method stub
			return jinXiangFaPiaoMingXi_FaPiaoMapper.getJinXiangFaPiaoMingXi_FaPiaoByCompanyId(company_id);
		}



}
