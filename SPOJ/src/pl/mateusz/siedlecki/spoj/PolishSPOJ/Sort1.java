package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Sort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Point> list = new ArrayList<>();
        int testsNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < testsNumber; i++) {

            int pointsNumber = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < pointsNumber; j++) {

                String line = scanner.nextLine();
                String[] parameters = line.split(" ");
                list.add(new Point(parameters[0], Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2])));
            }

            if (i==0){
                scanner.nextLine();
            }

            list.sort(Comparator.comparingDouble(o -> o.distance));
            for (Point p: list){
                answer.append(p);
                answer.append("\n");
            }
            list.clear();
            answer.append("\n");
        }

        System.out.println(answer);
    }
}

class Point {
    String name;
    int x;
    int y;
    double distance;

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        calculateDistance();
    }

    private void calculateDistance() {
        distance = Math.abs(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return (name+" "+x+" "+y);
    }
}
