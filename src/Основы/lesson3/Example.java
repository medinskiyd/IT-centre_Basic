package Основы.lesson3;

/* (пїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ)!!!!!пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ-пїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ.
 * пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅ 0 ... пїЅпїЅ пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ.
 * пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("??????? ?????? ??????? = ");

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int m[] = new int[a];
		int i = 0;
		int v = 0;
		int j = 0;

		//?????????? ??????? ?????????? ???????
		for (i = 0; i < m.length; i++) {
			int b = (int) (Math.random()*(a+1));
			m[i] = b;
			System.out.print(m[i] + " "); }
			System.out.println();

		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m.length; j++) {
				if (m [j] > m [j+1]) { // ??????????????? ???????? ?????????? ?? ???????????.
				v = m [j];
				m [j] = m [j+1];
				m [j+1] = v;
				}
				
				System.out.println(Arrays.toString(m));
			}
		}
			System.out.println(" ");
	}
}
