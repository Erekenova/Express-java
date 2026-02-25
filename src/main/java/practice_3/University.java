package practice_3;

public class University {
    static String universityName = "СГУ им. Чернышевского Н.Г.";
    final int studentID;
    String studentName;
    University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public static void changeUniversityName(String newName){
        universityName = newName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println("Имя студента: " + this.studentName + " ID студента: " + this.studentID + " Название университета: " + universityName);
    }
}
