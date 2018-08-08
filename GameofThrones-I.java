import java.util.*;
class GameofThrones-I
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int arr[] = new int[26];
    int even=0,odd=0;
    for(int i=0;i<s.length();i++)
    {
      arr[s.charAt(i)-'a']++;
    }
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2!=0)
        odd++;
    }
    if(odd>1)
      System.out.println("NO");
    else
      System.out.println("YES");
  }
}
