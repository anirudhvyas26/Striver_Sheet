package Gfg;

public class dmond {
public static void ia(int n) {
	int i,j;
	for(i=1;i<=n;i++)
{for(j=1;j<=(n-i);j++) {
	System.out.print(" ");
}
for(j=1;j<=2*i-1;j++) {
	System.out.print("*");
}


System.out.println();
		}
	
	for(i=2;i<=n;i++) {
		for(j=2;j<=i;j++) {
			System.out.print(" ");
			
		}
		for(j=2*(n-i);j>=0;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int n=5;
	ia(n);
}

}
