package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishitechanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishitechanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishitechanView;


/**
 * 美食特产评论表
 *
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface DiscussmeishitechanService extends IService<DiscussmeishitechanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishitechanVO> selectListVO(Wrapper<DiscussmeishitechanEntity> wrapper);
   	
   	DiscussmeishitechanVO selectVO(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
   	
   	List<DiscussmeishitechanView> selectListView(Wrapper<DiscussmeishitechanEntity> wrapper);
   	
   	DiscussmeishitechanView selectView(@Param("ew") Wrapper<DiscussmeishitechanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishitechanEntity> wrapper);
   	

}

