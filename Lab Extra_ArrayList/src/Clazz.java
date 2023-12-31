import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Clazz {
	private String name;
	private String year;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Clazz(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "Clazz [Name:" + name + ", Year:" + year + "]" + "\n" + students ;
	}



	public void addSt(Student student) {
		students.add(student);
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public ArrayList<Student> getStudents() {
		return students;
	}



	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}



	// sort students according to the given comparator c
	public void sortStudents(Comparator<Student> c) {
	  Collections.sort(students, c);
	}

	// get top n students with highest GPA
	public ArrayList<Student> getTopNStudents(int n) {
		ArrayList<Student> list = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getGPA() > n) {
				list.add(student);
			}
		}
		return list;
	}

		// get random n students from the list of students
		public ArrayList<Student> getRandomNStudents(int n) {
			ArrayList<Student> randomStudent = new ArrayList<Student>();
			for (Student student : students) {
				if (student.getGPA() > (Double) Math.random()) {
					randomStudent.add(student);
				}
			}
			return randomStudent;
		}

// remove a student with a given id
	public boolean removeStudent(String id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				  students.remove(student);
				  return true;
			}
			}
		return false;
		}

	// get all students who were born in a given birth year.
	public ArrayList<Student> getStudentByBirthYear(int birthYear) {
		ArrayList<Student> listStudent = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getBirthYear() == birthYear) {
				listStudent.add(student);
			}
		}
		return listStudent;
	}

	// similar as toString method, this method prints the name, year, and all
	// students of the class. Note that, using iterator
	public void display() {
		System.out.println("Class: " + name + " - Year: " + year);
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}

	}
	
	public void linksBelow() {
		System.out.println("__________________________________________________");
	}
}
