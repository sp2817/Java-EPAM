import java.util.Scanner;
class Problem3_3{
	public static void main(String args[]){
	int a[]={1,4,34,56,7};
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter any number");
	int n=sc.nextInt();
	int i,k=0,c=0;
	//System.out.println(" "+n);
	for (i=0; i<5;i++ ) {
		if(a[i]==n){
			c++;
			k=i+1;
			
			//System.out.println("Found at location : "+k);
		}
		
		
	}
	if(c>0){
		System.out.println("Found at location : "+k);
	}
	else{
		System.out.println("-1");
	}
	
	}
}