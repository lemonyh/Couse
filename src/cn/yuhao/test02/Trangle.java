package cn.yuhao.test02;

import java.util.Scanner;

public class Trangle {
	public void confirm(int a, int b, int c) {
		if (((a + b > c) && (a + c > b) && (b + c > a))) {
			if (a == b || b == c || a == c) {
				if (a == b && b == c) {
					System.out.println("等边三角行");
					return;
				}
				System.out.println("等腰三角行");
				return;
			}
			System.out.println("普通三角行");
		}
		else
		{
			System.out.println(a+" "+b+" "+c+"不能构成三角形!\n");
		}
		
	}
	public static void main(String[] args) {
		Trangle trangle=new Trangle();
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		trangle.confirm(a, b, c);
	}
	

}
