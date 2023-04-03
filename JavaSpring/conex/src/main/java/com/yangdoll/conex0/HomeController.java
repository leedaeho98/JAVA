package com.yangdoll.conex0;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangdoll.conex0.vo.MemberVO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "../index1"; // /WEB-INF/ + ..(상위폴더) / index+.jsp
	}
	
	// 반환타입이 없으므로 rediret를 쓸수없다
	@RequestMapping(value = {"/views/*"}, method = RequestMethod.GET)
	public void homeNon(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
//		return "home"; // /WEB-INF/views//*.jsp로 포워드 매핑을 해준다
	}
	
	
	@RequestMapping(value = "/databind/") 
	@ResponseBody // 이 어노테이션을 사용하려면 jackson-databind 라이브러리가 있어야한다
	public MemberVO dataReq() {
		MemberVO vo = new MemberVO("aaaa", "password", "name", "suwon", 19);
		return vo;
		
	}
	
	
	
}
