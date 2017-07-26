package com.bawei.interView.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.interView.bean.Email;
import com.bawei.interView.bean.EmailExample;

public interface EmailMapperInter {
	
	  long countByExample(EmailExample example);

	    int deleteByExample(EmailExample example);

	    int deleteByPrimaryKey(Integer sendId);

	    int insert(Email record);

	    int insertSelective(Email record);

	    List<Email> selectByExample();

	    Email selectByPrimaryKey(Integer sendId);

	    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

	    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);

	    int updateByPrimaryKeySelective(Email record);

	    int updateByPrimaryKey(Email record);

}
