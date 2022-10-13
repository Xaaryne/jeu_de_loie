package com.example;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int win = 0;
        while (win != 1) {
            Random generateur = new Random();
            int laCase = 0;
            for (int i = 1; i <= 5; i++) {
                // lancer le dé
                int lancer = generateur.nextInt(6) + 1;
                System.out.println("Vous avez fait " + lancer);
                // avancer le pion d'autant de cases
                laCase = laCase + lancer;
                System.out.println("Vous êtes à la case " + laCase);
            }

            if (laCase == 20) {
                System.out.println("Vous avez gagné !");
                win = 1;
            } else {
                System.out.println("Vous avez perdu !");
                win = 0;
            }
        }
    }
}
