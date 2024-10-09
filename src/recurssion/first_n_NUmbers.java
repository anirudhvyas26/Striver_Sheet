package recurssion;

public class first_n_NUmbers {
static int sum(int n) {
	
if(n==0)
	return 0;
return n + sum(n-1);

}
public static void main(String[] args) {
	int n =5;
	int s =sum(n);
	System.out.println(  "n is : " + n + " sum is:" +s );
}
}
