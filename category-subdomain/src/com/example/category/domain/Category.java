package com.example.category.domain;

import java.util.Objects;

public class Category {
	private String id;
	private Name name;
	private SubCategory subcategory;
	
	public Category(String id, Name name, SubCategory subcategory) {
		this.id = id;
		this.name = name;
		this.subcategory = subcategory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public SubCategory getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Category [id=" + id + "]";
	}
	
	
}

