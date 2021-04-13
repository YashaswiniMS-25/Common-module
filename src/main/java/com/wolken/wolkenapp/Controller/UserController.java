package com.wolken.wolkenapp.Controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.DTO.UserDTO;
import com.wolken.wolkenapp.Exception.User2Exception;
import com.wolken.wolkenapp.Exception.UserException;
import com.wolken.wolkenapp.Service.UpdateDetails;
import com.wolken.wolkenapp.Service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	
	Logger logger = Logger.getLogger("UserController");

	@Autowired
	UserService userservice;
	
	@RequestMapping("/user.do")
	public String save(@ModelAttribute UserDTO userdto, HttpServletRequest req) throws User2Exception  {
		logger.info("inside save function in usercontroller");
		String message = userservice.validateAndSave(userdto);
		logger.info(message);
		

		req.setAttribute("message", message);
		logger.info("setting attribute");
		return "login.jsp";
		
	
	}

}
