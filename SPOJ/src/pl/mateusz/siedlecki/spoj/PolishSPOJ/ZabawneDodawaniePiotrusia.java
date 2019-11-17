package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class ZabawneDodawaniePiotrusia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int howManyNumbers = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<howManyNumbers; i++){
            int number = sc.nextInt();
            int iterator =0;
            while (!isPalindrom(number)){

                iterator++;
                number = number+reversNumber(number);
            }

            System.out.println(number+" "+iterator);
        }
    }

    public static boolean isPalindrom(int number){
        int reversNumber = reversNumber(number);

        return (number*2) == (number+reversNumber);
    }

    public static int reversNumber(int number){
        String stringNumber = String.valueOf(number);
        StringBuilder reversNumber = new StringBuilder();
        for (int i =stringNumber.length()-1; i>=0; i--){
            reversNumber.append(stringNumber.charAt(i));
        }

            return Integer.parseInt(String.valueOf(reversNumber));

    }
}
