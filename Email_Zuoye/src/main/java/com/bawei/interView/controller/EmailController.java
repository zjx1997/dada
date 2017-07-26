package com.bawei.interView.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.interView.bean.Email;
import com.bawei.interView.service.impl.EmailMapperInter;

@Controller
@RequestMapping("test")
public class EmailController {
	
	@Autowired
	private EmailMapperInter emailMapperInter;
	
	@RequestMapping(value="selectByExample",method=RequestMethod.GET)
	@ResponseBody
	public List<Email> selectByExample(){
		
		List<Email> selectByExample = emailMapperInter.selectByExample();
		
		return selectByExample;
	}
	
	

}
