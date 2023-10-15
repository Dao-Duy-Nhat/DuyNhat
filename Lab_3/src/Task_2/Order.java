package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order {
	private OrderItem[] items;
	
	
	public Order(OrderItem[] items) {
		this.items = items;
	}
	


	@Override
	public String toString() {
		return "Order [items=" + Arrays.toString(items) + "]";
	}



	public double cost() {
		double sum = 0.0;
		for (OrderItem orderItem : items) {
	        sum += orderItem.getP().getPrice() * orderItem.getQuality();
		}
	return sum;
	}
	
	// using binary search approach
	public boolean contains(Product p) {
		// Sắp xếp:
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem item1, OrderItem item2) {
				return item1.getP().getId().compareTo(item2.getP().getId());
			}
		});
		// Tìm kiếm:
		int low = 0;
		int high = items.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			OrderItem item = items[mid]; // Lấy sp tại mid;

			if (item.getP().equals(p)) {
				return true;
			} else if (item.getP().getId().compareTo(p.getId()) < 0) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		return false;
	}
	
	// get all products based on the given type using linear search
	public Product[] filter(String type) {
		  Arrays.sort(items, new Comparator<OrderItem>() {
		    @Override
		    public int compare(OrderItem item1, OrderItem item2) {
		      return item1.getP().getType().compareTo(item2.getP().getType());
		    }
		  });

		 
		  List<Product> filteredProducts = new ArrayList<>();
		  for (OrderItem item : items) {
		    if (item.getP().getType().equals(type)) {
		      filteredProducts.add(item.getP());
		    }
		  }
		  return filteredProducts.toArray(new Product[0]);
		}


}
