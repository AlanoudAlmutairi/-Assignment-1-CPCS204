
package cpit251lab1;

import java.util.Scanner;


public class CPIT251LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("** WELCOM **");
       System.out.println("Enter your name: ");
       String name =  input.next();
       System.out.print("Hi " + name );
    }
    
}
