package org.sap.service;

import org.sap.model.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
		
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException{
		
		
		
		CustomUserDetails customUserDetails = new CustomUserDetails();
		
		
		return customUserDetails;
	}

	
}
