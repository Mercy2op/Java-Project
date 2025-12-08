public class SimpleCalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        calculatePrimitive(num1, num2);

        int obj1 = 20;
        int obj2 = 4;
        calculateNonPrimitive(obj1, obj2);
    }

    public static void calculatePrimitive(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("Primitive Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
    }

    public static void calculateNonPrimitive(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("Non-Primitive Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}