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
        class Person{
            String fullName;
            boolean loggedIn;
            
            void Person(){
                fullName = "empty";
                loggedIn = false;
            }
        }
         // catch any errors
         try{
            // initialize employees array
            Person[] employees = new Person[26]; // 26 employees
            // create employee objects
            for(int i = 0; i < employees.length; i++){
                employees[i] = new Person();
            }
            
            login(employees,"test");
            //intro();
         } catch (Exception e){
             System.out.println("\n[ERROR] Error caught:\n\t"+e);
         }
     }

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
     public static void login(Person[] employees, String name){

     }
     
     // initiate logout (param: full name)
     public static void logout(){
         
     }
}
