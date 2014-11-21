package cn.yuhao.project;

public class VIPUser extends User {

	public VIPUser(String name, String pwd, int age) {
		super(name, pwd, age);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void information() {
		
		System.out.println(this.getName()+"是VIP用户"+age+"岁");
	}

}
