// employee/visitor terminal logger
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

public class Logger{
     public static void main(String []args){
         try{
             intro();
         } catch (Exception e){
             System.out.println("\n[ERROR] Error caught:\n\t"+e);
         }
     }
     
     public static void intro(){
         System.out.println("COMPANY LOGIN: \n\tEmployee: [e]\n\tVisitor/Guest: [v/g]\n\nType login type [e/v/g] for options: ");
         
        Scanner scan = new Scanner(System.in);
        
        if(scan.hasNextLine()){
            String input = scan.nextLine();
        } else { 
            throw new IllegalArgumentException("\n\tNo Scanner input available in current terminal.");
        }

     }
     
     public static void login(){
         
     }
     
     public static void logout(){
         
     }
}
