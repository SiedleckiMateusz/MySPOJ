package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class StringMerge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder answer = new StringBuilder();
        int testsNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i< testsNumbers; i++){
            String line = scanner.nextLine();
            String[] words = line.split(" ");

            answer.append(mergeString(words[0],words[1]));
            answer.append("\n");
        }
        System.out.println(answer);
    }

    private static String mergeString(String word1, String word2){
        StringBuilder sentence = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i<min ;i++){
            sentence.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return sentence.toString();
    }
}
