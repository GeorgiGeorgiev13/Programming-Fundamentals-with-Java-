package Exam18062022.P01;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wrappingPaperCount = Integer.parseInt(scanner.nextLine());
        int rollTextileCount = Integer.parseInt(scanner.nextLine());
        double glueLitters = Double.parseDouble(scanner.nextLine());
        double discountPercentage = Double.parseDouble(scanner.nextLine());

        double wrappingPaperPrice = 5.8;
        double textile = 7.2;
        double glue = 1.2;


        double wrap = wrappingPaperCount * wrappingPaperPrice;
        double roll = rollTextileCount * textile;
        double glueAll = glue * glueLitters;

        double sumMaterials = wrap + roll + glueAll;

        discountPercentage = discountPercentage / 100;

        double discount = sumMaterials * discountPercentage;

        double result = sumMaterials - discount;

        System.out.printf("%.3f", result);



    }
}
