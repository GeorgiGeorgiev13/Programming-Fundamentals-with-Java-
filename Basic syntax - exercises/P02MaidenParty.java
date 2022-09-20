package Exam18062022.P01;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maidenPartyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessagesCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int keyHoldersCount = Integer.parseInt(scanner.nextLine());
        int cartoonsCount = Integer.parseInt(scanner.nextLine());
        int surprisesCount = Integer.parseInt(scanner.nextLine());

        int totalArticles = loveMessagesCount + rosesCount + keyHoldersCount + cartoonsCount + surprisesCount;

        double loveMessagesPrice = 0.6;
        double rosesPrice = 7.2;
        double keyHoldersPrice = 3.6;
        double cartoonsPrice = 18.2;
        double surprisesPrice = 22;

        double totalSumLove = loveMessagesCount * loveMessagesPrice;
        double totalSumRoses = rosesCount * rosesPrice;
        double totalSumKeys = keyHoldersCount * keyHoldersPrice;
        double totalSumCartoons = cartoonsCount * cartoonsPrice;
        double totalSumSurprises = surprisesCount * surprisesPrice;

        double total = totalSumCartoons + totalSumKeys + totalSumRoses + totalSumLove + totalSumSurprises;

        if (totalArticles > 25) {
            total = total - (total * 0.35);

        }


            double profit = total - (total * 0.10);

        if (profit > maidenPartyPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - maidenPartyPrice);
        } else if (profit < maidenPartyPrice) {
            System.out.printf("Not enough money! %.2f lv needed.", maidenPartyPrice - profit);
        }
    }
}
