package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Obzartuchy {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader scanner = new BufferedReader(r);
        StringBuilder answer = new StringBuilder();


        int testsNumber = Integer.parseInt(scanner.readLine());

        for (int i = 0; i< testsNumber; i++){
            String line = scanner.readLine();
            String[] parameters = line.split(" ");

            int numberOfHoungryPeople = Integer.parseInt(parameters[0]);
            int numberOfBiscutInBox = Integer.parseInt(parameters[1]);

            int allBiscuts =0;

            for (int k = 0; k<numberOfHoungryPeople; k++){
                allBiscuts+=howManyBiscutInOneDay(Integer.parseInt(scanner.readLine()));
            }

            if(allBiscuts%numberOfBiscutInBox>0){
                answer.append((allBiscuts/numberOfBiscutInBox)+1);
                answer.append("\n");
            }else{
                answer.append(allBiscuts/numberOfBiscutInBox);
                answer.append("\n");
            }
        }

        System.out.println(answer);

    }

    public static int howManyBiscutInOneDay(int timeForOneBiscut){
        int dayBySecond = 86_400;

        return dayBySecond/timeForOneBiscut;
    }
}
