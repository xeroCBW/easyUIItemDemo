package com.cbw.mappers;

import org.springframework.stereotype.Repository;

import com.cbw.dto.TbItem_cat;

@Repository
public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem_cat record);

    int insertSelective(TbItem_cat record);

    TbItem_cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem_cat record);

    int updateByPrimaryKey(TbItem_cat record);
}