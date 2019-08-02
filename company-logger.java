// employee/visitor terminal logger
// by Eivydas Raulynaitis
// 8/2/2019

/*
COMPANY LOGIN:
    Employee: [e]
    Visitor/Guest: [v/g]

Type login type [e/v/g] for options: 

Employee first name:
Employee last name:

Successfully logged [FULL NAME] in at 0:00:00

// if already logged in, automatically log out

Successfully logged [FULL NAME] out at 0:00:00

*/

import java.util.Scanner;

public class Main{
     public static void main(String []args){
         // catch any errors
         try{
             login("test");
             //intro();
         } catch (Exception e){
             System.out.println("\n[ERROR] Error caught:\n\t"+e);
         }
     }
     
     public static class employee{
         String fullName;
         boolean loggedIn;
         
         void employee(){
             fullName = "empty";
             loggedIn = false;
         }
     }
     static employee[] employees = new employee[26]; // 26 employees
     employees[0].fullName = "John Doe";
     
     // load up introduction
     public static void intro(){
        System.out.println("COMPANY LOGIN: \n\tEmployee: [e]\n\tVisitor/Guest: [v/g]\n\nType login type [e/v/g] for options: ");
         
        Scanner scan = new Scanner(System.in);
        
        // does current terminal window allow Scanner inputs?
        if(scan.hasNextLine()){
            String input = scan.nextLine();
        } else { 
            throw new IllegalArgumentException("\n\tNo Scanner input available in current terminal.");
        }

     }
     
     // initiate login (param: full name)
     public static void login(String name){
         for(employee i : employees){
             System.out.println(i);
         }
     }
     
     // initiate logout (param: full name)
     public static void logout(){
         
     }
}
