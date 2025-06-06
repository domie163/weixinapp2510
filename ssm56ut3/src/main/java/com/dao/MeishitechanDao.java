package com.dao;

import com.entity.MeishitechanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishitechanVO;
import com.entity.view.MeishitechanView;


/**
 * 美食特产
 * 
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface MeishitechanDao extends BaseMapper<MeishitechanEntity> {
	
	List<MeishitechanVO> selectListVO(@Param("ew") Wrapper<MeishitechanEntity> wrapper);
	
	MeishitechanVO selectVO(@Param("ew") Wrapper<MeishitechanEntity> wrapper);
	
	List<MeishitechanView> selectListView(@Param("ew") Wrapper<MeishitechanEntity> wrapper);

	List<MeishitechanView> selectListView(Pagination page,@Param("ew") Wrapper<MeishitechanEntity> wrapper);
	
	MeishitechanView selectView(@Param("ew") Wrapper<MeishitechanEntity> wrapper);
	

}
