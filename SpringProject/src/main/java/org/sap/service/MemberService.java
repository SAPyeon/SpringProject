package org.sap.service;

import java.util.ArrayList;

import org.sap.model.MemberVO;

public interface MemberService {
	public void register(MemberVO mvo);
		
	public ArrayList<MemberVO> list(MemberVO mvo);
}
