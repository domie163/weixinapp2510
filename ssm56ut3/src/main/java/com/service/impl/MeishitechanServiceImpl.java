package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MeishitechanDao;
import com.entity.MeishitechanEntity;
import com.service.MeishitechanService;
import com.entity.vo.MeishitechanVO;
import com.entity.view.MeishitechanView;

@Service("meishitechanService")
public class MeishitechanServiceImpl extends ServiceImpl<MeishitechanDao, MeishitechanEntity> implements MeishitechanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishitechanEntity> page = this.selectPage(
                new Query<MeishitechanEntity>(params).getPage(),
                new EntityWrapper<MeishitechanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishitechanEntity> wrapper) {
		  Page<MeishitechanView> page =new Query<MeishitechanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishitechanVO> selectListVO(Wrapper<MeishitechanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishitechanVO selectVO(Wrapper<MeishitechanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishitechanView> selectListView(Wrapper<MeishitechanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishitechanView selectView(Wrapper<MeishitechanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
