package com.userfront.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
	
	private String authority;
	
	
	
	public Authority(String authority) {
		
		this.authority = authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		
		return authority;
	}
	
	
}
