package cn.yuhao.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.*;
import java.awt.event.*;
public class ClassDemo01 {
  public static void main(String args[])
  {
	  new MyFrame();
  }
}
class MyFrame extends Frame
{
	Button btn2,btn3,btn4,btn5;
	MyFrame()
	{
		btn2=new Button("red");
		btn3=new Button("blue");
		btn4=new Button("green");
		btn5=new Button("white");
		setLayout(new FlowLayout());
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		btn2.addActionListener(new ColorAct());
		btn3.addActionListener(new ColorAct());
		btn4.addActionListener(new ColorAct());
		btn5.addActionListener(new ColorAct());
		addWindowListener(new HandleWin());
		setSize(300,200);
		setTitle("我的窗口");
		setVisible(true);
	}
class HandleAct implements ActionListener
{
	Frame my_frame;
	HandleAct(Frame f){
		my_frame=f;
	}
	public void actionPerformed(ActionEvent e)
	{
		my_frame.dispose();
		System.exit(0);
	}
}
class ColorAct implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="red")
		{setBackground(Color.red);
		setTitle("背景是红色");}
		else if(e.getActionCommand()=="blue")
			{setBackground(Color.blue);
		    setTitle("背景是蓝色");}
		else if(e.getActionCommand()=="green")
			{setBackground(Color.green);
			setTitle("背景是绿色");}
		else if(e.getActionCommand()=="white")
			{setBackground(Color.white);
			setTitle("背景是白色");}
	}
}
/*
 * 关闭监听器
 */
class HandleWin extends WindowAdapter{
	public void windowClosing(WindowEvent e)
	{
		(e.getWindow()).dispose();
		System.exit(0);
	}
}
}



