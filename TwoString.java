import java.util.*;
class TwoString
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    int a1[] = new int[26];
    int a2[] = new int[26];
    boolean flag = false;
    for(int i=0;i<s1.length();i++)
    {
      a1[s1.charAt(i)-'a']++;
    }
    for(int i=0;i<s2.length();i++)
    {
      a2[s2.charAt(i)-'a']++;
    }
    for(int i =0;i<26;i++)
    {
      if(a1[i]>0&&a2[i]>0)
      {
        flag=true;
        break;
      }
    }
    if(flag)
      System.out.println("YES");
     else
     System.out.println("NO");
  }
}
