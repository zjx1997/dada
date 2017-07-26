package com.bwie.mapper;

import com.bwie.pojo.department;
import com.bwie.pojo.departmentExample;
import com.bwie.pojo.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface departmentMapper {
    long countByExample(departmentExample example);

    int deleteByExample(departmentExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(department record);

    int insertSelective(department record);

    List<department> selectByExample(departmentExample example);

    department selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") department record, @Param("example") departmentExample example);

    int updateByExample(@Param("record") department record, @Param("example") departmentExample example);

    int updateByPrimaryKeySelective(department record);

    int updateByPrimaryKey(department record);
    //查询所有
    List<employee> select();
    
}