
class ArrayListDemo<T> {

    private Object[] arr;
    private int count = 0;

    public ArrayListDemo() {
        arr = new Object[10];
    }

    public ArrayListDemo(int size) {
        arr = new Object[size];
    }

//add the elements inside the arraylist dynamically
    public void add(T element) {

        Object array[];
        if (count == arr.length) {

            array = new Object[arr.length * 2];
            for(int i = 0; i < arr.length; i++) {
                array[i] = arr[i];
            }
            arr = array;
        }

        this.arr[count] = element;
        count++;
    }

//display all array list elements
    public void get() {
        System.out.print("[");
        for (int i = 0; i < this.count; i++) {
            System.out.print(this.arr[i]);

            if (i < count - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

//display first elements
    @SuppressWarnings("unchecked")
    public T getFirst() {
        return (T) arr[0];
    }


//display last elements
    @SuppressWarnings("unchecked")
    public T lastElement() {
        return (T) arr[count - 1];
    }

}

public class CustomArrayList
{

    public static void main(String[] args) {

        ArrayListDemo<Integer> ls = new ArrayListDemo<Integer>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        ArrayListDemo<String> ls1 = new ArrayListDemo<String>(2);
        ls1.add("mangesh");
        ls1.add("pawan");

        ls.get();

        ls1.get();

        System.out.println("first element   " + ls.getFirst());

        System.out.println("last  " + ls.lastElement());

        System.out.println(ls1.lastElement());

    }
}
