package com.testassignment.shoppingcart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testassignment.shoppingcart.domain.User;
import com.testassignment.shoppingcart.repository.UserRepository;

/**
 * Created by ashishn on 08/28/2017.
 */
@Service
@Transactional
public class UserService {
   
	@Autowired
    private UserRepository userRepository;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("user1@gmail.com","user1"));
        users.add(new User("user2@gmail.com","user2"));
    }

    public void saveInitialBatch(){
        userRepository.save(users);
    }

}
