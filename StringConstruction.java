import java.util.*;
class StringConstruction
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a[] = new int[26];
    int dollar=0;
    for(int i=0;i<s.length();i++)
    {
      if(a[s.charAt(i)]==0)
        dollar++;
      a[s.charAt(i)-'a']++;
    }
    System.out.println(dollar);
  }
}
