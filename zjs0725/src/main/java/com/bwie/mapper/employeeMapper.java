package com.bwie.mapper;

import com.bwie.pojo.employee;
import com.bwie.pojo.employeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface employeeMapper {
    long countByExample(employeeExample example);

    int deleteByExample(employeeExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(employee record);

    int insertSelective(employee record);

    List<employee> selectByExample(employeeExample example);

    employee selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByExample(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}