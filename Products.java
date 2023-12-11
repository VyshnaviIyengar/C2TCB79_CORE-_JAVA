package com.ait.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Products {
    private List<String> productList=new ArrayList<>();

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
        System.out.println("Product '" + product + "' added to the cart.");
    }

    public void sortProductList() {
        Collections.sort(productList);
        System.out.println("Products sorted in alphabetical order.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add product to cart");
            System.out.println("2. Display products in alphabetical order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product to add: ");
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    List<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        System.out.println("Products in alphabetical order:");
                        products.sortProductList();
                        for (String item : productList) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select between 1 and 3.");
                    break;
            }
        }
    }
}
