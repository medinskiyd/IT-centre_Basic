package ������.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {

    private String str = " ";
    private FileReader fReader = null;
    private BufferedReader br = null;
    

    // �����������.
    public MyScanner(String str) {
        this.str = str;
    }
    // ����� ������ ���� ����� � ������.
    public String next() {
        String result = "";
        return result;
    }
    // ����� ������ ����� ������ �� ������ ��� ���������� ���������� InputMismatchException.
    public int nextInt() {
        int result = 0;
        return result;
    }
    // ����� ������ ��� ������.
    public String nextLine() {
        String result = null;
        try {                
                fReader = new FileReader(str);
                br = new BufferedReader(fReader);
                while ((result = br.readLine()) == "\n") {
                	System.out.println(result);
                }

        } catch (Exception e) {
            System.out.println("FileNotFound - ������");
            e.printStackTrace();
        }
        return result;
    }
    // ����� ���������� ������� � ������ ������.
    public boolean hasNext() {
        boolean decision = false;
        return decision;
    }
    // ����� ���������� ������� � ������ ������ int �����.
    public boolean hasNextInt() {
        boolean decision = false;
        return decision;
    }
    // ����� ���������� �����������.
    public String useDelemiter() {
        String delem = null;
        return delem;
    }
    // �������� �������.
    public void close() {
        try {
            this.fReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

