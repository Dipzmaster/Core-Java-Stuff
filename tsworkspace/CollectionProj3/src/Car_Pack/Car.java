package Car_Pack;

public class Car {
	
private int Modelid;
private String Modelname;
private String Body;
private int Seating;
private int Mileage;
private int Price;


public Car(int modelid, String modelname, String body, int seating,
		int mileage, int price) {
	super();
	Modelid = modelid;
	Modelname = modelname;
	Body = body;
	Seating = seating;
	Mileage = mileage;
	Price = price;
}


public int getModelid() {
	return Modelid;
}


public void setModelid(int modelid) {
	Modelid = modelid;
}


public String getModelname() {
	return Modelname;
}


public void setModelname(String modelname) {
	Modelname = modelname;
}


public String getBody() {
	return Body;
}


public void setBody(String body) {
	Body = body;
}


public int getSeating() {
	return Seating;
}


public void setSeating(int seating) {
	Seating = seating;
}


public int getMileage() {
	return Mileage;
}


public void setMileage(int mileage) {
	Mileage = mileage;
}


public int getPrice() {
	return Price;
}


public void setPrice(int price) {
	Price = price;
}



	

}
