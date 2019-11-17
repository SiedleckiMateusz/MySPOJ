package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class CzyUmieszPotegowac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int testsNumber = scanner.nextInt();

        for (int i = 0; i<testsNumber; i++){
            int first = scanner.nextInt();
            int second = scanner.nextInt();


            answer.append((int)(Math.pow(first, second)%10));
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
