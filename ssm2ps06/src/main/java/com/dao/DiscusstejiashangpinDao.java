package com.dao;

import com.entity.DiscusstejiashangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstejiashangpinVO;
import com.entity.view.DiscusstejiashangpinView;


/**
 * 特价商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-10 14:10:11
 */
public interface DiscusstejiashangpinDao extends BaseMapper<DiscusstejiashangpinEntity> {
	
	List<DiscusstejiashangpinVO> selectListVO(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
	
	DiscusstejiashangpinVO selectVO(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
	
	List<DiscusstejiashangpinView> selectListView(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);

	List<DiscusstejiashangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
	
	DiscusstejiashangpinView selectView(@Param("ew") Wrapper<DiscusstejiashangpinEntity> wrapper);
	
}
