package com.kasimir.demo.service;

import com.kasimir.demo.dao.IUserDao;
import com.kasimir.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    IUserDao repo;

    public String getUser(Long id){
        Optional<User> userOpt = repo.findById(id);
        if(userOpt.isPresent()){
            return userOpt.get().getName();
        }else{
            return "User not found";
        }

    }


}
