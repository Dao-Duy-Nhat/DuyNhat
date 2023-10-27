import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		Clazz cl1 = new Clazz("Năm 1", "2023");

		Student st1 = new Student("18130006", "Trong", "Nguyen", 1997, 7.5);
		Student st2 = new Student("18130090", "Phi", "Hoang", 1997, 5.5);
		Student st3 = new Student("18130086", "An", "Ly", 1998, 8.5);
		Student st4 = new Student("18130024", "Anh", "Pham", 1999, 9.5);
		Student st5 = new Student("18130105", "Ngoc", "Phan", 1999, 9.0);
		Student st6 = new Student("18130206", "Tam", "Ly", 1994, 8.5);
		Student st7 = new Student("18130110", "Lan", "Nguyen", 1996, 8.0);
		Student st8 = new Student("18130056", "Vu", "Dang", 1995, 7.5);
		Student st9 = new Student("18130012", "Dung", "Tran", 1994, 6.5);
		Student st10 = new Student("18130045", "Thao", "Le", 1993, 7.5);

		cl1.addSt(st1);
		cl1.addSt(st2);
		cl1.addSt(st3);
		cl1.addSt(st4);
		cl1.addSt(st5);
		cl1.addSt(st6);
		cl1.addSt(st7);
		cl1.addSt(st8);
		cl1.addSt(st9);
		cl1.addSt(st10);

		cl1.display();
		cl1.linksBelow();

		cl1.sortStudents(new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				return student1.getFirstName().compareTo(student2.getFirstName());
			}
		});
		System.out.println("Sắp xếp theo tên: " + cl1);

		cl1.linksBelow();
		cl1.sortStudents(new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				return Double.compare(student1.getGPA(), student2.getGPA());
			}
		});

		cl1.linksBelow();

		System.out.println("Sắp xếp theo GPA: " + cl1);
		cl1.linksBelow();

		System.out.println("GPA lớn hơn n: " + cl1.getTopNStudents(8));
		cl1.linksBelow();

		System.out.println("Random học sinh theo GPA:" + cl1.getRandomNStudents(0));
		cl1.linksBelow();

		System.out.println("Xóa một hs theo id:");
		System.out.println("Học sinh đã bị xóa: " + cl1.removeStudent("18130045"));
		System.out.println("Học sinh đã bị xóa:" + cl1.removeStudent("18130045"));
		cl1.linksBelow();

		System.out.println("Học sinh có cùng ngày sinh:");
		System.out.println(cl1.getStudentByBirthYear(1997));
		cl1.linksBelow();

	}
}