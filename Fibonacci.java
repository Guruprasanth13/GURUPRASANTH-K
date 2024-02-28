import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count, num1 = 0, num2 = 1;
        
        System.out.print("How many Fibonacci numbers to print: ");
        count = scanner.nextInt();
        
        System.out.print(num1+" "+num2); // printing 0 and 1
        
        for(int i = 2; i < count; ++i) {
            int num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}