package entities;

public class Product {
	private Integer code;
	private String name;
	private Double price;
	private Double quantity;
	
	public Product() {
	}

	public Product(Integer code, String name, Double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	
	
}
