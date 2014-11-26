package Основы.HomeWork2;

/*Баскетбол.

	Известны результаты каждой из 4х четвертей баскетбольной встречи. 
	Нужно определить победителя матча. (использовать отдельный метод для определения победителя).

	Вход:
	1-я			2-я 
	команда 	команда
	26 			17
	13 			15
	19 			11
	14 			16

	Выход:
	1 
 */

public class Task0_BascketBall {

	public static void main(String[] args) {
		
		int vectorFirstTeamBalance[] = {100,13,19,14};
		int vectorSecondTeamBalance[] = new int [4];
		String winnerOfGame = null;

		vectorSecondTeamBalance[0] = 17;
		vectorSecondTeamBalance[1] = 15;
		vectorSecondTeamBalance[2] = 70;
		vectorSecondTeamBalance[3] = 16;

		for (int i = 0; i < 4; i++) {
			System.out.print(vectorFirstTeamBalance[i] + " ");
		}
		
		System.out.println("- счет первой команды за 4 матча");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(vectorSecondTeamBalance[i] + " ");
		}
		
		System.out.println("- счет второй команды за 4 матча");
		System.out.println(" ");
		
		winnerOfGame = winnerOfGame(vectorFirstTeamBalance, vectorSecondTeamBalance);
		
		if (winnerOfGame == "first winner") {
			System.out.println("Победила команда №1.");
		} else if (winnerOfGame == "second winner") {
			System.out.println("Победила команда №2.");
		}
	}
		//Расчет победителя.
	public static String winnerOfGame(int vectorFirstTeamBalance[], int vectorSecondTeamBalance[]) {
			
		int sumFirstTeam = 0;
        int sumSecondTeam = 0;
        String rezult = null;

        for (int i = 0; i < 4; i++) {
		    sumFirstTeam = vectorFirstTeamBalance[i] + sumFirstTeam; //Сумма очков первой команды.
		}

		for (int i = 0; i < 4; i++) {
			sumSecondTeam = vectorSecondTeamBalance[i] + sumSecondTeam;  //Сумма очков второй команды.
		}
			
		if (sumFirstTeam > sumSecondTeam) {
			rezult = "first winner"; //Победила команда №1.
		}
			
		if (sumFirstTeam < sumSecondTeam) {
			rezult = "second winner"; //Победила команда №2.
		}
		return rezult ;
	}
}