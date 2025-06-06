package com.entity.view;

import com.entity.DiscussmeishitechanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食特产评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
@TableName("discussmeishitechan")
public class DiscussmeishitechanView  extends DiscussmeishitechanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeishitechanView(){
	}
 
 	public DiscussmeishitechanView(DiscussmeishitechanEntity discussmeishitechanEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeishitechanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
