public class Calculator {
    public static void printSum(int a, int b){ //static method doesn't access instance variable directly
        System.out.println("sum " + (a+b));
    }

    public static void main(String[] args) {
        Calculator.printSum(2,10); //static methods are only called only if are in the same class className.methodName

    }
}
