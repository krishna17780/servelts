package Logicalprograms;

public class BinarysearchExp {
	public static void main(String[] args) {
		
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	boolean flag = false;
	int first=0;
	int last=a.length-1;
	int key=7;
	while (first<=last) {
		int m=(first+last)/2;
		if(a[m]==key) {
			System.out.println("element found...");
			flag = true;
			break;
		}
		if(a[m]<key) {
			first=last+1;
		}
		if (a[m]>key) {
			last=first-1;
		}
		if (flag=false) {
			System.out.println("elemt not found..");
		}
	}

}
}