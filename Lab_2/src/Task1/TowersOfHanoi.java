package Task1;
public class TowersOfHanoi {

	public static void moveTower(int disk, char source, char auxiliary, char destination) {
		if (disk == 0) {
			// Di chuyển đĩa 1 từ trục nguồn đến trục đích
			System.out.println("Di chuyển đĩa " + disk + " từ trục nguồn " + source + " đến trục đích " + destination);
			return;
		}

		// Di chuyển `disk - 1` đĩa đầu tiên từ trục nguồn đến trục phụ
		moveTower(disk - 1, source, destination, auxiliary);

		// Di chuyển đĩa hiện tại từ trục nguồn đến trục đích
		System.out.println("Di chuyển đĩa " + disk + " từ trục nguồn " + source + " đến trục đích " + destination);

		// Di chuyển `disk - 1` đĩa cuối cùng từ trục phụ đến trục đích
		moveTower(disk - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		int n = 4;
		moveTower(n, 'A', 'B', 'C');
	}
}

