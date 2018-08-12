package com.cbw.service;

import com.cbw.dto.TbItem;
import com.cbw.pojo.EasyUIDataGridResult;

public interface ItemService {
	
	
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
    
    EasyUIDataGridResult getItemList(int page, int rows);

}
