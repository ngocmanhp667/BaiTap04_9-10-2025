package webstar.services.impl;

import webstar.models.UserModel;
import webstar.services.IUserService;
import webstar.dao.*;
import webstar.dao.impl.UserDaoImpl;

public class UserServiceImpl implements IUserService {
	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel FindByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
