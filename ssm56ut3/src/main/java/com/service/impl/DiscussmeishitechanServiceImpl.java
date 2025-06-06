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


import com.dao.DiscussmeishitechanDao;
import com.entity.DiscussmeishitechanEntity;
import com.service.DiscussmeishitechanService;
import com.entity.vo.DiscussmeishitechanVO;
import com.entity.view.DiscussmeishitechanView;

@Service("discussmeishitechanService")
public class DiscussmeishitechanServiceImpl extends ServiceImpl<DiscussmeishitechanDao, DiscussmeishitechanEntity> implements DiscussmeishitechanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishitechanEntity> page = this.selectPage(
                new Query<DiscussmeishitechanEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishitechanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishitechanEntity> wrapper) {
		  Page<DiscussmeishitechanView> page =new Query<DiscussmeishitechanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishitechanVO> selectListVO(Wrapper<DiscussmeishitechanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishitechanVO selectVO(Wrapper<DiscussmeishitechanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishitechanView> selectListView(Wrapper<DiscussmeishitechanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishitechanView selectView(Wrapper<DiscussmeishitechanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
