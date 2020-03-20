package dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.UserDao;
import domain.User;
@Repository
public class UserLinkedListDao  implements UserDao{
	private List<User> users;
	
	public UserLinkedListDao() {
		users = new LinkedList<User>();
	}
	public void save(User user) {
		users.add (user);
	}
	public void print() {
		for (User user : users) {
			System.out.println(user);
		}
	}
}
