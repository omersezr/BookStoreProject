package com.example.sale.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Customer {
	private final static Map<String, Customer> cache = new HashMap<>();
    private final String value;

    private Customer(String value) {
        this.value = value;
    }

    public static Customer valueOf(String value) {
        if (!isValid(value))
            throw new IllegalArgumentException("This is not a valid identity no!");
        var identity = cache.get(value);
        if (Objects.isNull(identity)) {
            identity = new Customer(value);
            cache.put(value, identity);
        }
        return identity;
    }

    private static boolean isValid(String value) {
        if (value == null)
            return false;
        if (!value.matches("^\\d{11}$")) { // fail-fast
            return false;
        }
        int[] digits = new int[11];
        for (int i = 0; i < digits.length; ++i) {
            digits[i] = value.charAt(i) - '0';
        }
        int x = digits[0];
        int y = digits[1];
        for (int i = 1; i < 5; i++) {
            x += digits[2 * i];
        }
        for (int i = 2; i <= 4; i++) {
            y += digits[2 * i - 1];
        }
        int c1 = 7 * x - y;
        if (c1 % 10 != digits[9]) {
            return false;
        }
        int c2 = 0;
        for (int i = 0; i < 10; ++i) {
            c2 += digits[i];
        }
        if (c2 % 10 != digits[10]) {
            return false;
        }
        return true;
    }

    public String getValue() {
        return value;
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
        Customer other = (Customer) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "TcKimlikNo [value=" + value + "]";
    }
    }