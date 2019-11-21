package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class Dwumiany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int testsNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<testsNumber; i++){
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int n = Integer.parseInt(numbers[0]);
            int k = Integer.parseInt(numbers[1]);
            int result;
            if (n<1 && k<1){
                result = 1;
            } else if (n<1){
                result = 1/factorial(k)*factorial(n-k);
            }else if (k<1){
                result = factorial(n)/factorial(n-k);
            }else{
                result = factorial(n)/(factorial(k)*factorial(n-k));
            }
            answer.append(result).append("\n");
        }
        System.out.println(answer);
    }

    public static int factorial(int number){
        int result = 1;
        for (int i = 2; i<=number; i++){
            result *= i;
        }
        return result;
    }
}
