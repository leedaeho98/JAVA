package com.yangdoll.conex0;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yangdoll.conex0.service.MemberService;
import com.yangdoll.conex0.vo.ListMemberVO;
import com.yangdoll.conex0.vo.MemberVO;


@Controller
@RequestMapping(value = "/param/")
public class ParamCollController {
	
	@Autowired
	MemberService service;

	@RequestMapping("one")
	public void one(@RequestParam("data1")int data2) {
		System.out.println(data2 + 1234);
	}
	@RequestMapping("two") // 여러개의 자료를 보내려하려면 RequestParam을 붙인다
	public void two(@RequestParam("data1")ArrayList<String> data1) {
		System.out.println(data1.get(0));
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
	}
	@RequestMapping("three")
	public void three(@RequestParam("data1") String[] data1) {
		System.out.println(data1[0]);
		System.out.println(data1[1]);
		System.out.println(data1[2]);
		
	}
	@RequestMapping("four")
	public void four(MemberVO vo, HttpServletRequest request, HttpSession ses,Model model) {
		System.out.println(vo);
		request.setAttribute("vo", vo);
		ses.setAttribute("sesVO", vo);
		model.addAttribute("dbResultVo", service.getMember(vo.getId()));
	}
	@RequestMapping("five")
	public void five(ListMemberVO list, Model model) {
		model.addAttribute("list",list);
	}
	
//	@RequestMapping(value = "six", method=RequestMethod.) //=> 기존
//	@GetMapping(value = "six") // => 4.0이후로 간단하게 작성 가능 (get방식)
//	@PostMapping // => Post방식
	public void six(@ModelAttribute("vo") MemberVO vo, 
					@ModelAttribute("test") int test) {
	}
	
	
	@RequestMapping("inform")
	public void form() {
	}
}
