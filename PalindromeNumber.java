public class PalindromeNumber
{
  public static void main(String[] args) {
    
      
      int number=Integer.parseInt(IO.readln("Enter the number"));
      int checkPalindrome=number;
      int rev=0;
      int digit=0;
      while(number!=0)
      {
       digit=number%10;
       rev=rev*10+digit;
       number=number/10;

      }

      if(checkPalindrome==rev)
      {
        IO.println("Number Is PalindromeNumber");
      }
      else
      {
        IO.println(rev+"Number Is Not PalindromeNumber");
      }
  }
}