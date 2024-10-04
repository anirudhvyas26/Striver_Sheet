package Gfg;

public class hs{
public static void box(int n){
 int i,j;
 for(
	 i=0;i<n;i++){
		for(j=0;j<n;j++) {
			System.out.print((i==0||j==0||i== n-1||j == n-1 )?"*":" ");
			
		}
		 System.out.println();
		 
		 
	 }
}
 

public static void main(String[] args) {
	int n =6;
	box(n);

}
}
