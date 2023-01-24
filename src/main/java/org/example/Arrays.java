package org.example;

import static java.lang.System.out;

public class Arrays {
    public static void main(String[] args) {
        int[] mas4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 4};
        for (int x = 0;x < mas4.length; x++) {
            out.println(mas4[x]);
        }
        int count = 0;
        for (int a : mas4) {
            if (a % 2 == 0) {
                count++;
                out.println(count);
            }
        }

    }
}
