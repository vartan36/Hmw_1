public class MyClass {
    int year = 2023;
    static int sumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        int a = 23, b = 13, sum;
        sum = a + b;
        //System.out.println("The sum of two numbers is: "+sum);
        System.out.println(sumOfTwoNumbers(a, b));
        //System.out.println(sumOfTwoNumbers(100, 70));
        }
    }
