import javax.print.Doc;

class Person {}

class Teacher extends Person {
    public void order(String dish) {
        System.out.println("教师点了：" + dish);
    }
}

class Student extends Person {
    public void order(String dish) {
        System.out.println("学生点了：" + dish);
    }
}

class Doctor extends Person {
    public void order(String dish) {
        System.out.println("医生点了：" + dish);
    }
}

public class exercise_3 {
    public static void main(String[] args) {
        Person tea = new Teacher();
        Teacher teacher = (Teacher) tea;

        Person stu = new Student();
        Student student = (Student) stu;

        Person doc = new Doctor();
        Doctor doctor = (Doctor) doc;

        teacher.order("香辣肉丝");
        student.order("火腿炒面");
        doctor.order("麻辣香锅");
    }
}
