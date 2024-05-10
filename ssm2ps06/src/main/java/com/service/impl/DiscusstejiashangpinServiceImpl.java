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


import com.dao.DiscusstejiashangpinDao;
import com.entity.DiscusstejiashangpinEntity;
import com.service.DiscusstejiashangpinService;
import com.entity.vo.DiscusstejiashangpinVO;
import com.entity.view.DiscusstejiashangpinView;

@Service("discusstejiashangpinService")
public class DiscusstejiashangpinServiceImpl extends ServiceImpl<DiscusstejiashangpinDao, DiscusstejiashangpinEntity> implements DiscusstejiashangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstejiashangpinEntity> page = this.selectPage(
                new Query<DiscusstejiashangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstejiashangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstejiashangpinEntity> wrapper) {
		  Page<DiscusstejiashangpinView> page =new Query<DiscusstejiashangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstejiashangpinVO> selectListVO(Wrapper<DiscusstejiashangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstejiashangpinVO selectVO(Wrapper<DiscusstejiashangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstejiashangpinView> selectListView(Wrapper<DiscusstejiashangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstejiashangpinView selectView(Wrapper<DiscusstejiashangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
