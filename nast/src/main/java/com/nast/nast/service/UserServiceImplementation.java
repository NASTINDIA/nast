package com.nast.nast.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nast.nast.entity.UserEntity;
import com.nast.nast.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		
		userRepository.save(userEntity);
		
		
		
	}

}
