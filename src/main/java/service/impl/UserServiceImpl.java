package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import dao.UserDao;
import dao.impl.UserArrayListDao;
import dao.impl.UserLinkedListDao;
import domain.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private  UserDao userDaoLinked;

	private  UserDao userDaoArray;
	

//	public UserServiceImpl(UserDao userDao) {
//		this.userDao=userDao;
//	}
	public void save(User user, String type) {
		if(type.equals("linked")) {
			userDaoLinked.save(user);
		}
		else if (type.equals("array")) {
			userDaoArray.save(user);
		}
	}

	public void print() {
		userDaoArray.print();
	}

	@Autowired
	@Qualifier(value = "userLinkedListDao")
	public void setUserDaoLinked(UserDao userDaoLinked) {
		this.userDaoLinked = userDaoLinked;
	}
	
	@Autowired
	@Qualifier(value = "userArrayListDao")
	public void setUserDaoArray(UserDao userDaoArray) {
		this.userDaoArray = userDaoArray;
	}

	

	
	
}
