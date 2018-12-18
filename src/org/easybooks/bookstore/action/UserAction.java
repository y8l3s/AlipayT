package org.easybooks.bookstore.action;
import java.util.Map;

import org.easybooks.bookstore.service.IUserService;
import org.easybooks.bookstore.service.impl.UserService;
import org.easybooks.bookstore.vo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class UserAction extends ActionSupport{
	private User user;
	protected IUserService userService;
	//�û�ע�ᣬ����service���saveUser()����
	public String register() throws Exception{
		userService.saveUser(user);
		return SUCCESS;
	}
	//�û���¼������service���validateUser()����
	public String execute() throws Exception{
		User u=userService.validateUser(user.getUsername(),user.getPassword());
		if(u!=null)
		{
			Map session=ActionContext.getContext().getSession();
			//����˴λỰ��u���û��˺ţ���Ϣ
			session.put("user", u);
			return SUCCESS;
		}
		return ERROR;
	}
	//�û�ע����ȥ���Ự�е��û��˺���Ϣ���ɣ��������service��
	public String logout() throws Exception{
		Map session=ActionContext.getContext().getSession();
		session.remove("user");
		//session.remove("cart");
		return SUCCESS;
	}
	public User getUser(){
		return this.user;
	}
	public void setUser(User user){
		this.user=user;
	}
	public IUserService getUserService(){
		return this.userService;
	}
	public void setUserService(IUserService userService){
		this.userService=userService;
	}
}
