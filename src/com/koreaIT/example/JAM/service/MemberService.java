package com.koreaIT.example.JAM.service;


import java.sql.Connection;

import com.koreaIT.example.JAM.Member;
import com.koreaIT.example.JAM.container.Container;
import com.koreaIT.example.JAM.dao.MemberDao;

public class MemberService {
	private MemberDao memberDao;

	public MemberService() {
		this.memberDao = Container.memberDao;
	}

	public int doJoin(String loginId, String loginPw, String name) {
		return memberDao.doJoin(loginId, loginPw, name);
	}

	public boolean isLoginIdDup(String loginId) {
		return memberDao.isLoginIdDup(loginId);
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

}