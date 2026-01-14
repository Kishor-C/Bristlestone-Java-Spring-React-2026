package com.bristlecone;

public interface UserService {
	public void store(User user);
	public User[] findAll();
	public User findByName(String name);
}
