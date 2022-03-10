package com.sg.webApp.service;

import java.util.List;
import java.util.Map;

import com.sg.webApp.entities.Test;

public interface TestService {

	void addTest(Test t);

	void updateTest(Test t);

	void deleteTest(Test t);

	Test getTestById(int id);

	List<Test> getTest();

	Map<Integer, Test> getTestMap();
}
