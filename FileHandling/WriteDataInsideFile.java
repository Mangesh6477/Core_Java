void main() throws  FileNotFoundException
{
  var filePath="C:\\Users\\sarvadnya\\Desktop\\eng com\\program.txt";
  var fileout=new FileOutputStream(filePath);

  try(fileout)
  {

    String str="hii my name is shubham i am from maharastra what about you";

   byte arr[]= str.getBytes();
   fileout.write(arr);
   System.out.println("Data stored successfully");
  }
  catch(Exception e)
  {
    e.printStackTrace();

  }

}