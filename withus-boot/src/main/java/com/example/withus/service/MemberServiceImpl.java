package com.example.withus.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.withus.dao.MemberDao;
import com.example.withus.domain.Member;




@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public Member findByIdAndPassword(String user_id, String password) {
		// TODO Auto-generated method stub
		return memberDao.findByIdAndPassword(user_id, password);
	}

	@Override
	public String findId(Member member) {
		// TODO Auto-generated method stub
		return memberDao.findId(member);
	}

	@Override
	public String findPW(Member member) {
		// TODO Auto-generated method stub
		return memberDao.findPW(member);
	}
	
	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		memberDao.updateMember(member);
	}

	@Override
	public Member memberInfo(String user_id) {
		// TODO Auto-generated method stub
		return memberDao.memberInfo(user_id);
	}

}