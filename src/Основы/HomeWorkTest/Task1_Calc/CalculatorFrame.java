package Основы.HomeWorkTest.Task1_Calc;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
	
	// Фрейм с панелью содержащий кнопки калькулятора.
	
	public CalculatorFrame() {
		
		setTitle("Calculator");
		CalculatorPanel panel = new CalculatorPanel();
		add(panel);
		pack();
	}
}
