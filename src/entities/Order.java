package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer number;
	private Customer customer;
	private Double total;
	
	private List<Product> products = new ArrayList<>();

	public Order() {
	}

	public Order(Integer number, Customer customer) {
		this.number = number;
		this.customer = customer;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Product> getProduct() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public double total() {
		double total = 0;
		
		for(Product p : products) {
			total += p.subTotal();
		}		
		return total;
	}
	
	
	
	
	
}
