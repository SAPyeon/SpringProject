package org.sap.mapper;

import java.util.ArrayList;

import org.sap.model.MemberVO;

public interface MemberMapper {

	public void register(MemberVO mvo);

	public ArrayList<MemberVO> list(MemberVO mvo);

}
