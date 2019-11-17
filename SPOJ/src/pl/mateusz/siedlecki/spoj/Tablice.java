package pl.mateusz.siedlecki.spoj;

import java.util.Scanner;

class Tablice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab;

        int iletablic = sc.nextInt();

        for (int i = 0; i< iletablic; i++){
            int iloscElementow = sc.nextInt();
            tab = new int[iloscElementow];
            for (int index = 0; index<tab.length; index++){
                tab[index] = sc.nextInt();
            }
            for (int index = tab.length-1; index>=0; index--){
                System.out.print(tab[index]+" ");
            }
            System.out.println();


        }

    }
}
