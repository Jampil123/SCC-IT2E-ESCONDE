
package javaapp1;

import java.util.Scanner;

public class Product {
    public void getProducts(){
     Scanner sc = new Scanner(System.in);
       
         System.out.print("Enter No. of Products: ");
         int num_p = sc.nextInt();
         
         Products[] pr = new Products[num_p];
         
         for(int i = 0; i<num_p; i++ ){
             System.out.println("Enter Details for Product "+(i+1));
             System.out.print("ID: ");
             int pid = sc.nextInt();
             System.out.print("Name: ");
             String name = sc.next();
             System.out.print("Price: ");
             double price = sc.nextDouble();
             System.out.print("Stocks: ");
             int stock = sc.nextInt();
             System.out.print("Sold: ");
             int sold = sc.nextInt();
             System.out.print("");
             
         pr[i] = new Products();
         pr[i].addProduct(pid, name, price, stock, sold);
         
         }
         double totalProfit = 0, totalTep = 0;
        
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "TEP", "Status");
         for(Products pr1 : pr){
            pr1.viewProducts();
            totalProfit += pr1.profit;
            totalTep += pr1.tep;
         }
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.printf("Total Profits: %.2f\n", totalProfit);
        System.out.printf("Total Estimate Price: %.2f\n", totalTep);
    }
}  

