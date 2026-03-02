package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + " Фамилия: " + this.lastName + " СНИЛС: " + this.ssn);
    }
}
