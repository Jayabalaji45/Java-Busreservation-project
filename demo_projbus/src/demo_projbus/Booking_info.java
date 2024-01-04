package demo_projbus;
import java.util.*;
public class Booking_info {
	public static void main(String[]args) {
		ArrayList<Car_info> buses=new ArrayList<>();
		ArrayList<Customer_info> customerinfo=new ArrayList<>();
		
		
		
		
		
		buses.add(new Car_info(1,"bala",1234,2) );
		
//		for(Car_info car:buses) {
//			car.displaycar();
//		}
		
		
		
		
	
		Scanner sc=new Scanner(System.in);
		int useropt=1;
		while(useropt==1) {
			System.out.println("press 1 for continue and 2 for exit");
			useropt=sc.nextInt();
			if(useropt==1) {
				Customer_info customer=new Customer_info();
				if(customer.isAvaliable(customerinfo,buses)) {
					customerinfo.add(customer);
					System.out.println("your booking is confirm");
					
				}
				else {
					System.out.println("seats r full");
				}
			}
			
		}
	
}
}