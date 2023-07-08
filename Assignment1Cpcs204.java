/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1.cpcs204;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* Name :Alanoud Owaed Almutairi
Id : 2105088
Section :B8B
Assignment 1 - CPCS 204 
*/

public class Assignment1Cpcs204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
    //creat command file and check if it is exsist or not 
        File commandFile = new File("Commands.txt");
        if(!commandFile.exists()){
            System.out.println("The file is not exists");
            System.exit(0);}
    //read from command file 
        Scanner inputC = new Scanner(commandFile); 
        
        
    //creat information  file and check if it is exsist or not 
        File informationFile = new File ("intialInformation.txt");
           if(!informationFile.exists()){
            System.out.println("The file is not exists");
            System.exit(0);}
    //read from information File 
           Scanner inputI = new Scanner (informationFile);
        
    //  print in new file 
       // PrintWriter output = new PrintWriter("output.txt");
     
    //read information from information file     
             int emp = inputI.nextInt();
             int cent = inputI.nextInt();
             int prod = inputI.nextInt();
     //2 Arrays to store product and center names        
          String [] productName = new String[prod];
          String [] centName = new String[cent];
   // loop to read centers name        
          for(int i = 0 ; i<centName.length; i++){
              centName[i] = inputI.next();
          }
    //loop to read product names       
          for(int j = 0 ; j < productName.length ; j++){
              productName[j] = inputI.next();
          }
  
    // Array of centers object contain 3 objects   
        Center []c = new Center[cent];
        for(int j = 0 ; j < c.length ; j++){
          c[j] = new Center(centName[j]);
        }
       
        
        
    // print the header in output file 
        output.println("                                                  Welcome to Shopping Center Employee Management System 				\n" +
"                                                  ---------------------------------------------------------------------------				\n" +
"                                                                         Information of Employees in Each Center "); 
    // read first command in command file    
        String  command = inputC.next();
     
      do{  
    //first command :  
            if(command.equalsIgnoreCase("StartUp")){
                  System.out.println("1111");
          setUp(inputI , emp , cent , productName  ,c  );
          command = inputC.next();
          System.out.println(command);
          output.println("1 command " + command);   
            }
            
    //second comannd :        
            if (command.equalsIgnoreCase("DISPLAY_ALL_CENTERS")){
                System.out.println("2222");
                displayCenter( emp ,  centName ,  productName  ,  output, c);
                command = inputC.next();
                output.println(" 2 command "); 
            }
    //third command         
             if(command.equalsIgnoreCase("DISPLAY_PRODUCTS_FOR_EMPLOYEE")){
    //read the Id from command file :
                 int id = inputC.nextInt();
                 DisplayProduct(  id ,inputI , output , c , centName);
                 command = inputC.next();
                System.out.println("3333"+ command);
            }
             if (command.equalsIgnoreCase("NUM_OF_EMPLOYEES")){
                command = inputC.next();   
                System.out.println("444444");
            }
             if(command.equalsIgnoreCase("DISPLAY_BASED_ON_PRODUCT")){
                command = inputC.next(); 
                System.out.println("55555");
            }
            if(command.equalsIgnoreCase("CHANGE_TO_NULL_PRODUCT")){
                command = inputC.next();   
               System.out.println("66666");
            }
            if (command.equalsIgnoreCase("SWAP_BETWEEN_EMPLOYEES")){
               command = inputC.next();
               System.out.println("777777");
            }
            if(command.equalsIgnoreCase("DISPLAY_ALL_CENTERS")){
               command = inputC.next();
               System.out.println("8888888");
                
            }
        
        }while(command.equals("QUIT"));
                           

output.println("\n	============================			\n" +
"		Best Wishes 		\n" +
"	============================");
            
     output.flush();
     inputI.close();
     inputC.close();
     output.close();
   
    }
    
///////////////////////Start Up method ///////////////////////////////////////////////////////
    
    public static void setUp ( Scanner inputI ,int emp , int cent , String productName[]
    , Center c []){
   
// loop to read information and creat an employee:       
      for(int i = 0 ; i < cent ; i++){
          for(int j = 0 ; j < emp /3 ; j++){
          int id = inputI.nextInt();
          String fname = inputI.next();
          String lname = inputI.next();
          c[i].addEmployee(id, fname, lname); } 
      }
//loop to set a product name to each employee :     
      for(int i = 0 ; i <cent ;i++){
          Employee hlpPtr = c[i].getHead();
          for(int y = 0 ; y < productName.length ;y++){
// use setProduct method from center class:              
              hlpPtr.setproduct(productName[y]);
            hlpPtr=  hlpPtr.getnext();
          }}
    
    }
   
           
    
    
///////////////////// display Center method //////////////////////////////////////////////
    
    public static void displayCenter(int emp ,String[] centName ,String [] productName 
            , PrintWriter output,Center[] c){
        
        for(int i = 0 ; i<  centName.length; i++){
        System.out.println("                                Employees in "+ c[i].getCenterName()+" Center");
        System.out.println("	ID	        Name 	                      Product");
            Employee hlpPtr = c[i].getHead();
                  
                while(hlpPtr != null){
    //check if the id > 9 we should put (00) befor the Id                  
                   if(hlpPtr.getEmpId() <= 9){
                        System.out.print("\t"+"00" +hlpPtr.getEmpId() + "\t\t" + hlpPtr.getfName()+" " +
                         hlpPtr.getlName()+ " \t\t\t" +hlpPtr.getproduct());}
    //else just put (0)  befor the Id               
                   else{
                       System.out.print("\t"+"0" +hlpPtr.getEmpId() + "\t\t" + hlpPtr.getfName()+" " +
                       hlpPtr.getlName()+ "\t\t\t" +hlpPtr.getproduct());}                         
               
                       hlpPtr = hlpPtr.getnext();
                      System.out.println();}
              
               System.out.println("\t\t------------------------------------------");
           }}
    
////////////////////// display Product method //////////////////////////////////////////////

public static void DisplayProduct(int id ,Scanner inputI , PrintWriter output , Center [] c, String[]centName){
    System.out.println("\n");
//loop pass through all centers   
    for(int i = 0 ; i < c.length ; i++) {
//use search Employee By ID method from center class 
        Employee x =c[i].searchEmployeeByID(id);
        System.out.println("\t \"Employee: " + x.getfName() + " " + x.getlName()
                + ", 00" + x.getEmpId() + ", is assigned to " + x.getproduct()+
                        "in " +centName[i] + " Center\"");
    
    }
     System.out.println("\t\t------------------------------------------");
  //  System.out.println("	No employee of this number is found");
}
    
////////////////////// Num of Employee method //////////////////////////////////////////////

public static void  NEmployee(PrintWriter output , Center [] c , String name,String[]centName,int emp){
        System.out.println("\n");
//loop pass through all centers         
    for(int i = 0 ; i<c.length; i++) {
        System.out.println("                   Number of employess in "+centName[i]+ " center:" +emp /c.length);
    }
            System.out.println("\t\t------------------------------------------");
    
}

}
    
    

