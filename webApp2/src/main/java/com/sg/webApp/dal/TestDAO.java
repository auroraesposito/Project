package com.sg.webApp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.webApp.entities.Test;

@Repository
public interface TestDAO extends JpaRepository<Test, Integer> {

}
