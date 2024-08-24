//package com.devar.cabs.service.impl;
//
//import com.devar.cabs.entity.UserEntity;
//import com.devar.cabs.repository.UserRepository;
//import com.devar.cabs.service.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Optional;
//
//@Service
//public class UserService implements UserDetailsService{
//
//	
//	  @Autowired
//	    private UserRepository userRepository;
//
//	    @Autowired
//	    private PasswordEncoder passwordEncoder;
//
//	    public UserEntity createUser(UserEntity user) {
//	        user.setPassword(passwordEncoder.encode(user.getPassword()));
//	        return userRepository.save(user);
//	    }
//
//	    public Optional<UserEntity> findByUsername(String username) {
//	        return userRepository.findByUsername(username);
//	    }
//
//	    public Optional<UserEntity> findById(Long id) {
//	        return userRepository.findById(id);
//	    }
//
//	    public boolean checkPassword(String rawPassword, String encodedPassword) {
//	        return passwordEncoder.matches(rawPassword, encodedPassword);
//	    }
//
//	    @Override
//	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	    	UserEntity user = userRepository.findByUsername(username).orElseThrow(() ->
//	                new UsernameNotFoundException("User not found with username: " + username));
//	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
//	    }
//}
