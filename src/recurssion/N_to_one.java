package recurssion;

public class N_to_one {
static void print1(int n) {
	if(n==0)
		return;
	
System.out.print(n +" ");
print1(n-1);
}
public static void main(String[] args) {
	int n =10;
	print1(n);
}
}
