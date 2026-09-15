package prepereToMock.OOP14;

public class Student {
    private final String name;
    private final int recordNumber;
    private final double averageGrade;

    public Student(String name, int recordNumber, double averageGrade) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return name + " — " + recordNumber + " — " + averageGrade;
    }
}
