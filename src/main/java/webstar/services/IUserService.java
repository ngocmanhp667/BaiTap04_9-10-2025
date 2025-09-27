package webstar.services;

import webstar.models.UserModel;

public interface IUserService {
	UserModel login(String username,String password);
	
	UserModel FindByUserName(String username);
	
}
