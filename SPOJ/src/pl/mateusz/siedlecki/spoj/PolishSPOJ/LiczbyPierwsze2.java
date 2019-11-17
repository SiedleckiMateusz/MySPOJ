package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class LiczbyPierwsze2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int testsNumber = scanner.nextInt();

        for (int i = 0; i<testsNumber; i++){
            if (isPrime(scanner.nextInt())){
                answer.append("TAK");
            }else {
                answer.append("NIE");
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i = 2; i<number; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
