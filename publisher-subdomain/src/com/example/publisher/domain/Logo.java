package com.example.publisher.domain;

import java.util.Base64;
import java.util.Objects;

public final class Logo {
	private final byte[] values;

	private Logo(byte[] values) {
		this.values = values;
	}
	
	public static Logo valueOf(byte[] values) {
		Objects.requireNonNull(values);
		return new Logo(values);
	}
	public static Logo valueOf(String values) {
		Objects.requireNonNull(values);
		return new Logo(Base64.getDecoder().decode(values));
	}

	public byte[] getValues() {
		return values;
	}
	
	public String getBase64Values() {
		return String.valueOf(Base64.getEncoder().encode(values));
	}
	
}


