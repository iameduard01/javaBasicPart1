package javaPart1.theCalculator;
import java.util.Scanner;

public class Functionality {
    public static void main(String[] args){
        System.out.println("hi");
        System.out.println("this is your magic calculator!!");
        System.out.println("you just need to select what you want");
        System.out.println("sum : press 1");
        System.out.println("dif : press 2");
        System.out.println("multiplication : press 3");
        System.out.println("division : press 4");

        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();
        if ( sum == 1 ){
            System.out.println("you selected sum!");
            System.out.println("now you need to type your numbers!");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            Sum(firstNumber, secondNumber);
        }

        double dif = scanner.nextDouble();
        if ( dif == 2 ){
            System.out.println("you selected dif!");
            System.out.println("now you need to type your numbers!");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            Dif(firstNumber, secondNumber);
        }

        double multiplication = scanner.nextDouble();
        if ( multiplication == 3 ){
            System.out.println("you selected multiplication!");
            System.out.println("now you need to type your numbers!");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            Multiplication(firstNumber, secondNumber);
        }
        double division = scanner.nextDouble();

        if ( division == 4 ){
            System.out.println("you selected division!");
            System.out.println("now you need to type your numbers!");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            Division(firstNumber, secondNumber);
        }
    }
    public static void Sum(double firstNumber, double secondNumber){
        double result;
        result = firstNumber + secondNumber;
        System.out.println("this is the correct result for your numbers : " + result);
    }
    public static void Dif(double firstNumber, double secondNumber){
        double result;
        result = firstNumber - secondNumber;
        System.out.println("this is the correct result for your numbers : " + result);
    }
    public static void Multiplication(double firstNumber, double secondNumber){
        double result;
        result = firstNumber * secondNumber;
        System.out.println("this is the correct result for your numbers : " + result);
    }
    public static void Division(double firstNumber, double secondNumber){
        double result;
        result = firstNumber / secondNumber;
        System.out.println("this is the correct result for your numbers : " + result);
    }
}
