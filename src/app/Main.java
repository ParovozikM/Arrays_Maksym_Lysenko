package app;

import java.util.Scanner;

public class Main {
    static String[] products;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String searchItem = scanner.nextLine();

        products = new String[]{"Pork", "Veal", "Liver", "Duck", "Trout", "Veal", "Milk", "Oil", "Duck"};

        System.out.println("List of products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }




