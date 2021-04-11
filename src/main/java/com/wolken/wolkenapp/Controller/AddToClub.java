package com.wolken.wolkenapp.Controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.DTO.ClubDTO;
import com.wolken.wolkenapp.Service.UpdateDetails;
import com.wolken.wolkenapp.Service.UserService;

@Controller
@RequestMapping("/")
public class AddToClub {
	
	Logger logger = Logger.getLogger("AddToClub");
	@Autowired
	UpdateDetails userdetails;
	
	@RequestMapping("addstudent.do")
	public String saveDetails(@ModelAttribute ClubDTO dto, HttpServletRequest req) {
		
		String msg=userdetails.validateAndAdd(dto);
		req.setAttribute("message", msg);
		return "home.jsp";
		
	}
	

}
