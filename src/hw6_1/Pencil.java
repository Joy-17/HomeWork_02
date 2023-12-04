package hw6_1;

public class Pencil extends Pen {
	private String brand;
	private double price;

	public Pencil() {

	}

	public Pencil(int price) {
		this.price = price;
	}

	public Pencil(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void getPrice() {
		System.out.println(price*0.8);
		
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
