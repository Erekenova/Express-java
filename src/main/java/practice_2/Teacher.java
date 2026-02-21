package practice_2;

public class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    void printInfo(){
        System.out.println("Имя учителя: " + this.name + " Предмет: " + this.subject);
    }


}
