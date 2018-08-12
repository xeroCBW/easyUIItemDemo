package com.cbw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dto.TbUser;
import com.cbw.mappers.TbUserMapper;
import com.cbw.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private TbUserMapper tbUserMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return tbUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TbUser record) {
		// TODO Auto-generated method stub
		return tbUserMapper.insert(record);
	}

	@Override
	public int insertSelective(TbUser record) {
		// TODO Auto-generated method stub
		return tbUserMapper.insertSelective(record);
	}

	@Override
	public TbUser selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return tbUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(TbUser record) {
		// TODO Auto-generated method stub
		return tbUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(TbUser record) {
		// TODO Auto-generated method stub
		return tbUserMapper.updateByPrimaryKey(record);
	}

}
