package com.sg.webApp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.webApp.entities.TestUser;

@Repository
public interface TestUserDAO extends JpaRepository<TestUser, Integer> {

}
