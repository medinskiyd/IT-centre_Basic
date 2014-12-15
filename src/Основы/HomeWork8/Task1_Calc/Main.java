package Основы.HomeWork8.Task1_Calc;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame (); // Создаем объект окно.
		frame.setLocation(200, 200); // Задаем позицию окна.
		frame.setSize(255, 305); // Задаем размер окна.
		frame.setVisible(true); // Задаем видимость окна.

		frame.setTitle("Калькулятор"); // Задаем имя окна.
		frame.setLayout(null); // Запускаем менеджер компоновки (что бы можно было создавать несколько объкетов в окне).
		
		
		JTextField field = new JTextField(); // Создаем объект текстовое поле.
		//field.setText("Введите текст:"); // Изначальный текст в текстовом поле.
		field.setLocation(20, 20); // Задаем положение текстового поля.
		field.setSize(200, 20); // Задаем размер текстового поля.
		field.setVisible(true); // Задаем видимость текстового поля.
		frame.add(field); // Добавляем наше поле в объект окно.
		
		JButton button1 = new JButton("1"); // Создаем объект кнопка.
		button1.setLocation(20, 50); // Задаем положение кнопки.
		button1.setSize(50, 50); // Задаем размер кнопки.
		button1.setVisible(true); // Задаем видимость кнопки.
		MyListener listenerButton1 = new MyListener(1); // Создаем объект который отлавливает действия пользователя.
		button1.addActionListener(listenerButton1); // Задаем этому объекту что бы слушалась наша кнопка.
		frame.add(button1); // Добавляем нашу кнопку в главное окно.
		
		//field.
		
		JButton button2 = new JButton("2");
		button2.setLocation(70, 50);
		button2.setSize(50, 50);
		button2.setVisible(true);
		MyListener listenerButton2 = new MyListener(2);
		button2.addActionListener(listenerButton2);
		frame.add(button2);
		
		JButton button3 = new JButton("3");
		button3.setLocation(120, 50);
		button3.setSize(50, 50);
		button3.setVisible(true);
		MyListener listenerButton3 = new MyListener(3);
		button3.addActionListener(listenerButton3);
		frame.add(button3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setLocation(170, 50);
		buttonPlus.setSize(50, 50);
		buttonPlus.setVisible(true);
		MyListener listenerButtonPlus = new MyListener(000);
		buttonPlus.addActionListener(listenerButtonPlus);
		frame.add(buttonPlus);
		
		JButton button4 = new JButton("4");
		button4.setLocation(20, 100);
		button4.setSize(50, 50);
		button4.setVisible(true);
		MyListener listenerButton4 = new MyListener(4);
		button4.addActionListener(listenerButton4);
		frame.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setLocation(70, 100);
		button5.setSize(50, 50);
		button5.setVisible(true);
		MyListener listenerButton5 = new MyListener(5);
		button5.addActionListener(listenerButton5);
		frame.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setLocation(120, 100);
		button6.setSize(50, 50);
		button6.setVisible(true);
		MyListener listenerButton6 = new MyListener(6);
		button6.addActionListener(listenerButton6);
		frame.add(button6);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setLocation(170, 100);
		buttonMinus.setSize(50, 50);
		buttonMinus.setVisible(true);
		MyListener listenerButtonMinus = new MyListener(000);
		buttonMinus.addActionListener(listenerButtonMinus);
		frame.add(buttonMinus);
		
		JButton button7 = new JButton("7");
		button7.setLocation(20, 150);
		button7.setSize(50, 50);
		button7.setVisible(true);
		MyListener listenerButton7 = new MyListener(7);
		button7.addActionListener(listenerButton7);
		frame.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setLocation(70, 150);
		button8.setSize(50, 50);
		button8.setVisible(true);
		MyListener listenerButton8 = new MyListener(8);
		button8.addActionListener(listenerButton8);
		frame.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setLocation(120, 150);
		button9.setSize(50, 50);
		button9.setVisible(true);
		MyListener listenerButton9 = new MyListener(9);
		button9.addActionListener(listenerButton9);
		frame.add(button9);
		
		JButton buttonMult = new JButton("*");
		buttonMult.setLocation(170, 150);
		buttonMult.setSize(50, 50);
		buttonMult.setVisible(true);
		MyListener listenerButtonMult = new MyListener(000);
		buttonMult.addActionListener(listenerButtonMult);
		frame.add(buttonMult);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.setLocation(20, 200);
		buttonDiv.setSize(50, 50);
		buttonDiv.setVisible(true);
		MyListener listenerButtonDiv = new MyListener(000);
		buttonDiv.addActionListener(listenerButtonDiv);
		frame.add(buttonDiv);
		
		JButton button0 = new JButton("0");
		button0.setLocation(70, 200);
		button0.setSize(50, 50);
		button0.setVisible(true);
		MyListener listenerButton0 = new MyListener(0);
		button0.addActionListener(listenerButton0);
		frame.add(button0);
		
		JButton buttonRes = new JButton("%");
		buttonRes.setLocation(120, 200);
		buttonRes.setSize(50, 50);
		buttonRes.setVisible(true);
		MyListener listenerButtonRes = new MyListener(000);
		buttonRes.addActionListener(listenerButtonRes);
		frame.add(buttonRes);
		
		JButton buttonEq = new JButton("=");
		buttonEq.setLocation(170, 200);
		buttonEq.setSize(50, 50);
		buttonEq.setVisible(true);
		MyListener listenerButtonEq = new MyListener(000);
		buttonEq.addActionListener(listenerButtonEq);
		frame.add(buttonEq);
		
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Должен быть последней командой.
	}

}
