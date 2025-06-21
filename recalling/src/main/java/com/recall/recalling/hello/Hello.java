package com.recall.recalling.hello;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//new changes -main changes


@Controller
public class Hello {
	
	Logger logger=LoggerFactory.getLogger(getClass());
	
	@RequestMapping("hello")
	@ResponseBody
	public String Welcome(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		logger.debug("XXXXXXXXXXXXXXXXXXXXX"+name);
		return "recallHello";
		
	}
	
	
}
