package company;

public class StudentSalary implements Accounting<Currency,Student> {
    @Override
    public int getSalary(Student student){
        if (student.stateStudent == false) {
            System.out.println("This student does not have a scholarship");
        }
        else if (student.getGradebook().getAverageScore()>=4) {

            student.setScholarship(1300);
        }
        else { student.setScholarship(0); }
        System.out.println("Student scholarship " + student.toString() + " = " +  student.getScholarship() + " " + getCurrency());
        return student.getScholarship();
    }

    @Override
    public Currency getCurrency(){
        return Currency.UAH;
    }

}
