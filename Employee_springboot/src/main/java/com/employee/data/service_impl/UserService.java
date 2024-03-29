package com.employee.data.service_impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.employee.data.entity.UserData;
import com.employee.data.repo.UserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserData us=userRepo.findByUserName(username);
		return new User(us.getUsername(), us.getPassword(), new ArrayList<>());
	}

	
}
