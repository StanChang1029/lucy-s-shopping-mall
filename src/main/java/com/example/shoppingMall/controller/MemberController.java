package com.example.shoppingMall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingMall.dto.member.CreateMemberRes;
import com.example.shoppingMall.dto.member.DeleteMemberRes;
import com.example.shoppingMall.dto.member.NonAvailableMemberRes;
import com.example.shoppingMall.dto.member.QueryMemberWithAllRes;
import com.example.shoppingMall.dto.member.UpdateMemberRes;
import com.example.shoppingMall.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping(value = "/member/create")
	public CreateMemberRes createMember() {
		return null;

	}

	@PostMapping(value = "/member/update")
	public UpdateMemberRes updateMember() {
		return null;

	}

	@PostMapping(value = "/member/query/id")
	public QueryMemberWithAllRes queryWithIdMember() {
		return null;

	}

	@PostMapping(value = "/member/query/all")
	public QueryMemberWithAllRes queryWithAllMember() {
		return null;

	}

	@PostMapping(value = "/member/delete")
	public DeleteMemberRes deleteMember() {
		return null;

	}
	
	@PostMapping(value = "/member/non/available")
	public NonAvailableMemberRes nonAvailableMember() {
		return null;

	}

}
