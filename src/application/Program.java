package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.Product;
import entities.Customer;
import entities.Department;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the number order: ");
		Integer numberOrder = sc.nextInt();
		
		System.out.println("Enter customer name: ");
		String customerName = sc.next();
		
		Order order = new Order(numberOrder, new Customer(customerName));
		
		System.out.println("How many products ?");
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter code product: ");
			Integer productCode = sc.nextInt();
			
			System.out.println("Enter product name: ");
			String productName = sc.next();
			
			System.out.println("Enter product department: ");
			String productDepartment = sc.next();
			
			System.out.println("Enter the price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.println("Enter quantity: ");
			Double productQuantity = sc.nextDouble();
			
			Product product = new Product(productCode, productName, new Department(productDepartment), productPrice, productQuantity);
			order.addProduct(product);
		
		}
		
		System.out.println("Total Value: " + order.total());		
		
		sc.close();
	}

}
