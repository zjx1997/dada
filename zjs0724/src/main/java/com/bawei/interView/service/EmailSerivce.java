package com.bawei.interView.service;

import java.util.List;

import com.bawei.interView.bean.Email;

public interface EmailSerivce {
	
	//批量设为已读
    void batcheSetRead(int[] eids);
    
    //批量删除
    void batcheSetDlete(int[] eids);
    //多条件查询
    List<Email> selectByExample(Integer sendRead,Integer orderFlag);
}
