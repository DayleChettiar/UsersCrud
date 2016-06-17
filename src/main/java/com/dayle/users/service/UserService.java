package com.dayle.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.dayle.users.dao.UserDAO;
import com.dayle.users.domain.User;
import com.dayle.users.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService{

	@Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRepository userRepository;

    public Object findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findOne(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
