
class MyException extends Exception {

    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }

}

public class CustomException1 {

    public static void main(String[] args) {

        try {
            int a = 19;
            custom(a);

        } catch (MyException e) {
            e.printStackTrace();

        }

    }

    public static void custom(int age) throws MyException {
        if (age < 18) {
            throw new MyException("wrong input");
        } else {
            System.out.println("Valid output");
        }
    }
}
