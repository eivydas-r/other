// job/wage simulator
/*
Job Simulator
    Enter human name:
    Enter hourly wage:
    Enter tax rate: 26%
    Enter hours worked per week (>40 = 1.5x OT):
    Enter simulation time (in weeks):
    

*/

import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter human name: ");
        String name = scan.nextLine();
        System.out.println("Enter hourly wage:");
        float wage = scan.nextFloat();
        System.out.println("Enter tax rate: ");
        float tax = scan.nextFloat();
        System.out.println("Enter hours worked per week (>40 = 1.5x OT): ");
        int hours = scan.nextInt();
        System.out.println("Enter simulation time (in weeks):");
        int weeks = scan.nextInt();
        float total = 0;
        
        for(int i = 1; i<=weeks; i++){
            total = total + wage*hours;
            System.out.format("%-" + 10 + "s   %-10s %4s\n", "Week "+i, "Wage: "+total, "Net wage: "+(total-(total*(tax/100))));
            //System.out.println("Week "+i+": "+total);
            sleep(1000);
        }
    }
    
    // simplify sleep()
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } catch (Exception e) {}
    }
}
