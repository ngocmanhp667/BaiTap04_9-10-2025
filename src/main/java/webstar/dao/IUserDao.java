package webstar.dao;
import webstar.models.*;
import java.util.List;
public interface IUserDao {
	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user);
	
	UserModel findByUserName(String username);
}
