package com.example.publisher.domain;

import java.util.Objects;

public class Publisher {
	private PublisherId publisherId;
	private Name name;
	private Logo logo;
	public Publisher(PublisherId publisherId, Name name, Logo logo) {
		this.publisherId = publisherId;
		this.name = name;
		this.logo = logo;
	}
	public PublisherId getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(PublisherId publisherId) {
		this.publisherId = publisherId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Logo getLogo() {
		return logo;
	}
	public void setLogo(Logo logo) {
		this.logo = logo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(publisherId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(publisherId, other.publisherId);
	}
	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", name=" + name + ", logo=" + logo + "]";
	}
	
	public static class Builder{
		private PublisherId publisherId;
		private Name name;
		private Logo logo;
		
		public Builder publisherId(String value) {
			this.publisherId = PublisherId.of(value);
			return this;
		}
		public Builder name(String value) {
			this.name = Name.of(value);
			return this;
		}
		public Builder logo(String value) {
			this.logo = Logo.valueOf(value);
			
			return this;
		}
	
		public Publisher build() {
			var publisher = new Publisher(publisherId, name, logo);

			return publisher;
		}
		
	}
	
	

}
