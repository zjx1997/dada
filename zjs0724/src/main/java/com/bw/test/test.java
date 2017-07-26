package com.bw.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})*/
public class test {
    public static void main(String[] args) throws Exception{
    	 List<String> warnings = new ArrayList<String>();
    	   boolean overwrite = true;
    	   File configFile = new File("mgf.xml");
    	   ConfigurationParser cp = new ConfigurationParser(warnings);
    	   Configuration config = cp.parseConfiguration(configFile);
    	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    	   myBatisGenerator.generate(null);
	}
	/*@Autowired
	private EmailMapper dao;
	   @Test
	   public void testDao(){
		   
		   EmailExample example = new EmailExample();
		   Criteria criteria = example.createCriteria();
		   
		   //增加约束条件
		   criteria.andSendReadEqualTo("1");
		   List<Email> list = dao.selectByExample(example);
		   for (Email email : list) {
			System.out.println(email);
		   //批量设为已读
		   dao.batcheSetRead(new int[]{3,4,5});
		   //批量删除
		// dao.batcheSetDlete(new int[]{1,2});
		   EmailExample example = new EmailExample();
		   example.setOrderByClause("send_time desc");
		   List<Email> list = dao.selectByExample(example);
		   for (Email email : list) {
			System.out.println(email	);
		}
		}*/
		   
	   }
       

