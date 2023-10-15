package Task_1_4;


public class Test {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Laptop", 500.000, "L");
		Product p2 = new Product(4, "Chuột", 200.000, "C");
		Product p3 = new Product(3, "Bàn phím", 100.000, "B");
		Product p4 = new Product(2, "Laptop", 100.000, "L");

		 OrderItem[] items = new OrderItem[] {
	                new OrderItem(p1, 4),
	                new OrderItem(p2, 2),
	                new OrderItem(p3, 1),
	                new OrderItem(p4, 4)
	        };
		// Tạo đơn hàng mới
		Order order = new Order(items);
		Order.sortOder(items);
		System.out.println(order);
}
}