
import java.util.*;

public class TempConverter {

    //java program for temp converter- which takes input from the user and convert it to farhenit and kelvin based on user selection
// select temp to convert - from which to which - input - converted value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            for(;;){
        System.out.println("Please choose the temperature CODE from the list to convert");
        System.out.println("1. CELCIUS(C) - KELVIN  | 2. Kelvin(k) - CELCIUS |  3. CELCIUS - FAHRENHEIT | 4.FAHRENHEIT -> CELCIUS | 5. KELVIN -> FAHRENHEIT | 6. FAHERENHEIT -> KELVIN || 0.To Terminate");
        int InputTemp = sc.nextInt();
        //CONDITION FORMULAS TO CONVERT FROM CELCIUS TO KELVIN


        //exception handling using if else
        if(InputTemp !=1 && InputTemp !=2 && InputTemp !=3 && InputTemp !=4 && InputTemp !=5 && InputTemp!=6 && InputTemp!=0){
            System.out.println("invalid input entered");
            continue;
        }
//formulas to conversion - 
        //for kelvin to celcius
        float celcius = 0;
        //celcius to kelvin  ;
        float kelvin = 0;
        float FAHERENHEIT = 0;

    

            //CELCIUS TO KELVIN CONVERSION
            if (InputTemp==1) {
                //converting from celcius to kelvin
                System.out.println("Please Enter the temp in celcius");
                float ucelcius = sc.nextFloat();
                kelvin = ucelcius + 273.15f;
                System.out.println("converted to Kelvin is " + " " + kelvin);
                
    
                //KELVIN TO CELCIUS CONVERSION
            } else if (InputTemp==2) {
                //converting from kelvin to celcius
                System.out.println("please enter the temp in Kelvin");
                float ukelvin = sc.nextFloat();
                celcius = ukelvin - 273.15f;
                System.out.println("converted to celcius value is " + " " + celcius + "*C");
            } 
    
            //conversion of celcius to farhenheit
            else if (InputTemp==3) {
                System.out.println("Enter the Temp in Celcius");
                celcius = sc.nextFloat();
                  FAHERENHEIT = (celcius * 9 / 5) + 32;
                System.out.println("Converted to Farhenheit value is " + FAHERENHEIT + " *F");
            }
    
             //fahrenheit to Celcius 
            else if(InputTemp==4) {
                System.out.println("Enter the temp in Farhenheit");
                  FAHERENHEIT = sc.nextFloat();
                celcius = (FAHERENHEIT - 32)*5/9f;
                System.out.println("converted to Celcius" + celcius + "*c");
            }
    
            //conversion for the kelvin to farhenheit
            else if(InputTemp==5){
                System.out.println("Enter the temp in Kelvin");
                kelvin = sc.nextFloat();
                  FAHERENHEIT = (kelvin - 273.15f)*9/5+32;
                System.out.println("Converted to Farhenheit" + FAHERENHEIT);
            }
    
            //conversion for the farheneit to Kelvin
            else if(InputTemp==6){
                System.out.println("Enter the temp in Farhenheit");
                  FAHERENHEIT = sc.nextFloat();
                kelvin = (FAHERENHEIT - 32)*5/9+273.15f;
                System.out.println("converted to kelvin value is " + kelvin + "k");

            }
             
            System.out.println("Do you want to Continue again? Y/N");
            char choise = sc.next().toUpperCase().charAt(0);

            if(choise == 'N'){
                System.out.println("Thank for using converter");
            }

            
         }


    }

}
