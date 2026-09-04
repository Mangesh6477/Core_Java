void main()
{
  int []arr={1,4,6,2,8,5,3};

  int secondLargest=arr[0];
  int largestElement=arr[0];
  for(int i=0;i<arr.length;i++)
  {
     if(arr[i]>=largestElement)
     {
      secondLargest=largestElement;
      largestElement=arr[i];
     }
    
  }
  IO.println("Second largest number is: "+secondLargest);
}