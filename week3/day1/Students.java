package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student is: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student name is: " + name);
		System.out.println("Student id is: " + id);

	}

	public void getStudentInfo(String email, long phNo) {
		System.out.println("Student email is: " + email);
		System.out.println("Student phNo is: " + phNo);

	}

	public static void main(String[] args) {

		Students s = new Students();
		s.getStudentInfo(100);
		s.getStudentInfo(200, "Bharathi");
		s.getStudentInfo("krishna@gmail.com", 8097654321l);
	}

}
