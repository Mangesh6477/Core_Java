void main()
{
  int []arr={7,11,2,2,3,7,9,4};
  for(int i=0;i<arr.length;i++)
  {
    for(int j=i+1;j<arr.length;j++)
    {
      if(arr[i]==arr[j])
      {
        arr[j]=-1;
      }
    }
    
  }
  IO.println("Remove Duplicate Element is:");
  for(int arr1:arr)
  {
    if(arr1!=-1)
    {
      IO.print(" "+arr1);
    }
  }
}