import java.util.Scanner;
import java.util.Random;
public class calc {


    public static void main(String[] args) {
        int choice = 0;
        int t = 3;
        int num1 = 0;
        int num2 = 0;
        getMenuOption(choice, t, num1, num2);
    }

    public static int getMenuOption(int choice, int t, int num1, int num2) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        while (cont = true) {
            System.out.println("Calculator");
            System.out.println("Choose the number of the operation you need");
            System.out.println("\n \n");
            System.out.println("Menu:");
            System.out.println("1: Add two numbers");
            System.out.println("2: Subtract two numbers");
            System.out.println("3: Multiply two Numbers");
            System.out.println("4: Divide two numbers");
            System.out.println("5: Generate a Random Number");
            System.out.println("6: Generate Factors a Number");
            System.out.println("7: Generate Prime-Factors a Number");
            System.out.println("8: Raise a Number to the x Power");
            System.out.println("9: Exit the Program");
            System.out.println();
            System.out.print("What is your choice?: ");
            choice = input.nextInt();
            switch(choice) {
                case 1: add(num1, num2); break;
                case 2: subtract(num1, num2); break;
                case 3: multiply(num1, num2); break;
                case 4: divide(num1, num2); break;
                case 5: random(num1, num2); break;
                case 6: factors(num1); break;
                case 7: primeFact(num1); break;
                case 8: expoGen(num1); break;
                case 9: System.exit(0);
            }
            if (choice <= 0 || choice >= 10) {
                System.out.println("Incorrect choice please try again");
                t--;
                int tries = t;
                System.out.println(tries + " tries left before restart");
                if (tries <= 0) {
                    System.out.println("Program Restarting");
                    System.exit(0);
                } // end of tries statement
            } // end of if choice statement
            if (choice == 1 || choice <= 9) {
                t = 3;
            }
        }
        return 0;
    }
    public static double add(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.print("Please enter the first number: ");
         double operand1 = input.nextDouble();
        System.out.println();
        System.out.print("Please enter second number: ");
        double operand2 = input.nextDouble();
        answer = operand1 + operand2;
        System.out.println("\n");
        System.out.println("Your answer is: " + answer);
        System.out.println("\n");

        return 0;
    }

    public static double[] subtract(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.print("Please enter the first number: ");
         double operand1 = input.nextDouble();
        System.out.println();
        System.out.print("Please enter second number: ");
        double operand2 = input.nextDouble();
        answer = (operand1 - operand2);
        System.out.println("\n");
        System.out.println("Your answer is: " + answer);
        System.out.println("\n");
        return null;
    }

    public static double[] multiply(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.print("Please enter the first number: ");
        double operand1 = input.nextDouble();
        System.out.println();
        System.out.print("Please enter second number: ");
        double operand2 = input.nextDouble();
        answer = (operand1 * operand2);
        System.out.println("\n");
        System.out.println("Your answer is: " + answer);
        System.out.println("\n");
        return null;
    }

    public static double divide(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.print("Please enter the first number: ");
        double operand1 = input.nextDouble();
        System.out.println();
        System.out.print("Please enter second number: ");
        double operand2 = input.nextDouble();
        answer = (operand1 / operand2);
        if (operand2 == 0) {
            return (Double) null;
        } else
            System.out.println("\n");
            System.out.println("Your answer is: " + answer);
        System.out.println("\n");
        return Double.NaN;
    }

    public static double[] random(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the upper limit: ");
        double upperLimit1 = input.nextDouble();
        System.out.println();
        System.out.print("Please enter lower limit: ");
        double lowerLimit1 = input.nextDouble();
        double bound =  (upperLimit1 - lowerLimit1) + 1;
        Random rand = new Random();
        double ranNum = rand.nextInt((int) bound) + lowerLimit1;
        System.out.println("\n");
        System.out.println("Your random number is: " + ranNum);
        System.out.println("\n");
        return null;
    }

    public static double[] factors(int num1) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.print("Please enter the number: ");
        System.out.println("\n");
        final int MAX = input.nextInt();
        boolean fact[] = new boolean[MAX];
        for (int k = 1; k < fact.length; k++) {
            fact[k] = false;
        }
        for (int k = 1; k < fact.length; k++) {
            if (fact.length % k == 0) {
                fact[k] = true;
            }
        }
        System.out.println("Factors of " + fact.length +" are ");
        System.out.println();

        for (int k = 1; k < fact.length; k++) {
            if (fact[k] == true) {
                System.out.print(k + " ");
            }
        }
        System.out.print(fact.length);
        System.out.println();
        System.out.println("\n");
        return null;
    }
    public static double[] primeFact(int num1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int Max = input.nextInt();
        while(Max % 2 ==0){
            System.out.print(2 + " ");
            Max /= 2;
        }
        //  if maxis now odd
        for(int i = 3; i <= Math.sqrt(Max); i += 2){
            while (Max % i == 0){
                System.out.print(i +" ");
                Max /= i;
            }
        }
        // if maxis prime
        if (Max> 2){
            System.out.print(Max);
        }
        System.out.println("\n");
        //code referenced from https://www.geeksforgeeks.org/java-program-for-efficiently-print-all-prime-factors-of-a-given-number/
        return null;
    }

    public static double[] expoGen(int num1){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number:");
        double con = input.nextDouble();
        System.out.println();
        System.out.print("Enter Exponent: ");
        int ex = input.nextInt();
        boolean expo[] = new boolean[ex];
        final double c = con;

        for(int k = 1; k < expo.length; k++){
            con = c * con;
        }
        System.out.println("\n");
        System.out.println("Your answer is " + con);
        System.out.println("\n");
        return null;
    }
}

