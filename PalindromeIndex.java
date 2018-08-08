import java.util.*;
class PalindromeIndex{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int end = s.length()-1;
	int c=-1;
	for(int i=0;i<s.length()/2;i++){
			char st = s.charAt(i);
			char ed = s.charAt(end);
			if(st!=end){
				boolean flag=true;
				for(int j=i,en=end-1,c=end;j<s.length()/2;j++,en--){
					st=s.charAt(j);
					ed=s.charAt(en);
					if(st!=ed){
						flag=false;
						c=-1;
						break;
					}
				}
				if(flag)
					break;
			for(int j=i+1,en=end,c=i;j<s.length()/2;j++,en--){
					st=s.charAt(j);
					ed=s.charAt(en);
					if(st!=ed){
						flag=false;
						c=-1;
						break;
					}
				}
			}
			end--;
		}
		System.out.println(c);
	}
}
