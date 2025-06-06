package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CunyouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CunyouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CunyouxinxiView;


/**
 * 村游信息
 *
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface CunyouxinxiService extends IService<CunyouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CunyouxinxiVO> selectListVO(Wrapper<CunyouxinxiEntity> wrapper);
   	
   	CunyouxinxiVO selectVO(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
   	
   	List<CunyouxinxiView> selectListView(Wrapper<CunyouxinxiEntity> wrapper);
   	
   	CunyouxinxiView selectView(@Param("ew") Wrapper<CunyouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CunyouxinxiEntity> wrapper);
   	

}

