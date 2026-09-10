void main()
{
  int num=Integer.parseInt(IO.readln("Enter the number "));
  int rev=0;

  while(num!=0)
  {
    rev=rev*10+num%10;
    num/=10;
  }

  IO.println("Reverse number is: "+rev);
}