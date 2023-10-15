package Task_2;
public class Test {
	public static void main(String[] args) {
		Product p1 = new Product("01", "Laptop", 500.000, "L");
		Product p2 = new Product("02", "Chuột", 200.000, "C");
		Product p3 = new Product("03", "Bàn phím", 100.000, "B");
		Product p4 = new Product("04", "Laptop", 100.000, "L");

		 OrderItem[] items = new OrderItem[] {
	                new OrderItem(p1, 4),
	                new OrderItem(p2, 2),
	                new OrderItem(p3, 1),
	                new OrderItem(p4, 4)
	        };
		// Tạo đơn hàng mới
		Order order = new Order(items);

		// In tổng giá trị đơn hàng
		System.out.println("Tổng giá trị đơn hàng: " + order.cost());

		// Kiểm tra sản phẩm có tồn tại trong đơn hàng hay không
		System.out.println("Sản phẩm chuột có tồn tại trong đơn hàng không? " + order.contains(p2));

		// Lọc các sản phẩm có loại là Laptop
		Product[] filteredProducts = order.filter("L");

		// In danh sách các sản phẩm được lọc
		System.out.println("Danh sách các sản phẩm loại Laptop: ");
		for (Product product : filteredProducts) {
			System.out.println(product);
		}
	}
		
}
