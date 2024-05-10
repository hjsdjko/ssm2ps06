package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TejiashangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TejiashangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TejiashangpinView;


/**
 * 特价商品
 *
 * @author 
 * @email 
 * @date 2021-01-10 14:10:10
 */
public interface TejiashangpinService extends IService<TejiashangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TejiashangpinVO> selectListVO(Wrapper<TejiashangpinEntity> wrapper);
   	
   	TejiashangpinVO selectVO(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
   	
   	List<TejiashangpinView> selectListView(Wrapper<TejiashangpinEntity> wrapper);
   	
   	TejiashangpinView selectView(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TejiashangpinEntity> wrapper);
   	
}

