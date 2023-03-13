package com.yangdoll.useck;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	// 필드
	private Map<String, Cookie> cookieMap = new HashMap<>(); 
	
	// 생성시 기존에 쿠키가 존재하면 cookieMap에 모든 쿠키를 저장
	public CookieBox(HttpServletRequest request) { 
		Cookie[] cookies=request.getCookies();
		if (cookies != null) {
			for (int i = 0 ; i < cookies.length ; i++) {
				cookieMap.put(cookies[i].getName() , cookies[i]);
			}
		}
	}
	
	// 쿠키 생성(쿠키명과 쿠키값만을 이용한 쿠키 생성)
	public static Cookie createCookie(String CookieName , String CookieValue) {
		return new Cookie(CookieName, CookieValue);
		
	}
	
	// 쿠키 생성(쿠키명과 쿠키, 경로와 유지 시간 지정한 쿠키 생성)
	public static Cookie createCookie(String CookieName , String CookieValue, String path , int maxAge) {
		Cookie cookie = new Cookie(CookieName, CookieValue); 
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	//쿠키 생성(쿠키명과 쿠키값, 도메인, 경로와 유지 시간을 지정한 쿠키 생
	public static Cookie createCookie(String CookieName , String CookieValue, String path , int maxAge , String domain) {
		Cookie cookie = new Cookie(CookieName, CookieValue); 
		cookie.setDomain(domain); 
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	public Cookie cookieVlaueAppend(Cookie cookie, String appendValue) {
		cookie.setValue(cookie.getValue()/* 기존의 쿠키 값 */+ "/"/* 구분자 */ + appendValue/* 새로추가할 상품명 */); 
		return cookie;	
	}
	
	public Cookie getCookie(String name) {
		return cookieMap.get(name);		
	}
	
	public String getValue(String name) {
		Cookie cookie = cookieMap.get(name);
		if( cookie == null) return null;
		return cookie.getValue();
	}
	
	public boolean existsCookie(String name) {
		return cookieMap.get(name) != null;
	}
}
