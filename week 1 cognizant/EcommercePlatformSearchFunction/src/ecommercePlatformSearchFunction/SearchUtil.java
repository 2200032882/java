package ecommercePlatformSearchFunction;


	public class SearchUtil {
	    public static Product linearSearch(Product[] products, int id) {
	        for (Product p : products) {
	            if (p.productId == id) return p;
	        }
	        return null;
	    }

	    public static Product binarySearch(Product[] products, int id) {
	        int left = 0;
	        int right = products.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (products[mid].productId == id) return products[mid];
	            else if (products[mid].productId < id) left = mid + 1;
	            else right = mid - 1;
	        }
	        return null;
	    }

	    public static void sortProductsById(Product[] products) {
	        java.util.Arrays.sort(products, (a, b) -> a.productId - b.productId);
	    }
	}


