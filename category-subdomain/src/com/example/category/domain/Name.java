package com.example.category.domain;

import java.util.Objects;

public final class Name {
	
	 private final String name;

	    private Name(String name) {
	        this.name = name;
	    }

	    public static Name of(String value) {
	        return new Name(value);
	    }

	    public String getCategoryName() {
	        return name;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Name that = (Name) o;
	        return name.equals(that.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name);
	    }

	    @Override
	    public String toString() {
	        return "Name{" +
	                "name='" + name + '\'' +
	                '}';
	    }

}
