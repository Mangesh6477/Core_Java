void main()
{
  String str="java";
  String rev="";

  for(int i=str.length()-1;i>=0;i--)
  {
    rev=rev+str.charAt(i);
  }

  IO.println("Original String Is "+str);
  IO.println("Reversed String Is "+rev);
}