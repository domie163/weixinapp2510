package com.dao;

import com.entity.DiscussmeishitechanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishitechanVO;
import com.entity.view.DiscussmeishitechanView;


/**
 * 美食特产评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface DiscussmeishitechanDao extends BaseMapper<DiscussmeishitechanEntity> {
	
	List<DiscussmeishitechanVO> selectListVO(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
	
	DiscussmeishitechanVO selectVO(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
	
	List<DiscussmeishitechanView> selectListView(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);

	List<DiscussmeishitechanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
	
	DiscussmeishitechanView selectView(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
	

}
