package com.cbw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dto.TbItem;
import com.cbw.mappers.TbItemMapper;
import com.cbw.pojo.EasyUIDataGridResult;
import com.cbw.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(value="itemService")
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return tbItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TbItem record) {
		// TODO Auto-generated method stub
		return tbItemMapper.insert(record);
	}

	@Override
	public int insertSelective(TbItem record) {
		// TODO Auto-generated method stub
		return tbItemMapper.insertSelective(record);
	}

	@Override
	public TbItem selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(TbItem record) {
		// TODO Auto-generated method stub
		return tbItemMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(TbItem record) {
		// TODO Auto-generated method stub
		return tbItemMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		//设置分页信息
		
//		return null;
		//执行查询
//		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page, rows);
		List<TbItem> list = tbItemMapper.queryList(null);
		//取查询结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		//返回结果
		return result;
	}

}
