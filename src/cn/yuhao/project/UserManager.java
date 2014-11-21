package cn.yuhao.project;


public class UserManager {
	// 数组大小
	private int size = 100;
	// 注意：数组声明的格式， 必须在创建时确定数组大小
	private User[] userList = new User[size];
	// 当前用户数
	private int index;
	
	public boolean addUser(User user){
		if(index<size){
			userList[index]=user;//添加用户
			index++;//当前用户数+1
			return true;
		}else{
			return false;
		}				
	}
	public User getUserByName(String name)
	{
		for(int i=0;i<index;i++)
		{
			User user=userList[i];
			if(name.equals(user.getName()))
			{
				return user;
			}
		}
		return null;
	}
	public boolean exist(String name,String password)
	{
		for(int i=0;i<index;i++)
		{
			User user=userList[i];
			if(name.equals(user.name)&&password.equals(user.pwd))
			{
				return true;
			}
		}
		return false;
	}
	public boolean delete(User user)
	{
		if(this.exist(user.getName(), user.getPwd())==false){
		return false;
		}
		else {
			return true;
		}
		
	}

}
