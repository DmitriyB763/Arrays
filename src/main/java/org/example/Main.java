package org.example;


import org.example.elements.Button;

import java.util.Arrays;

import static java.lang.System.out;
//http://javazadachi.blogspot.com/p/blog-page_5.html
public class Main {

    public static void main(String[] args) {
        Button but = new Button();
        lesson7();
    }

    public static void lesson1() {
        int[] mas = new int[10];
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                mas[count] = i;
                out.println(mas[count]);
                count++;
            }
        }
        String s = "";
        for (int x : mas) {
            s += x + " ";
        }
        out.println(s);
    }

    public static void lessonBook() {
        double[] mas2 = {2.23, 3.99, 10.12, 20.15, 16.55};
        double sum = 0;
        double avg;
        for (double i : mas2) {
            sum += i;
            //при расчете средней в поле видимости цикла , расчет берется для каждого i  отдельно и я получаю не один показатель , а 5
            // (расчет производится для каждого i)
        }
        avg = sum / mas2.length;
        out.println(avg);
    }

    public static void lesson2() {
        int[] mas3 = new int[0];
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                mas3 = Arrays.copyOf(mas3, mas3.length + 1);
                mas3[mas3.length - 1] = i;
            }
        }
        for (int x : mas3) {
            out.print(x + " ");
        }
        out.println(" ");
        for (int i = mas3.length - 1; i >= 0; i--) {
            out.print(mas3[i] + " ");
        }
    }

    public static void lesson3() {

        int[] mas4 = new int[15];
        for (int x = 0; x < mas4.length; x++) {
            mas4[x] = (int) (Math.random() * 9);
            out.println(mas4[x]);
        }
        out.println(" ");
        int count = 0;
        for (int a : mas4) {
            if (a % 2 == 0) {
                count++;
            }
        }
        out.print(count);
    }

    public static void lesson4() {
        int[] mas5 = new int[8];
        for (int x = 0; x < mas5.length; x++) {
            mas5[x] = (int) ((Math.random() * 11) + 1);
            out.print(mas5[x] + " ");
        }
        out.println(" ");

        for (int i = 0; i < mas5.length; i++) {
            if (i % 2 != 0) {
                mas5[i] = 0;
            }
            out.print(mas5[i] + " ");
        }
    }

    public static void lesson5() {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int sumArr1 = 0;
        int sumArr2 = 0;
        double avgArr1;
        double avgArr2;
        String s = "";
        String s1 = "";

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5);
            arr2[i] = (int) (Math.random() * 5);
            s += arr1[i] + " ";
            s1 += arr2[i] + " ";
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }

        out.println(s);
        out.println(s1);

        avgArr1 = sumArr1 / arr1.length;
        avgArr2 = sumArr2 / arr2.length;

        if (avgArr1 > avgArr2) {
            out.println(avgArr1);
        }
        if (avgArr1 < avgArr2) {
            out.println(avgArr2);
        } else {
            out.println("Средние арифметические массивов равны");
        }

    }

    public static void lesson6() {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 99) + 10);
            out.print(arr[i] + " ");
        }
        out.println(" ");
//проверить возврастающая последовательность или нет
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] < arr[i + 1])) {
                out.println("Последовательность не возврастающая");
                return;
            }
        }
        out.println("Последовательность возврастающая");
    }

    public static void lesson7() {
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 1; i < fib.length - 1; i++) {
            fib[i+1] = fib[i] + fib[i-1];
        }
        Arrays.stream(fib).forEach(x -> out.print(x + " "));
    }

    public static void lesson8() {
        int[] arr = new int[12];
        int count = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (30 + 1) - 15);
            out.println(arr[i]);
        }
        out.println(" ");
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > count) {
                count = arr[x];
                index = x;
            }
        }
        out.println(index);
    }

    public static void lesson9() {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) ((Math.random() * 9) + 1);
            out.print(arr1[i] + " ");
        }
        out.println(" ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) ((Math.random() * 9) + 1);
            out.print(arr2[i] + " ");
        }
        out.println(" ");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / (double) arr2[i];
            out.print(arr3[i] + " ");
        }
        out.println(" ");
        int count = 0;
        for (double i : arr3) {
            if (i - Math.rint(i) == 0) {
                count++;
            }
        }
        out.println(count);
    }

    public static void lesson10() {
        int[] arr = new int[11];
        //int[] arrUnic = new int[0];
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (3 + 1) - 2);
            out.print(arr[i] + " ");
        }
        out.println(" ");
        for (int x : arr) {
            if (x < 0) {
                first++;
            }
            if (x == 0) {
                second++;
            }
            if (x > 0) {
                third++;
            }
        }
        if (first > second && first > third) {
            out.println(-1);
        } else if (second > first && second > third) {
            out.println(0);
        } else if (third > first && third > second) {
            out.println(1);
        }


    }

    //нужен массив с уникальными значениями (с числами в  ед. экземляре) или просто с переменными(3 перем. для каждого виды значений)
    public static void lesson11() {
        int leftModulSum = 0;
        int rigtModulSum = 0;
        String s = "";


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (10 + 1)) - 5);
            //int arrToMod = Math.abs(arr[i]);
            s += arr[i] + " ";
            //out.print(arrToMod);
            out.print(" ");
        }
        out.println(" ");
        out.println(s);

        for (int a = 0;a < arr.length; a++){
            if (a <= arr.length/2){
                leftModulSum+= Math.abs(arr[a]);
            }else {
                rigtModulSum+= Math.abs(arr[a]);
            }

        }
        /*for (int a = 0; a < arr.length / 2; a++) {
            leftModulSum += Math.abs(arr[a]);
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            rigtModulSum += Math.abs(arr[i]);
        }*/

        if (rigtModulSum > leftModulSum) {
            out.println("Rigt: " + rigtModulSum);
        } else {
            out.println("Left: " + leftModulSum);
        }

    }
}



    /*public static void lesson12(){
    int[] arr = new int[12];
    for (int i = 0; i<arr.length;i++){
        arr[i]= (int) (Math.random() *(20+1)-10);
        for (int x:arr){
            if ()
        }
        out.println(arr[i]);
    }
    }*/















