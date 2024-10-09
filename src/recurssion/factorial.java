package recurssion;

public class factorial {
static int fac(int n) {
	if(n==0)
		return 1;
	return n* fac( n-1);
}
public static void main(String[] args) {
	int n =5;
	int f =fac(n);
	System.out.println("n is : " + n + "factorial is: " + f );
}
}
