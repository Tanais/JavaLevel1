package ru.as.homeworks.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = -100;
        int b = -100;
        if ((a + b) >= 0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int color = 100;
        if (color < 0){
            System.out.println("Красный");
        }
        if (color >= 0 && color <= 100){
            System.out.println("Желтый");
        }
        if (color > 100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 100;
        int b = 55;
        if (a >= b){
            System.out.println("а больше(>) или равно(=) b");
        }
        if (a < b){
            System.out.println("а меньше(<) b");
        }
    }

}
