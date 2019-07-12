package company;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("Black", 0.7f);
        Gradebook gradebook = new Gradebook(4.15f, 4, 320599 );
        Student student2 = new FullTimeStudent(20,"Denys", gradebook, pen, true, 60, 3);
        student2.addGradebook(gradebook);
        student2.addPen(pen);
        Gradebook gradebook1 = new Gradebook(3.4f, 3,200400);
        Pen pen1 = new Pen("Blue", 0.8f);
        Student student3 = new PartTimeStudent(20, "Maxim",gradebook1,pen1,false,50,4 );
        student3.addGradebook(gradebook1);
        student2.countingTheNumberOfWorks((FullTimeStudent) student2);
        student3.countingTheNumberOfWorks((PartTimeStudent) student3);
        student3.addPen(pen1);
        Teacher teacher = new Teacher(45, "Vasyl Petrovich", 25,160,10);
        StudentSalary studentSalary = new StudentSalary();
        studentSalary.getSalary(student2);
        studentSalary.getSalary(student3);
        TeacherSalary teacherSalary = new TeacherSalary();
        teacherSalary.getSalary(teacher);
        teacher.checkExperiense();
        Gradebook gradebook2= new Gradebook(4.8f,2,854476);
        FullTimeStudent student = new FullTimeStudent(19, "Vova",gradebook2,pen,true,70,2 );
        student.addGradebook(gradebook2);
        student.checkNumberOfAbsenteeism(student);
        studentSalary.getSalary(student);
    }
}