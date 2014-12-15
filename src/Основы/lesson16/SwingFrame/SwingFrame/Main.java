package ������.lesson16.SwingFrame.SwingFrame;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame (); // ������� ������ ����.
		frame.setLocation(200, 200); // ������ ������� ����.
		frame.setSize(260, 150); // ������ ������ ����.
		frame.setVisible(true); // ������ ��������� ����.

		frame.setTitle("�����������"); // ������ ��� ����.
		frame.setLayout(null); // ��������� �������� ���������� (��� �� ����� ���� ��������� ��������� �������� � ����).
		
//		JLabel label = new JLabel ("������� �����:");
//		label.setLocation(10, 20);
//		label.setVisible(true);

		
		
		JTextField field = new JTextField(); // ������� ������ ��������� ����.
		field.setText("������� �����:"); // ����������� ����� � ��������� ����.
		field.setLocation(20, 20); // ������ ��������� ���������� ����.
		field.setSize(200, 20); // ������ ������ ���������� ����.
		field.setVisible(true); // ������ ��������� ���������� ����.
		frame.add(field); // ��������� ���� ���� � ������ ����.
		
		JButton button1 = new JButton(); // ������� ������ ������.
		button1.setLocation(20, 50); // ������ ��������� ������.
		button1.setSize(50, 50); // ������ ������ ������.
		button1.setVisible(true); // ������ ��������� ������.
		button1.setText("1"); // ����� �������� ������.
		MyListener listenerButton1 = new MyListener(1); // ������� ������ ������� ����������� �������� ������������.
		button1.addActionListener(listenerButton1); // ������ ����� ������ ��� �� ��������� ���� ������.
		frame.add(button1); // ��������� ���� ������ � ������� ����.
		//field.setName(listenerButton1.getValue()); 
		
		JButton button2 = new JButton();
		button2.setLocation(70, 50);
		button2.setSize(50, 50);
		button2.setVisible(true);
		button2.setText("2");
		MyListener listenerButton2 = new MyListener(2);
		button2.addActionListener(listenerButton2);
		frame.add(button2);
		
		JButton button3 = new JButton();
		button3.setLocation(120, 50);
		button3.setSize(50, 50);
		button3.setVisible(true);
		button3.setText("3");
		MyListener listenerButton3 = new MyListener(3);
		button3.addActionListener(listenerButton3);
		frame.add(button3);
		
		JButton buttonPlus = new JButton();
		buttonPlus.setLocation(170, 50);
		buttonPlus.setSize(50, 50);
		buttonPlus.setVisible(true);
		buttonPlus.setText("+");
		MyListener listenerButtonPlus = new MyListener("+");
		buttonPlus.addActionListener(listenerButtonPlus);
		frame.add(buttonPlus);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // ������ ���� ��������� ��������.
	}

}
