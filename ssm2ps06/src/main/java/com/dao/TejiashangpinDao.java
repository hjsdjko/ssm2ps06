package com.dao;

import com.entity.TejiashangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TejiashangpinVO;
import com.entity.view.TejiashangpinView;


/**
 * 特价商品
 * 
 * @author 
 * @email 
 * @date 2021-01-10 14:10:10
 */
public interface TejiashangpinDao extends BaseMapper<TejiashangpinEntity> {
	
	List<TejiashangpinVO> selectListVO(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
	
	TejiashangpinVO selectVO(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
	
	List<TejiashangpinView> selectListView(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);

	List<TejiashangpinView> selectListView(Pagination page,@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
	
	TejiashangpinView selectView(@Param("ew") Wrapper<TejiashangpinEntity> wrapper);
	
}
