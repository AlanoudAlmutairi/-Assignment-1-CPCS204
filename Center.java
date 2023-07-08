/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.cpcs204;

/**
 *
 * @author alano
 */
public class Center {
    
    private String centerName;
    private int centerID;
    private Employee head;

   public Center (  int centerID, String centerName){
       this.centerName = centerName ;
       this.centerID = centerID ;
   }
   public Center(String centerName ){
       this.centerName = centerName;
   }
   public Center( int centerId , String centerName ,Employee head){
       this.centerName = centerName ;
       this.centerID = centerID ;
       this.head = head;
   }
   
   public Center(){
       this.centerName = centerName ;
       this.centerID = centerID ;
       this.head = head;
   }
      
    public int setCenterID(int id ){
     return  this.centerID = id;
   }
   public int getCenterID(){
       return centerID;
   }
    public String setCenterName(String name ){
     return  this.centerName = name;
   }
   public String getCenterName(){
       return centerName;
   }
   
   public Employee setHead(Employee head ){
     return  this.head = head;
   }
   public Employee getHead(){
       return head;
   }
  // public void addEmployee(int Id , String fname , String lname ){
    //    head = addEmployee( Id ,  fname ,  lname , head );
	//}
   
   

   public void addEmployee(int Id , String fname , String lname ){
         
       // if the linked List 
       if ( head == null){
           head = new Employee(Id , fname , lname , head);
       
       }
       // add anywhere 
       else{
           Employee hlpPtr = head ;
           while (hlpPtr.getnext() != null) {
		hlpPtr = hlpPtr.getnext();
			}
           Employee newNode = new Employee(Id , fname , lname ,hlpPtr.getnext());
           hlpPtr.Setnext(newNode);
         
       }
   }
   
   
   public Employee searchEmployeeByID(int id){
       Employee hlpPtr = head ;
       while(hlpPtr != null){
       if(hlpPtr.getEmpId() == id )
           return hlpPtr ;
       hlpPtr = hlpPtr.getnext();
   }
    return hlpPtr;   
   }
   
  // public Employee swapEmployees(){
     //  return null ;
  // }
   
  
   }
 /*
    
    Center() --
addEmployee()
searchEmployeeByID()
swapEmployees()
deleteEmployeeByID()
    
    */

