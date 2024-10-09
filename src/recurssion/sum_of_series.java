package recurssion;

public class sum_of_series {
static int same(int n) {
	if(n==0) {
	return 0;
}
	return (n*n*n) + same(n-1);
	
	}
public static void main(String[] args) {
	int n =3;
	int s =same(n);
	System.out.println("n is " + n + " sum is :" + s );
}
}
