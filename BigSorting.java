import java.util.*;
class BigSorting{
  public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    for(int i=0;i<n;i++){
      s[i] = sc.next();
    }
    String tmpstr="";
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n-1;j++){
        int l1=s[i].length();
        int l2=s[j].length();
        if(l1>l2){
          tmpstr=s[i];
          s[i]=s[j];
          s[j]=tmpstr;
        }
        else if(l1==l2){
          boolean flag=false;
          for(int k=0;k<l1;k++){
            int x = s[i].charAt(k);
            int y = s[j].charAt(k);
            if(x>y){
            flag=true;
            break;
            }
          }
          if(true){
            tmpstr=s[i];
            s[i]=s[j];
            s[j]=tmpstr;
          }
        }
      }
    }
    for(int i=0;i<s.length;i++){
      System.out.println(s[i]);
    }
  }
}
