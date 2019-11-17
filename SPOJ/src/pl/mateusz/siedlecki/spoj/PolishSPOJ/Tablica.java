package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class Tablica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] someTab = line.split(" ");

        for (int i = someTab.length-1; i>=0; i--){
            System.out.print(someTab[i]+" ");
        }
    }
}