package javaPrograms;

public class CloneEx implements Cloneable {
	int rollno;
	String name;

	CloneEx(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneEx s1 = new CloneEx(10, "krishna");
		CloneEx s2 = (CloneEx) s1.clone();
		System.out.println(s1.hashCode() + " name: " + s1.name);
		System.out.println(s2.hashCode() + " rollmo: " + s2.rollno);

	}

}
