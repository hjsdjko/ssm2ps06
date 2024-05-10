package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstejiashangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstejiashangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstejiashangpinView;


/**
 * 特价商品评论表
 *
 * @author 
 * @email 
 * @date 2021-01-10 14:10:11
 */
public interface DiscusstejiashangpinService extends IService<DiscusstejiashangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstejiashangpinVO> selectListVO(Wrapper<DiscusstejiashangpinEntity> wrapper);
   	
   	DiscusstejiashangpinVO selectVO(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
   	
   	List<DiscusstejiashangpinView> selectListView(Wrapper<DiscusstejiashangpinEntity> wrapper);
   	
   	DiscusstejiashangpinView selectView(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstejiashangpinEntity> wrapper);
   	
}

