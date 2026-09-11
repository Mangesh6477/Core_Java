//Runtime exception handling not a complusory
import java.util.Scanner;

class NegativeNumber extends RuntimeException {

    public NegativeNumber(String msg) {
        super(msg);
    }
}

public class UncheckedCustomException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int num = sc.nextInt();
        try {
            demo(num);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void demo(int number) {
        if (number < 0) {
            throw new NegativeNumber("enter positive number");
        } else {
            System.out.println("Input is valid");
        }

    }
}
