package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class Przedszkolanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testsNumber = sc.nextInt();

        for (int i = 0; i < testsNumber; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(findNWW(first,second));
        }

    }

    public static int findNWW(int first, int second){
        int biggerNumber;
        if (first>second){
            biggerNumber = first;
        }else {
            biggerNumber = second;
        }
        for (int i = biggerNumber; i<=first*second; i++){
            if (i%first==0 && i%second==0){
                return i;
            }
        }
        return -1;
    }

}
