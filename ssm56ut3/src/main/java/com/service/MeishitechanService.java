package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishitechanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishitechanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishitechanView;


/**
 * 美食特产
 *
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public interface MeishitechanService extends IService<MeishitechanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishitechanVO> selectListVO(Wrapper<MeishitechanEntity> wrapper);
   	
   	MeishitechanVO selectVO(@Param("ew") Wrapper<MeishitechanEntity> wrapper);
   	
   	List<MeishitechanView> selectListView(Wrapper<MeishitechanEntity> wrapper);
   	
   	MeishitechanView selectView(@Param("ew") Wrapper<MeishitechanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishitechanEntity> wrapper);
   	

}

