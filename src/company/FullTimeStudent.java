package company;


public class FullTimeStudent extends Student {
    private int numberOfAbsenteeism;
    private int numberOfTermPapers;

    public FullTimeStudent(int age, String name, Gradebook gradebook, Pen pen, boolean stateStudent, int numberOfAbsenteeism, int numberOfTermPapers) {
        super(age, name, gradebook, pen, stateStudent);
        this.numberOfAbsenteeism = numberOfAbsenteeism;
        this.numberOfTermPapers = numberOfTermPapers;
    }

    protected void  checkNumberOfAbsenteeism(FullTimeStudent student){
        if (numberOfAbsenteeism>50){
            System.out.println("You have many absenteeism " + student.toString());
        }
    }


    @Override
    public String toString() {
        return "FullTimeStudent{" +
                ", gradebook=" + getGradebook() +
                ", pen=" + getPen() +
                ", scholarship=" + getScholarship() +
                '}';
    }

    public int getNumberOfTermPapers() {
        return numberOfTermPapers;
    }
}