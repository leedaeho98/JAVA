package com.leedaeho.memberjdbc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leedaeho.memberjdbc.dao.MemberJDBCTempDao;
import com.leedaeho.memberjdbc.service.MemberService;
import com.leedaeho.memberjdbc.vo.MemberVO;


@Controller
@RequestMapping(value="/member/")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/addMember", method = RequestMethod.GET)
	public String addMember() {
		return "addMember";
	}
	@RequestMapping(value = "/addMember", method = RequestMethod.POST)
	public String addMember(MemberVO member) {
		int result = service.addMember(member);
		return "redirect:/";
	}

	@RequestMapping(value = "/delMember", method = RequestMethod.GET)
	public String delMember() {
		return "delMember";
	}
	
	@RequestMapping(value = "/delMember", method = RequestMethod.POST)
	public String delMember(String memId) {
		System.out.println("넘겨받은 아이디 : " + memId);
		int result = service.delMember(memId);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/getMember", method = RequestMethod.GET)
	public String getMember() {
		return "getMember";
	}
	
	@RequestMapping(value = "/getMember", method = RequestMethod.POST)
	public String getMember(String memId, Model model) {
		MemberVO member = service.getMember(memId);
		if( member == null) {
			return "idError";
		}
		model.addAttribute("member", member);
		
		return "getView";
	}
	
	@RequestMapping(value = "/updateMember", method = RequestMethod.POST)
	public String updateMember(MemberVO member, Model model) {
		service.updateMember(member);		
		return "redirect:/";
	}
}
