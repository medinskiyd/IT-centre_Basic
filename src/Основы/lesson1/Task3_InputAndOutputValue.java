package ������.lesson1;

import java.util.Scanner;

public class Task3_InputAndOutputValue {

	/* ������������ ������ �����, ������� �� ����� ��� ����� 2 ����. */

    public static void main(String[] args) {

        System.out.println("������� ����� -");

        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();

        System.out.println("�������, " + "���� ����� - " + val + "; ������ ������ ����� - " + val + ";");


    }
}