package com.pb.semenist.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt( 101);
        System.out.println("попробуй отгадать число от 0 - 100");
        final int MAX_ATTEMPT=8;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");

        while(attempt< MAX_ATTEMPT){ attempt++;
            int y; y = scan.nextInt();

            if (y >x){System.out.println("загадайте число меньше");}
            if (y <x){System.out.println("загадайте число больше");}
            if (y ==777){System.out.println("Выход");}

            if (y == x) {System.out.println("Ура. Угадали с " + attempt + " попытки");}
            break;


            }
            }
    }

