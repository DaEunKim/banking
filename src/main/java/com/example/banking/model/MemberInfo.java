package com.example.banking.model;

import lombok.Data;

/**
 * @author : DaEunKim
 * @version : 2020.09.11
 * @Description :
 */

@Data
public class MemberInfo {
	private Integer index;
	private String userId;
	private String userName;
	private String accountNum;
	private String accountPw;
	private String idcardImg;
	private String idcardUserName;
	private String regisNum;
	private String idcardNum;
	private String idcardRegDay;

	public MemberInfo() {

	}
	public MemberInfo(String userName) {
		this.userName = userName;

	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountPw() {
		return accountPw;
	}

	public void setAccountPw(String accountPw) {
		this.accountPw = accountPw;
	}

	public String getIdcardImg() {
		return idcardImg;
	}

	public void setIdcardImg(String idcardImg) {
		this.idcardImg = idcardImg;
	}

	public String getIdcardUserName() {
		return idcardUserName;
	}

	public void setIdcardUserName(String idcardUserName) {
		this.idcardUserName = idcardUserName;
	}

	public String getRegisNum() {
		return regisNum;
	}

	public void setRegisNum(String regisNum) {
		this.regisNum = regisNum;
	}

	public String getIdcardNum() {
		return idcardNum;
	}

	public void setIdcardNum(String idcardNum) {
		this.idcardNum = idcardNum;
	}

	public String getIdcardRegDay() {
		return idcardRegDay;
	}

	public void setIdcardRegDay(String idcardRegDay) {
		this.idcardRegDay = idcardRegDay;
	}
}
