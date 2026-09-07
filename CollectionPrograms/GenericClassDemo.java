
public class GenericClassDemo {

    public static void main(String[] args) {
      Demo<Integer>  value1=new Demo<Integer>(10);
      System.out.println(value1.getValue());
      Demo<String> value2=new Demo<String>("Hello");
      System.out.println(value2.getValue());
      Demo<Boolean> value3=new Demo<Boolean>(false);
      System.out.println(value3.getValue());

    }
}

class Demo<T> {

    private T value;

    Demo(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

}
