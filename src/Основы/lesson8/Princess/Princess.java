package Основы.lesson8.Princess;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * Принцесса приезжает на каникулы в замок в июне на месяц.
 * В замке 30 спален. Каждую ночь принцесса ночует в соседней спальне.
 * Принцесса не ночует в уже посещенной спальне.
 * Принцу нужно найти принцессу как можно быстрее.
 * Принц может стучать в спальню принцессе только один раз в день.
 *
 */

public class Princess {
    private ArrayList<Integer> bedchambers = new ArrayList<Integer>();
    private static final int WAS = 1;
    private static final int ABSENT = 0;
    private static final int HERE = 100;
    private static final int DAYS_PER_WEEK = 7;
    private int direction;
    private int currentPlace;
    private int attempt;
    private Random rnd = new Random();

    public Princess(int size) {
        for (int i = 0; i < size; i++) {
            bedchambers.add(0);
        }
        direction = rnd.nextInt(100)%2==0 ? -1 : 1;
        currentPlace = rnd.nextInt(bedchambers.size());
    }

    public int get(int number) {
        attempt = number;
        if(number < 0 || number >= bedchambers.size()) {
            throw new IllegalArgumentException("Illegal bedchamber number " + number);
        }
        return bedchambers.get(number);
    }

    public void move() {
        int oldPlace = currentPlace;
        currentPlace = currentPlace + direction;

        if(currentPlace < 0) {
            currentPlace = bedchambers.size();
        } else if(currentPlace >= bedchambers.size()) {
            currentPlace = 0;
        }
        bedchambers.set(oldPlace, WAS);
        bedchambers.set(currentPlace, HERE);
    }

    /**
     * Here you can use only 'get' and 'win' methods
     * and WAS, ABSENT, HERE constants
     */
    public void check() {
        int index = 5;
        
        
        
        if(get(index) == HERE) {
            win(index);
        }
    
    }

    private void win(int index) {
        if(bedchambers.get(index) == HERE) {
            System.out.println("You are win!");
        } else {
            System.out.println("Unfortunately you are loose");
        }
        System.exit(1);
    }

    public void action() {
        for(int i=0; i<DAYS_PER_WEEK; i++) {
            move();
            System.out.println("Princess in the " + currentPlace + " bedchamber");
            System.out.println("- Your attemption to knock is " + attempt);
            check();
        }
        System.out.println("Unfortunately you are loose");
    }
}