package recurssion;

public class fibonacci {
static int fab(int n) {
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	return  fab(n-1) + fab(n-2);
}
public static void main(String[] args) {
	int n=10;
	System.out.println("the n is : "+ n + "the series is: " + fab(n));
}
}
