package cn.yuhao.project;

public class GeneralUser extends User {

	public GeneralUser(String name, String pwd, int age) {
		super(name, pwd, age);
		this.type=1;
		// TODO Auto-generated constructor stub
	}
	public void information() {
		System.out.println(this.getName()+"是普通用户"+age+"岁");
	}


	
}
