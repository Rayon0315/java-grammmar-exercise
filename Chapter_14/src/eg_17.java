import java.util.List;
import java.util.stream.Stream;

public class eg_17 {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        Stream<Employee> stream = list.stream();
        stream = stream.filter(person -> person.getAge() > 30);
        List<Employee> result = stream.toList();
        for (Employee emp : result) {
            System.out.println(emp);
        }
    }
}
