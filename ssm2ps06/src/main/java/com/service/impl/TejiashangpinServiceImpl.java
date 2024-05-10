package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TejiashangpinDao;
import com.entity.TejiashangpinEntity;
import com.service.TejiashangpinService;
import com.entity.vo.TejiashangpinVO;
import com.entity.view.TejiashangpinView;

@Service("tejiashangpinService")
public class TejiashangpinServiceImpl extends ServiceImpl<TejiashangpinDao, TejiashangpinEntity> implements TejiashangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TejiashangpinEntity> page = this.selectPage(
                new Query<TejiashangpinEntity>(params).getPage(),
                new EntityWrapper<TejiashangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TejiashangpinEntity> wrapper) {
		  Page<TejiashangpinView> page =new Query<TejiashangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TejiashangpinVO> selectListVO(Wrapper<TejiashangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TejiashangpinVO selectVO(Wrapper<TejiashangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TejiashangpinView> selectListView(Wrapper<TejiashangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TejiashangpinView selectView(Wrapper<TejiashangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
