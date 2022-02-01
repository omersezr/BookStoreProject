package com.example.customer.domain;

import java.util.List;
import java.util.Objects;

public class Customer {
	
	private Identity identity;
	private Username username;
	private Password password;
	private IsAdmin isAdmin;
	private FullName fullname;
	private Age age;
	private Location location;
	private List<Interests> interests;
	private Email email;
	private Epurse epurse;
	
	public Customer(Identity identity, Username username, Password password, IsAdmin isAdmin, FullName fullname,
			Age age, Location location, List<Interests> interests, Email email, Epurse epurse) {
		
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
		this.fullname = fullname;
		this.age = age;
		this.location = location;
		this.interests = interests;
		this.email = email;
		this.epurse = epurse;	
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public IsAdmin getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(IsAdmin isAdmin) {
		this.isAdmin = isAdmin;
	}

	public FullName getFullname() {
		return fullname;
	}

	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Interests> getInterests() {
		return interests;
	}

	public void setInterests(List<Interests> interests) {
		this.interests = interests;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Epurse getEpurse() {
		return epurse;
	}

	public void setEpurse(Epurse epurse) {
		this.epurse = epurse;
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
		return Objects.equals(identity, other.identity);
	}

	@Override
	public String toString() {
		return "Customer [identity=" + identity + ", username=" + username + ", password=" + password + ", isAdmin="
				+ isAdmin + ", age=" + age + ", epurse=" + epurse + "]";
	}
	
	
	
	
	
	
	

}
