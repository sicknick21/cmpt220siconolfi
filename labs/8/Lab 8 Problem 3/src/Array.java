import java.util.ArrayList;
import java.util.List;

	public class Array {

		public static void main(String[] args) {

			Course course1=new Course("Data Structures");
			Course course2=new Course("Database Systems");
			course1.addStudent("Nick");
			course1.addStudent("Brain ");
			course1.addStudent("Kimmy");
			course2.addStudent("Scott");
			course2.addStudent("Cole");

			System.out.println("The number of students in course 1: "+course1.getNumberOfStudents());
			for (String student : course1.getStudents()) {
			System.out.print(student+", ");

		}
			System.out.println();
			System.out.println("The number of students in course 2: "+course2.getNumberOfStudents());

			for (String student : course2.getStudents()) {

				System.out.print(student+", ");

}

}

}

class Course{

	public String name;

	List<String> students=new ArrayList<>();

		public Course(String name) {
			this.name = name;

}
		public void addStudent(String student) {
			students.add(student);
		}
		public String[] getStudents() {
			String[] result=new String[students.size()];
			students.toArray(result);

			return result;
		}
		public int getNumberOfStudents() {
			return students.size();

}

}