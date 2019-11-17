package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class ProsteDodawanie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testsNumber = sc.nextInt();

        for (int i = 0; i<testsNumber; i++){
            int howManyNumbers = sc.nextInt();
            int suma = 0;
            for (int j = 0; j<howManyNumbers; j++){
                suma+=sc.nextInt();
            }
            System.out.println(suma);
        }
    }
}
