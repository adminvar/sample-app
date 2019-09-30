package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRespository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRespository) {
		this.userRespository = userRespository;
	}

    public List<User> findAll() {
        return userRespository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRespository.findById(id);
    }

    public User save(User user) {
        return userRespository.save(user);
    }

    public void deleteById(Long id) {
    	userRespository.deleteById(id);
    }
}
