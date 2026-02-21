package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;
    StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return  this.studentCount;
    }
    void setGroupName(String newGroupname){
        this.groupName = newGroupname;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }
    void printInfo(){
        System.out.println("Группа " + this.groupName + " Количество студентов " + this.studentCount);
    }
}
