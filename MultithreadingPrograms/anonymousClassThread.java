void main()
{
  Thread th=new Thread()
  {
    @Override
    public  void run()
    {
      String ThreadName=Thread.currentThread().getName();
      System.out.println(ThreadName);
    }
  };

  th.setName("anonymous Thread");
  th.start();


  String name=Thread.currentThread().getName();
  System.err.println(name);
}