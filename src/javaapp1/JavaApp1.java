
package javaapp1;

import java.util.Scanner;

public class JavaApp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade gr = new Grade();
        Sale sale = new Sale();
        Product pr = new Product();
        Account acr = new Account();
        
        int choice;
        
        do{
            System.out.println("1.Grades\n2.Product\n3.Sales\n4.Accounts");
            System.out.println("-------------------");
            System.out.printf("Enter Choice: ");
            choice = sc.nextInt();
            System.out.println("-------------------");
         switch (choice){
            
            case 1:
                 gr.getGrades();
                 break;
            case 2:
                 pr.getProducts();
                break;
            case 3:
                sale.getSales();
                break;
            case 4:
                acr.getAccounts();
                break;
          }
        }while( choice > 4 || choice < 0 );
    }
}
