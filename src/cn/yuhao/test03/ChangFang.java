package cn.yuhao.test03;

import java.awt.im.InputContext;
import java.util.Scanner;

public class ChangFang implements Printable {
	private int length;
	private int width;

	public ChangFang(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public ChangFang(int length) {
		super();
		this.length = length;
	}

	public ChangFang() {
		super();
	}

	public int area() {
		return length * width;
	}

	public int zhouchang() {
		return 2 * (length + width);
	}

	public static void main(String[] args) {
		ChangFang c = new ChangFang();
		c.printWay('*');

	}

	public void printWay() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长：");
		length = in.nextInt();

		System.out.println("请输入宽：");
		width = in.nextInt();
		ChangFang changFang = new ChangFang(length, width);
		System.out.println("长" + length);
		System.out.println("宽" + width);
		System.out.println("面积" + changFang.area());
		System.out.println("周长" + changFang.zhouchang());

	}

	public void printWay(char ch) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长：");
		length = in.nextInt();

		System.out.println("请输入宽：");
		width = in.nextInt();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < length; y++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
