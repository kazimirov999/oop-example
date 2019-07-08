package company;

public class TeacherSalary implements Accounting<Currency, Teacher> {
    int salary;

    @Override
    public int getSalary(Teacher teacher) {
        salary = teacher.getHours()*teacher.getRate();
        if(teacher.getExperiense()>5){
            salary+=1000;
        }
        System.out.println("Teacher "+ teacher.toString() +  "salary = "  + salary + " " + getCurrency());
        return salary;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
