package recurssion;

public class one_to_N {
public static void  printn(int n) {
	if(n==0) 
	return ;	
	
	
	
	System.out.print(n +" ");
	printn(n-1);
	
}
public static void main(String[] args) {
	int n =10;
	printn (n);
}
}
