package printhello;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=16;
		int count=0;
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
				
				count++;
			}
		}
		if(count==2) {
			
			System.out.println("prime");
		}
		else {
			
			System.out.println("not prime");
		}
}
}
