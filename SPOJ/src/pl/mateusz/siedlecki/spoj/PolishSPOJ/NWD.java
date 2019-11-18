package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class NWD {
    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader scanner = new BufferedReader(r);


        int testsNumber = Integer.parseInt(scanner.readLine());

        for (int i = 0; i < testsNumber; i++) {
            String line = scanner.readLine();
            String[] numbers = line.split(" ");

            int n1 = Integer.parseInt(numbers[0]);
            int n2 = Integer.parseInt(numbers[1]);

            answer.append(nwd(n1, n2));
            answer.append("\n");
        }

        System.out.println(answer);
    }


    private static int nwd(int n1, int n2) {
        int min, max,result;
        max = Math.max(n1,n2);
        min = Math.min(n1,n2);
        int[] tab;

        while((result = max - min)!=0){
            tab = new int[]{result, max, min};
            Arrays.sort(tab);
            min = tab[0];
            max = tab[1];
        }

        return min;
    }

}
