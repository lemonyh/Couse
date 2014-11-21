package cn.yuhao.test05;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientChatUI extends JFrame {
	private String userName;// 登录成功的用户名

	public static void main(String[] args) {
		ClientChatUI chatUI = new ClientChatUI("yu");
	}

	public ClientChatUI(String userName) throws HeadlessException {
		// super();
		this.userName = userName;
		JPanel contentPane = new JPanel();

		showFrame();
	}

	// 显示一个窗体的方法
	public void showFrame() {
		this.setTitle("netjava:欢迎" + this.userName);
		java.awt.FlowLayout fl = new java.awt.FlowLayout(0);
		this.setLayout(fl);
		this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗体关闭时程序退出
		this.setVisible(true);
		initUI();

	}

	public void initUI() {
		JLabel la_name = new JLabel("接收到的消息：");
		JLabel la_users = new JLabel("发送给谁：");
		final JTextField jtf_send = new JTextField(20);
		final JTextField jtf_recieve = new JTextField(30);
		javax.swing.JButton bu_send = new JButton("send");
		JComboBox jc = new JComboBox();
		jc.addItem("张三");
		jc.addItem("李四");

	}

}