package com.entity.model;

import com.entity.MeishitechanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 美食特产
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
public class MeishitechanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美食名称
	 */
	
	private String meishimingcheng;
		
	/**
	 * 美食类型
	 */
	
	private String meishileixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 美食简介
	 */
	
	private String meishijianjie;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：美食名称
	 */
	 
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
				
	
	/**
	 * 设置：美食类型
	 */
	 
	public void setMeishileixing(String meishileixing) {
		this.meishileixing = meishileixing;
	}
	
	/**
	 * 获取：美食类型
	 */
	public String getMeishileixing() {
		return meishileixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：美食简介
	 */
	 
	public void setMeishijianjie(String meishijianjie) {
		this.meishijianjie = meishijianjie;
	}
	
	/**
	 * 获取：美食简介
	 */
	public String getMeishijianjie() {
		return meishijianjie;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
