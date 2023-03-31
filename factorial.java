import java.util.Scanner;

class factorial{

	public static void main(String[] args) {
	int f=1,i,n;
	System.out.println("enter a number");
	Scanner s1=new Scanner (System.in);
	n=s1.nextInt();

	for(i=1;i<n+1;i++)
	{
		f=f*i;
	}
	System.out.println("factorial of "+n+"is"+f);
	}
}


