import java.util.*;
class Anagram{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    int count=0;
    int arr1[]=new int[26];
    int arr2[]=new int[26];
    if(len%2==0)
    {
      for(int i=0;i<len/2;i++)
      {
        char c1 = s.charAt(i);
        char c2 = s.charAt((len/2)+i);
        arr1[c1-'a']++;
        arr2[c2-'a']++;
      }
      for(int i=0;i<arr1.length;i++)
      {
        if(arr1[i]>arr2[i])
        {
          count=count+(arr1[i]-arr2[i]);
        }
      }
    }
    else
      count=-1;
    System.out.println(count);
  }
}
