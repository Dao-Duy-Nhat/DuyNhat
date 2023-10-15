package Task_1_4;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;
	
	
	public Order(OrderItem[] items) {
		this.items = items;
	}
	


	@Override
	public String toString() {
		return "Order [items=" + Arrays.toString(items) + "]";
	}
	public static void sortOder(OrderItem[] items) {
		OrderItem[] sortedItems = new OrderItem[items.length];

		for (int i = 0; i < items.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < items.length; j++) {
				if (items[j].getP().getId() < items[minIndex].getP().getId()) {
					minIndex = j;
				}
			}

			OrderItem temp = items[i];
			items[i] = items[minIndex];
			items[minIndex] = temp;
		}

		System.arraycopy(items, 0, sortedItems, 0, items.length);
	}
}

