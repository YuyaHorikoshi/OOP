package ex10;

public class Student {
	private String studentNumber;
	private String name;
	private String address;
	private String tel;

	public static void main(String[] args) {
		Student a = new Student("学籍番号", "名前", "住所", "電話番号");
		a.setName("太郎");
		a.setAddress("横須賀");
		a.setTel("046");
		System.out.println(a);
		
	}

	public Student(String studentNumber, String name, String address, String tel) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.address = address;
		this.tel = tel;

	}

	public String getStudentNumber() {
		return studentNumber;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getAddress() {
		return address;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public String getTel() {
		return tel;

	}

	public void setTel(String tel) {
		this.tel = tel;

	}

	public String toString() {
		return "Student" + "(" + getStudentNumber() + "," + getName() + "," + getAddress() + "," + getTel() + ")";

	}

}
