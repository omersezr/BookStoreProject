package com.example.publisher.domain;

import java.util.Objects;

public class PublisherId {
	private final String value;

    private PublisherId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static PublisherId of(String value) {
        if (!isValid(value))
            throw new IllegalArgumentException("This is not a valid id");
        return new PublisherId(value);
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
        PublisherId other = (PublisherId) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PublisherId [value=" + value + "]";
    }

}


