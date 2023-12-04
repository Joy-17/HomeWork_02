package hw6_1;

public abstract class Pen {
	public String brand;
	public int price;
	
	public Pen() {
		
	}
	
	public Pen(String brand,int price) {
		this.brand = brand;
		this.price = price;
		
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void getPrice() ;
	

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void write();
}
