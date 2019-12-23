class Problem3_1{
public static void main(String[] args){
	//Scanner sc=new Scanner(System.in);
	int i;
	int[] a={1,2,3,4,5};
	double avg=0,sum=0;
	for (i=0;i<5;i++) {
		sum=sum+a[i];
	}
	avg=sum/5;
	System.out.println("Average is "+avg);
	System.out.println("Sum is "+sum);	
}
}