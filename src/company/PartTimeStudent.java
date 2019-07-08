package company;

public class PartTimeStudent extends Student {
    private int numberOfVisits;
    private int numberOfControlWorks;

    public PartTimeStudent(int age, String name, Gradebook gradebook, Pen pen, boolean stateStudent, int numberOfVisits, int numberOfControlWorks) {
        super(age, name, gradebook, pen, stateStudent);
        this.numberOfVisits = numberOfVisits;
        this.numberOfControlWorks = numberOfControlWorks;
    }

    protected void checkNumberOfVisits(PartTimeStudent student){
        if (numberOfVisits > 40){
            System.out.println("It is a good student" + student.toString());
        }
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "gradebook=" + getGradebook() +
                ", pen=" + getPen() +
                ", scholarship=" + getScholarship() +
                '}';
    }

    public int getNumberOfControlWorks() {
        return numberOfControlWorks;
    }
}