package ������.Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String name = "text.txt";
        MyScanner myScan = new MyScanner(name); // ������� ������ ��� ������.

//        myScan.next();
//        myScan.nextInt();
        //String a = ;
        System.out.println(myScan.nextLine());
//        myScan.hasNext();
//        myScan.hasNextInt();
//        myScan.useDelemiter();
        myScan.close();

    }
}
