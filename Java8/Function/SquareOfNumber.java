
import java.util.function.Function;

class SquareOfNumber
{
  public static void main(String[] args) {
      
      Function<Integer,Integer> function=number->number*number;

      
      System.out.println(function.apply(35));
  }
}