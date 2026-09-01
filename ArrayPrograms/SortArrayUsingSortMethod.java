
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingSortMethod{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int []array=new int[size];
    System.out.println("enter the arrays elements");
    for (int i = 0; i <array.length; i++) {
      int elements=sc.nextInt();
      array[i]=elements;
        
    }
     Arrays.sort(array);
    for(int arr:array)
    {
      System.out.print(" "+arr);
    }

   
      
  }

}