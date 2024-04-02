package com.juaracoding;

public class Soalnomer2 {




    public static void main(String[] args) {
        DataAnalist dataAnalist = new DataAnalist();


        System.out.println("Jawaban Nomer 2");
        Perulangan(1,9);
        System.out.println("Jawaban Nomer 3");

    }

    static void  Perulangan(int start, int end) {
        while (start <= end) {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }


}
