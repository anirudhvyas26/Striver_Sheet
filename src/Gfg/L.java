package Gfg;

public class L {
public static void P(int n) {
	int i,j;
	for(i=1;i<n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int n=6;
	P(n);
}
}
