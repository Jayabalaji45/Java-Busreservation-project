package demo_projbus;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Customer_info {
private String name;
private int busno;
private Date date;

 public Customer_info(){
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter busno 1 to 5");
	busno=sc.nextInt();
	System.out.println("enter date dd/MM/yyyy");
	String dateip=sc.next();
   SimpleDateFormat date1=new SimpleDateFormat("dd/MM/yyyy");
    try {
		date=date1.parse(dateip);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
 }
 public boolean isAvaliable(ArrayList<Customer_info> customerinfo,ArrayList<Car_info> buses) {
	 int capacity=0;
	 for(Car_info bus:buses) {
		 if(bus.getCarno()==busno) {
			 capacity=bus.getcapacity();
		 }}
	 int booked=0;
	 for(Customer_info cust:customerinfo) {
		 if(cust.busno==busno&&cust.date.equals(date)) {
			 booked++;
		 }
	 }
	 return booked<capacity?true:false;
	 
	
	 
 }

}
