package com.cbw.mappers;

import org.springframework.stereotype.Repository;

import com.cbw.dto.TbItem_param;

@Repository
public interface TbItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem_param record);

    int insertSelective(TbItem_param record);

    TbItem_param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem_param record);

    int updateByPrimaryKeyWithBLOBs(TbItem_param record);

    int updateByPrimaryKey(TbItem_param record);
}