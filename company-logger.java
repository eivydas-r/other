// employee/visitor terminal logger
// by Eivydas Raulynaitis
// 8/2/2019

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;


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

            while(true){
                System.out.println("\n\n");
                employees = intro(employees);
            }

        } catch (Exception e){
            System.out.println("\n[ERROR] Error caught:\n\t"+e);
        }
    }

    // load up introduction
    public static ArrayList<Person> intro(ArrayList<Person> employees){
        System.out.println("COMPANY LOGIN: \n\tEmployee: [e]\n\tVisitor/Guest: [v/g]\n\nEnter login type [e/v/g] for options:");

        Scanner scan = new Scanner(System.in);
        String input;
        System.out.print("\t");

        // does current terminal window allow Scanner inputs?
        if(!scan.hasNextLine()){
            throw new IllegalArgumentException("\n\tNo Scanner input available in current terminal.");
        }

        while(true){
            //System.out.print("\n");
            //System.out.print("\t");
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
                    System.out.print("Incorrect input, please try again.\n\t");
                    continue;
            }
            break;
        }
        System.out.print("\t");
        input = scan.nextLine();
        return login(employees,input);
    }

    // initiate login (param: full name)
    public static ArrayList<Person> login(ArrayList<Person> employees, String name){
        employees.add(new Person(name,true));
        System.out.println("Successfully logged "+name+" in at "+getTime());
        //System.out.println(employees.get(0).name);
        return employees;
    }

    // initiate logout (param: full name)
    public static ArrayList<Person> logout(ArrayList<Person> employees){
        return employees;
    }

    public static String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String time = sdf.format(cal.getTime())+" on "+month+"/"+day+"/"+year;
        return time;
    }
}
