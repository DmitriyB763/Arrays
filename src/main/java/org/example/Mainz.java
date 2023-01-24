package org.example;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
//http://javazadachi.blogspot.com/p/blog-page_5.html
public class Mainz {
    public static void main(String[] args) {

        lesson12();
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
        int avgArr1;
        int avgArr2;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5);
        }
        String s = " "; //не вспомнил как проще вывести массив в строку
        for (int a : arr1) {
            s += a + " ";
        }
        out.println(s);
        for (int x : arr1) {
            sumArr1 += x;
        }
        avgArr1 = sumArr1 / arr1.length;


        out.println(" ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (int) (Math.random() * 5);
        }
        String g = " ";
        for (int w : arr2) {
            g += w + " ";
        }
        out.println(g);

        for (int n : arr2) {
            sumArr2 += n;
        }
        avgArr2 = sumArr2 / arr2.length;

        if (avgArr1 > avgArr2) {
            out.println(avgArr1);
        }
        if (avgArr1 < avgArr2) {
            out.println(avgArr2);
        } else {
            out.println("Средние арифметические  массивов" + s + " и " + g + "  равны"); // как передать имя массива ?
        }

    }

    public static void lesson6() {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 99) + 10);
        }
        String arrToString = " ";
        for (int w : arr) {
            arrToString += w + " ";
        }
        out.println(arrToString);
//проверить возврастающая последовательность или нет
        if (arr[0] < arr[1] & arr[1] < arr[2] & arr[2] < arr[3]) {
            out.println("Последовательность возврастающая");
        } else {
            out.println("Последовательность не возврастающая");
        }
    }

    public static void lesson7() {  //xz
        int[] fib = new int[20];
        int count = 0;
        for (int i = 1; i <= fib.length; i++) {
            count = i + i;
            fib[i] = count;
            out.println(fib[i]);
        }
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
        for (int x = 0; x < arr.length; x++) { //не получилось сделать циклом  for each
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
            out.println(arr1[i]);
        }
        out.println(" ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) ((Math.random() * 9) + 1);
            out.println(arr2[i]);
        }
        out.println(" ");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] / arr2[i];
            out.println(arr3[i]);
        }
        out.println(" ");
        int count = 0;
        for (double i : arr3) {
            if (i % i != 0) {
                count++;
            }
        }
        out.println(count); // считает , но наоборот - нецелые числа
    }

    public static void lesson10() { // не понял как сделать
        double[] arr = new double[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (1 + 1) - 1);
            String s = " ";
            s += arr[i] + " ";
            out.println(s);//вообще затупил как в строку вывести
        }
    }

    public static void lesson11() {
        int leftModulSum;
        int rigtModulSum;
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if (userNum < 2 | userNum % 2 != 0) {
            out.println("Введите корректное число");;
        } else {
            int[] arr = new int[userNum];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) ((Math.random() * (10 + 1)) - 5);
                out.println(arr[i]);
            }
            leftModulSum = arr.length / 2; //не понял как посчитать половину массива
        }
    }

    public static void lesson12(){
    int[] arr = new int[12];
    for (int i = 0; i<arr.length;i++){
        arr[i]= (int) (Math.random() *(20+1)-10);
        for (int x:arr){
            if ()
        }
        out.println(arr[i]);
    }
    }
}













