package com.wolken.wolkenapp.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.DTO.LoginDTO;
import com.wolken.wolkenapp.Service.LoginService;

@Controller
@RequestMapping("/")
public class loginController {
	@Autowired
	LoginService service;
	Logger logger=Logger.getLogger("loginController");
	@RequestMapping("login.do")
	public String login(@ModelAttribute LoginDTO dto, HttpServletRequest req) {
		String msg=service.validateAndlogin(dto);
		logger.info("called service method");
		req.setAttribute("message", msg);
		
		
		
		
		
		return "home.jsp";
		
	}
	
	
	

}
