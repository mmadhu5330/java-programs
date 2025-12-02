//Ninja Clan Difference
//Problem Statement:
//Kabali is a brave warrior who with his group of young ninjas moves from one place to another to fight against his opponents. Before Fighting he just calculates one thing, the difference between his ninja number and the opponent's ninja number. From this difference he decides whether to fight or not. Kabali's ninja number is never greater than his opponent.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        int kabali = sc.nextInt();
        int opponent = sc.nextInt();
       
        int difference = Math.abs(opponent - kabali);
        System.out.println(difference);
       
        sc.close();

    }
}