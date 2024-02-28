import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'x');
            }
        }
        input = sb.toString();
        System.out.println("Reversed String: " + input);
    }
}