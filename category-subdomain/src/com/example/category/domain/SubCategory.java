package com.example.category.domain;

import java.util.Objects;

public final class SubCategory {
	
	  private final String subcategory;

	    private SubCategory(String subcategory) {
	        this.subcategory = subcategory;
	    }

	    public static SubCategory of(String value) {
	        // Validation
	        return new SubCategory(value);
	    }

	    public String getSubCategory() {
	        return subcategory;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        SubCategory that = (SubCategory) o;
	        return subcategory.equals(that.subcategory);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(subcategory);
	    }

	    @Override
	    public String toString() {
	        return "SubCategory{" +
	                "subcategory='" + subcategory + '\'' +
	                '}';
	    }

}
