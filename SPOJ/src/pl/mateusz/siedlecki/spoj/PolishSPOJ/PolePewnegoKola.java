package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class PolePewnegoKola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        double r = Double.parseDouble(numbers[0]);
        double d = Double.parseDouble(numbers[1]);

        String stringResult = Double.toString(result(r,d));

        stringResult = stringResult.replace(',','.');

        System.out.println(stringResult);

    }

    private static double result(double r, double d){
        double pi = 3.141592654;
        double result;

        result = (Math.pow(r,2)-Math.pow(d,2)/4)*pi;

        return result;
    }
}
