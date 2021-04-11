package com.wolken.wolkenapp.Controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.Entity.ClubEntity;
import com.wolken.wolkenapp.Service.UpdateDetails;

@Controller
@RequestMapping("/")

public class SearchController {
	Logger logger = Logger.getLogger("AddToClub");
	@Autowired
	UpdateDetails userdetails;
	@RequestMapping("searchform.do")
	public String search(HttpServletRequest req) {
		try {
		String role=req.getParameter("role");
		List<ClubEntity> clubentity=userdetails.validateAndSearch(role); 
		req.setAttribute("results", clubentity);
		return "home.jsp";
		
	}catch(Exception e) {
		logger.info("list is empty");
	}
		return null;
		}
	
	
	
	

}
