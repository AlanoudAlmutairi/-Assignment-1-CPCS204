/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.cpcs204;

/**
 *
 * @author alano
 */
public class Employee {
    private int EmpID;
    private String Fname;
    private String lName;
    private String product;
    private String phone;
    private int age;
    private int center;
    private Employee next;
    
    public Employee(int EmpID, String Fname,  String lName,  String product, String phone,  int age,
            int center){
        EmpID = EmpID;
        Fname = Fname ;
        lName = lName ;
        product =product;
        phone = phone;
        age = age ;
        center = center;
        next = null;
    }
    
     public Employee(int EmpID, String Fname,  String lName,  String product, String phone,  int age,
            int center , Employee next ){
        EmpID = EmpID;
        Fname = Fname ;
        lName = lName ;
        product =product;
        phone = phone;
        age = age ;
        center = center;
        next = next;
    }
     
     public Employee(int EmpId, String fName , String lName   ){
    this.EmpID = EmpId;
    this.Fname=fName;
    this.lName = lName;
    next=null;
    
}

    Employee(int Id, String fname, String lname, Employee head) {
    EmpID = Id;
    Fname=fname;
    lName = lname;
    next= head;
    }
     public int getEmpId(){
         return EmpID;
     }
     public int setEmpID(int x ){
         return EmpID = x ;
     }
     public String getfName(){
         return Fname;
     }
     public String setfName(String name){
         return Fname =name;
     }
     public String getlName(){
     return lName;
     }
     public String setlName(String name){
         return lName = name ;
     }
     public String getproduct(){
         return product;
     }
     public String setproduct(String P ){
         return product = P ;
     }
     public String getPhone(){
         return phone;
     }
     public String SetPhone(String n){
         return phone = n;
     }   
     public int getAge(){
         return age;
     }
     public int SetAge(int age){
         return age = age;
     }
     public int getCenter(){
         return center;
     }
     public int SetCenter(int cent){
         return center = cent;
     }
     public Employee getnext(){
         return next;
     }
     public Employee Setnext(Employee Next){
         return next = Next;
     }
     
     
     
    
}
