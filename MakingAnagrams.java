import java.util.*;
class MakingAnagrams
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    int s1a[] = new int[26];
    int s2a[] = new int[26];
    int sum=0;
    for(int i=0;i<s1.length();i++)
    {
      s1a[s1.charAt(i)-'a']++;  
    }
    for(int i=0;i<s2.length();i++)
    {
      s2a[s2.charAt(i)-'a']++;  
    }
    for(int i=0;i<s1a.length;i++)
    {
      sum = sum + Math.abs(s1a[i]-s2a[i]);
    }
    System.out.println(sum);
  }
}
