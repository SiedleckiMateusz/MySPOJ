package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class Flamaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linesNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i<linesNumber; i++){
            System.out.println(convertString(sc.nextLine()));
        }
    }

    public static StringBuilder convertString(String word){
        StringBuilder newWord = new StringBuilder();
        char letter;
        int howManyTimiesIsLetter = 0;
        int i =0;

        while (i<word.length()){
            letter = word.charAt(i);

            while (i<word.length() && word.charAt(i)==letter){
                howManyTimiesIsLetter++;
                i++;
            }

            if (howManyTimiesIsLetter<3){
                for (int x = 0; x<howManyTimiesIsLetter; x++){
                    newWord.append(letter);
                }
            }else{
                newWord.append(letter);
                newWord.append(howManyTimiesIsLetter);
            }

            howManyTimiesIsLetter = 0;
        }

        return newWord;
    }
}
