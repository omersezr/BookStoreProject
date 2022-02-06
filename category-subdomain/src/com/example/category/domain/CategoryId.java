package com.example.category.domain;

import java.util.Objects;

public final class CategoryId {

	private final String id;

	private CategoryId(String id) {
		this.id = id;
	}

	public static CategoryId of(String value) {
		return new CategoryId(value);
	}

	public String getCategoryId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CategoryId that = (CategoryId) o;
		return id.equals(that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "CategoryId{" + "id='" + id + '\'' + '}';
	}

}
