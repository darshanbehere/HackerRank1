import java.util.*;

class InsertionSort-Part1
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int tmp;
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i=n-1;i>=0;i--)
    {
      for(int j=i-1;j>=0;j--)
      {
        if(arr[i]>arr[j])
        {
          break;
        }
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
      }
    }
  }
}
