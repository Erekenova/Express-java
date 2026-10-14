package prepereToMock.OOP199;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Экспресс Java");
        course.registerStudent("Anna");
        course.registerStudent("Boris");
        course.setCompleteStudent("Anna");
        course.countRegisterStident();
        course.countCompletedStudents();
    }
}
