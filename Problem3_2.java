class Problem3_2{
	public static void main(String args[]){
		int[] a={10,20,30,40,50,5};
		int i;
		int low=a[0],max=a[0];
		for (i=0;i<6;i++) {
			if(a[i]<=low){
				low=a[i];
			}
			
		}
		for (i=0;i<6 ;i++ ) {
			if(a[i]>=max){
				max=a[i];
			}
			
		}
		System.out.println("Minimum Value is : "+low);
		System.out.println("Maximum value is : "+max);
		
	}
}