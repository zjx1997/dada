package com.bwie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bwie.pojo.employee;
import com.bwie.service.departmentservice;

@Controller
@RequestMapping("department")
public class departmentcontroller {
      
	  @Autowired
	  private departmentservice ds;
	  
	  @RequestMapping("select")
	  @ResponseBody
	  public List<employee> select(Model model){
		  
		  List<employee> list = ds.select();
		  model.addAttribute("list",list);
		return list;
		  
		  
	  }
}
