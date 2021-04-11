package com.wolken.wolkenapp.Controller;
import javax.script.*;  


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.DTO.UpdateDTO;
import com.wolken.wolkenapp.Entity.UserEntity;
import com.wolken.wolkenapp.Exception.UserException;
import com.wolken.wolkenapp.Service.UpdateDetails;
import com.wolken.wolkenapp.Service.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController {
	@Autowired
	UpdateService service;
	@Autowired
	UpdateDetails update;
	Logger logger = Logger.getLogger("UpdateController");

	@RequestMapping("email.do")
	public String getByEmail(HttpServletRequest req) {
		try {
		String email = req.getParameter("EmailId");
		UserEntity entity = service.validateAndUpdate(email);
		if(entity!=null) {

		
		logger.info(entity.getEmailId());
		req.setAttribute("entity", entity);
		
		return "getdetails.jsp";
		}else {
			throw new UserException();
		}
		}catch (Exception e) {
			logger.error("email is invallid");
			
		}
		return null;

	}

	@RequestMapping("get.do")
	public String Updatedetails(@ModelAttribute UpdateDTO updatedto, HttpServletRequest req) {
		logger.info("inside update details of controller");
		String msg = update.Updatevalues(updatedto);
		req.setAttribute("message", msg);

		return "home.jsp";

	}
}
