void main() throws  FileNotFoundException
{
  var filePath="C:\\Users\\sarvadnya\\Desktop\\eng com\\program.txt";

  var fileIn=new FileInputStream(filePath);

  try(fileIn)
  {
       int data;

       while((data=fileIn.read())!=-1)
       {
        System.out.print((char )data);
       }
  }
  catch(Exception e)
  {
    e.printStackTrace();

  }

}