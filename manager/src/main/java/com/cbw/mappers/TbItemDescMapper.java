package com.cbw.mappers;

import org.springframework.stereotype.Repository;

import com.cbw.dto.TbItem_desc;

@Repository
public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItem_desc record);

    int insertSelective(TbItem_desc record);

    TbItem_desc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TbItem_desc record);

    int updateByPrimaryKeyWithBLOBs(TbItem_desc record);

    int updateByPrimaryKey(TbItem_desc record);
}