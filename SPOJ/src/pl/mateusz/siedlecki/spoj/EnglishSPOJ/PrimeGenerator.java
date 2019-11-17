package pl.mateusz.siedlecki.spoj.EnglishSPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeGenerator {


    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(r);
        StringBuilder answer = new StringBuilder();

        int testCases = Integer.parseInt(sc.readLine());

        for (int i =0; i<testCases; i++){
            String line = sc.readLine();
            String[] startEnd = line.split(" ");
            int start = Integer.parseInt(startEnd[0]);
            int end = Integer.parseInt(startEnd[1]);
            answer.append("\n");
            answer.append(generatePrimesFor(start,end));
        }

        System.out.println(answer);


    }

    public static StringBuilder generatePrimesFor(int start, int end){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i<=end; i++){
            if (isPrime(i)){
                stringBuilder.append("\n");
                stringBuilder.append(i);
            }
        }
        return stringBuilder;
    }

    public static boolean isPrime(int number){
        for (int i = 2; i<number; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
