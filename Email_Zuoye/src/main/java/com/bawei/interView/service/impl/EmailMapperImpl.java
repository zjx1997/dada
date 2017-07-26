package com.bawei.interView.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.interView.bean.Email;
import com.bawei.interView.bean.EmailExample;
import com.bawei.interView.mapper.EmailMapper;

@Service
@Transactional(readOnly=true)
public class EmailMapperImpl implements EmailMapperInter {
	
	@Autowired
	private EmailMapper emailMapper;

	@Override
	public long countByExample(EmailExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(EmailExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer sendId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Email record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Email record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Email> selectByExample() {
		// TODO Auto-generated method stub
		return emailMapper.selectByExample();
	}

	@Override
	public Email selectByPrimaryKey(Integer sendId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Email record, EmailExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Email record, EmailExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Email record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Email record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
