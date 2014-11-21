package cn.yuhao.project;

public class TestUser {
	
	
		public static void main(String args[]){
//			User gerneralUser = new GeneralUser("马可", "123456", 1970);
//			User vipUser = new VIPUser("汪涵", "123456", 1974);
//			gerneralUser.information();
//			vipUser.information();
			User u1 = new User("张三","123456");
			User u2 = new User("李四","sdf");
			User u3 = new User("王五","dfgg");
			UserManager um = new UserManager();
			um.addUser(u1);
			um.addUser(u2);
			um.addUser(u3);
			System.out.println(um.delete(u3));
			User user = um.getUserByName("张三");
			System.out.println(user.name+"   "+ user.pwd);
			boolean bool=um.exist("李四", "sddddd");
			System.out.println(bool);

		}

}
