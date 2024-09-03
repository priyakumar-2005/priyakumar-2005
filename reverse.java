package practice.com;


public class reverse {
	public static void main(String[] args) {
	int num=42567;
	int rev=0;
	int rem=0;
	while(num!=0) {
	
	rem=num%10;
	//rev=rev*10+rem;
	System.out.print(rem);
	num/=10;
	}
	//System.out.println("rev " +rev);
	
	
	

}
}
