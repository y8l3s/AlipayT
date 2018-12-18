package org.easybooks.bookstore.dao;
import org.easybooks.bookstore.vo.User;
public interface IUserDAO {
	public void saveUser(User user);
	public User validateUser(String username,String password);
	public boolean exitUser(String username);
}
