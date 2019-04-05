public class TestCourse {

    public static void main(String[] args) {
        Course course = new Course("CSE");
        course.addStudent("Nick");
        course.addStudent("Scott");
        course.addStudent("Matt");
        course.dropStudent("Cole");
        System.out.println("The students in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
    }

}