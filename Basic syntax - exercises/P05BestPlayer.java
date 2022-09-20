package Exam18062022.P01;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int goals = Integer.parseInt(scanner.nextLine());

        int mostGoals = Integer.MIN_VALUE;
        while (!input.equals("END")) {
            int goalsScored = Integer.parseInt(input);

            if (mostGoals > goalsScored) {
                mostGoals = goalsScored;
                input = scanner.nextLine();
            }


            }



        }
    }
