package com.juaracoding;

public class Soalnomor3 {
    public static String[] katakeberapa = new String[5];
    public static int huruf;
    public static String susunanKata;

    public static void main(String[] args) {
        DataAnalist dataAnalist = new DataAnalist();
        reArrage(dataAnalist.T1_1, dataAnalist.T2_1);
        System.out.println("--------------");
        reArrage(dataAnalist.T1_2, dataAnalist.T2_2);
        System.out.println("--------------");
        reArrage(dataAnalist.T1_3, dataAnalist.T2_3);
    }
    static void reArrage(String kalimat1, String kalimat2){

        for(int  i=0; i<5 ; i++){
            huruf = 0;
            katakeberapa[i]="";
            for (char karakter : kalimat2.toCharArray()){
                if(huruf==18){
                    kalimat2 = kalimat2.substring(huruf);
                    break;
                }
                katakeberapa[i] += karakter;
                huruf++;
            }
        }
        susunanKata = katakeberapa[2]+katakeberapa[3]+katakeberapa[4]+katakeberapa[0]+katakeberapa[1];

        System.out.println("T1" + kalimat1);
        System.out.println("T2" + susunanKata);
    }
}
