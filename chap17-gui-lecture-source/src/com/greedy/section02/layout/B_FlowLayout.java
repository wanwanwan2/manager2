package com.greedy.section02.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	
	public B_FlowLayout() {
		super("FlowLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		/* FlowLayout ���� */
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.add(new JButton("1��"));
		this.add(new JButton("2��"));
		this.add(new JButton("3��"));
		this.add(new JButton("4��"));
		this.add(new JButton("5��"));
		this.add(new JButton("6��"));
		this.add(new JButton("7��"));
		this.add(new JButton("8��"));
		this.add(new JButton("9��"));
		this.add(new JButton("10��"));
		this.add(new JButton("11��"));
		this.add(new JButton("12��"));
		this.add(new JButton("13��"));
		this.add(new JButton("14��"));
		this.add(new JButton("15��"));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
