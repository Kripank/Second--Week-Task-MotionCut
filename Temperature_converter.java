import java.util.*;

public class Temperature_converter  {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \n 0 to convert Fahrenheit = Celsius \n 1 to convert celsius  = Fahrenheit : ");
       int option=sc.nextInt();

        switch (option){
            case 0:
                System.out.println("You have chosen to convert  Fahrenheit = Celsius  : ");
                Userinput();
                Fahrenheit_converter();

                break;
                
            case 1:
                System.out.println("You have chosen to convert Celsius = Fahrenheit  : ");
                Userinput();
                celcius_converter();

                break;
            default:
                System.out.println("Choose the correct option !!!....");
        }
    }
    static void Userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");

    }
    static void celcius_converter(){
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        float F = (value * 9 / 5) + 32;
        System.out.print("Value in Fahrenheit : " + F+"°F");
    }
    static void Fahrenheit_converter(){
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        float C = (value - 32) * 5/9;
        System.out.print("Value in Celsius: " +C+"°C");
    }

}
