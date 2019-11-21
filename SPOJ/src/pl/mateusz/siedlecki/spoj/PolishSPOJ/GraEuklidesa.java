package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class GraEuklidesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int numberOFTests = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<numberOFTests; i++){
            String line = scanner.nextLine();
            String[] arguments = line.split(" ");

            answer.append(resultOfTheGame(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
            answer.append("\n");
        }

        System.out.println(answer);
    }

    public static int resultOfTheGame(int chipsFirstPlayer, int chipsSecondPlayer){

        while (chipsFirstPlayer!=chipsSecondPlayer){
            if (chipsFirstPlayer<chipsSecondPlayer){
                chipsSecondPlayer-=chipsFirstPlayer;
            }else {
                chipsFirstPlayer-=chipsSecondPlayer;
            }
        }

        return chipsFirstPlayer+chipsSecondPlayer;
    }
}
