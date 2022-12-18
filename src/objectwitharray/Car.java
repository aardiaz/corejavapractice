package objectwitharray;

public class Car {
	
	private String color;
	private int cc;
	private int price;
	private String model;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return " \n Car [color=" + color + ", cc=" + cc + ", price=" + price + ", model=" + model + "]";
	}

	
	
}
