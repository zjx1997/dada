package com.bwie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwie.mapper.departmentMapper;
import com.bwie.pojo.employee;

@Service
@Transactional
public class departmentserviceImpl implements departmentservice{
    
	@Autowired
	private departmentMapper dm;
	
	@Override
	public List<employee> select() {
		return dm.select();
	}
        
}
