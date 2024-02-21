package ru.netology.shakhmanov;

import java.util.Scanner;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //HW_1
        System.out.printf("Hello everyone!\n");
        System.out.printf("My name is Vladislav!!!\n");

        //HW_2
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean is_deleted = scanner.nextBoolean();
        Date date = new Date();
        double value = scanner.nextDouble();
        System.out.print(id + " ");
        System.out.print(is_deleted + " ");
        System.out.print(date + " ");
        System.out.print(value + " ");

    }
}