
public class GenericMethod {

    public static void main(String[] args) {

        Integer a1 = display(10);
        String ch1 = display("hellow");
        Boolean isValid = display(false);
        System.out.println(a1);
        System.out.println(ch1);
        System.out.println(isValid);

        keyValues(10, "mangesh");

    }

    public static <T> T display(T value) {
        return value;
    }

    public static <T,U> T keyValues(T value1,U value2) {
             System.out.println(value1+" : "+value2);
            return null; 
    }

}

