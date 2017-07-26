package com.bawei.interView.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.interView.bean.Email;
import com.bawei.interView.bean.EmailExample;
import com.bawei.interView.bean.EmailExample.Criteria;
import com.bawei.interView.mapper.EmailMapper;


@Service
@Transactional(readOnly=true)
public class EmailServiceImpl implements EmailSerivce{
       
	  @Autowired
        private EmailMapper emailMapper;

		@Override
		public void batcheSetRead(int[] eids) {
			emailMapper.batchSetRead(eids);
			
		}

		@Override
		public void batcheSetDlete(int[] eids) {
			emailMapper.batchDelete(eids);
			
		}
		/**
		 * status默认的阅读状态:  0---全部，1----未读,2----已读
		 * orderFlag默认的排序： 0---不排序，1----按时间升序,2----按时间排序
		 */
		@Override
		public List<Email> selectByExample(Integer sendRead, Integer orderFlag) {
			if (sendRead == 0 && orderFlag == 0) {
				return emailMapper.selectByExample(null);
			}else {
				EmailExample example = new EmailExample();
				//阅读状态的条件处理
				if (sendRead != 0) {
				  Criteria criteria = example.createCriteria();
				  criteria.andSendIdEqualTo(sendRead);
				  
				}
				
				if (orderFlag!=0) {
					if (orderFlag == 1) {
						//按时间生序
						example.setOrderByClause("send_time asc");
					}else{
						//按时间降续
						example.setOrderByClause("send_time desc");
					}
				}
				return emailMapper.selectByExample(example);
			}
			
		}

		
		
        
        
}
