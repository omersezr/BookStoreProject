package com.example.customer.domain;

import java.util.Objects;

public class Username {
	
	private String userName;

	public Username(String userName) {
		this.userName = userName;
	}
	
	public static Username of(String userName) {
		
		Objects.requireNonNull(userName);
		
		
		if (userName.length() < 5)
			throw new IllegalArgumentException("Kullanıcı adınız 5 karakterden az olamaz. ");
		
		return new Username(userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Username other = (Username) obj;
		return Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "Username [userName=" + userName + "]";
	}
	

}
