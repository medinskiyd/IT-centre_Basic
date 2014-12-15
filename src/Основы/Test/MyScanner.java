package Основы.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {

    private String str = " ";
    private FileReader fReader = null;
    private BufferedReader br = null;
    

    // Конструктор.
    public MyScanner(String str) {
        this.str = str;
    }
    // Метод читает одно слово в строке.
    public String next() {
        String result = "";
        return result;
    }
    // Метод читает целое чистро из строки или возвращает исключение InputMismatchException.
    public int nextInt() {
        int result = 0;
        return result;
    }
    // Метод читает всю строку.
    public String nextLine() {
        String result = null;
        try {                
                fReader = new FileReader(str);
                br = new BufferedReader(fReader);
                while ((result = br.readLine()) == "\n") {
                	System.out.println(result);
                }

        } catch (Exception e) {
            System.out.println("FileNotFound - ошибка");
            e.printStackTrace();
        }
        return result;
    }
    // Метод определяет наличие в потоке данных.
    public boolean hasNext() {
        boolean decision = false;
        return decision;
    }
    // Метод определяет наличие в потоке целого int числа.
    public boolean hasNextInt() {
        boolean decision = false;
        return decision;
    }
    // Метод использует разделитель.
    public String useDelemiter() {
        String delem = null;
        return delem;
    }
    // Закрытие сканера.
    public void close() {
        try {
            this.fReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

