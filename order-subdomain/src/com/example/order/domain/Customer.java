package com.example.order.domain;

import java.util.Objects;

public class Customer {
	
	private final int identity;
	private final String username;
	private final String password;
	private final String fullname;
	private final int age;
	private final String location;
	private final String email;
	private final Long epurse;
	
	public Customer(int identity, String username, String password, String fullname, int age, String location,
			String email, Long epurse) {
		super();
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.age = age;
		this.location = location;
		this.email = email;
		this.epurse = epurse;
	}

	public int getIdentity() {
		return identity;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFullname() {
		return fullname;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public String getEmail() {
		return email;
	}

	public Long getEpurse() {
		return epurse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return identity == other.identity;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", fullname=" + fullname + ", age=" + age + ", location=" + location
				+ ", email=" + email + ", epurse=" + epurse + "]";
	}

}
