package com.ust.Employeesecurity.Jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.Employeesecurity.Jwt.entity.User;
import com.ust.Employeesecurity.Jwt.repo.UserRepository;

@Service
public class Userservice implements UserDetailsService {
	
	@Autowired
	private UserRepository repo;
	
	
    
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
        User user =repo.findByUsername(username);
        
        return new org.springframework.security.core.userdetails.User(user.getuserName(),user.getPassword(),new ArrayList<>());
  
	}
}