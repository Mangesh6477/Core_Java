class MyThread extends Thread
{
  @Override
  public void run()
  {
    String name=Thread.currentThread().getName();
    System.out.println(name);
  }

}
void main()
{
  MyThread  t1=new MyThread();
  MyThread  t2=new MyThread();
  MyThread  t3=new MyThread();
  
  t1.setName("first1");
  t2.setName("Second");
  t3.setName("Third");
  t1.start();
  t2.start();
  t3.start();

  
}