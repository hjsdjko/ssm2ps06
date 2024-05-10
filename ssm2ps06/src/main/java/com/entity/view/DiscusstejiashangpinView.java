package com.entity.view;

import com.entity.DiscusstejiashangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特价商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-10 14:10:11
 */
@TableName("discusstejiashangpin")
public class DiscusstejiashangpinView  extends DiscusstejiashangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstejiashangpinView(){
	}
 
 	public DiscusstejiashangpinView(DiscusstejiashangpinEntity discusstejiashangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusstejiashangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
