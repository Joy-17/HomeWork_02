package hw6_1;

public class InkBrush extends Pen {

	private String brand;
	private double price;

	public InkBrush() {

	}

	public InkBrush(double price) {
		this.price = price;
	}

	public InkBrush(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void getPrice() {
		System.out.println(price * 0.9);

	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
