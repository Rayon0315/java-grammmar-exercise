import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String sex;
    private String dept;

    public Employee(String name, int age, double salary, String sex, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.dept = dept;
    }

    @Override
    public String toString() {
        String title = "\t\tEmployee\t\t\n";
        String header = "=====================\n";
        String divide = "---------------------\n";

        String nameCol   = String.format("%-8s%-10s%n", "name", name);
        String ageCol    = String.format("%-8s%-10d%n", "age", age);
        String salaryCol = String.format("%-8s%-10.1f%n", "salary", salary);
        String sexCol    = String.format("%-8s%-10s%n", "sex", sex);
        String deptCol   = String.format("%-8s%-10s%n", "dept", dept);

        return header + title + divide + nameCol + ageCol + salaryCol + sexCol + deptCol + divide;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getSex() {
        return sex;
    }
    public String getDept() {
        return dept;
    }

    static List<Employee> getEmpList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("老张", 40, 9000, "男", "运营部"));
        list.add(new Employee("小刘", 24, 5000, "女", "开发部"));
        list.add(new Employee("大刚", 32, 7500, "男", "销售部"));
        list.add(new Employee("翠花", 28, 5500, "女", "销售部"));
        list.add(new Employee("小马", 21, 3000, "男", "开发部"));
        list.add(new Employee("老王", 35, 6000, "女", "人事部"));
        list.add(new Employee("小王", 21, 3000, "女", "人事部"));
        return list;
    }
}
