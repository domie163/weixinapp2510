package com.dao;

import com.entity.CunyouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CunyouxinxiVO;
import com.entity.view.CunyouxinxiView;


/**
 * 村游信息
 * 
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface CunyouxinxiDao extends BaseMapper<CunyouxinxiEntity> {
	
	List<CunyouxinxiVO> selectListVO(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
	
	CunyouxinxiVO selectVO(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
	
	List<CunyouxinxiView> selectListView(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);

	List<CunyouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
	
	CunyouxinxiView selectView(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
	

}
