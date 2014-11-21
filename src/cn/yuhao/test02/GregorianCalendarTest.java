package cn.yuhao.test02;

import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		System.out.println(cal.getTime());
		

	}

}
