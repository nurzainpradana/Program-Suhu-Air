package com.nurzanpradana.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args){
        //Contoh pemakaian IF tiga kasis : wujud air//

        //kamus
        int T;

        //Program
        System.out.println("Contoh IF tiga kasus");
        System.out.println("Suhu (der. C) = ");

        //scanner untuk masukkan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // masukan suhu air dengan tipe int

        //proses pengecekan dengan if
        if(T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud air cair " + T);
        } else if (T > 100){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
