package com.sg.webApp.service;

import java.util.List;
import java.util.Map;

import com.sg.webApp.entities.User;

public interface UserService {

	void addUser(User u);

	void updateUser(User u);

	void deleteUser(User u);

	User getUserById(int id);

	List<User> getUser();

	Map<Integer, User> getUserMap();

}
