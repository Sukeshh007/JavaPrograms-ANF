package package1;

class Student{
	int rollNo;
	String name;
	float fees;
	
	Student(int roll, String nam, float fee)
	{
		rollNo=roll;
		name=nam;
		fees=fee;
	}
	void diaplay()
	{
		System.out.println(rollNo + " " + name + " " +" "+fees );
	}
}
public class TestClass {
	
	public static void main(String[]args) {
		Student s1=new Student(1, "Sukesh", 7500.0f);
		Student s2=new Student(2, "Rohit", 5000.0f);
		s1.diaplay();
		s2.diaplay();

	}

}
