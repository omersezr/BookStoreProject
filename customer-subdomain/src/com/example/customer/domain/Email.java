package com.example.customer.domain;

public class Email {
	
	private String email;
	
	public Email(String email) {
		
		this.email = email;
	}
	
	
	public static Email of(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        
        // Email kontrolü false ise 
        if (m.matches() == false)
        	throw new IllegalArgumentException("Lütfen doğru bir email adresi giriniz.");
        		
        return new Email(email);
 }
 
	public String getEmail() {
		return email;
	}
	
	

}
