package company;

import java.util.ArrayList;
import java.util.List;

public abstract class Student extends Person {

    private Gradebook gradebook;
    private Pen pen;
    public List<Gradebook> gradebooks = new ArrayList<>();
    public List<Pen> pens = new ArrayList<>();
    private int scholarship ;
    public boolean stateStudent;


    public Student(int age, String name, Gradebook gradebook, Pen pen,  boolean stateStudent) {
        super(age, name);
        this.gradebook = gradebook;
        this.pen = pen;
        this.stateStudent = stateStudent;
    }


    protected void addPen(Pen pen){
        System.out.println("Add new pen" + pen.toString());
        pens.add(pen);
    }

    protected void addGradebook(Gradebook gradebook){
        System.out.println("Add new gradebook "+ gradebook.toString());
        gradebooks.add(gradebook);
    }
    protected void countingTheNumberOfWorks(FullTimeStudent student){
        System.out.println(student.toString()+ " have " + student.getNumberOfTermPapers() + " works" );
    }
    protected void countingTheNumberOfWorks(PartTimeStudent student){
        System.out.println(student.toString()+ " have " + student.getNumberOfControlWorks() + " works" );
    }

    public Gradebook getGradebook() {
        return gradebook;
    }

    public Pen getPen() {
        return pen;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }


}
