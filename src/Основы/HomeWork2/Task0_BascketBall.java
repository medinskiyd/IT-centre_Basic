package ������.HomeWork2;

/*���������.

	�������� ���������� ������ �� 4� ��������� ������������� �������. 
	����� ���������� ���������� �����. (������������ ��������� ����� ��� ����������� ����������).

	����:
	1-�			2-� 
	������� 	�������
	26 			17
	13 			15
	19 			11
	14 			16

	�����:
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
		
		System.out.println("- ���� ������ ������� �� 4 �����");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(vectorSecondTeamBalance[i] + " ");
		}
		
		System.out.println("- ���� ������ ������� �� 4 �����");
		System.out.println(" ");
		
		winnerOfGame = winnerOfGame(vectorFirstTeamBalance, vectorSecondTeamBalance);
		
		if (winnerOfGame == "first winner") {
			System.out.println("�������� ������� �1.");
		} else if (winnerOfGame == "second winner") {
			System.out.println("�������� ������� �2.");
		}
	}
		//������ ����������.
	public static String winnerOfGame(int vectorFirstTeamBalance[], int vectorSecondTeamBalance[]) {
			
		int sumFirstTeam = 0;
        int sumSecondTeam = 0;
        String rezult = null;

        for (int i = 0; i < 4; i++) {
		    sumFirstTeam = vectorFirstTeamBalance[i] + sumFirstTeam; //����� ����� ������ �������.
		}

		for (int i = 0; i < 4; i++) {
			sumSecondTeam = vectorSecondTeamBalance[i] + sumSecondTeam;  //����� ����� ������ �������.
		}
			
		if (sumFirstTeam > sumSecondTeam) {
			rezult = "first winner"; //�������� ������� �1.
		}
			
		if (sumFirstTeam < sumSecondTeam) {
			rezult = "second winner"; //�������� ������� �2.
		}
		return rezult ;
	}
}