package com.bristlecone;

/*
 * This class maintains all the user objects in an array 
 */
public class UserServiceArray implements UserService {
	// create a static array so that no matter how many objects of UserServiceArray you create
	// you will have only one copy of the static array
	private static User[] userItems; // initially it will be null
	// counter to track the size of the array
	private static int counter = 0;
	public UserServiceArray(int size) {
		userItems = new User[size]; // allocates memory for the specified size
	}
	@Override
	public void store(User user) {
		if(counter < userItems.length) {
			userItems[counter] = user;
			counter++;
		} else {
			// usually we will throw exception here so that client will know what happened
			System.err.println("Array size is exceeded");
		}
		
	}
	@Override
	public User[] findAll() {
		// we will copy original array to another array and return that another array
		User[] copy = new User[counter]; 
		for(int index = 0; index < counter; index++) {
			copy[index] = userItems[index];
		}
		return copy;
	}
	@Override
	public User findByName(String name) {
		// call findAll() that gives only necessary blocks that are initialized
		// find the element from the array
		User[] items = findAll();
		for(User user : items) {
			String existing = user.getName();
			// to compare a string with another string you will use equals() method
			if(existing.equals(name)) {
				return user;
			}
		}
		return null;// null is returned only if no user is found based on the name
	}

}
