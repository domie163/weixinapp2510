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


import com.dao.CunyouxinxiDao;
import com.entity.CunyouxinxiEntity;
import com.service.CunyouxinxiService;
import com.entity.vo.CunyouxinxiVO;
import com.entity.view.CunyouxinxiView;

@Service("cunyouxinxiService")
public class CunyouxinxiServiceImpl extends ServiceImpl<CunyouxinxiDao, CunyouxinxiEntity> implements CunyouxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CunyouxinxiEntity> page = this.selectPage(
                new Query<CunyouxinxiEntity>(params).getPage(),
                new EntityWrapper<CunyouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CunyouxinxiEntity> wrapper) {
		  Page<CunyouxinxiView> page =new Query<CunyouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CunyouxinxiVO> selectListVO(Wrapper<CunyouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CunyouxinxiVO selectVO(Wrapper<CunyouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CunyouxinxiView> selectListView(Wrapper<CunyouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CunyouxinxiView selectView(Wrapper<CunyouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
