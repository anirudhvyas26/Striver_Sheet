package recurssion;

public class one_to_N {
public static void  printn(int n) {
	if(n==0) 
	return ;	
	
	printn(n-1);
	
	System.out.print(n +" ");
	
}
public static void main(String[] args) {
	int n =10;
	printn (n);
}
}
