package com.kasimir.demo.dao;

import com.kasimir.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IUserDao extends JpaRepository<User,Long> {

    List<User> findByName(String name);
}
