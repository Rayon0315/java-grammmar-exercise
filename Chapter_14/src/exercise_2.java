import java.util.List;
import java.util.stream.Stream;

public class exercise_2 {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        Stream<Employee> stream = list.stream();

        double process = 0.;
        for (Employee emp : list) {
            process += (double)emp.getAge();
        }
        process /= (double)list.size();
        double avgAge = process;
        System.out.println("平均年龄：" + avgAge);

        stream = stream.filter(person -> (double)person.getAge() > avgAge);
        List<Employee> result = stream.toList();

        for (Employee emp : result) {
            System.out.println(emp);
        }
    }
}
