package config;


import org.springframework.context.annotation.ComponentScan;


//TODO: chnage use component scan

@ComponentScan(basePackages = {
		"dao",
		"domain",
		"main",
		"service"
		
})

public class MyConfig {
//	@Bean (name = "main")
//	public Main getMain() {
//		return new Main();
//	}
	
//	@Bean (name="user")
//	//@Scope(scopeName = "prototype")
//	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	public User getUser() {
//		return new User();
//	}
	/*
	@Bean (name = "userServiceLinkedList")
	public UserService getUserServiceLinkedList () {
		return new UserServiceImpl(getLinkedListDao());
	}
	@Bean (name = "userServiceArrayList")
	public UserService getUserServiceArrayList () {
		return new UserServiceImpl(getArrayListDao());
	}
	*/
//	@Bean (name = "userServiceLinkedList")
//	public UserService getUserServiceLinkedList (@Qualifier ("linkedListDao") UserDao userDao) {
//		return new UserServiceImpl();
//	}
//	@Bean (name = "userServiceArrayList")
//	public UserService getUserServiceArrayList (@Qualifier ("arrayListDao") UserDao userDao) {
//		return new UserServiceImpl();
//	}
	
//	@Bean (name = "arrayListDao")
//	public UserDao getArrayListDao () {
//		return new UserArrayListDao();
//	}
//
//	@Bean (name = "linkedListDao")
//	public UserDao getLinkedListDao () {
//		return new UserLinkedListDao();
//	}
	
}
