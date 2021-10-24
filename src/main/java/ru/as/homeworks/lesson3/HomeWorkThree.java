package ru.as.homeworks.lesson3;


//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;


import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
//      taskOne();
//      collectArray();
//      taskThree();
//      diagonalArr();
//        initArray(5,66);
//        findMinMax();
        int[] testArr = {2,2,2};
//        System.out.println(checkBalance(testArr));


//        int[] testArrTwo = {2,3,5,6};
//        System.out.println(checkBalance(testArrTwo));
//        int[] testArrThree = {2,2,4,8};
//        System.out.println(checkBalance(testArrThree));
    }
    public static void taskOne(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
//        System.out.println();
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i]);

    }

    public static void collectArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void taskThree(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static void diagonalArr(){
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i][(arr.length-1)-i] = 1;
        }
        printArr(arr);

    }
    public static void initArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
            System.out.println();
        }
    }
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

    //    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    **Примеры:
//    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
//
//    8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//    При каком n в какую сторону сдвиг можете выбирать сами.
//    public static void cycleArrMove(int[] arr, int count){
//            int buff = 0;
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//        }
//        System.arraycopy();
//
//    }
//  Task №7.
    static public boolean checkBalance (int [] arr) {
        int sumArr = 0;
        int sumBal = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumBal = sumBal + arr[i];
            if (sumBal == (sumArr - sumBal)) {
                result = 1;
            }
        }
        if (result == 1) {
            return true;
        } else return false;
    }
    // help method
    static public void printArr (int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.printf("%3d",arr[i][j]);
            System.out.println();
        }
    }
}

