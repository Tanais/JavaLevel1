package ru.as.homeworks.lesson3;

public class HomeWorkThree {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{2, 2, 2, 2, 10}));
    }

    //Задание №1
    public static void taskOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
    }

    //Задание №2
    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    //Задание №3
    public static void taskThree(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
    }

    //Задание №4
    public static void diagonalArray(){
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i][(arr.length-1)-i] = 1;
        }
    }

    //Задание №5
    public static void initArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
    }


    //Задание №6
    public static void findMinMax(){
        int[] arr = {51,612,42,521,-12,1500,-500};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
    }


    //  Задание №7
    static public boolean checkBalance (int [] arr) {
        int sumArray = 0;
        int sumBalance = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArray = sumArray + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumBalance = sumBalance + arr[i];
            if (sumBalance == (sumArray - sumBalance)) {
                result = 1;
            }
        }
        return (result == 1);
    }
}

