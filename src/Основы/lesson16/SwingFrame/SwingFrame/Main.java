package Основы.lesson16.SwingFrame.SwingFrame;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame (); // Создаем объект окно.
		frame.setLocation(200, 200); // Задаем позицию окна.
		frame.setSize(260, 150); // Задаем размер окна.
		frame.setVisible(true); // Задаем видимость окна.

		frame.setTitle("Калькулятор"); // Задаем имя окна.
		frame.setLayout(null); // Запускаем менеджер компоновки (что бы можно было создавать несколько объкетов в окне).
		
//		JLabel label = new JLabel ("Введите текст:");
//		label.setLocation(10, 20);
//		label.setVisible(true);

		
		
		JTextField field = new JTextField(); // Создаем объект текстовое поле.
		field.setText("Введите текст:"); // Изначальный текст в текстовом поле.
		field.setLocation(20, 20); // Задаем положение текстового поля.
		field.setSize(200, 20); // Задаем размер текстового поля.
		field.setVisible(true); // Задаем видимость текстового поля.
		frame.add(field); // Добавляем наше поле в объект окно.
		
		JButton button1 = new JButton(); // Создаем объект кнопка.
		button1.setLocation(20, 50); // Задаем положение кнопки.
		button1.setSize(50, 50); // Задаем размер кнопки.
		button1.setVisible(true); // Задаем видимость кнопки.
		button1.setText("1"); // Пишем название кнопки.
		MyListener listenerButton1 = new MyListener(1); // Создаем объект который отлавливает действия пользователя.
		button1.addActionListener(listenerButton1); // Задаем этому объкту что бы слушалась наша кнопка.
		frame.add(button1); // Добавляем нашу кнопку в главное окно.
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
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Должен быть последней командой.
	}

}
