package com.example.requistion;

import java.util.Objects;

public class Publisher {
	private final String value;

    private Publisher(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Publisher of(String value) {
        if (!isValid(value))
            throw new IllegalArgumentException("This is not a valid id");
        return new Publisher(value);
    }

    private static boolean isValid(String value) {
        return value.matches("^[a-z0-9A-Z]{10,20}$");
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
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
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "Publisher[value=" + value + "]";
    }

}




