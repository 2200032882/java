package ecommercePlatformSearchFunction;


	public class Main {
	    public static void main(String[] args) {
	        Product[] products = {
	            new Product(101, "Phone", "Electronics"),
	            new Product(305, "Shirt", "Clothing"),
	            new Product(205, "Laptop", "Electronics"),
	            new Product(409, "Book", "Education"),
	            new Product(110, "Shoes", "Footwear")
	        };

	        Product result1 = SearchUtil.linearSearch(products, 205);
	        System.out.println("Linear Search Result: " + result1);

	        SearchUtil.sortProductsById(products);
	        Product result2 = SearchUtil.binarySearch(products, 205);
	        System.out.println("Binary Search Result: " + result2);
	    }
	}


