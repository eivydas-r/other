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
import java.util.ArrayList;


class Person{
	String name;
	boolean loggedIn;

	Person(){
		name = "empty";
		loggedIn = false;
	}

	Person(String name, boolean loggedIn){
		this.name = name;
		this.loggedIn = loggedIn;
	}
}


public class Main{
    public static void main(String []args){
         // catch any errors
         try{
            // initialize employees array
			ArrayList<Person> employees = new ArrayList<Person>();
			employees.add(new Person ("Joe",true));

			System.out.println(employees.get(0).name);

            //login(employees,"test");
			intro();
            
         } catch (Exception e){
             System.out.println("\n[ERROR] Error caught:\n\t"+e);
         }
     }

	      // load up introduction
    public static void intro(){
        System.out.println("COMPANY LOGIN: \n\tEmployee: [e]\n\tVisitor/Guest: [v/g]\n\nEnter login type [e/v/g] for options:");
         
        Scanner scan = new Scanner(System.in);
        String input;
		System.out.print("\t");

        // does current terminal window allow Scanner inputs?
        if(!scan.hasNextLine()){
			throw new IllegalArgumentException("\n\tNo Scanner input available in current terminal.");
        }
		
		while(true){
			System.out.print("\n");
			input = scan.nextLine();
			switch(input.toLowerCase()){
				case "e":
					System.out.println("Employee name: ");
					break;
				case "g":
					System.out.println("Guest name: ");
					break;
				case "v":
					System.out.println("Visitor name: ");
					break;
				default:
					System.out.println("Incorrect input, please try again.");
					continue;
			}
			break;
		}
		System.out.print("\t");
		input = scan.nextLine();

    }
     
     // initiate login (param: full name)
    public static void login(Person[] employees, String name){

    }
     
     // initiate logout (param: full name)
    public static void logout(){
         
    }
}
