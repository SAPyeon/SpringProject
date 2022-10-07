package org.sap.controller;

import org.sap.model.MemberVO;
import org.sap.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	
	@RequestMapping(value = "/users/login",method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인화면GET");
		return "/users/login";
	}
	@RequestMapping(value = "/users/loginProcess", method = RequestMethod.POST)
	public void loginPost() {
		System.out.println("로그인");
	}
	@RequestMapping(value="/users/member", method= RequestMethod.GET)
	public void Member() {
		System.out.println("멤버전용");
	}
	@RequestMapping(value="/users/admin", method= RequestMethod.GET)
	public void admin() {
		System.out.println("관리자");
	}
	//회원가입
	@RequestMapping(value="/users/register", method=RequestMethod.GET)
	public void register() {
		
	}
	@RequestMapping(value="/users/register", method=RequestMethod.POST)
	public String registerPost(MemberVO mvo) {
		ms.register(mvo);
		return "redirect:/";
	}
	
}
