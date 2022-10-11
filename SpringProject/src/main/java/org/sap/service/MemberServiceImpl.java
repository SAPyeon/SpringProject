package org.sap.service;

import java.util.ArrayList;

import org.sap.mapper.MemberMapper;
import org.sap.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper mm;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void register(MemberVO mvo) {
		System.out.println(mvo);
		String encodedPassword = bCryptPasswordEncoder.encode(mvo.getPassword());
		System.out.println("암호화된 비밀번호="+encodedPassword);
		
		mvo.setPassword(encodedPassword);
		mm.register(mvo);
		
	}
	public ArrayList<MemberVO> list(MemberVO mvo) {
		return mm.list(mvo);
	}
	
}
