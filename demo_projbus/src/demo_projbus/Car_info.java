package demo_projbus;

public class Car_info {
private int carno;
private String drivername;
private double driverphno;
private int capacity;


public Car_info(int carno, String drivername, double driverphno, int capacity) {
	super();
	this.carno = carno;
	this.drivername = drivername;
	this.driverphno = driverphno;
	this.capacity = capacity;
}
public int getCarno() {
	return carno;
}
public void setCarno(int carno) {
	this.carno = carno;
}
public String getDrivername() {
	return drivername;
}
public void setDrivername(String drivername) {
	this.drivername = drivername;
}
public double getDriverphno() {
	return driverphno;
}
public void setDriverphno(double driverphno) {
	this.driverphno = driverphno;
}
public int getcapacity() {
	return capacity;
}
public void setCarmodel(int capacity) {
	this.capacity = capacity;
}
public void  displaycar() {
	System.out.println(carno + drivername);
}

	
}
