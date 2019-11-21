package pl.mateusz.siedlecki.spoj.PolishSPOJ;

import java.util.Scanner;

class SkarbFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int numberOfTests = Integer.parseInt(scanner.nextLine());

        for (int i =0; i<numberOfTests; i++){

            int numberOfSteps = Integer.parseInt(scanner.nextLine());
            TreasurePoint point = new TreasurePoint();

            for (int j = 0; j<numberOfSteps; j++){
                String line = scanner.nextLine();
                String[] params = line.split(" ");

                point.move(Integer.parseInt(params[0]),Integer.parseInt(params[1]));
            }

            answer.append(point.findTheShortestRoad());
            answer.append("\n");
        }

        System.out.println(answer);
    }
}

class TreasurePoint{
    int x = 0;
    int y = 0;

    void move(int direction, int distance){
        switch (direction){
            case 0:
                y+=distance;
                break;
            case 1:
                y-=distance;
                break;
            case 2:
                x-=distance;
                break;
            case 3:
                x+=distance;
                break;
        }
    }

    StringBuilder findTheShortestRoad(){
        StringBuilder answer = new StringBuilder();
        if (x==0 && y==0){
            return answer.append("studnia");
        }

        if (x==0){
            return answer.append(convertCoordinteY());
        }

        if (y==0){
            return answer.append(convertCoordinateX());
        }

        return answer.append(convertCoordinteY()).append("\n").append(convertCoordinateX());
    }

    String convertCoordinateX(){
        if (x<0){
            return (2+" "+Math.abs(x));
        }
        if (x>0){
            return (3+" "+x);
        }
        return "";
    }

    String convertCoordinteY(){
        if (y<0){
            return (1+" "+Math.abs(y));
        }
        if (y>0){
            return (0+" "+y);
        }
        return "";
    }
}
