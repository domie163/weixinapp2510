package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussmeishitechanEntity;
import com.entity.view.DiscussmeishitechanView;

import com.service.DiscussmeishitechanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 美食特产评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-22 18:37:32
 */
@RestController
@RequestMapping("/discussmeishitechan")
public class DiscussmeishitechanController {
    @Autowired
    private DiscussmeishitechanService discussmeishitechanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussmeishitechanEntity discussmeishitechan, 
		HttpServletRequest request){

        EntityWrapper<DiscussmeishitechanEntity> ew = new EntityWrapper<DiscussmeishitechanEntity>();
		PageUtils page = discussmeishitechanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmeishitechan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussmeishitechanEntity discussmeishitechan, 
		HttpServletRequest request){
        EntityWrapper<DiscussmeishitechanEntity> ew = new EntityWrapper<DiscussmeishitechanEntity>();
		PageUtils page = discussmeishitechanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmeishitechan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussmeishitechanEntity discussmeishitechan){
       	EntityWrapper<DiscussmeishitechanEntity> ew = new EntityWrapper<DiscussmeishitechanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussmeishitechan, "discussmeishitechan")); 
        return R.ok().put("data", discussmeishitechanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussmeishitechanEntity discussmeishitechan){
        EntityWrapper< DiscussmeishitechanEntity> ew = new EntityWrapper< DiscussmeishitechanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussmeishitechan, "discussmeishitechan")); 
		DiscussmeishitechanView discussmeishitechanView =  discussmeishitechanService.selectView(ew);
		return R.ok("查询美食特产评论表成功").put("data", discussmeishitechanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussmeishitechanEntity discussmeishitechan = discussmeishitechanService.selectById(id);
        return R.ok().put("data", discussmeishitechan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussmeishitechanEntity discussmeishitechan = discussmeishitechanService.selectById(id);
        return R.ok().put("data", discussmeishitechan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussmeishitechanEntity discussmeishitechan, HttpServletRequest request){
    	discussmeishitechan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmeishitechan);

        discussmeishitechanService.insert(discussmeishitechan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussmeishitechanEntity discussmeishitechan, HttpServletRequest request){
    	discussmeishitechan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmeishitechan);

        discussmeishitechanService.insert(discussmeishitechan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussmeishitechanEntity discussmeishitechan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussmeishitechan);
        discussmeishitechanService.updateById(discussmeishitechan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussmeishitechanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussmeishitechanEntity> wrapper = new EntityWrapper<DiscussmeishitechanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussmeishitechanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
