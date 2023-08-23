package com.example.demo.dto;

public class LoginDTO {
	private long userId;
	private long accountNum;
	private String email;
	public LoginDTO() {
		super();
	}
	public LoginDTO(long userId, long accountNum, String email) {
		super();
		this.userId = userId;
		this.accountNum = accountNum;
		this.email = email;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
