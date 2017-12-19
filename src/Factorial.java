public class Factorial {

    //Recursive function to calculate factorial
    //Change comment
    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }

    //Main function
    public static void main(String [] args) {

        int fact;
        int number = 4;

        fact = factorial(number);

        System.out.println("\n Factorial of " + number + " is: " + fact);
    }
}
