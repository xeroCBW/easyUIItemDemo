package com.cbw.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbw.dto.TbItem;

@Repository
public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
    
    List<TbItem> queryList(TbItem record);
    
}