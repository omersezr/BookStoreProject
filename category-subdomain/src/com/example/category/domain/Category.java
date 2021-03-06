package com.example.category.domain;

import java.util.Objects;

public class Category {

	private CategoryId id;
	private Name name;
	private SubCategory subcategory;

	public Category(CategoryId id, Name name, SubCategory subcategory) {
		super();
		this.id = id;
		this.name = name;
		this.subcategory = subcategory;
	}

	public static Category of(Category value) {
		return new Category(value.id, value.name, value.subcategory);
	}

	public CategoryId getId() {
		return id;
	}

	public void setId(CategoryId id) {
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
		return "Category [id=" + id + ", name=" + name + ", subcategory=" + subcategory + "]";
	}

	 public static class Builder {
		 
			private CategoryId id;
			private Name name;
			private SubCategory subcategory;

	        public Builder id(String value){
	            this.id = CategoryId.of(value);
	            return this;
	        }
	        public Builder categoryName(String value){
	            this.name = Name.of(value);
	            return this;
	        }
	        public Builder subCategory(String value){
	            this.subcategory = SubCategory.of(value);
	            return this;
	        }
	        public Category build(){
	            var category = new Category(id, name, subcategory);
	            return category;
	        }
	    }
}
