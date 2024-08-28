

package javaapp1;

import java.util.Scanner;

public class Grade {
    
    public void getGrade(){
    
    Scanner sc = new Scanner(System.in);
    
    Grades[] gr = new Grades[100];
    
    System.out.print("Enter No. of Student: ");
    int np = sc.nextInt();
    
    for(int  i = 0; i < np; i++){
    
        System.out.println("Enter details of student "+(i+1));
        System.out.println("ID: ");
        int id = sc.nextInt();
        
        System.out.println("Name: ");
        String name = sc.next();
        
        System.out.println("Prelim: ");
        double p = sc.nextDouble();
        
        System.out.println("Midterm: ");
        double m = sc.nextDouble();
        
        System.out.println("Pre-Final: ");
        double pf = sc.nextDouble();
        
        System.out.println("Final: ");
        double f = sc.nextDouble();
      
       gr[i] = new Grades();
       gr[i].addGrades(id, name, p, m, pf, f);
             }
       }
  }
