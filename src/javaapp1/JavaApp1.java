
package javaapp1;

import java.util.Scanner;

public class JavaApp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade gr = new Grade();
        Sales sales = new Sales();
        Products pr = new Products();
        Account acr = new Account();
        
        int choice;
        
        do{
            System.out.println("1.Grades\n2.Product\n3.Sales\n4.Accounts");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            
        switch (choice){
            
            case 1:
                 gr.getGrade();
                 break;
            case 2:
                 pr.getProducts();
                break;
            case 3:
                sales.getSales();
                break;
            case 4:
                acr.getAccounts();
                break;
          }
        }while( choice > 3 || choice < 0 );
//        Grades gr1 = new Grades();
//        gr1.addGrades(1011,"John Phil ",3.3,3.2,3.3,3.3);
//        gr1.viewGrades();
        
//        Product pr = new Product();
//        pr.addProducts(1011, "sabon", 30, 60, 0);
//        pr.viewProducts();
//        
//        Product pr1 = new Product();
//        pr1.addProducts(1011, "sabon", 30, 0, 0);
//        pr1.viewProducts();

//          Sales sales = new Sales();
//          sales.getSales();
        
    }
    
}
