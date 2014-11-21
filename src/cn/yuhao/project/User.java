package cn.yuhao.project;
import java.util.Date;
import java.util.GregorianCalendar;

public class User implements Userable {
	protected String name;
	String pwd;
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	int age ;
	int born;
	int type;

	public void setAge(int age) {
		Date date = new Date();

		String str = date.toString();
		this.age = Integer.parseInt(str) - born;
	}

	public User(String name, String pwd, int age, int born) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.born = born;
	}

	public User(String name, String pwd, int born) {
		super();
		GregorianCalendar cal = new GregorianCalendar();
		//cal.get(GregorianCalendar.YEAR);
		this.name = name;
		this.pwd = pwd;
		this.age = cal.get(GregorianCalendar.YEAR) - born;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	

	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public User(String name, String pwd, int age, int born, int type) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.born = born;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void information() {

	}

}
