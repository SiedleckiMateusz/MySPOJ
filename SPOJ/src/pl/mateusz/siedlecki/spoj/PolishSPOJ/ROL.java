package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class ROL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int testNumber = scanner.nextInt();

        for (int i = 0; i<testNumber; i++){
            int size = scanner.nextInt();
            int[] tab = new int[size];
            for (int j = 0; j<tab.length; j++){
                tab[j] = scanner.nextInt();
            }
            for (int j = 1; j<tab.length; j++){
                answer.append(tab[j]).append(" ");
            }
            answer.append(tab[0]);
            answer.append("\n");

        }

        System.out.println(answer);
    }

}
