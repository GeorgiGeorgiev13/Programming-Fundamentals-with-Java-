package Exam18062022.P01;

import java.util.Scanner;

public class P03FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancersCount = Integer.parseInt(scanner.nextLine());
        double scoreCount = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double award = 0;
        if (place.equals("Bulgaria")) {
            award = dancersCount * scoreCount;

        } else {
            award = (dancersCount * scoreCount) * 1.5;
        }
        double costs = 0;
        if (place.equals("Bulgaria")) {
            if (season.equals("summer")) {
                costs = 0.05;

            } else if (season.equals("winter")) {
                costs = 0.08;
            }
        }
        if (place.equals("Abroad")) {
            if (season.equals("summer")) {
                costs = 0.10;

            } else if (season.equals("winter")) {
                costs = 0.15;

            }
        }

        double moneyAfterCosts = award - (award * costs);
        double charity = moneyAfterCosts * 0.75;
        double moneyLeft = moneyAfterCosts - charity;
        double moneyPerDancer = moneyLeft / dancersCount;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}