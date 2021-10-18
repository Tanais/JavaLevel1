package ru.as.homeworks.lesson2;



public class HomeWorkTwo {
    public static void main(String[] args) {

    }

    public static boolean checkInterval(int numberOne, int numberTwo){
        return (numberOne + numberTwo) >= 10 && (numberOne + numberTwo) <= 20;
    }

    public static void checkPositive(int number){
        if (number>=0) {System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean checkPositiveBoolean(int number){
        return (number>=0);
    }

    public static void printSentence(String sentence, int amount){
        for (int i = 0; i < amount; i++) {
            System.out.println(sentence);
        }
    }

    public static boolean checkYear (int year){
        return (year % 4 == 0 || year % 100 !=0 ) && (year % 400 == 0);
    }
}


