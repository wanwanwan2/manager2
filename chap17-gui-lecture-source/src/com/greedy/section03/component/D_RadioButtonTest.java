package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButtonTest {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("���� ��ư �׽�Ʈ");
		mf.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		mf.add(topPanel, BorderLayout.NORTH);
		
		JPanel sizePanel = new JPanel();
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("Medium size");
		JRadioButton large = new JRadioButton("Large size");
		
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		mf.add(sizePanel, BorderLayout.CENTER);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		resultPanel.add(text);
		
		mf.add(resultPanel, BorderLayout.SOUTH);
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text.setText("Small size�� ���õǾ����ϴ�.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text.setText("Medium size�� ���õǾ����ϴ�.");
			}
		});

		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text.setText("Large size�� ���õǾ����ϴ�.");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}








