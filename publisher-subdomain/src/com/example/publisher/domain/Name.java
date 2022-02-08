package com.example.publisher.domain;

import java.util.Objects;

public  class Name {
	
private final String name;

public Name(String name) {
	this.name = name;
}
public static Name of(String name) {
	Objects.requireNonNull(name);
	
	if (name.isEmpty() )
		throw new IllegalArgumentException("Publisher's Name is not empty");
	return new Name(name);
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "Name [value=" + name + "]";
}


}
