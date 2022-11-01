package co.box.giga.member.service;

import java.sql.Date;

import lombok.Data;
@Data
public class MemberVO {
	String id;
	String pwd;
	String nm;
	Date birth;
	String phone;
	String picAttech;
	String pic;
	String email;
	String auth;
	int tierCd;
	int point;
}
