package ������.HomeWorkTest.Task1_Calc;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
	
	// ����� � ������� ���������� ������ ������������.
	
	public CalculatorFrame() {
		
		setTitle("Calculator");
		CalculatorPanel panel = new CalculatorPanel();
		add(panel);
		pack();
	}
}
