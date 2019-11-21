package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class ProblemCollatza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        StringBuilder answer = new StringBuilder();

        int numberOfTests = scanner.nextInt();

        for (int i=0; i<numberOfTests; i++){
            int xn = scanner.nextInt();
            if (xn==1){
                answer.append(index);
            }else {
                answer.append(calculateByRecursion(xn,index));
            }
            answer.append("\n");
            index = 0;
        }

        System.out.println(answer);

    }

    public static int calculateByRecursion(int xn, int index){
        index++;
        if (xn%2==0){
            xn=xn/2;
            if (xn==1){
                return index;
            }else
                return calculateByRecursion(xn,index);
        }else {
            xn = 3*xn+1;
            if (xn==1){
                return index;
            }else {
                return calculateByRecursion(xn, index);
            }
        }
    }
}
