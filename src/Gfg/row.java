package Gfg;

public class row {
private static void ee(int n) {
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	for(i=1;i<=n;i++) {
		for(j=n-1;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int n=5;
	ee(n);
}
}
