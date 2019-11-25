package com.hcl.day3;

public class Perfect {
	public void show(int n)
	{
	int sum=0;
	for(int i=1;i<
	        n;i++){
		if(n%i==0){
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		System.out.println("perfect number" +sum);
	}
	else
	{
		System.out.println("no perfect" +sum);
	}

}
	public static void main(String[] args) {
		new Perfect().show(6);
	}
}
