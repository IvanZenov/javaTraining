package by.epam.task1;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class FirstTask {

    //Task 1
    public static double getValueByFormula (double a, double b, double c) throws ArithmeticException{
        double z = pow(b,2) + 4*a*c;
        return (b + pow(z,0.5))/2*a - pow(a,3) + pow(b,-2);
    }

    //Task 2
    public static void getDateByDayAmount(int number){
        if (number<0||number>365){
            System.out.println("Incorrect data");
        }
        else {
            int monthDay = 30;
            int day = number%monthDay;
            int month = number/monthDay;
            System.out.println("Day: " + day +" Month: " + month);
        }
    }

    //Task 3
    public static void changeNumberByExpression(double a,double b,double c){
        if (a>b && b>c){
            a *=2;
            b *=2;
            c *=2;
        }
        else {
            a = abs(a);
            b = abs(b);
            c = abs(c);
        }
    }

    //Task 4
    public static double fff(double x){
        return x<=13 ? (pow(-x,3) + 9): (-3)/(x+1);
    }

    //Task 5
    public static void threeDigitSumAndMultiply(int x){
        int sum = 0;
        int composition = 1;
        int fourDigit = (x%10)*1000 + x;
        int tmp;
        while (x>0){
            tmp = x%10;
            sum += tmp;
            composition *= tmp;
            x /= 10;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Composition: " + composition);
        System.out.println("Four Digit plus last number: " + fourDigit);

    }


    //Task 6
    public static void experimentInt(int a1,int d){
        int currentSum = a1;
        int an = a1;
        int n = 1;
        for (int i =0; i< Integer.MAX_VALUE; i++) {
            an += d;
            n++;
            try {
                currentSum = Math.addExact(currentSum, an);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println(n);
                break;
            }
        }
    }
    public static void experimentLong(int a1,int d){
        long currentSum = a1;
        long an = a1;
        long n = 1;
        for (long i =0; i< Long.MAX_VALUE; i++) {
            an += d;
            n++;
            try {
                currentSum = Math.addExact(currentSum, an);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println(n);
                break;
            }
        }
    }


    //Task 7
    public static void realNumberChanger(double x){
        double result = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(result);
    }

    //Task 8
    public static void function (int a, int b, int h){
        int c = 10;
        for (int i = a; i < b; i+=h) {
            System.out.println(getFunctionValue(i,c));
        }
    }

    public static int getFunctionValue(int x, int c){
        return x==15 ? 2*(x+c) : (x-c) + 6;
    }

    //Task 9. General solution for a given n. For this task n = 10
    public static long sequenceSum(int n){
        long sum = 1;
        long numberBefore = 1;
        for (int i = 1; i <= n; i++){
            sum *= (numberBefore + i + 1);
            numberBefore = (numberBefore + i + 1);
        }
        return sum;
    }

    //Task 10
    public static void sequence(){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        boolean increase = true;
        boolean sameNeighborhood = false;
        boolean alternatingSign = true;

        while (number != 0){
            int secondNumber = number;
            number = s.nextInt();
            if (number==0){
                break;
            }
            if (increase) increase = number > secondNumber;
            if (!sameNeighborhood) sameNeighborhood = (number==secondNumber);
            if (alternatingSign) alternatingSign=(number*secondNumber<0);
        }
        System.out.println("Increase: " + increase);
        System.out.println("Same Neighborhood: " + sameNeighborhood);
        System.out.println("Alternating Sign: " + alternatingSign);

    }

}
