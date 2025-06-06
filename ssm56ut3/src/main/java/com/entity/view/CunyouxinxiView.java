package com.entity.view;

import com.entity.CunyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 村游信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
@TableName("cunyouxinxi")
public class CunyouxinxiView  extends CunyouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CunyouxinxiView(){
	}
 
 	public CunyouxinxiView(CunyouxinxiEntity cunyouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cunyouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
